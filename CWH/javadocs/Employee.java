package com.myPackage;

/**
 * This class helps manage employees of your firm
 * @author Priyanshu
 * @version 1.0
 */
public class Employee{
	String name;
	String designation;

	int salary;

	/**
	 * This method shows the salary of an employee
	 * @return salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * This method lets you set the salary of your employee
	 * @param salary (in thousands)
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	int experience;

	/**
	 * This method shows the experience of an employee
	 * @return experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * This method lets you set the prior experience of your employee
	 * @param experience (in years)
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

	String language;

	/**
	 * This method shows the major programming language of an employee
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * This method lets you set the major programming language of your employee
	 * @param language (like C, C++, Java, Python, etc...)
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	// Constructor
	/**
	 * This is employee constructor
	 * @param name Name of employee
	 * @param designation Designation (while recruting) of employee
	 */
	public Employee(String name, String designation){
		this.name = name;
		this.designation = designation;
	}

	// Methods
	/**
	 * This method lets you upgrade your employees' designation
	 * @param newDesignation New designation of existing employee, after promotion
	 */
	public void upgradeDesignation(String newDesignation){
		this.designation = newDesignation;
	}

	/**
	 * This method lets you change the salary of your employee
	 * @param multiplier (could be less than 1 also)
	 */
	public void changeSalary(double multiplier){
		this.salary *= multiplier;
	}
}