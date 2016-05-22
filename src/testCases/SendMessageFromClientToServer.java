package testCases;

public class SendMessageFromClientToServer implements Runnable{

	public static void main(String[] args) {
		//Runs Client Thread
		Thread client = new Thread(new SendMessageFromClientToServer());
		client.start();
		
		//Runs Server Thread
		general.MessageUserText msg = null;
		try {
			msg = (general.MessageUserText) server.Connection.receive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg.getText());
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		general.Message msg = new general.MessageUserText("Hans", "Testdevice", "Peter", "Dies ist eine Nachricht!");
		try {
			client.Connection.send(msg);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
