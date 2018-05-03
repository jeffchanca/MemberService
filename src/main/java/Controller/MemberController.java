package Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Member;
import Service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/getAllMembers")
	public Collection<Member> getAllMembers() {
		return memberService.getAllMembers();
	}
	
	@RequestMapping(value="/getMemberName")
	public String getMemberName() {
		return memberService.getMemberName();
	}
	
	@RequestMapping(value="/ping")
	public String ping() {
		return "Hello World";
	}
	
}
