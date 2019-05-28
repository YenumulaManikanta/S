package com.student.info;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private int marks[];
	private List<String>hobbies;
	private Set<String> subjects;
	private Map<Integer,String> ranks;
	private Properties mobileno;
	
	public void setMobileno(Properties mobileno) {
		this.mobileno = mobileno;
	}
	public void setRanks(Map<Integer, String> ranks) {
		this.ranks = ranks;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks="
				+ Arrays.toString(marks) + ", hobbies=" + hobbies
				+ ", subjects=" + subjects + ", ranks=" + ranks + ", mobileno="
				+ mobileno + "]";
	}
	
	
	
	

}
