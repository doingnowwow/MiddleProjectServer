package kr.or.ddit.service.blacklist;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.blacklist.BlacklistDao;
import kr.or.ddit.dao.blacklist.BlacklistDaoImpl;
import kr.or.ddit.vo.BlackVO;

public class BlacklistServiceImpl extends UnicastRemoteObject implements BlacklistService {

	BlacklistDao dao;
	
	public static BlacklistServiceImpl service;
	
	public BlacklistServiceImpl() throws RemoteException {
		super();
		dao = BlacklistDaoImpl.getInstance();
	}
	
	public static BlacklistServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new BlacklistServiceImpl();
		}
		return service;
	}
	
	@Override
	public int insertBlack(BlackVO bv) throws RemoteException {
		return dao.insertBlack(bv);
	}

	@Override
	public int updateBlack(BlackVO bv) throws RemoteException {
		return dao.updateBlack(bv);
	}
	
	@Override
	public int deleteBlack(BlackVO bv) throws RemoteException {
		return dao.deleteBlack(bv);
	}

	@Override
	public List<BlackVO> showAllB() throws RemoteException {
		return dao.showAllB();
	}

	@Override
	public List<BlackVO> searchB(BlackVO bv) throws RemoteException {
		return dao.searchB(bv);
	}


}
