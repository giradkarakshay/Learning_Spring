package com.yash.SpringRestFulWebServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

	//private List<String> dataList = new ArrayList<String>(Arrays.asList("Spring", "Rest", "SRC"));

	@GetMapping
	@RequestMapping("/getData.ds")
	public String getData() {

		return "Helloooo";

	}

}
