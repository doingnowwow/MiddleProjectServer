package kr.or.ddit.dao.admin;

import java.util.List;

import kr.or.ddit.vo.MemberVO;

public interface AdminDao {

	// 일반회원 , 블랙회원 블랙리스트 CRUD

	public List<MemberVO> getAllMember();// 전체회원조회

	public List<MemberVO> getAllBlackMember(); // 전체 블랙 회원 조회

	public int insertBlackMember(MemberVO mvo); // 블랙 회원 정보 삽입

	public int deleteBlackMember(MemberVO mvo); // 블랙 회원 정보 삭제 (회원번호 사용)

}
