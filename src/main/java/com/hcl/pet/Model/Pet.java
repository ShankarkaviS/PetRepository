package com.hcl.pet.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="pet")
public class Pet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pet_id")
	private long petId;
	private String petName;
	private String petPlace;
	
	public Pet(String petName, String petPlace, User user) {
		// TODO Auto-generated constructor stub
	}
	
	public Pet(long petId,String petName, String petPlace) {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="user_id")
	private User owner;
	
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public long getPetId() {
		return petId;
	}
	public void setPetId(long petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	
}
