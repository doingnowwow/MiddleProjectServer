package kr.or.ddit.service.ILogin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.ILogin.LoginDaoImpl;
import kr.or.ddit.vo.ComVO;
import kr.or.ddit.vo.MemberVO;

public class LoginServiceImpl extends UnicastRemoteObject implements ILoginService {

	private LoginDaoImpl loginDao;
	private static LoginServiceImpl logService;

	public LoginServiceImpl() throws RemoteException {
		loginDao = LoginDaoImpl.getInstance();
	}

	public static LoginServiceImpl getInstance() throws RemoteException {
		if (logService == null) {
			logService = new LoginServiceImpl();
		}
		return logService;
	}

	@Override
	public List<MemberVO> memberLogin(MemberVO mv) throws RemoteException {
		return loginDao.memberLogin(mv);
	}

	@Override
	public List<MemberVO> idSearch(MemberVO mv) throws RemoteException {
		return loginDao.idSearch(mv);
	}

	@Override
	public List<MemberVO> memNoSearch(MemberVO mv) throws RemoteException {
		return loginDao.memNoSearch(mv);
	}
	
	@Override
	public List<ComVO> comnoSearch(ComVO cv) throws RemoteException {
		return loginDao.comnoSearch(cv);
	}

	@Override
	public List<MemberVO> pwSearch(MemberVO mv) throws RemoteException {
		return loginDao.pwSearch(mv);
	}

	@Override
	public List<ComVO> isCom(ComVO cv) throws RemoteException {
		return loginDao.isCom(cv);

	}
	
	@Override
	public List<MemberVO> isMemPwchek(MemberVO mv) throws RemoteException{
		return loginDao.isMemPwchek(mv);
	}

	
}
