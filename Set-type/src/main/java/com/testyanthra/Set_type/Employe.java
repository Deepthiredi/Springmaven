package com.testyanthra.Set_type;

import java.util.Set;

public class Employe
{
	private int empid;
	private String empname;
	private Set<Long> contactnumber;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Set<Long> getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Set<Long> contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", empname=" + empname + ", contactnumber=" + contactnumber + "]";
	}

}
