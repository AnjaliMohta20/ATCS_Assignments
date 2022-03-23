package com.rp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spjparesttr")
public class Trainee {
	
	@Id
	@Column(name = "tid", length = 10)
	private int tid;
	@Column(name = "ename", length = 15)
	private String tname;
	@Column(name = "esal", length = 10)
	private int tsal;
	@Column(name = "eadd", length = 15)
	private String tadd;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTsal() {
		return tsal;
	}
	public void setTsal(int tsal) {
		this.tsal = tsal;
	}
	public String getTadd() {
		return tadd;
	}
	public void setTadd(String tadd) {
		this.tadd = tadd;
	}
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int tid, String tname, int tsal, String tadd) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsal = tsal;
		this.tadd = tadd;
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + ", tsal=" + tsal + ", tadd=" + tadd + "]";
	}
	
	

}
