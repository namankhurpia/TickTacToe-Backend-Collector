package com.namankhurpia.tictactoeData.Service;

import java.util.ArrayList;

import com.namankhurpia.tictactoeData.model.Dataset;

public interface DatasetServiceInterface {
	
	public void adddataset(Dataset obj);
	
	public ArrayList<Dataset> getAllDataset();
	

}
