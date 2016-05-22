package testCases;

public class SendMessageFromClientToServer implements Runnable{
	static general.MessageUserText clientMessage;
	static general.MessageUserText serverMessage;

	public static void main(String[] args) {
		//Runs Client Thread
		Thread client = new Thread(new SendMessageFromClientToServer());
		client.start();
		
		//Runs Server Thread
		try {
			serverMessage = (general.MessageUserText) server.Connection.receive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(serverMessage.getText());
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		clientMessage = new general.MessageUserText("Hans", "Testdevice", "Peter", "Dies ist eine Nachricht!");
		try {
			client.Connection.send(clientMessage);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
