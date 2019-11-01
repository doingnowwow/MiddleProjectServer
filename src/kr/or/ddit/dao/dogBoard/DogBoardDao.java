package kr.or.ddit.dao.dogBoard;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.DogBoardVO;

public interface DogBoardDao extends Remote{

/**
 * 분양 후기 게시판 전체 출력
 * @return
 */
	
public List<DogBoardVO> getAllDogBoard() throws RemoteException;


/**
 * 분양후기 게시판 등록
 * @param dbv
 * @return
 */
public int insertDogBoard(DogBoardVO dbv) throws RemoteException;

/**
 * 분양 후기 게시판 검색 메서드	
 */

public List<DogBoardVO> searchDogBoard(String content) throws RemoteException;

/**
 * 분양 후기 게시글 수정
 * 
 */
public int updateDogBoard(DogBoardVO dbv) throws RemoteException;

/**
 * 분양 후기 게시글 삭제
 *
 */

public int deleteDogBoard(DogBoardVO dbv) throws RemoteException;


public List<DogBoardVO> getMyBoardList(DogBoardVO dv) throws RemoteException;
	

}
