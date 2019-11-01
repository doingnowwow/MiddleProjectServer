package kr.or.ddit.service.petSaleApp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.petSaleApp.PetSaleAppDaoImpl;
import kr.or.ddit.vo.PetSaleAppVO;

public class PetSaleAppServiceImpl extends UnicastRemoteObject implements PetSaleAppService {

	PetSaleAppDaoImpl psaDao;
	
	private static PetSaleAppServiceImpl service;
	
	private PetSaleAppServiceImpl() throws RemoteException {
		super();
		psaDao = PetSaleAppDaoImpl.getInstance();
	}
	
	public static PetSaleAppServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new PetSaleAppServiceImpl();
		}
		return service;
	}
	
	
	@Override
	public List<PetSaleAppVO> getAllApp(PetSaleAppVO pv) throws RemoteException {
		return psaDao.getAllApp(pv);
	}

	@Override
	public int updatePetInfo(PetSaleAppVO pv) throws RemoteException {
		return psaDao.updatePetInfo(pv);
	}

	@Override
	public int insertApp(PetSaleAppVO pv) throws RemoteException {
		return psaDao.insertApp(pv);
	}

}
