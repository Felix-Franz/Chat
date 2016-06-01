package general;

import java.io.Serializable;

/**
 * 
 * @author Felix
 * This class implements a message
 *
 */

public abstract class Message implements Serializable {
	private String senderPerson;		//Person that sends the
	private String senderDevice;		//ID of the Sending device
	
	public Message(String senderPerson, String senderDevice) {
		this.senderPerson = senderPerson;
		this.senderDevice = senderDevice;
	}
	
	public String getSender() {
		return senderPerson;
	}
	public String getSenderDevice() {
		return senderDevice;
	}
	
	public static Message convertToMessage(Object obj) throws Exception{	//TODO change Exception Type
		if (!(obj instanceof general.Message)) return (general.Message) obj;
		else throw new Exception("object is no message!");
	}
}
