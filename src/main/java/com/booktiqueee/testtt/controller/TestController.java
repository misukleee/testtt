package com.booktiqueee.testtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("testtt")
public class TestController {
	
	@GetMapping("name")
	public String name() {
		log.debug("로그로그");
		return "dd";
	}
}
