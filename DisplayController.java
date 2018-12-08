package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {
	
	@Autowired
	private StockRepository stockRepository;
	@GetMapping("/stocks/data")
	public List<Stock_Details> getAllData(){
		
		List<Stock_Details>  data =new ArrayList<Stock_Details> ();
		
		stockRepository.findAll().forEach(stock->data.add(stock));;
		
		return data;
	}

}
