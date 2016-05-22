package testCases;

public class MessageTextCreate {
	public static void main(String[] args) {
		general.MessageUserText msg = new general.MessageUserText("Hans", "Testdevice", "Peter", "Dies ist eine Nachricht!");
		System.out.println(msg.getText());
	}
}
