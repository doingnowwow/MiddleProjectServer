package kr.or.ddit.service.memberSearch;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.memberSearch.MemSearchDaoImpl;
import kr.or.ddit.vo.MemberSearchVO;

public class MemberSearchServiceImpl extends UnicastRemoteObject implements MemberSearchService {

	private static MemberSearchServiceImpl service;
	
	private MemSearchDaoImpl dao;
	
	private MemberSearchServiceImpl() throws RemoteException {
		super();
		dao = MemSearchDaoImpl.getInstance();
	}
	
	public static MemberSearchServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new MemberSearchServiceImpl();
		}
		return service;
	}
	
	
	@Override
	public List<MemberSearchVO> getAllMember()
			throws RemoteException {
		return dao.getAllMember();
	}

	@Override
	public List<MemberSearchVO> getMemberByTF(MemberSearchVO ms)
			throws RemoteException {
		return dao.getMemberByTF(ms);
	}

	@Override
	public List<MemberSearchVO> getAllMemPet()
			throws RemoteException {
		return dao.getAllMemPet();
	}

	@Override
	public List<MemberSearchVO> getMemPetByTF(MemberSearchVO ms)
			throws RemoteException {
		return dao.getMemPetByTF(ms);
	}

	@Override
	public List<MemberSearchVO> getAllComMem()
			throws RemoteException {
		return dao.getAllComMem();
	}

	@Override
	public List<MemberSearchVO> getComMemByTF(MemberSearchVO ms)
			throws RemoteException {
		return dao.getComMemByTF(ms);
	}

}
