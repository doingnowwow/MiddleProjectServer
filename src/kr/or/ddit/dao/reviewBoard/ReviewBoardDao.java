package kr.or.ddit.dao.reviewBoard;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.ReviewBoardVO;



public interface ReviewBoardDao {

	//게시글 등록
	public int insertReviewBoard(ReviewBoardVO vo) throws RemoteException;
	
	//게시글 수정
	public int updateReviewBoard(ReviewBoardVO vo) throws RemoteException;
	
	//게시글 삭제
	public int deleteReviewBoard(ReviewBoardVO vo) throws RemoteException;
	
	//전체 리스트 조회
	public List<ReviewBoardVO> getReAllList() throws RemoteException;
	
	//게시글 확인
	public List<ReviewBoardVO> readReBoard(ReviewBoardVO vo) throws RemoteException;
	
	//게시글 존재여부 확인
	public boolean getReviewBoardNo(int Rebd_no) throws RemoteException;
	
	
	//게시글 신고
	
	//게시글 관리(관리자 페이지)
}
