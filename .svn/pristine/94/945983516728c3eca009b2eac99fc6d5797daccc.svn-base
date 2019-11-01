package kr.or.ddit.service.horeview;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.horeview.HoReviewDaoImpl;
import kr.or.ddit.vo.HotelReviewVO;

public class HoReviewServiceImpl extends UnicastRemoteObject implements HoReviewService{

	HoReviewDaoImpl horeviewDao; // 사용할 Dao의 멤버변수 선언
	
	private static HoReviewServiceImpl service; // singleton패턴
	
	
	protected HoReviewServiceImpl() throws RemoteException {
		super();
		horeviewDao = HoReviewDaoImpl.getInstance(); // 싱글톤패턴
	}
	
	public static HoReviewServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new HoReviewServiceImpl();
		}
		return service;
	}

	@Override
	public List<HotelReviewVO> selectRewview(HotelReviewVO mem_no) throws RemoteException {
		
		return horeviewDao.selectRewview(mem_no);
	}

	@Override
	public List<HotelReviewVO> selectMyReviewDate(HotelReviewVO mv) throws RemoteException {
		return horeviewDao.selectMyReviewDate(mv);
	}
	
	@Override
	public List<HotelReviewVO> selectMyReviewText(HotelReviewVO mv) throws RemoteException {
		return horeviewDao.selectMyReviewText(mv);
	}
	
	@Override
	public int insertHotelReview(HotelReviewVO vo) throws RemoteException {
		
		return horeviewDao.insertHotelReview(vo);
	}

	@Override
	public int deleteHotelReview(HotelReviewVO vo) throws RemoteException {
		
		return horeviewDao.deleteAdminHotelReview(vo);
	}

	@Override
	public int updateHotelReview(HotelReviewVO vo) throws RemoteException {
		
		return horeviewDao.updateHotelReview(vo);
	}

	@Override
	public List<HotelReviewVO> adminHotelReview() throws RemoteException {
		
		return horeviewDao.adminHotelReview();
	}

	@Override
	public int deleteAdminHotelReview(HotelReviewVO vo) throws RemoteException {
		
		return horeviewDao.deleteAdminHotelReview(vo);
	}

	@Override
	public List<HotelReviewVO> selectHotelReview(HotelReviewVO hotel_no) throws RemoteException {
		
		return horeviewDao.selectHotelReview(hotel_no);
	}

	@Override
	public List<HotelReviewVO> selectReviewHotel(HotelReviewVO hotel_no) throws RemoteException {
		return horeviewDao.selectReviewHotel(hotel_no);
	}


	
	
}
