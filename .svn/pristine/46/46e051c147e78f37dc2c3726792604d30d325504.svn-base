package kr.or.ddit.dao.horeview;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.HotelReviewVO;

public class HoReviewDaoImpl implements HoReviewDao {
	
	private SqlMapClient smc; // review.xml연결
	
	//외부에서 객체 생성 막음
	public static HoReviewDaoImpl dao = new HoReviewDaoImpl();
	
	private  HoReviewDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	// 객체 생성 및 제공
	public static HoReviewDaoImpl getInstance() throws RemoteException{
		if(dao == null) {
			dao = new HoReviewDaoImpl();
		}
		return dao;
	}

	/**
	 * 내가 쓴 호텔리뷰 조회
	 */
	@Override
	public List<HotelReviewVO> selectRewview(HotelReviewVO mem_no)throws RemoteException {
		ArrayList<HotelReviewVO> noticeList = new ArrayList<>();
		
		try {
			noticeList = (ArrayList<HotelReviewVO>) smc.queryForList("hReview.selectListMy",mem_no);
		}catch (SQLException e) {
			noticeList = null;
			e.printStackTrace();
		}
		return noticeList;
	}
	
	/**
	 * 호텔 별 리뷰 조회
	 */
	@Override
	public List<HotelReviewVO> selectReviewHotel(HotelReviewVO hotel_no) throws RemoteException {
		ArrayList<HotelReviewVO> ho_list = new ArrayList<>();
		
		try {
			ho_list = (ArrayList<HotelReviewVO>) smc.queryForList("hReview.selectListHotel", hotel_no);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ho_list;
	}
	
	
	@Override
	public List<HotelReviewVO> selectMyReviewDate(HotelReviewVO mv) throws RemoteException {
		ArrayList<HotelReviewVO> dateList = new ArrayList<>();
		
		try {
			dateList = (ArrayList<HotelReviewVO>) smc.queryForList("hReview.selectMyReviewDate", mv);
		}catch (SQLException e) {
			dateList = null;
			e.printStackTrace();
		}
		return dateList;
	}
	
	@Override
	public List<HotelReviewVO> selectMyReviewText(HotelReviewVO mv) throws RemoteException {
		ArrayList<HotelReviewVO> textList = new ArrayList<>();
		try {
			textList = (ArrayList<HotelReviewVO>) smc.queryForList("hReview.selectMyReviewText", mv);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return textList;
	}

	@Override
	public int insertHotelReview(HotelReviewVO vo)throws RemoteException {
		int cnt = 0;
		try {
			Object obj = smc.insert("hReview.insertHotelReview",vo);
			
			if(obj == null) {
				cnt = 1;
			}else {
				
			}
		}catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteHotelReview(HotelReviewVO vo)throws RemoteException {
		int cnt = 0;
		try {
			cnt  = smc.delete("hReview.deleteHotelReview", vo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return cnt;
	}

	@Override
	public int updateHotelReview(HotelReviewVO vo) throws RemoteException{
		int cnt = 0;
		
		try {
			cnt = smc.update("hReview.updateHotelReview", vo);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<HotelReviewVO> adminHotelReview()throws RemoteException {
		ArrayList<HotelReviewVO> reviewList = new ArrayList<HotelReviewVO>();
		
		try {
			reviewList = (ArrayList<HotelReviewVO>) smc.queryForList("hReview.slectListAdmin");
		} catch (SQLException e) {
			System.out.println("리뷰리스트 관리자 에러");
			e.printStackTrace();
		}
		return reviewList;
	}

	@Override
	public int deleteAdminHotelReview(HotelReviewVO vo)throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("hReview.deleteAdminHotelReview", vo);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		} finally {
			
		}
		
		return cnt;
	}

	@Override
	public List<HotelReviewVO> selectHotelReview(HotelReviewVO hotel_no)throws RemoteException {
		ArrayList<HotelReviewVO> selectReview = new ArrayList<>();
		
		try {
			selectReview = (ArrayList<HotelReviewVO>) smc.queryForList("selectHotelReview", hotel_no);
			
			} catch (Exception e) {
				System.out.println("에러");
				e.printStackTrace();
			} 
		return selectReview;
	}

	@Override
	public List<HotelReviewVO> clickedReviewNo(String word) throws RemoteException{
		ArrayList<HotelReviewVO> list = new ArrayList<HotelReviewVO>();
		
		try {
			list = (ArrayList<HotelReviewVO>) smc.queryForList("clickedReviewNo",word);
		}catch (SQLException e) {
			System.out.println("검색에러");
			e.printStackTrace();
		}
		return list;
	}

}
