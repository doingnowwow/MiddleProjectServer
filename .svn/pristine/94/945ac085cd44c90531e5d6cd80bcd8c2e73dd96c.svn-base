package kr.or.ddit.dao.like;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.LikeVO;
import kr.or.ddit.vo.MemberVO;

public interface LikeDao extends Remote {
	
	//찜 조회 회원 별
	public List<LikeVO> dlikelist (LikeVO vo) throws RemoteException;

	public int deleteDlike(LikeVO vo) throws RemoteException;
	
	public int detailview(LikeVO vo) throws RemoteException;
	
	public int insertLike(LikeVO vo) throws RemoteException;
	
	

}
