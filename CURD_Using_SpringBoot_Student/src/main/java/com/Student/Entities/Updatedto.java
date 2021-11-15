package com.Student.Entities;

public class Updatedto {
private int id;
	
	private int Student_No;
	private String Student_name;
	private String Student_DOB;
	private String Student_DOJ;
	public Updatedto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Updatedto(int id, int student_No, String student_name, String student_DOB, String student_DOJ) {
		super();
		this.id = id;
		Student_No = student_No;
		Student_name = student_name;
		Student_DOB = student_DOB;
		Student_DOJ = student_DOJ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudent_No() {
		return Student_No;
	}
	public void setStudent_No(int student_No) {
		Student_No = student_No;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_DOB() {
		return Student_DOB;
	}
	public void setStudent_DOB(String student_DOB) {
		Student_DOB = student_DOB;
	}
	public String getStudent_DOJ() {
		return Student_DOJ;
	}
	public void setStudent_DOJ(String student_DOJ) {
		Student_DOJ = student_DOJ;
	}
	@Override
	public String toString() {
		return "Updatedto [id=" + id + ", Student_No=" + Student_No + ", Student_name=" + Student_name
				+ ", Student_DOB=" + Student_DOB + ", Student_DOJ=" + Student_DOJ + "]";
	}
	
}
