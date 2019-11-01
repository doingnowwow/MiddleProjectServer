package kr.or.ddit.service.comReservCheck;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.comReservCheck.ReservCheckDaoImpl;
import kr.or.ddit.vo.ComReservCheckVO;

public class ReservCheckServiceImpl extends UnicastRemoteObject implements ReservCheckService {

	private ReservCheckDaoImpl resDao; 
	
	private static ReservCheckServiceImpl servi;
	
	private ReservCheckServiceImpl() throws RemoteException {
		super();
		resDao = ReservCheckDaoImpl.getInstance();
	}
	
	public static ReservCheckServiceImpl getInstance() throws RemoteException {
		if(servi == null) {
			servi = new ReservCheckServiceImpl();
		}
		return servi;
	}
	
	@Override
	public List<ComReservCheckVO> getAllBookCheck(ComReservCheckVO cv) throws RemoteException {
		return resDao.getAllBookCheck(cv);
	}

	@Override
	public List<ComReservCheckVO> getAllBookByMonth(ComReservCheckVO cv) throws RemoteException {
		return resDao.getAllBookByMonth(cv);
	}

}
