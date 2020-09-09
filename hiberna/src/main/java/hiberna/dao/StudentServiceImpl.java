package hiberna.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hiberna.model.Student;
import hiberna.model.User;


@Service("studentService")
@Transactional
public class StudentServiceImpl {

	@Autowired
	private StudentDao studentDao;
	
	public int insert(User user) {
		
		studentDao.insert(user);
		return 1;
	}
	
	
}
