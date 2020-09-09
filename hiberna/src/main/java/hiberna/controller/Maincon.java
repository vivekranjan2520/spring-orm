package hiberna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hiberna.dao.StudentDao;
import hiberna.dao.StudentServiceImpl;

import hiberna.model.Student;
import hiberna.model.User;

@Controller
public class Maincon {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	User user=new User("raja","raja","raja","raja","raja","raja");
@RequestMapping("/")
public String Hip() {
	studentServiceImpl.insert(user);
	return "index";
	}
}
