package kr.or.ddit.dao.hotel;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.BookVO;
import kr.or.ddit.vo.HotelVO;

public class HotelDaoImpl implements HotelDao{
	private SqlMapClient smc; 
	
	//외부에서 객체 생성 막음
	public static HotelDaoImpl dao = new HotelDaoImpl();
	
	private  HotelDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	// 객체 생성 및 제공
	public static HotelDaoImpl getInstance() {
		if(dao == null) {
			dao = new HotelDaoImpl();
		}
		return dao;
	}

	@Override
	public int insertHotel(HotelVO vo) throws RemoteException {
		int cnt =0;
		Object obj;
		try {
			obj = smc.insert("hotel.insertHotel",vo);
			if(obj == null) {
				cnt = 1;
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateHotel(HotelVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.update("hotel.updateHotel",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteHotel(HotelVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.delete("hotel.deleteHotel",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<HotelVO> selectHotelList(HotelVO com_no) throws RemoteException {
		List<HotelVO> hotel_list = new ArrayList<HotelVO>();
		
		try {
			hotel_list = smc.queryForList("hotel.selectHotelList",com_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return hotel_list;

		}
	
	@Override
		public List<HotelVO> getAllhotelList() {
 
		List<HotelVO> hotelList = new ArrayList<HotelVO>();
		
		try {
			hotelList = smc.queryForList("hotel.getAllHotelList");
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		return hotelList;
	}

	@Override
	public List<HotelVO> getSelectedHotel(HotelVO vo) throws RemoteException {
		List<HotelVO> select_list = new ArrayList<HotelVO>();
		
		try {
			select_list = smc.queryForList("hotel.select", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return select_list;
	}

	@Override
	public List<HotelVO> hoNoSearch(HotelVO vo) throws RemoteException {
		List<HotelVO> ho_list = new ArrayList<HotelVO>();
		try {
			ho_list = smc.queryForList("hotel.hoNoSearch", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ho_list;
	}
	
	
}
