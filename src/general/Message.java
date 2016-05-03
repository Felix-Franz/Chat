package general;

/**
 * 
 * @author Felix
 * This class implements a message
 *
 */

public abstract class Message {
	String sender;		//Person that sends the 
	String retriever;	//Person(s) that retrieve the message
	
	public Message(String sender, String retriever) {
		this.sender = sender;
		this.retriever = retriever;
	}
	
	String getSender() {
		return sender;
	}
	void setSender(String sender) {
		this.sender = sender;
	}
	String getRetriever() {
		return retriever;
	}
	void setRetriever(String retriever) {
		this.retriever = retriever;
	}	
}
