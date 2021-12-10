package program;

public interface MemberService {
	
	public abstract void viewAll(); // 회원 전체 보여주기
	public abstract void view(); // 회원 한명 정보 보여주기
	public abstract void insert(); // 회원 추가
	public abstract void edit(); // 회원 정보 수정
	public abstract void delete(); // 회원 정보 삭제

}
