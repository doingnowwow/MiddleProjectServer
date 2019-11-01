package kr.or.ddit.dao.point;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.dao.BookInfo.BookInfoDaoImpl;
import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.PointVO;

public class PointDaoImpl implements PointDao {
BookInfoDaoImpl bookInfoDao; // 사용할 Dao의 멤버변수 선언
	
	private SqlMapClient smc;
	private static PointDaoImpl dao;
	
	public PointDaoImpl() {
		//SqlMapClient 객체 생성
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static PointDaoImpl getInstance() {
		if(dao == null) {
			dao = new PointDaoImpl();
		}
		return dao;
	}
	
	/**
	 * 호텔 결제를 통한 적립금 처리
	 */
	@Override
	public int insertPointReserv(PointVO vo) throws RemoteException {
		int cnt = 0;
		Object obj;
		try {
			obj = smc.insert("point.insertPointReserv",vo);
			if(obj == null) {
				cnt = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	
	/**
	 * 회원번호를 통한 vo마일리지 호출
	 */
	@Override
	public int searchMyPoint(PointVO vo) throws RemoteException {
		int resPoint = 0;
		Object obj;
		try {
			obj = smc.queryForObject("point.seachNowMileage", vo);
			resPoint = (int) obj;
			if(obj == null) {
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resPoint;
	}
	
	/**
	 * 회원번호를 통한 vo마일리지 호출
	 */
	@Override
	public List<PointVO> searchMem_no(int mem_no) throws RemoteException {
		List<PointVO> pointlist = null;
	
		try {
			pointlist = smc.queryForList("point.seachMem_noGetAll", mem_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pointlist;

	}

}
