package kr.or.ddit.dao.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BlackVO;
import kr.or.ddit.vo.MemberVO;

public class AdminDaoImpl implements AdminDao{

	private SqlMapClient smc;

	private static AdminDaoImpl dao  = new AdminDaoImpl();

	private AdminDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}

	public static AdminDaoImpl getInstance() {
		
		if (dao == null) {
			dao = new AdminDaoImpl();
		}
		return dao;
	}


	@Override
	public List<MemberVO> getAllBlackMember() {
		ArrayList<MemberVO> blackMemList = new ArrayList<MemberVO>();
		
		try {
			blackMemList = (ArrayList<MemberVO>) smc.queryForList("getAllBlackMember");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return blackMemList;
	}

	@Override
	public int insertBlackMember(MemberVO mvo) {
		int cnt = 0;
		try {

			cnt = smc.update("insertBlackMember",mvo);

		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}

		return cnt;
	}

	@Override
	public int deleteBlackMember(MemberVO mvo) {
		int cnt = 0;
		try {

			cnt = smc.update("deleteBlackMember", mvo);

		} catch (SQLException e) {

			cnt = 0;
			e.printStackTrace();
		}

		return cnt;
	}
	
    public static void main(String[] args) {
		
    	ArrayList<BlackVO> blacklist = new ArrayList<BlackVO>();
    	
	}

	@Override
	public List<MemberVO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}







}
