package com.example.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4209467756946478997L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double cpu;
	private long memory;
	private long disk;
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp time;
	private String orgName;
	private String appname;
	private String spaceName;
	private int instanceIndex;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public long getMemory() {
		return memory;
	}
	public void setMemory(long memory) {
		this.memory = memory;
	}
	public long getDisk() {
		return disk;
	}
	public void setDisk(long disk) {
		this.disk = disk;
	}
	
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getSpaceName() {
		return spaceName;
	}
	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}
	public int getInstanceIndex() {
		return instanceIndex;
	}
	public void setInstanceIndex(int instanceIndex) {
		this.instanceIndex = instanceIndex;
	}
	@Override
	public String toString() {
		return "Usage [id=" + id + ", cpu=" + cpu + ", memory=" + memory + ", disk=" + disk + ", time=" + time
				+ ", orgName=" + orgName + ", appname=" + appname + ", spaceName=" + spaceName + ", instanceIndex="
				+ instanceIndex + "]";
	}
	@PrePersist
	public void pouplateDate(){
		this.time = new Timestamp(new Date().getTime());
	}
	
	
}
