package com.task2.msf;

class Employees {
	int ID;
	String Name;
	String Type;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Employees(int iD, String name, String type) {
		
		ID = iD;
		Name = name;
		Type = type;
	
 }
	@Override
	public String toString() {
		return "Employees [ID=" + ID + ", Name=" + Name + ", Type=" + Type + "]";
	}}
