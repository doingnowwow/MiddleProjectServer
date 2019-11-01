package kr.or.ddit.service.member;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.member.IMemberDao;
import kr.or.ddit.dao.member.MemberDaoImpl;
import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public class MemberServiceImpl extends UnicastRemoteObject implements MemberService {

	private static MemberServiceImpl memService;
	
	private IMemberDao memDao;
	
	private MemberServiceImpl() throws RemoteException{
		memDao = MemberDaoImpl.getInstance();
	}
	
	public static MemberServiceImpl getInstance() throws RemoteException {
		if(memService == null) {
			memService = new MemberServiceImpl();
			
		}
		return memService;
	}
	
	
	
	@Override
	public MemberVO login(String mem_id, String mem_pw) throws RemoteException {
		return memDao.login(mem_id, mem_pw);
	}

	@Override
	public List<MemberVO> getAllMember() throws RemoteException {
		return memDao.getAllMember();
	}

	@Override
	public List<MemberVO> getSearchMember(MemberVO mv) throws RemoteException{
		return memDao.getSearchMember(mv);
	}

	@Override
	public List<MemDogVO> getDogList(int mem_no) throws RemoteException{
		return memDao.getDogList(mem_no);
	}

	@Override
	public int updateMember(MemberVO mv) throws RemoteException {
		return memDao.updateMember(mv);
	}

	@Override
	public int deleteMember(String mem_id) throws RemoteException {
		return memDao.deleteMember(mem_id);
	}

	@Override
	public List<MemberVO> getgrade(int mem_point) throws RemoteException {
		return memDao.getgrade(mem_point);
	}

	@Override
	public int updategrade(MemberVO mem_point) throws RemoteException {
		return memDao.updategrade(mem_point);
	}

	@Override
	public List<MemberVO> getAllMemberAll() throws RemoteException {
		// TODO Auto-generated method stub
		return memDao.getAllMemberAll();
	}


}
