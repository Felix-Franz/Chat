package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class Connection implements Runnable {
	
	//first try send/receive methods
	public static void send(general.Message msg /* HashMap<general.Device, general.Message> msg /*Referenz auf die Liste mit Personen & Nachricht*/) throws Exception {
		try {
			ServerSocket waitingConnection = new ServerSocket(general.Settings.PORT);
			Socket connection = waitingConnection.accept();
			
			ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
			output.writeObject(msg);
			
			output.close();
			connection.close();
			waitingConnection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static general.Message receive() throws Exception {		//Receives a message from the client
		try {
			ServerSocket waitingConnection = new ServerSocket(general.Settings.PORT);
			Socket connection = waitingConnection.accept();
			
			ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
			Object receivedMsg = input.readObject();
			if (!(receivedMsg instanceof general.Message)){
				input.close();
				connection.close();
				waitingConnection.close();
				throw new Exception("Wrong received object type!");
			}
			general.Message msg = (general.Message) receivedMsg;
			input.close();
			
			connection.close();
			waitingConnection.close();
			return msg;
		} catch (Exception e) {
			throw new Exception("Error receiving message from the client! " + e.getStackTrace());
		}
	}
	//END first try send/receive methods
	
	
	boolean running = false;
	boolean stop = true;
	Thread mainThread = new Thread(this);
	Queue<Socket> connections;
	
	public void connectionHandling(){ //handles send and receive
		running = true;
		
		try {
			ServerSocket waitingConnection = new ServerSocket(general.Settings.PORT);
			while(!stop){
				connections.add(waitingConnection.accept());
				new Thread(this).start();												//noch einbauchen: max Anzahl von threads!
			}
			waitingConnection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		running = false;
	}
	
	@Override
	public void run() {
		//starts ConnectionHandling thead if not running...
		if (!running){
			connectionHandling();
			return;
		}
		//Opens connections to send and receive
		try {
			Socket connection = connections.poll();
			ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
			ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
			
			sendAndReceive(input, output);
			
			input.close();
			output.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void sendAndReceive(ObjectInputStream input, ObjectOutputStream output) throws Exception{
		try {
			general.Message msg;
			msg = general.Message.convertToMessage(input.readObject());

			//Authentification
			if (msg instanceof general.MessageSystemAuthentication);
			//TODO Authentifizierung

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		while(true){
			//TODO send and receive messages
			
		}
	}
	
	public void start(){
		stop = false;
		mainThread.start();
	}
	
	public void stop(){
		stop = true;
	}
}
