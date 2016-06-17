package com.study.springrest.controller;


import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springrest.domain.RestVO;
import com.study.springrest.service.RestService;

@Controller
public class RestController {
	@Inject
	private RestService service;
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	
	@RequestMapping(value = "/Rest", method = RequestMethod.GET)
	public String rest(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<RestVO> rest_list = service.getList();
		model.addAttribute("list", rest_list);
		return "board_list";
	}
	@RequestMapping(value = "/Rest", method = RequestMethod.POST)
	public String restInsert(RestVO vo, Model model) {
		
		service.insert(vo);
		
		return "redirect:/Rest";
	}
	@RequestMapping(value = "/Write", method = RequestMethod.GET)
	public String restWrite() {
		return "write";
		
	}
	@RequestMapping(value = "/RestDelete", method = RequestMethod.POST)
	public String restDelete(@RequestParam("board_no") int board_no, Model model) {
		
		service.delete(board_no);
		
		return "redirect:/Rest";
		
		
	}

	@RequestMapping(value = "/RestEdit", method = RequestMethod.POST)
	public String restedit(@RequestParam("board_no")int board_no, Model model) {
		
		RestVO vo = service.get(board_no) ;
		model.addAttribute("vo", vo);
		return "restEdit";
		
	}
	
	@RequestMapping(value = "/RestUpdate", method = RequestMethod.POST)
	public String restupdate(RestVO vo, Model model) {
		service.update(vo) ;
		return "redirect:/Rest";
		
	}

	
}
