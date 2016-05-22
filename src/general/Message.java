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
	private String receiverPerson;		//Person(s)/Device(s) that retrieve the message
	
	public Message(String senderPerson, String senderDevice, String receiverPerson) {
		this.senderPerson = senderPerson;
		this.senderDevice = senderDevice;
		this.receiverPerson = receiverPerson;
	}
	
	public String getSender() {
		return senderPerson;
	}
	public String getRetriever() {
		return receiverPerson;
	}
}
