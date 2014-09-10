package com.nhnent.guestbook.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.nhnent.guestbook.dao.GuestbookDAO;
import com.nhnent.guestbook.vo.ChkPwVO;
import com.nhnent.guestbook.vo.GuestbookVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	GuestbookDAO guestbookDAO;
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("allData", guestbookDAO.getAllData());
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/writeArticle")
	public ModelAndView writeArticle(@ModelAttribute GuestbookVO guestbookVO) {
		ModelAndView mv = new ModelAndView();
		guestbookDAO.insertData(guestbookVO);
		mv.setViewName("redirect:/");
		return mv;
	}

	@RequestMapping(value = "/PwConfirm")
	public ModelAndView confirmPassword() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pwconfirm");
		return mv;
	}

	@RequestMapping(value = "/ChkPw")
	public ModelAndView checkPasswordToDB() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("pwconfirm");
		return mv;
	}

	@RequestMapping(value = "/ChkPw", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> checkPasswordToDB(
			@RequestBody GuestbookVO chkPwVO) throws ParseException {
		System.out.println(chkPwVO.getId());
		System.out.println(chkPwVO.getWriterPassword());
		Map<String, Object> message = new HashMap<String, Object>();
		GuestbookVO retrievedGuestbookVO = guestbookDAO.getDataById(chkPwVO
				.getId());
		if (retrievedGuestbookVO.getWriterPassword().equals(
				chkPwVO.getWriterPassword())) {
			message.put("result", "OK");
			message.put("message", "success");
			guestbookDAO.deleteDataById(chkPwVO.getId());
		} else {
			message.put("result", "OK");
			message.put("message", "false");
		}
		return message;
	}

}
