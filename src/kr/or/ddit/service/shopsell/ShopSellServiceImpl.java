package kr.or.ddit.service.shopsell;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.shopsell.ShopSellDaoImpl;
import kr.or.ddit.vo.SellVO;

public class ShopSellServiceImpl extends UnicastRemoteObject implements ShopSellService {

	ShopSellDaoImpl dao;
	
	public static ShopSellServiceImpl service;
	
	public ShopSellServiceImpl () throws RemoteException {
		super();
		dao = ShopSellDaoImpl.getInstance();
	}
	
	public static ShopSellServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new ShopSellServiceImpl();
		}
		return service;
	}
	
	
	@Override
	public List<SellVO> sellListAll() throws RemoteException {
		// TODO Auto-generated method stub
		return dao.sellListAll();
	}

	@Override
	public List<SellVO> sellCnt() throws RemoteException {
		return dao.sellCnt();
	}

}
