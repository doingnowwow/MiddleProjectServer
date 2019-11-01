package kr.or.ddit.dao.BookInfo;

import java.rmi.RemoteException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.dao.Book.BookDaoImpl;
import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BookingInfoVO;

public class BookInfoDaoImpl implements BookInfoDao {
	
	//외분에서 객체 생성을 막음
	private static BookInfoDaoImpl dao = new BookInfoDaoImpl();
	private SqlMapClient smc; //xml연결
	
	private BookInfoDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	//객체 생성 및 제공
	public static BookInfoDaoImpl getInstance() {
		
		if(dao == null) {
			dao = new BookInfoDaoImpl();
		}
		return dao;
		
	}
	
	/**
	 * BookInfo 결제를 통한 예약 및 DB저장
	 */
	@Override
	public int insertBookInfoReserv(BookingInfoVO vo) throws RemoteException {
		int cnt = 0;
		Object obj;
		try {
			obj = smc.insert("bookInfo.insertBooking",vo);
			if(obj == null) {
				cnt =1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	
}
