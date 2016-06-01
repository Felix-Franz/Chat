package server;

import java.util.ArrayList;

public class MessageList {
	private static ArrayList<MessageList> list;
	private general.User user;
	private general.Device device;
	private ArrayList<general.Message> message;
	
	public MessageList(general.User user, general.Device device, general.Message message) {
		this(user, device);
		this.message.add(message);
	}
	public MessageList(general.User user, general.Device device){
		this.user = user;
		this.device = device;
		list.add(this);
	}
	
	public void AddMessage(general.Message message){
		this.message.add(message);
	}
	
	public general.Message RemoveMessage()throws Exception{ //TODO change Exception
		return RemoveMessage(0);
	}
	public general.Message RemoveMessage(int index)throws Exception{ //TODO change Exception
		if (index>=message.size()) throw new Exception("index to big for this message list!");
		if (message.size()<=1) list.remove(this);
		return message.remove(index);
	}
	
	
}
