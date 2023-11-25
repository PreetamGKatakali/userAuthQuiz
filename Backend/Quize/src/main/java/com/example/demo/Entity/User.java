package com.example.demo.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@Column(unique = true)
	private String email;
	
	private String password;
	
	private int score;
	
	private Date testtaken;
	
	

	public User() {
		
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getTesttaken() {
		return testtaken;
	}

	public void setTesttaken(Date testtaken) {
		this.testtaken = testtaken;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", score=" + score + ", testtaken=" + testtaken
				+ "]";
	}
	
	
	

}
