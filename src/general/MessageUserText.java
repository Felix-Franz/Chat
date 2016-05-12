package general;

/**
 * 
 * @author Felix
 * This class implements a text message
 *
 */
public class MessageUserText extends MessageUser{
	private String text; //Message Text
	
	/**
	 * This creates a Text message
	 * @param senderPerson Person that sends the message
	 * @param senderDevice Device that sends the message
	 * @param receiverPerson Person that recieves the message
	 * @param text the message
	 */
	public MessageUserText(String senderPerson, String senderDevice, String receiverPerson, String text){
		super(senderPerson, senderDevice, receiverPerson);
		this.text = text;
	}

	String getText() {
		return text;
	}

	void setText(String text) {
		this.text = text;
	}
	
	
}
