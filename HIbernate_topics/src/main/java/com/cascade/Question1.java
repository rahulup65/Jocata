package com.cascade;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
public class Question1 {
	
	
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
    // one to many it means one question have many answer_________//
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY, cascade = CascadeType.ALL)// now this is behaving like a lazy loading 
	
	//@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)// now it will behave like a eager loading now it will load the answer also when we create the object of question class
	private List<Answer1> answers;								
	
	public int getQuestionId() {
		return questionId;
	}
	
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
		
	
	public List<Answer1> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}


	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question1(int questionId, String question, List<Answer1> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

}



