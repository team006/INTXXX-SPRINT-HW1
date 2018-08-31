package th.ac.kmutt.sit.MyFirstService.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController{
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable("id")int id) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(0,"X"));
		users.add(new User(1,"Y"));
		users.add(new User(2,"Z"));
		users.add(new User(3,"U"));
		users.add(new User(4,"V"));
		return users.get(id);
	}

	@GetMapping("/users")
	public ArrayList<User> getUser(){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(0,"X"));
		users.add(new User(1,"Y"));
		users.add(new User(2,"Z"));
		users.add(new User(3,"U"));
		users.add(new User(4,"V"));
        return users;
	}
}