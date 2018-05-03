package Entity;

public class Member {

	private int memberId;
	private String firstName;
	private String email;
	public Member(int memberId, String firstName, String email) {
		this.memberId = memberId;
		this.firstName = firstName;
		this.email = email;
	}
	
	public Member() {}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
