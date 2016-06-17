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

import com.study.springrest.domain.ReplyVO;
import com.study.springrest.service.ReplyService;

@Controller
public class ReplyController {
	@Inject
	private ReplyService service;
	
	private static final Logger logger = LoggerFactory.getLogger(ReplyController.class);
	
	@RequestMapping(value = "/Reply", method = RequestMethod.GET)
	public String reply(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<ReplyVO> reply_list = service.getList();
		model.addAttribute("list", reply_list);
		return "reply_list";
	}
	@RequestMapping(value = "/Reply", method = RequestMethod.POST)
	public String replyInsert(ReplyVO vo, Model model) {
		
		service.insert(vo);
		
		return "redirect:/Reply";
	}
	@RequestMapping(value = "/ReplyWrite", method = RequestMethod.GET)
	public void replyWrite() {
		
		
	}
	@RequestMapping(value = "/ReplyDelete", method = RequestMethod.POST)
	public String replyDelete(@RequestParam("reply_no") int reply_no, Model model) {
		
		service.delete(reply_no);
		
		return "redirect:/Reply";
		
		
	}

	@RequestMapping(value = "/ReplyEdit", method = RequestMethod.POST)
	public String replyedit(@RequestParam("reply_no")int reply_no, Model model) {
		
		ReplyVO vo = service.get(reply_no) ;
		model.addAttribute("vo", vo);
		return "memberEdit";
		
	}
	
	@RequestMapping(value = "/ReplyUpdate", method = RequestMethod.POST)
	public String replyupdate(ReplyVO vo, Model model) {
		service.update(vo) ;
		return "redirect:/Reply";
		
	}
	
}
