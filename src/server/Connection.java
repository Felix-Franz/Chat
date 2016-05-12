package server;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection implements general.Connection {

	@Override
	public void send(general.Message m) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public general.Message receive() throws Exception {		//Receives a message from the client
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
