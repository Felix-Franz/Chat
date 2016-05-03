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
	//Timestamp timestampSent		//Timestamp created during the send process of the message
	//Timestamp timestampServer		//Timestamp created, when the message reached the server
	//Timestamp timestampRetrievt	//Timestamp created, when the other person retrievt the message (Problem: Groups?)
	//Maybe add a class Timestamps with a class extending this class for multiple users
	
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
