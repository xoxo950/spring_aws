package kr.smhrd.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.mapper.MemberMapper;
import kr.smhrd.model.MemberVO;

// Controller라는걸 인지 하기 위해!
@Controller
public class MemberController {
	
	
	@Autowired
	private MemberMapper memberMapper;

	@RequestMapping("/index.do")
	public void index() {
	}
	
	@RequestMapping("/join.do")
	public void join() {
	}
	
	@RequestMapping("/login.do")
	public void login() {
	}
	
	
	@RequestMapping("/joinService.do")
	public String joinService(Model model, MemberVO vo) {
		System.out.println(vo.getEmail());
		memberMapper.joinService(vo);
		model.addAttribute("email", vo.getEmail());
		return "join_success";
	}
	
	@RequestMapping("/loginService.do")
	public String loginService(Model model, MemberVO vo) {
		
		MemberVO info = memberMapper.loginService(vo);
		model.addAttribute("info", info);
		return "login_success";
	}
	
}
