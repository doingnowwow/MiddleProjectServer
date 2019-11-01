package kr.or.ddit.service.dogSaleAdd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.dogSaleAdd.DogSaleAddDaoImpl;
import kr.or.ddit.vo.DogSaleAddVO;

//서현작업중
public class DogSaleAddServiceImpl extends UnicastRemoteObject implements DogSaleAddService {

	DogSaleAddDaoImpl dogAddDao;
	
	private static DogSaleAddServiceImpl service;
	
	protected DogSaleAddServiceImpl() throws RemoteException {
		super();
		dogAddDao = DogSaleAddDaoImpl.getInstance();
	}
	
	public static DogSaleAddServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new DogSaleAddServiceImpl();
		}
		return service;
	}

	@Override
	public int insertDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		return dogAddDao.insertDogSaleAdd(vo);
	}

	@Override
	public int deleteDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		return dogAddDao.deleteDogSaleAdd(vo);
	}

	@Override
	public List<DogSaleAddVO> AllSaleAddList(int com_no) throws RemoteException {
		return dogAddDao.AllSaleAddList(com_no);
	}

	@Override
	public int updateDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		return dogAddDao.updateDogSaleAdd(vo);
	}

}
