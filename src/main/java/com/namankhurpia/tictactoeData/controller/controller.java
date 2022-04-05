package com.namankhurpia.tictactoeData.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.tictactoeData.Service.DatasetService;
import com.namankhurpia.tictactoeData.model.Dataset;

@RestController
public class controller {
	
	@Autowired
	DatasetService service;

	@GetMapping("/")
	public String helloworld() {
		return "Hi\nThis is Tic Tac Toe 2.0 \n\nby Naman Khurpia";
	}
	
	@GetMapping("/dataset")
	public ArrayList<Dataset> getAlldata(){
		return service.getAllDataset();
	}
	
	@PostMapping("/add")
	public String postdata(@RequestBody Dataset obj) {
		try {
			System.out.println(obj.getAone());
			service.adddataset(obj);
			return "Added";
		}
		catch(Exception e)
		{
			return "Got exception"+e.getLocalizedMessage();
		}
		
	}
}
