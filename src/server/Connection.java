package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Connection {

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

}
