package kr.or.ddit.service.Human_Mypage_Ranking;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.dao.Human_Mypage_Ranking.Human_MypageRankDaoImpl;
import kr.or.ddit.vo.PointVO;
import sun.print.resources.serviceui;

public class Human_MypageRankServiceImpl implements Human_MypageRankService {
	private Human_MypageRankDaoImpl rankDao;
	private static Human_MypageRankServiceImpl service;
	
	public Human_MypageRankServiceImpl() {
		rankDao = Human_MypageRankDaoImpl.getInstance();
	}
	
	public static Human_MypageRankServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new Human_MypageRankServiceImpl();
		}
		return service;
	}
	
	
	@Override
	public List<PointVO> getMemberPoint(PointVO Rank) throws RemoteException {
		return rankDao.getMemberPoint(Rank);
	}

}
