package com.namankhurpia.tictactoeData.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.namankhurpia.tictactoeData.Repository.repository;
import com.namankhurpia.tictactoeData.model.Dataset;

@Transactional
@Service
public class DatasetService implements DatasetServiceInterface {
	
	@Autowired
	repository datasetrepo;

	@Override
	public void adddataset(Dataset obj) {
		datasetrepo.save(obj);
		
	}

	@Override
	public ArrayList<Dataset> getAllDataset() {
		ArrayList<Dataset> list = new ArrayList<Dataset>();  
		datasetrepo.findAll().forEach(list1 -> list.add(list1));  
		return list;  
		
	}
	
	
	

}
