package Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import Entity.Member; 

@Repository
public class MemberDao {

	@Autowired
	private static Map<Integer, Member> member;
	private Member member2;
	
	static {
		member = new HashMap<Integer, Member>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
			put(1, new Member(1,"Jeff","jeff@gmail.com"));
			put(2, new Member(2,"Bill","bill@gmail.com"));
			put(3, new Member(3,"Steve","job@gmail.com"));
			}
		};
	}
	
	public Collection<Member> getAllMembers() {
		return this.member.values();
	}
	
	public String getMemberName() {
		member2 = new Member(1,"Jeff","jeffrey@gmail.com");
		return member2.getFirstName();
	}
}
