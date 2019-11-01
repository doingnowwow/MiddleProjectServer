package kr.or.ddit.dao.join;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public interface IJoinDao extends Remote{

	public List<MemberVO> selectId(MemberVO mv) throws RemoteException;
	
	public List<MemberVO> selectEmail(MemberVO mv) throws RemoteException ;
	
	public int insertMember(MemberVO mv) throws RemoteException  ;
	
	public int insertMemDog(MemDogVO dv) throws RemoteException  ;
}
