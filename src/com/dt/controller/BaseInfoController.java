package com.dt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dt.service.BaseInfoService;
import com.dt.service.UserService;

@Controller
@RequestMapping("/baseInfoController")
public class BaseInfoController {
	
	
	@Autowired
	private BaseInfoService baseInfoService;
	
}