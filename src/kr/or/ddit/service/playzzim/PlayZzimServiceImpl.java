package kr.or.ddit.service.playzzim;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import kr.or.ddit.dao.PlayZzim.PlayZzimDao;
import kr.or.ddit.dao.PlayZzim.PlayZzimDaoImpl;
import kr.or.ddit.dao.memInfoUpdate.MemInfoUpdateDaoImpl;
import kr.or.ddit.service.memInfoUpdate.MemInfoUpdateService;
import kr.or.ddit.service.memInfoUpdate.MemInfoUpdateServiceImpl;
import kr.or.ddit.vo.PlayZzimVO;

public class PlayZzimServiceImpl extends UnicastRemoteObject implements PlayZzimService{
	
	private PlayZzimDao Dao;
	
	private static PlayZzimServiceImpl service;
	
	private PlayZzimServiceImpl() throws RemoteException {
		super();
		Dao = PlayZzimDaoImpl.getInstance();
	}
	
	
	
	public static PlayZzimServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new PlayZzimServiceImpl();
		}
		return service;
	}


	@Override
	public int insertZzimInfo(PlayZzimVO saveZzim) {
		return Dao.insertZzimInfo(saveZzim);
	}

}
