package data;

import java.io.Serializable;

public class Manager extends Worker implements Serializable{

	private static final long serialVersionUID = 1L;

	public Manager(String username, String password) {
		super(username, password);
	}

}
