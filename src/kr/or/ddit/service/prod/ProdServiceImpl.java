package kr.or.ddit.service.prod;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.prod.ProdDao;
import kr.or.ddit.dao.prod.ProdDaoImpl;
import kr.or.ddit.vo.ProdVO;

public class ProdServiceImpl extends UnicastRemoteObject  implements ProdService{


private static ProdServiceImpl prodService;
	
	private ProdDao prodDao;
	
	private ProdServiceImpl() throws RemoteException{
		prodDao = ProdDaoImpl.getInstance();
	}
	
	public static ProdServiceImpl getInstance() throws RemoteException {
		if(prodService == null) {
			prodService = new ProdServiceImpl();
			
		}
		return prodService;
	}

	@Override
	public List<ProdVO> getAllProd() throws RemoteException {
		return prodDao.getAllProd();
	}

	@Override
	public int insertProd(ProdVO vo) throws RemoteException {
		return prodDao.insertProd(vo);
	}

	@Override
	public List<ProdVO> SearchProd(ProdVO vo) throws RemoteException {
		return prodDao.SearchProd(vo);
	}

	@Override
	public int updateProd(ProdVO vo) throws RemoteException {
		return prodDao.updateProd(vo);
	}

	@Override
	public int deleteProd(ProdVO vo) throws RemoteException {
		return prodDao.deleteProd(vo);
	}

	@Override
	public List<ProdVO> getSelectedProd(ProdVO vo) throws RemoteException {
		return prodDao.getSelectedProd(vo);
	}
	
	@Override
		public List<ProdVO> getSearchProdList(ProdVO vo) throws RemoteException {
		return prodDao.getSearchProdList(vo);
	}
	
	
}
