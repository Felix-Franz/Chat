package testCases;

public class MessageTextCreate {
	static general.MessageUserText msg;
	
	public static void main(String[] args) {
		msg = new general.MessageUserText("Hans", "Testdevice", "Peter", "Dies ist eine Nachricht!");
		System.out.println(msg.getText());
	}
}
