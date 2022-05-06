package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import springmvc.model.User;

public class UserDao {
	
	@Autowired  //to inject object
    private HibernateTemplate hibernateTemplate;
	public int saveUser(User user) {
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
		
	}
}
