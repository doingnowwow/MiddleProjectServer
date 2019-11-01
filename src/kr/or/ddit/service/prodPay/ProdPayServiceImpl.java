package kr.or.ddit.service.prodPay;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.prodPay.ProdPayDao;
import kr.or.ddit.dao.prodPay.ProdPayDaoImpl;
import kr.or.ddit.vo.ProdPayVO;

public class ProdPayServiceImpl extends UnicastRemoteObject implements ProdPayService {

	
	// 싱글톤

	public static ProdPayServiceImpl prodPayservice;

	private ProdPayDao prodPayDao;
	
	private ProdPayServiceImpl() throws RemoteException {
		prodPayDao = ProdPayDaoImpl.getInstance();
	}

	public static ProdPayServiceImpl getInstance() throws RemoteException{
		if(prodPayservice == null) {
			prodPayservice = new ProdPayServiceImpl();
		}
		return prodPayservice;
	}

	
	
	@Override
	public List<ProdPayVO> getProdPayAllList(ProdPayVO vo) throws RemoteException {
		return prodPayDao.getProdPayAllList(vo);
	}

	@Override
	public int insertProdPay(ProdPayVO vo) throws RemoteException {
		return prodPayDao.insertProdPay(vo);
	}
	
	

}
