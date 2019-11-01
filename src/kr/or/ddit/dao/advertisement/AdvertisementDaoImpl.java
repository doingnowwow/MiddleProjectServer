package kr.or.ddit.dao.advertisement;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.AdvertisementVO;

public class AdvertisementDaoImpl implements AdvertisementDao {
	
	private SqlMapClient smc;
	
	public static AdvertisementDaoImpl dao = new AdvertisementDaoImpl();
	
	private AdvertisementDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static AdvertisementDaoImpl getInstance() {
		if(dao == null) {
			dao = new AdvertisementDaoImpl();
		}
		return dao;
	}
	
	

	@Override
	public int insertAd(AdvertisementVO vo) throws RemoteException {
		int cnt = 0; 
		
		try {
			Object obj = smc.insert("adver.insertAd", vo);
			if(obj == null) {
				cnt = 1;
			}else {
				
			}
		}catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteAd(AdvertisementVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.delete("adver.deleteAd", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int modifyAd(AdvertisementVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("adver.modifyAd", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<AdvertisementVO> showAllAd() throws RemoteException {
		List<AdvertisementVO> ad_list = null;
		
		try {
			ad_list = smc.queryForList("adver.showAllAd");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ad_list;
	}

	@Override
	public List<AdvertisementVO> selectAd(AdvertisementVO vo) throws RemoteException {
		List<AdvertisementVO> ad_list = null;
		
		try {
			ad_list = smc.queryForList("adver.selectAd", vo);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ad_list;
	}

}
