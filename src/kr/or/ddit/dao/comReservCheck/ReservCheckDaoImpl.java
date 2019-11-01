package kr.or.ddit.dao.comReservCheck;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.ComReservCheckVO;

public class ReservCheckDaoImpl implements ReservCheckDao {
	
	private static ReservCheckDaoImpl dao = new ReservCheckDaoImpl();
	private SqlMapClient smc;
	
	private ReservCheckDaoImpl () {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ReservCheckDaoImpl getInstance() {
		if(dao == null) {
			dao = new ReservCheckDaoImpl();
		}
		return dao;
	}

	@Override
	public List<ComReservCheckVO> getAllBookCheck(ComReservCheckVO cv) throws RemoteException {
		List<ComReservCheckVO> com_book_list = null;
		
		try {
			com_book_list = smc.queryForList("check.getAllBookCheck", cv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return com_book_list;
	}

	@Override
	public List<ComReservCheckVO> getAllBookByMonth(ComReservCheckVO cv) throws RemoteException {
		List<ComReservCheckVO> com_month_list = null;
		
		try {
			com_month_list = smc.queryForList("check.getAllBookMonthCheck", cv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return com_month_list;
	}

}
