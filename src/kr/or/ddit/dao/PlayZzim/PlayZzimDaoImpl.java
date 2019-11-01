package kr.or.ddit.dao.PlayZzim;

import kr.or.ddit.dao.point.PointDaoImpl;
import kr.or.ddit.dao.prod.ProdDao;
import kr.or.ddit.dao.prod.ProdDaoImpl;
import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.PlayZzimVO;

import com.ibatis.sqlmap.client.SqlMapClient;

public class PlayZzimDaoImpl implements PlayZzimDao{
	private static PlayZzimDaoImpl dao;
	private SqlMapClient smc;
	
	private PlayZzimDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static PlayZzimDaoImpl getInstance() {
		if( dao == null) {
			dao = new PlayZzimDaoImpl();
		}
		return dao;
	}
	
	
	
	

	
	
	@Override
	public int insertZzimInfo(PlayZzimVO saveZzim) {
		int cnt = 0;
//		Object obj;
//		try {
//			obj = smc.insert("playzzim.insertZzimInfo", saveZzim);
//			if(obj == null) {
//				cnt = 1;
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		return cnt;
	}

}
