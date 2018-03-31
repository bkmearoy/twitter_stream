package com.fagena.twitter.Dao;

public class Table 
{
	long id;
	String name;
	String screenName;
	long friends;
	String message;
	String date;
	
	
	public Table(long id, String name, String screenName, long friends, String message, String date) {
		this.id = id;
		this.name = name;
		this.screenName = screenName;
		this.friends = friends;
		this.message = message;
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getFriends() {
		return friends;
	}
	public void setFriends(int friends) {
		this.friends = friends;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}
