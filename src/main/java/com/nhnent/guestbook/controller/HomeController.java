package com.nhnent.guestbook.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhnent.guestbook.dao.GuestbookDAO;
import com.nhnent.guestbook.vo.GuestbookVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	GuestbookDAO guestbookDAO;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("allData",guestbookDAO.getAllData());
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping(value = "/writeArticle")
	public ModelAndView writeArticle(@ModelAttribute GuestbookVO guestbookVO){
		ModelAndView mv = new ModelAndView();
		guestbookDAO.insertData(guestbookVO);
		mv.setViewName("redirect:/");
		return mv;
	}
}
