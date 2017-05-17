package ttu.tteh.user;

import java.util.List;


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

	List<User> getAllUsers() {
		return userRepository.findAll();
	}

	User getUserById(long userId) {
		return userRepository.findOne(userId);
	}

}
