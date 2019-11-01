package kr.or.ddit.service.memInfoUpdate;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import kr.or.ddit.dao.memInfoUpdate.MemInfoUpdateDaoImpl;
import kr.or.ddit.vo.MemberVO;

public class MemInfoUpdateServiceImpl extends UnicastRemoteObject implements MemInfoUpdateService {

	private MemInfoUpdateDaoImpl memInfoDao;
	
	private static MemInfoUpdateServiceImpl memInfoService;
	
	private MemInfoUpdateServiceImpl() throws RemoteException{
		super();
		
		memInfoDao = MemInfoUpdateDaoImpl.getInstance();
	}
	
	public static MemInfoUpdateService getInstance() throws RemoteException {
		if(memInfoService == null) {
			memInfoService = new MemInfoUpdateServiceImpl();
		}
		return memInfoService;
	}
	
	
	
	
	
	@Override
	public MemberVO getPw(MemberVO mvo) throws RemoteException {
		
		
		return memInfoDao.getPw(mvo);
		
		
	}

	@Override
	public MemberVO getDefaultInfo(MemberVO mvo) throws RemoteException {
		// TODO Auto-generated method stub
		return memInfoDao.getDefaultInfo(mvo);
	}

	@Override
	public int deleteMember(MemberVO mvo) throws RemoteException {
		// TODO Auto-generated method stub
		return memInfoDao.deleteMember(mvo);
	}

	@Override
	public int updateMember(MemberVO mvo) throws RemoteException {
		// TODO Auto-generated method stub
		return memInfoDao.updateMember(mvo);
	}

}
