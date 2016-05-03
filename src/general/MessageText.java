package general;

/**
 * 
 * @author Felix
 * This class implements a text message
 *
 */
public class MessageText extends Message {
	private String text; //Message Text
	
	MessageText(String senderPerson, String senderDevice, String retriever, String text){
		super(senderPerson, senderDevice, retriever);
		this.text = text;
	}

	String getText() {
		return text;
	}

	void setText(String text) {
		this.text = text;
	}
	
	
}
