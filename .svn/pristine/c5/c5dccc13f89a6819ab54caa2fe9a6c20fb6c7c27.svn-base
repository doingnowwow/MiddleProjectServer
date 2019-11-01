package kr.or.ddit.dao.Human_Mypage_Ranking;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.PointVO;

public class Human_MypageRankDaoImpl implements Human_MypageRankDao{
	private SqlMapClient smc;
	private static Human_MypageRankDaoImpl dao;
	
	public Human_MypageRankDaoImpl() {
		//SqlMapClient 객체 생성
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static Human_MypageRankDaoImpl getInstance() {
		if(dao == null) {
			dao = new Human_MypageRankDaoImpl();
		}
		return dao;
	}
	
	/**
	 * 로그인 사용자를 통한 검색으로 pointVO가져오기
	 */
	@Override
	public List<PointVO> getMemberPoint(PointVO Rank) {
		ArrayList<PointVO> memRankList = null;
		
		try {
			memRankList = (ArrayList<PointVO>) smc.queryForList("getSearchMember", Rank);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memRankList;
	}
	
	

}
