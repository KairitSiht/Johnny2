package ttu.tteh.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue
	public long id;
	public String userName;
	public String realName;
	public String passWord;
	public int age;
	public String url;
	public String interest;
	public String bio;
	/* 
	 * HULLULT HEA MÕTE TEHA VÄLJAD PUBLICUKS!!!!!!!!!!!!!!! !!! !!! 
	 */
}
