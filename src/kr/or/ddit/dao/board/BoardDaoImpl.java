package kr.or.ddit.dao.board;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BoardVO;


public class BoardDaoImpl implements BoardDao {

	private SqlMapClient smc; // review.xml 연결

	public static BoardDao dao;
	
	private BoardDaoImpl() { 
		smc = SqlMapClientFactory.getInstance();
	}

	// 객체 생성 및 제공
	public static BoardDao getInstance() {
		if (dao == null) {
			dao = new BoardDaoImpl();
		}
		return dao;
	}

	
	@Override
	public int insertBoard(BoardVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("board.insertBoard",vo);
			
			if(obj ==null) {
				cnt=1;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int updateBoard(BoardVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("board.updateBoard", vo);
			
		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteBoard(BoardVO vo) throws RemoteException {
		 int cnt = 0;

	      try {
	         cnt = smc.delete("board.deleteBoard",vo);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
	      return cnt;
	   }
	
	

	@Override
	public List<BoardVO> getAllList() throws RemoteException {
		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			boardList = (ArrayList<BoardVO>) smc.queryForList("board.selectBoardlist");
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		return boardList;
	}
	
	@Override
	public List<BoardVO> readBoard(BoardVO vo) throws RemoteException {
		List<BoardVO> readboard = new ArrayList<>();
	      
		try {
			readboard = smc.queryForList("board.selectBoardread",vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	      
	      return readboard;
	}
	
	@Override
	public boolean getBoardNo(Integer bd_no) throws RemoteException {
		boolean chk = false;
		
		try {
			int cnt =(int)smc.queryForObject("board.getBoard",bd_no);
			
			if(cnt > 0) {
				chk =true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chk;
	}
/*
	@Override
	public List<BoardVO> searchList(BoardVO vo) throws RemoteException {
		List<BoardVO> searchlist = new ArrayList<>();
		try {
			searchlist = smc.queryForList("board.searchList", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return searchlist;
	}*/

	@Override
	public List<BoardVO> searchBoardTitle(String b) throws RemoteException {
		List<BoardVO> searchlist = new ArrayList<>();
		try {
			searchlist = smc.queryForList("board.searchBoardTitle", b);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return searchlist;
	}

	@Override
	public List<BoardVO> searchBoardWriter(String b) throws RemoteException {
		List<BoardVO> searchlist = new ArrayList<>();
		try {
			searchlist = smc.queryForList("board.searchBoardWriter", b);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return searchlist;
	}

}
