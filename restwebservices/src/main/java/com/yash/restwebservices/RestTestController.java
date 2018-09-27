package com.yash.restwebservices;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	
	private List<Data> dataList = new ArrayList<Data>();

	@GetMapping
	@RequestMapping("/getData.ds")
	public List<Data> getData() {
		dataList.add(new Data(1, "Akshay"));
		dataList.add(new Data(2, "Nikhil"));
		return dataList;

	}

}
