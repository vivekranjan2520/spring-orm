package hiberna.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hiberna.model.Student;
import hiberna.model.User;

@Repository("studentDao")
public class StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public int insert(User user) {
		System.out.println("111");
		sessionFactory.getCurrentSession().save(user);
		sessionFactory.close();
		return 1;
	}
	
}
