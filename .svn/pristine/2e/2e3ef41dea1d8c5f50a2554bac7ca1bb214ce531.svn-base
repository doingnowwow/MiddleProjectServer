package kr.or.ddit.service.book;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.Book.BookDaoImpl;
import kr.or.ddit.vo.BookVO;

public class BookServiceImpl extends UnicastRemoteObject implements BookService {

	BookDaoImpl bookDao; // 사용할 Dao의 멤버변수 선언
	
	private static BookServiceImpl service; // singleton 패턴
	
	private BookServiceImpl() throws RemoteException {
		super();
		bookDao = BookDaoImpl.getInstance(); // Singleton 패턴
	}
	
	public static BookServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new BookServiceImpl();
		}
		return service;
	}

	@Override
	public List<BookVO> getAllBook(BookVO vo) throws RemoteException {
		return bookDao.getAllBook(vo);
	}

	@Override
	public int insertBooking(BookVO vo) throws RemoteException {
		return bookDao.insertBooking(vo);
	}

	@Override
	public List<BookVO> selectMyBook(int mem_no) throws RemoteException {
		return bookDao.selectMyBook(mem_no);
	}

	@Override
	public int updateBooking(BookVO vo) throws RemoteException {
		return bookDao.updateBooking(vo);
	}

	@Override
	public int deleteBooking(BookVO vo) throws RemoteException {
		return bookDao.deleteBooking(vo);
	}

	@Override
	public List<BookVO> selectComBook(int com_no) throws RemoteException {
		return bookDao.selectComBook(com_no);
	}

	@Override
	public int selectMaxBook_no() throws RemoteException {
		return bookDao.selectMaxBook_no();
	}

	@Override
	public int insertBookReserv(BookVO vo) throws RemoteException {
		return bookDao.insertBookReserv(vo);
	}

}
