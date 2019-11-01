package kr.or.ddit.dao.board;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.BoardVO;



public interface BoardDao {

	//게시글 등록
	public int insertBoard(BoardVO vo) throws RemoteException;
	
	//게시글 수정
	public int updateBoard(BoardVO vo) throws RemoteException;
	
	//게시글 삭제
	public int deleteBoard(BoardVO vo) throws RemoteException;
	
	//전체 리스트 조회
	public List<BoardVO> getAllList() throws RemoteException;
	
	//게시글 확인
	public List<BoardVO> readBoard(BoardVO vo) throws RemoteException;
	
	//게시글 존재여부 확인
	public boolean getBoardNo(Integer bd_no) throws RemoteException;
	
	//게시글 제목 검색
	public List<BoardVO> searchBoardTitle(String b) throws RemoteException;
	//게시글 작성자 검색
	public List<BoardVO> searchBoardWriter(String b) throws RemoteException;
	
	
	//게시글 신고
	
	//게시글 관리(관리자 페이지)
}
