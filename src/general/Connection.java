package general;

public interface Connection {
	public void send(Message m) throws Exception;
	public Message receive() throws Exception;
}
