package kr.or.ddit.service.bookInfo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import kr.or.ddit.dao.BookInfo.BookInfoDaoImpl;
import kr.or.ddit.vo.BookingInfoVO;

public class BookInfoServiceImpl extends UnicastRemoteObject  implements BookInfoService {
	BookInfoDaoImpl bookInfoDao; // 사용할 Dao의 멤버변수 선언
	
	private static BookInfoServiceImpl service; // singleton 패턴
	
	private BookInfoServiceImpl() throws RemoteException {
		super();
		bookInfoDao = BookInfoDaoImpl.getInstance(); // Singleton 패턴
	}
	
	public static BookInfoServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new BookInfoServiceImpl();
		}
		return service;
	}


	@Override
	public int insertBookInfoReserv(BookingInfoVO vo) throws RemoteException {
		return bookInfoDao.insertBookInfoReserv(vo);
	}
	
	
}
