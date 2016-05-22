package testCases;

import static org.junit.Assert.*;
import org.junit.Test;

public class _UnitTest {
	
	@Test
	public void MessageTextCreate(){
		MessageTextCreate.main(new String[0]);
		assertEquals("Hans", MessageTextCreate.msg.getSender());
		assertEquals("Testdevice", MessageTextCreate.msg.getSenderDevice());
		assertEquals("Peter", MessageTextCreate.msg.getRetriever());
		assertEquals("Dies ist eine Nachricht!", MessageTextCreate.msg.getText());
	}
	
	@Test
	public void SendMessageFromClientToServer(){
		SendMessageFromClientToServer.main(new String[0]);
		assertEquals(SendMessageFromClientToServer.clientMessage.getSender(), SendMessageFromClientToServer.serverMessage.getSender());
		assertEquals(SendMessageFromClientToServer.clientMessage.getSenderDevice(), SendMessageFromClientToServer.serverMessage.getSenderDevice());
		assertEquals(SendMessageFromClientToServer.clientMessage.getRetriever(), SendMessageFromClientToServer.serverMessage.getRetriever());
		assertEquals(SendMessageFromClientToServer.clientMessage.getText(), SendMessageFromClientToServer.serverMessage.getText());
	}
	
}
