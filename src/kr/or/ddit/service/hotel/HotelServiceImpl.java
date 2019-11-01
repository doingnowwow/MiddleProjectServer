package kr.or.ddit.service.hotel;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.hotel.HotelDaoImpl;
import kr.or.ddit.vo.HotelVO;

public class HotelServiceImpl extends UnicastRemoteObject implements HotelService{
	
	HotelDaoImpl hotelDao; // 사용할 Dao의 멤버변수 선언
	
	private static HotelServiceImpl service; // singleton패턴
	
	protected HotelServiceImpl() throws RemoteException {
		super();
		hotelDao = HotelDaoImpl.getInstance(); // 싱글톤패턴
	}
	
	public static HotelServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new HotelServiceImpl();
		}
		return service;
	}

	@Override
	public int insertHotel(HotelVO vo) throws RemoteException {
		
		return hotelDao.insertHotel(vo);
	}


	@Override
	public int deleteHotel(HotelVO vo) throws RemoteException {
		return hotelDao.deleteHotel(vo);
	}

	@Override
	public List<HotelVO> selectHotelList(HotelVO com_no) throws RemoteException {
		
		return hotelDao.selectHotelList(com_no);
	}

	@Override
	public List<HotelVO> getAllHotelList() throws RemoteException {
		
		return hotelDao.getAllhotelList();
	}

	@Override
	public List<HotelVO> getSelectedHotel(HotelVO vo) throws RemoteException {
		// TODO Auto-generated method stub
		return hotelDao.getSelectedHotel(vo);
	}

	@Override
	public List<HotelVO> hoNoSearch(HotelVO vo) throws RemoteException {
		return hotelDao.hoNoSearch(vo);
	}
	
	
}
