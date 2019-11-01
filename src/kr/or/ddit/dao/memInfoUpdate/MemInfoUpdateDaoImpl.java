package kr.or.ddit.dao.memInfoUpdate;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemberVO;

public class MemInfoUpdateDaoImpl implements MemInfoUpdateDao {

	private SqlMapClient smc;
	private static MemInfoUpdateDaoImpl dao = new MemInfoUpdateDaoImpl();
	
	private MemInfoUpdateDaoImpl(){
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static MemInfoUpdateDaoImpl getInstance() {
		if(dao ==null) {
			dao = new MemInfoUpdateDaoImpl();
		}
		return dao;
	}
	
	
	//비밀번호 가져와서 마이페이지 로그인 하기 
	@Override
	public MemberVO getPw(MemberVO mvo) {
		MemberVO vo = new MemberVO();
		try {
			vo = (MemberVO) smc.queryForObject("memInfo.getMemPw",mvo);
		}catch(SQLException e 	) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public MemberVO getDefaultInfo(MemberVO mvo) {
		MemberVO vo = new MemberVO();
		
		try {
			vo = (MemberVO) smc.queryForObject("memInfo.getMemberInfo",mvo);
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int deleteMember(MemberVO mvo) {
		
		int cnt = 0;
		try {
			cnt = smc.update("memInfo.deleteMemInfo",mvo);
		}catch(SQLException e 	 ) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateMember(MemberVO mvo) {
		int cnt = 0;
		try {
			cnt = smc.update("memInfo.updateMemInfo",mvo);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

}
