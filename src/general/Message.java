package general;

/**
 * 
 * @author Felix
 * This class implements a message
 *
 */

public abstract class Message {
	String senderPerson;		//Person that sends the
	String senderDevice;		//ID of the Sending device
	String retrieverPerson;		//Person(s)/Device(s) that retrieve the message
	
	public Message(String senderPerson, String senderDevice, String retrieverPerson) {
		this.senderPerson = senderPerson;
		this.senderDevice = senderDevice;
		this.retrieverPerson = retrieverPerson;
	}
	
	String getSender() {
		return senderPerson;
	}
	String getRetriever() {
		return retrieverPerson;
	}
}
