package kr.or.ddit.service.com;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.com.ComDao;
import kr.or.ddit.dao.com.ComDaoImpl;
import kr.or.ddit.vo.ComVO;

public class ComServiceImpl extends UnicastRemoteObject implements ComService {
	
	
	private ComDaoImpl comDao;
	
	 private static ComServiceImpl comService;
	 
	   private ComServiceImpl() throws RemoteException {
		   super();
		  //memDao = new MemeberDao(); //싱글턴 사용 전.
	      comDao = ComDaoImpl.getInstance();   //Dao객체 생성
	   }
	   public static ComService getInstance() throws RemoteException {
		   if(comService == null) {
			   comService = new ComServiceImpl();
		   }
		   return comService;
	   }
	@Override
	public ComVO getCom_pw(ComVO cvo) throws  RemoteException{
		return comDao.getCom_pw(cvo);
	}
	@Override
	public ComVO ComgetDefaulInfo(ComVO cvo) throws  RemoteException{
		
		return comDao.ComgetDefaulInfo(cvo);	
		
	}
	@Override
	public int updateCom(ComVO cvo) throws  RemoteException{
		return comDao.updateCom(cvo);
	}
	@Override
	public int deleteCom(ComVO cvo)throws  RemoteException {
		
		return comDao.deleteCom(cvo);
	}
	@Override
	public List<ComVO> SearchComInfo(int com_no) throws RemoteException {
		
		return comDao.SearchComInfo(com_no);
	}
	@Override
	public ComVO searchCom(ComVO com) throws RemoteException {
		return comDao.searchCom(com);
	}
	@Override
	public List<ComVO> getAllComMember() throws RemoteException {
	
		return comDao.getAllComMember();
	}

}