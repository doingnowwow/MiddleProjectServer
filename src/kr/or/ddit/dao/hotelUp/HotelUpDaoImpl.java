package kr.or.ddit.dao.hotelUp;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.HotelUpVO;

public class HotelUpDaoImpl implements HotelUpDao {

	private SqlMapClient smc;
	
	public static HotelUpDaoImpl dao = new HotelUpDaoImpl();
	
	private  HotelUpDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static HotelUpDaoImpl getInstance() {
		if(dao == null) {
			dao = new HotelUpDaoImpl();
		}
		return dao;
	}
	
	@Override
	public int insertHotelUp(HotelUpVO vo) throws RemoteException {
		int cnt = 0;
		Object obj;
		try {
			obj = smc.insert("hotelUp.insertHotelUp",vo);
			if(obj == null) {
				cnt = 1;
			}else {
				cnt = 0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteHotel(HotelUpVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.delete("hotelUp.deleteHotelUp",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<HotelUpVO> selectHotelList(HotelUpVO vo) throws RemoteException {
		List<HotelUpVO> hotelup_list = null;
		
		try {
			hotelup_list = smc.queryForList("hotelUp.selectHotelList",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return hotelup_list;

		}
	

	@Override
	public List<HotelUpVO> getAllHotelList(HotelUpVO vo) throws RemoteException {
		List<HotelUpVO> hotelUpList = new ArrayList<HotelUpVO>();
		
		try {
			hotelUpList = (ArrayList<HotelUpVO>) smc.queryForList("hotelUp.getAllHotelUpList");
		} catch (SQLException e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		return hotelUpList;
	}

	@Override
	public int updateHotelUp(HotelUpVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.update("hotelUp.updateHotelUp",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	

}
