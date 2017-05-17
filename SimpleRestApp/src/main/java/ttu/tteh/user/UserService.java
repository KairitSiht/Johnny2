package ttu.tteh.user;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


@Service
public class UserService {

	private static final int MIN_AGE = 0;
	private static final int MAX_AGE = 150;
	
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	User addUser(User user) {
		if(user.age < MIN_AGE || MAX_AGE < user.age){
			return null;
		}
		return userRepository.save(user);
	}
	public Optional<User> logIn(String realName, String passWord){
		if(realName == null || passWord == null){
			throw new NullPointerException("Enter your account info");
		}
		return this.getAllUsers().stream()
				.filter(s -> realName.equals(s.getRealName()))
				.filter(s -> passWord.equals(s.getPassWord()))
				.findFirst();
	}

	List<User> getAllUsers() {
		return userRepository.findAll();
	}

	User getUserById(long userId) {
		return userRepository.findOne(userId);
	}
}
