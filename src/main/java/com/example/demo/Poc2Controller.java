package com.example.demo;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Poc2Controller {

	@AopAspects(allow = true)
	public String otherMethod(JSONObject option) {
		// TODO Auto-generated method stub
		return "jii";
	}

}
