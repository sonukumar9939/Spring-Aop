package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PocController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PocController.class);

	@AopAspects(allow = true)
	@RequestMapping(method = RequestMethod.POST, value = "/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> getJson(@RequestBody OptionHeader optionHeader, HttpServletRequest reqest) {

		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(optionHeader);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LOGGER.info(json);
		JSONObject option = new JSONObject(optionHeader);
		LOGGER.info("hii Poc Controller");
		return new ResponseEntity<>(option.toString(), HttpStatus.OK);

	}

}
