package com.rays.fatching;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private int id;
	private String ans;
	
	@ManyToOne
	private Question ques;
	
	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return ans ;
	}
	

}
