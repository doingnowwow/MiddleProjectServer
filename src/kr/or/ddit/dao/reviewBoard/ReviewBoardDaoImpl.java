package kr.or.ddit.dao.reviewBoard;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;

import kr.or.ddit.vo.ReviewBoardVO;


public class ReviewBoardDaoImpl implements ReviewBoardDao {

	private SqlMapClient smc; // review.xml 연결

	private static ReviewBoardDaoImpl dao = new ReviewBoardDaoImpl();
	
	private ReviewBoardDaoImpl() { 
		smc = SqlMapClientFactory.getInstance();
	}

	// 객체 생성 및 제공
	public static ReviewBoardDaoImpl getInstance() {
		if (dao == null) {
			dao = new ReviewBoardDaoImpl();
		}
		return dao;
	}

	@Override
	public int insertReviewBoard(ReviewBoardVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("Reviewboard.insertReBoard",vo);
			
			if(obj ==null) {
				cnt=1;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cnt;
	}
	@Override
	public int updateReviewBoard(ReviewBoardVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("Reviewboard.updateReBoard", vo);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}


	@Override
	public int deleteReviewBoard(ReviewBoardVO vo) throws RemoteException {
		  int cnt = 0;

	      try {
	         cnt = smc.delete("Reviewboard.deleteReBoard",vo);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
	      return cnt;
	   }
	@Override
	public List<ReviewBoardVO> getReAllList() throws RemoteException {
		ArrayList<ReviewBoardVO> boardList = new ArrayList<ReviewBoardVO>();
		
		try {
			boardList = (ArrayList<ReviewBoardVO>) smc.queryForList("Reviewboard.selectReBoardlist");
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public List<ReviewBoardVO> readReBoard(ReviewBoardVO vo) throws RemoteException {
		List<ReviewBoardVO> readboard = new ArrayList<>();
	      
		try {
			readboard = smc.queryForList("Reviewboard.selectReBoardread",vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	      
	      return readboard;
	}

	@Override
	public boolean getReviewBoardNo(int Rebd_no) throws RemoteException {
	boolean chk = false;
		
		try {
			int cnt =(int)smc.queryForObject("Reviewboard.getReBoard",Rebd_no);
			
			if(cnt > 0) {
				chk =true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chk;
	}



	

}
