package edu.java.list03;

public class Member {
	// field
	private String memberId;
	private String memberPassword;	

	// 생성자 - 기본 생성자, 파라미터 2개인 생성자
	public Member() {}
	
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	
	// getters & setters
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}	
	
	// toString override
	@Override
	public String toString() {
		return "{아이디: " + memberId + ", 비밀번호: " + memberPassword + "}";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if (obj instanceof Member) {
//			Member other = (Member) obj;
//			if (this.memberId == other.memberId)
//				result = true;
//		}
//		
//		return result;
//	}
//	
//	@Override
//	public int hashCode() {
//		return Member.valueOf(memberId).hashCode() * 10 + Member.valueOf(memberId).hashCode();

}