package kr.or.ddit.service.hotelUp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.hotelUp.HotelUpDao;
import kr.or.ddit.dao.hotelUp.HotelUpDaoImpl;
import kr.or.ddit.vo.HotelUpVO;

public class HotelUpServiceImpl extends UnicastRemoteObject implements HotelUpService{
	HotelUpDaoImpl hotelUpDao;
	
	private static HotelUpServiceImpl service;
	
	protected HotelUpServiceImpl() throws RemoteException {
		super();
		hotelUpDao = HotelUpDaoImpl.getInstance();
	}
	
	public static HotelUpServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new HotelUpServiceImpl();
		}
		return service;
	}
	

	@Override
	public int insertHotelUp(HotelUpVO vo) throws RemoteException {
		return hotelUpDao.insertHotelUp(vo);
	}

	@Override
	public int deleteHotel(HotelUpVO vo) throws RemoteException {
		return hotelUpDao.deleteHotel(vo);
	}

	@Override
	public List<HotelUpVO> selectHotelList(HotelUpVO vo) throws RemoteException {
		return hotelUpDao.selectHotelList(vo);
	}

	@Override
	public List<HotelUpVO> getAllHotelList(HotelUpVO vo) throws RemoteException {
		return hotelUpDao.getAllHotelList(vo);
	}

	@Override
	public int updateHotelUp(HotelUpVO vo) throws RemoteException {
		return hotelUpDao.updateHotelUp(vo);
	}

}
