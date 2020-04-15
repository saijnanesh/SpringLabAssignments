package com.cpg.springframeworklab1.dto;

import java.util.List;

public class SBU {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<EmployeeDTO> empList;
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<EmployeeDTO> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmployeeDTO> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList + "]";
	}

	
}
