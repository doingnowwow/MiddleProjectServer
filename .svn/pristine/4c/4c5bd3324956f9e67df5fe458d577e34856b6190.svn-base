package kr.or.ddit.dao.memDogInfo;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemDogVO;

public class MemDogInfoDaoImpl implements MemDogInfoDao {
	
	private SqlMapClient smc;
	private static MemDogInfoDaoImpl dao = new MemDogInfoDaoImpl();
	
	private MemDogInfoDaoImpl(){
		
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static MemDogInfoDaoImpl getInstance() {
		if(dao == null) {
			dao = new MemDogInfoDaoImpl();
		}
		return dao;
	}
	
	

	@Override
	public MemDogVO getDogInfo(MemDogVO mdvo) {
		MemDogVO vo = new MemDogVO();
		try {
			vo = (MemDogVO) smc.queryForObject("memDogInfo.getMemDogInfoAll",mdvo);
		}catch(SQLException e	) {
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int updateDog(MemDogVO mdvo) {
		int cnt = 0;
		
		
		try {
			cnt = smc.update("memDogInfo.updateMemDogInfo",mdvo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteDog(MemDogVO mdvo) {
		
		int cnt = 0;
		try {
			cnt = smc.update("memDogInfo.deleteMemDogInfo",mdvo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
