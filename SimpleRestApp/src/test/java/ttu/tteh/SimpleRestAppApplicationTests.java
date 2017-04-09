package ttu.tteh;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import ttu.tteh.user.User;
import ttu.tteh.user.UserController;
import ttu.tteh.user.UserRepository;
import ttu.tteh.user.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRestAppApplicationTests {

	@Autowired
	UserController ctrl;
	
	User testUser1;
	User testUser2;
	
	@Before
	// kõik testandmed pigem siia dekl, slp siin kõik meetodid saavad kasutada
	public void contextLoads() {
		testUser1 = new User();
		testUser2 = new User();
		testUser2.userName = "TU2";
		testUser1.userName = "TU1";
		testUser1.age = -2;
		testUser2.age = 200;
		testUser1.url = "http://example.com";
		testUser2.url = "http://example.com";
		testUser1.bio = "nobio";
		testUser2.bio = "nobio";
		testUser1.passWord = "hunter2";
		testUser2.passWord = "hunter2";
	}
	
	@Test
	public void testDoesNotAcceptTimeTravellers(){
		User response = ctrl.addUser(testUser1);
		assertThat(response).isEqualTo(null);
	}
	
	

}
