package main.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public User getUser(String username) {
		return userRepo.findByUsername(username).get(0);
	}

}
