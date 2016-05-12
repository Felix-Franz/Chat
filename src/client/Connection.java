package client;

import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 
 * @author Felix
 * This class implements the sending and retrieving methods
 *
 */
public class Connection{

	public static void send(general.Message msg) throws Exception {		//Sends a Message (Object) to the Server
		try {
			Socket connection = new Socket(general.Settings.URL, general.Settings.PORT);
			ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
			output.writeObject(msg);
			output.close();
			connection.close();
		} catch (Exception e) {
			throw new Exception("Error sending message to the server! " + e.getStackTrace());
		}
	}

	public static general.Message receive() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
