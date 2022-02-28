package com.odj.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrMemberController {
	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	public String getString() {
		return "안녕하세오";
	}
}	