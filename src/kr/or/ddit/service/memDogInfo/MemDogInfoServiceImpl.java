package kr.or.ddit.service.memDogInfo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import kr.or.ddit.dao.memDogInfo.MemDogInfoDaoImpl;
import kr.or.ddit.vo.MemDogVO;

public class MemDogInfoServiceImpl extends UnicastRemoteObject implements MemDogInfoService {
	
	
	private MemDogInfoDaoImpl dogDao;
	private static MemDogInfoServiceImpl dogservice;
	
	private MemDogInfoServiceImpl() throws RemoteException {
		super();
		
		dogDao = MemDogInfoDaoImpl.getInstance();
	}
	
	
	public static MemDogInfoService getInstance()  throws RemoteException{
		
		if(dogservice == null	) {
			dogservice = new MemDogInfoServiceImpl();
		}
		return dogservice;
	}
	
	
	

	@Override
	public MemDogVO getDogInfo(MemDogVO mdvo) throws RemoteException {
		return dogDao.getDogInfo(mdvo);
	}

	@Override
	public int updateDog(MemDogVO mdvo) throws RemoteException {
		return dogDao.updateDog(mdvo);
	}

	@Override
	public int deleteDog(MemDogVO mdvo) throws RemoteException {
		return dogDao.deleteDog(mdvo);
	}

}
