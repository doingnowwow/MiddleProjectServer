package kr.or.ddit.service.board;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.board.BoardDao;
import kr.or.ddit.dao.board.BoardDaoImpl;
import kr.or.ddit.vo.BoardVO;



public class BoardServiceImpl extends UnicastRemoteObject implements BoardService {
	BoardDao boardDao;

	private static BoardServiceImpl service;//Singleton패턴

	private BoardServiceImpl() throws RemoteException {
		super();
		boardDao =  BoardDaoImpl.getInstance();//Singleton패턴s
	}

	public static BoardServiceImpl getInstance() throws RemoteException {
		if(service== null) {
			service = new BoardServiceImpl();
		}
		return service;
	}


	@Override
	public int insertBoard(BoardVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.updateBoard(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		 return boardDao.deleteBoard(vo);
	}

	@Override
	public List<BoardVO> getAllList() throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.getAllList();
	}
	
	@Override
	public List<BoardVO> readBoard(BoardVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.readBoard(vo);
	}
	
	@Override
	public boolean getBoardNo(Integer bd_no) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.getBoardNo(bd_no);
	}

/*	@Override
	public List<BoardVO> searchList(BoardVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.searchList(vo);
	}
*/
	@Override
	public List<BoardVO> searchBoardTitle(String b) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.searchBoardTitle(b);
	}

	@Override
	public List<BoardVO> searchBoardWriter(String b) throws RemoteException {
		// TODO Auto-generated method stub
		return boardDao.searchBoardWriter(b);
	}

}
