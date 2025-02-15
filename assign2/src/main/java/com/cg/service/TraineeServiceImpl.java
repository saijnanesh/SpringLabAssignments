package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.TraineeDao;
import com.cg.model.Trainee;

public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	TraineeDao traineedao;
	
	@Override
	public void create(Trainee trianee) {
		boolean b=traineedao.create(trianee);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}

	@Override
	public List<Trainee> reterive() {
		List<Trainee> list=traineedao.reterive();
		return list;
	}

	@Override
	public Trainee findById(int id) {
		Trainee tr=traineedao.findById(id);
		return tr;
	}

	@Override
	public void delete(int id) {
		traineedao.delete(id);
		
	}

	@Override
	public void update(int id,String name,String domain,String location) {
		traineedao.update(id,name,domain,location);
		
	}

}
