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
	}
	
	public void AddMessage(general.Message message){
		this.message.add(message);
	}
	
	public general.Message RemoveMessage(){
		return RemoveMessage(0);
	}
	public general.Message RemoveMessage(int index){
		return message.remove(index);
	}
	
	
}
