package kr.or.ddit.service.like;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.like.LikeDaoImpl;
import kr.or.ddit.vo.LikeVO;

public class LikeServiceImpl extends UnicastRemoteObject implements LikeService {
	
	private LikeDaoImpl likeDao;
	private static LikeServiceImpl service;
	
	private LikeServiceImpl() throws RemoteException {
		super();
		likeDao = LikeDaoImpl.getInstance();// 이거 왜 에러인가..
		
	}
	
	public static LikeServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new LikeServiceImpl();
		}
		return service;
	}

	@Override
	public List<LikeVO> dlikelist(LikeVO vo) throws RemoteException {
		return likeDao.dlikelist(vo);
	}

	@Override
	public int deleteDlike(LikeVO vo) throws RemoteException {
		return likeDao.deleteDlike(vo);
	}

	@Override
	public int detailview(LikeVO vo) throws RemoteException {
		return likeDao.detailview(vo);
	}

	@Override
	public int insertLike(LikeVO vo) throws RemoteException {
		return likeDao.insertLike(vo);
	}

}
