package kr.or.ddit.dao.dogBoard;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.DogBoardVO;
import kr.or.ddit.vo.DogSaleVO;

public class DogBoardDaoImpl implements DogBoardDao {
	
	private static DogBoardDaoImpl dogBoardDao;
	private SqlMapClient smc;
	
	private DogBoardDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static DogBoardDao getInstance() {
		if(dogBoardDao == null) {
			dogBoardDao = new DogBoardDaoImpl();
		}
		return dogBoardDao;
	}

	@Override
	public List<DogBoardVO> getAllDogBoard() throws RemoteException {
		List<DogBoardVO> dogBoard_list = null;
		
		try {
			dogBoard_list = smc.queryForList("dogBoard.getAllDogBoardList");
		}catch (SQLException e) { 
			e.printStackTrace();
			}
		return dogBoard_list;
	}	

	@Override
	public List<DogBoardVO> getMyBoardList(DogBoardVO dv) throws RemoteException{
		List<DogBoardVO> dogBoard_list = null;
		
		try {
			dogBoard_list = smc.queryForList("dogBoard.getMyBoardList", dv);
		}catch (SQLException e) { 
			e.printStackTrace();
			}
		return dogBoard_list;
	}
	
	@Override
	public int insertDogBoard(DogBoardVO dbv)  throws RemoteException{
			
		int cnt = 0;
		
		try {
			Object obj = smc.insert("dogBoard.insertDogBoard", dbv);
			
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
	public List<DogBoardVO> searchDogBoard(String content)  throws RemoteException{
		List<DogBoardVO> dogBoardList = new ArrayList<>();
		
		try {
			smc.queryForList("dogBoard.serachDogBoard", content );
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dogBoardList;
	}

	@Override
	public int updateDogBoard(DogBoardVO dbv) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("dogBoard.updateDogBoard", dbv);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteDogBoard(DogBoardVO dbv) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.delete("dogBoard.deleteDogBoard", dbv);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}



}
