package kr.or.ddit.dao.blacklist;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BlackVO;

public class BlacklistDaoImpl implements BlacklistDao {
	
	private SqlMapClient smc;
	
	public static BlacklistDaoImpl dao = new BlacklistDaoImpl();
	
	private BlacklistDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static BlacklistDaoImpl getInstance() {
		if(dao == null) {
			dao = new BlacklistDaoImpl();
		}
		return dao;
	}
	

	@Override
	public int insertBlack(BlackVO bv) throws RemoteException {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("black.insertBlack", bv);
			if(obj == null) {
				cnt = 1;
			}else {
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateBlack(BlackVO bv) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("black.updateBlack", bv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	@Override
	public int deleteBlack(BlackVO bv) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.delete("black.deleteBlack", bv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<BlackVO> showAllB() throws RemoteException {
		List<BlackVO> blist = null;
		
		try {
			blist = smc.queryForList("black.showAllb");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return blist;
	}

	@Override
	public List<BlackVO> searchB(BlackVO bv) throws RemoteException {
		List<BlackVO> blist = null;
		
		try {
			blist = smc.queryForList("black.searchB", bv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return blist;
	}


}
