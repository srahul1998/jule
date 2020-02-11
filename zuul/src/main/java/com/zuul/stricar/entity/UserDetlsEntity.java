package com.zuul.stricar.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;


public class UserDetlsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	
	private Integer uid;

	
	private String uname;

	
	private String password;

	
	private String verifypassword;

	
	private String email;

	
	
	private String verifyemail;

	
	private String dl_id;

	
	private Date dob;

	
	private Integer last4degitssn;

	
	private Date issuedate;

	
	private Set<SecurityQuestionAndAnswerEntity> questions_answers;

	
	private Set<UserRoles> roles;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "detlsEntityone") private SecurityQuestionEntity qEntity;
	 */

	/*
	 * @OneToMany(targetEntity = SecurityAnswerEntity.class, cascade =
	 * CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "uid_fk",referencedColumnName = "uid") private
	 * Set<SecurityAnswerEntity> answers;
	 */

	public Set<UserRoles> getRoles() {
		return roles;
	}

	public void setRoles(Set<UserRoles> roles) {
		this.roles = roles;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifypassword() {
		return verifypassword;
	}

	public void setVerifypassword(String verifypassword) {
		this.verifypassword = verifypassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyemail() {
		return verifyemail;
	}

	public void setVerifyemail(String verifyemail) {
		this.verifyemail = verifyemail;
	}

	public String getDl_id() {
		return dl_id;
	}

	public void setDl_id(String dl_id) {
		this.dl_id = dl_id;
	}

	public Integer getLast4degitssn() {
		return last4degitssn;
	}

	public void setLast4degitssn(Integer last4degitssn) {
		this.last4degitssn = last4degitssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<SecurityQuestionAndAnswerEntity> getQuestions_answers() {
		return questions_answers;
	}

	public void setQuestions_answers(Set<SecurityQuestionAndAnswerEntity> questions_answers) {
		this.questions_answers = questions_answers;
	}

	@Override
	public String toString() {
		return "UserDetlsEntity [uid=" + uid + ", uname=" + uname + ", password=" + password + ", verifypassword="
				+ verifypassword + ", email=" + email + ", verifyemail=" + verifyemail + ", dl_id=" + dl_id + ", dob="
				+ dob + ", last4degitssn=" + last4degitssn + ", issuedate=" + issuedate + ", questions_answers="
				+ questions_answers + ", roles=" + roles + "]";
	}

	/*
	 * 
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "detlsEntitytwo") private SecurityAnswerEntity answerEntity;
	 */

}
