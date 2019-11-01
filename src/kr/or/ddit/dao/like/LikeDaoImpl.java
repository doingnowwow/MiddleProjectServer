package kr.or.ddit.dao.like;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.LikeVO;
import kr.or.ddit.vo.MemDogVO;

public class LikeDaoImpl implements LikeDao  {
	
	private static LikeDaoImpl likeDao;
	private SqlMapClient smc;
	
	private LikeDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static LikeDaoImpl getInstance() {
		if(likeDao == null) {
			likeDao = new LikeDaoImpl();
		}
		return likeDao;
	}
	
	
	@Override
	public List<LikeVO> dlikelist(LikeVO vo) throws RemoteException {
		List<LikeVO> l_list = null;
		
		try {
			l_list = smc.queryForList("dlike.dlikelist", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return l_list;
	}

	@Override
	public int deleteDlike(LikeVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt=smc.delete("dlike.deleteDlike", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int detailview(LikeVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = (int)smc.queryForObject("dlike.detailview", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertLike(LikeVO vo) throws RemoteException {
		int cnt = 0;
		try {
			Object obj = smc.insert("dlike.insertdlike", vo);
			if(obj == null) {
				cnt = 1;
			}else {
				cnt = 0;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	

	

}
