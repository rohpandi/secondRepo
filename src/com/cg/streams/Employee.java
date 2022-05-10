package com.cg.streams;

import java.io.Serializable;

public class Employee implements Serializable {
private int id;
private String name;
private String address;
//transient is used to make not serializable the object

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
