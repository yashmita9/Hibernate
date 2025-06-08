package com.rays.fatching;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int id;
	private String ques;
	
	@OneToMany(mappedBy = "ques" , fetch = FetchType.EAGER)
	private List<Answer> ans;

	
	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Question(int id, String ques) {
		super();
		this.id = id;
		this.ques = ques;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
