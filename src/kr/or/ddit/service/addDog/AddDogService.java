package kr.or.ddit.service.addDog;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public interface AddDogService extends Remote {

	public List<MemDogVO> getAllDog(int mem_dog_no) throws RemoteException;
	
	public int updatedog(MemberVO db) throws RemoteException;
	
	public int deletedog(String da) throws RemoteException;
	
	public int insertdog(String dv) throws RemoteException;
	
}
