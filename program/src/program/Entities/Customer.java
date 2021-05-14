package program.Entities;

import program.Abstract.IEntity;

public class Customer implements IEntity {
 public int id;
 public String firstName;
 public String lastName;
 public int dateOfBirt;
 public long NationalityId;

public Customer(int id, String firstName, String lastName, int dateOfBirt, long nationalityId) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirt = dateOfBirt;
	NationalityId = nationalityId;
}
public int getId() {
	return id; 
}


public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getDateOfBirt() {
	return dateOfBirt;
}
public void setDateOfBirt(int dateOfBirt) {
	this.dateOfBirt = dateOfBirt;
}
public long getNationalityId() {
	return NationalityId;
}
public void setNationalityId(long nationalityId) {
	NationalityId = nationalityId;
}
 
 
}
