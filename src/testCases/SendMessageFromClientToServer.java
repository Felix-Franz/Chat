package testCases;

public class SendMessageFromClientToServer implements Runnable{

	public static void main(String[] args) {
		Thread client = new Thread(new SendMessageFromClientToServer());
		client.start();
		
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
		
		general.Message msg = new general.MessageUserText(null, null, null, "eine gesendete Nachricht!");
		try {
			client.Connection.send(msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
