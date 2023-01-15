package com.learning;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class User {
	
	@Id
	private int userId;
	private String userName;

	
	@OneToMany(mappedBy="user", fetch=FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	
	
	
}
