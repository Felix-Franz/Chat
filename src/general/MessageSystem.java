package general;

public abstract class MessageSystem extends Message{

	public MessageSystem(String senderPerson, String senderDevice, String receiverPerson) {
		super(senderPerson, senderDevice, receiverPerson);
	}

}
