package kr.or.ddit.dao.join;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.ComVO;

public class ComJoinDaoImpl implements iComJoinDao {
	
	private SqlMapClient smc;
	
	private static ComJoinDaoImpl comDao;
	private ComJoinDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ComJoinDaoImpl getInstance() {
		if(comDao == null) {
			comDao = new ComJoinDaoImpl();
		}
		return comDao;
	}

	@Override
	public List<ComVO> comSelectId(ComVO cv) throws RemoteException {
		List<ComVO> comList = new ArrayList<>();
		try {
			comList = (List<ComVO>) smc.queryForList("comJoin.comSelectId", cv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return comList;
	}

	@Override
	public List<ComVO> comSelectEmail(ComVO cv) throws RemoteException {
		List<ComVO> comList = new ArrayList<>();
		try {
			comList = (List<ComVO>) smc.queryForList("comJoin.comSelectEmail", cv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return comList;
	}

	@Override
	public int insertCom(ComVO cv) throws RemoteException {
		int cnt = 0;
		try {
			Object obj = smc.insert("comJoin.insertCom", cv);
			if(obj == null) {
				cnt = 1;
			}else {
				cnt = 0;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
