package ttu.tteh.user;

import java.util.List;
import java.util.Optional;

import ttu.tteh.user.logInRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/users/add", method=RequestMethod.POST,
			consumes = "application/json")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getAllUsers() {
		List<User> users = userService.getAllUsers();
		
		// Remove all passwords before sharing with the user
		for (User user : users) {
			user.passWord = "UNDISCLOSED";
		}
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/users/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable("id") long userId) {
		return userService.getUserById(userId);
	}
	@RequestMapping(value = "/logIn", method=RequestMethod.POST,
			consumes="application/json")
		public User logIn(@RequestBody logInRequest request){
			Optional<User> findUser = userService.logIn(request.getPassWord(), request.getRealName());
			if(!findUser.isPresent()){
				throw new RuntimeException("Not a real user");
			}else if(!findUser.get().getPassWord().equals(request.getPassWord())){
				throw new RuntimeException("Wrong info");
			}else{
				return findUser.get();
			}
		}
		
	
	
}
