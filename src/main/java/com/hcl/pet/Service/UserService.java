package com.hcl.pet.Service;

import java.util.List;

import com.hcl.pet.Model.Pet;
import com.hcl.pet.Model.User;

public interface UserService {

	public String addPet(Pet pet);
	public String addUser(User user);
	public List<User> getAllUser();
	
}
