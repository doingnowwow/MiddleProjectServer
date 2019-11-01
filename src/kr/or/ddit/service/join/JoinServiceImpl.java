package kr.or.ddit.service.join;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.join.JoinDaoImpl;
import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public class JoinServiceImpl extends UnicastRemoteObject implements IJoinService {
	
	private JoinDaoImpl joinDao;
	private static JoinServiceImpl joinService;
	
	private JoinServiceImpl() throws RemoteException {
		super();
		joinDao = JoinDaoImpl.getInstance();
	}
	
	public static JoinServiceImpl getInstance() throws RemoteException {
		if( joinService == null) {
			joinService = new JoinServiceImpl();
		}
		return joinService;
	}

	@Override
	public List<MemberVO> selectId(MemberVO mv) throws RemoteException {
		return joinDao.selectId(mv);
	}

	@Override
	public List<MemberVO> selectEmail(MemberVO mv) throws RemoteException {
		return joinDao.selectEmail(mv);
	}

	@Override
	public int insertMember(MemberVO mv) throws RemoteException {
		return joinDao.insertMember(mv);
	}

	@Override
	public int insertMemDog(MemDogVO dv)  throws RemoteException {
		return joinDao.insertMemDog(dv);
	}

}
