package general;

/**
 * 
 * @author Felix
 * This class implements a message sent by a user
 *
 */

public abstract class MessageUser extends Message{

	public MessageUser(String senderPerson, String senderDevice, String retrieverPerson) {
		super(senderPerson, senderDevice, retrieverPerson);
	}
	
	//Timestamp timestampSent		//Timestamp created during the send process of the message
	//Timestamp timestampServer		//Timestamp created, when the message reached the server
	//Timestamp timestampRetrievt	//Timestamp created, when the other person retrievt the message (Problem: Groups?)
	//Maybe add a class Timestamps with a class extending this class for multiple users
}
