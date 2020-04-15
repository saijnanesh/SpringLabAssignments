package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	int traineeId;
	@Column
	String traineeName;
	@Column
	String traineeDomain;
	@Column
	String traineeLocation;
	
	
	public Trainee()
	{
		
	}
	
	public Trainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}

	
	
	
	
	
	
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public void setTraineeName(String traineeName) {
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}
	
	
	
	
	
	
	
}
