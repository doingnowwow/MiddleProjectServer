package kr.or.ddit.dao.Book;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BookVO;

public class BookDaoImpl implements BookDao{
	
	//외분에서 객체 생성을 막음
	private static BookDaoImpl dao = new BookDaoImpl();
	private SqlMapClient smc; //xml연결
	
	private BookDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	//객체 생성 및 제공
	public static BookDaoImpl getInstance() {
		
		if(dao == null) {
			dao = new BookDaoImpl();
		}
		return dao;
		
	}

	@Override
	public List<BookVO> getAllBook(BookVO vo) throws RemoteException {
		
		List<BookVO> Book_list = new ArrayList<BookVO>();
		
		try {
			Book_list = smc.queryForList("book.getAllBook", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Book_list;
	}

	@Override
	public int updateBooking(BookVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.update("book.updateBooking", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteBooking(BookVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt =smc.delete("book.deleteBooking",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertBooking(BookVO vo) throws RemoteException {
		int cnt = 0;
		Object obj;
		try {
			obj = smc.insert("book.insertBooking",vo);
			if(obj == null) {
				cnt =1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	

	@Override
	public List<BookVO> selectMyBook(int mem_no)  throws RemoteException{
		List<BookVO> booklist =null;
		try {
			booklist = smc.queryForList("book.selectMyBook",mem_no);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return booklist;
	}

	@Override
	public List<BookVO> selectComBook(int com_no)  throws RemoteException{
		List<BookVO> booklist = null;
		
		try {
			booklist = smc.queryForList("book.selectComBook",com_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return booklist;
	}
	
	//승재 추가

	@Override
	public int selectMaxBook_no() throws RemoteException {
		int maxBook_no = 0;
		try {
			maxBook_no = (int) smc.queryForObject("book.selectMyBookNum");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return maxBook_no;
	}

	@Override
	public int insertBookReserv(BookVO vo) throws RemoteException {
		int insertRes = 0;
		Object obj;
		try {
			obj = smc.insert("book.insertBookReserv",vo);
			if(obj == null) {
				insertRes = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return insertRes;
	}


	
}
	