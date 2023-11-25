package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Quize")
public class Quize {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String question;
	
	private String[] option;
	
	private String answer;
	
	

	public Quize() {
	
	}

	public Quize(String question, String[] option, String answer) {
		super();
		this.question = question;
		this.option = option;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
