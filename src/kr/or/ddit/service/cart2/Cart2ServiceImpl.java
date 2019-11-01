package kr.or.ddit.service.cart2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import kr.or.ddit.dao.cart2.Cart2Dao;
import kr.or.ddit.dao.board.BoardDaoImpl;
import kr.or.ddit.dao.cart2.Cart2DaoImpl;
import kr.or.ddit.service.board.BoardServiceImpl;
import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.ProdVO;


public class Cart2ServiceImpl extends UnicastRemoteObject implements Cart2Service{
	
	Cart2Dao cart2dao;
	
	private static Cart2ServiceImpl service;//Singleton패턴

	private Cart2ServiceImpl() throws RemoteException {
		super();
		cart2dao = Cart2DaoImpl.getInstance();//Singleton패턴
	}

	public static Cart2ServiceImpl getInstance() throws RemoteException {
		if(service== null) {
			service = new Cart2ServiceImpl();
		}
		return service;
	}
/*
	@Override
	public int updateCart(ProdVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return cart2dao.updateCart(vo);
	}*/

	@Override
	public int deleteCart(CartVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return cart2dao.deleteCart(vo);
	}

	@Override
	public List<CartVO> getAllList(CartVO vo) throws RemoteException {
		return cart2dao.getAllList(vo);
	}

	@Override
	public int insertCart(CartVO vo) throws RemoteException {
		return cart2dao.insertCart(vo);
	}

/*	@Override
	public List<CartVO> readCart(CartVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return cart2dao.readCart(vo);
	}

	@Override
	public boolean getCartNo(Integer prod_id) throws RemoteException {
		// TODO Auto-generated method stub
		return cart2dao.getCartNo(prod_id);
	}*/

	
	
	
	
	

}
