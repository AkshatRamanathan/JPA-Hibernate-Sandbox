package main.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/test")
	public String test() {
		return "hello";

	}

	@GetMapping("/user/{username}")
	public ResponseEntity<User> getUser(@PathVariable String username) {
		User user = userService.getUser(username);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

}
