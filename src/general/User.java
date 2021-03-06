package general;

import java.util.ArrayList;

/**
 * 
 * @author Felix
 * This class implements a User
 * Each user can have multiple Devices sending and receiving messages
 *
 */

public class User {
	private String username;
	private String firstname;
	private String lastname;
	private ArrayList<Device> device;
	private String lastOnline;
}
