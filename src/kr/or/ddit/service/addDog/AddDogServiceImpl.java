package kr.or.ddit.service.addDog;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.adddog.AddDogDao;
import kr.or.ddit.dao.adddog.AddDogDaoImpl;
import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public class AddDogServiceImpl extends UnicastRemoteObject implements AddDogService {

	private static AddDogServiceImpl dogService;
	
	private AddDogDao addDao;
	
	private AddDogServiceImpl() throws RemoteException{
		addDao = AddDogDaoImpl.getInstance();
	}
	
	public static AddDogServiceImpl getInstance() throws RemoteException {
		if(dogService == null) {
			dogService = new AddDogServiceImpl();
			
		}
		return dogService;
	}
   

	@Override
	public List<MemDogVO> getAllDog(int mem_dog_no) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatedog(MemberVO db) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletedog(String da) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertdog(String dv) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
	}