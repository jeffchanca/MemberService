package Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import Dao.MemberDao;
import Entity.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;

	public Collection<Member> getAllMembers() {
		return this.memberDao.getAllMembers();
	}
	
	public String getMemberName() {
		return this.memberDao.getMemberName();
	}
}
