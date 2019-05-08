package com.hcl.pet.Controller;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.pet.Model.Pet;
import com.hcl.pet.Model.User;
import com.hcl.pet.Repository.PetRepository;
import com.hcl.pet.Service.Impl.PetServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PetControllerTest {

	
	
	@Mock
	PetServiceImpl petService;
	
	@Mock
	PetRepository petRepository;
	
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getAllTest()
	{
		List<Pet> petList= new ArrayList<Pet>();
		User user1= new User(1,"Shankar","Welcome");
		User user2= new User(2,"Raja","How");

		Pet pet1= new Pet("Cat","Mangalore",user2);
		Pet pet2= new Pet("Dog","Bangalore",user1);
		Pet pet3= new Pet("Parrot","Pune",user2);
		petList.add(pet1);	
		petList.add(pet2);
		petList.add(pet3);
		
		when(petService.getAll()).thenReturn(petList);
		
		List<Pet> petLists=petService.getAll();
		assertEquals(3,petLists.size());
		verify(petService,times(1)).getAll();	
	}
	
	@Test
	public void UserLogin()
	{
		List<User> userList= new ArrayList<User>();
		User user1= new User(1,"Shankar","Howareyou");
		User user2= new User(2,"Raja","iloveindia");
		User user3= new User(3,"Varun","welcomepeople");
		User user4= new User(4,"Loganathan","Bangalore");
		User user5= new User(5,"Vijay","Radha");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		when(petService.getAllUser()).thenReturn(userList);
		List<User> userLists= petService.getAllUser();
		assertEquals(5,userLists.size());
		verify(petService,times(1)).getAllUser();	
	}
	
	/*
	 * @Test public void getOnePet() { Pet pet1= new Pet(2L,"Parrot","Mumbai");
	 * 
	 * Pet pet2=petService.getPet(2L);
	 * 
	 * assertEquals(pet2,pet1); }
	 * 
	 */
	
	
}
