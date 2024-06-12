package com.odigos.oops;

public class Emplyoee {
	private int empId;
	private String empName;
	private float empSal;
	private String empAdd;

	public Emplyoee() {
		System.out.println("default constructor");
	}
	
	public Emplyoee(int empId, String empName, float empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Emplyoee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
			this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
}
