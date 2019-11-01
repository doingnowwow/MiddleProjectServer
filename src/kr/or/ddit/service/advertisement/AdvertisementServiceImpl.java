package kr.or.ddit.service.advertisement;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.dao.advertisement.AdvertisementDao;
import kr.or.ddit.dao.advertisement.AdvertisementDaoImpl;
import kr.or.ddit.vo.AdvertisementVO;

public class AdvertisementServiceImpl extends UnicastRemoteObject implements AdvertisementService {
	
	AdvertisementDao dao;
	
	public static AdvertisementServiceImpl service;
	
	public AdvertisementServiceImpl() throws RemoteException {
		super();
		dao = AdvertisementDaoImpl.getInstance();
	}
	
	public static AdvertisementServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new AdvertisementServiceImpl();
		}
		return service;
	}

	@Override
	public int insertAd(AdvertisementVO vo) throws RemoteException {
		return dao.insertAd(vo);
	}

	@Override
	public int deleteAd(AdvertisementVO vo) throws RemoteException {
		return dao.deleteAd(vo);
	}

	@Override
	public int modifyAd(AdvertisementVO vo) throws RemoteException {
		return dao.modifyAd(vo);
	}

	@Override
	public List<AdvertisementVO> showAllAd() throws RemoteException {
		return dao.showAllAd();
	}

	@Override
	public List<AdvertisementVO> selectAd(AdvertisementVO vo) throws RemoteException {
		return dao.selectAd(vo);
	}

}
