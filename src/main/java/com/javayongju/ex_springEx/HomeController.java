package com.javayongju.ex_springEx;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javayongju.ex_springEx.dao.MDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private SqlSession sqlSession;
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		MDao dao = sqlSession.getMapper(MDao.class);
		model.addAttribute("list", dao.listDao());
		return "list";
	}
	
	@RequestMapping("/memberForm")
	public String memberForm(Model model) {
		return "memberForm";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request , Model model) {
		MDao dao = sqlSession.getMapper(MDao.class);
		dao.deleteDao(request.getParameter("mNum"));
		return "redirect:list";
	}
	
	@RequestMapping("/member")
	public String member(HttpServletRequest request , Model model) {
		MDao dao = sqlSession.getMapper(MDao.class);
		int recordCount = sqlSession.selectOne("recordCountDao",null); 
	    int idCount = recordCount + 1;
		dao.memberDao(request.getParameter("mName"), request.getParameter("mPhone"), request.getParameter("mAddr"),idCount);
		return "redirect:list";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request , Model model) {
	MDao dao = sqlSession.getMapper(MDao.class);
	dao.modifyDao(request.getParameter("mPhone"), request.getParameter("mAddr"), request.getParameter("mNum"));
	return "redirect:list";
	}
	
	@RequestMapping("/memberView")
	public String memberView(HttpServletRequest request,Model model) {
		MDao dao = sqlSession.getMapper(MDao.class);
		model.addAttribute("memberView",dao.memberView(request.getParameter("mNum"),request.getParameter("mName"),request.getParameter("mPhone"),request.getParameter("mAddr") ));
		return "memberView";
	}
}
