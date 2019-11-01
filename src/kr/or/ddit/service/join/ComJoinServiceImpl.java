package kr.or.ddit.service.join;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.join.ComJoinDaoImpl;
import kr.or.ddit.vo.ComVO;

public class ComJoinServiceImpl extends UnicastRemoteObject implements IComJoinService {

	private ComJoinDaoImpl comDao;
	private static ComJoinServiceImpl service;
	
	private ComJoinServiceImpl() throws RemoteException {
		super();
		comDao = ComJoinDaoImpl.getInstance();
	}
	
	public static ComJoinServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new ComJoinServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<ComVO> comSelectId(ComVO cv) throws RemoteException {
		return comDao.comSelectId(cv);
	}

	@Override
	public List<ComVO> comSelectEmail(ComVO cv) throws RemoteException {
		return comDao.comSelectEmail(cv);
	}

	@Override
	public int insertCom(ComVO cv) throws RemoteException {
		return comDao.insertCom(cv);
	}

}
