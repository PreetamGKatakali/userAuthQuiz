package com.example.demo.Controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.QuizeDao;
import com.example.demo.Dao.UserDao;
import com.example.demo.Entity.Quize;
import com.example.demo.Entity.User;
import com.example.demo.Services.UserServices;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {
	
	@Autowired
	QuizeDao quizedao;
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	UserDao userDao;
	
	
	@RequestMapping(value = "/getquize",method = RequestMethod.GET)
	public List<Quize> getQuize() {
		return quizedao.findAll();
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.PUT)
	public String newUser(@RequestBody User user) {
		userDao.save(user);
		return null;
	}
	
	@RequestMapping(value = "/update/{email}/{score}",method = RequestMethod.PUT)
	public String updateUser(@PathVariable("email") String email,@PathVariable("score") int score) {
		User user=userDao.findById(email).orElse(null);
//		user.setScore(score);
		Date date = Date.valueOf(LocalDate.now());
		user.setTesttaken(date);
		user.setScore(score);
		userDao.save(user);
		return null;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
