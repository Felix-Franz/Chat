package general;

public class MessageSystemClose extends MessageSystem {
	String Error;

	public MessageSystemClose(String senderPerson, String senderDevice, String Error) {
		super(senderPerson, senderDevice);
		this.Error = Error;
	}

}
