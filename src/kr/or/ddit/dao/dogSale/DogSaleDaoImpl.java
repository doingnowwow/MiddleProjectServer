package kr.or.ddit.dao.dogSale;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.DogSaleVO;

public class DogSaleDaoImpl implements DogSaleDao  {
	
private static DogSaleDaoImpl dogSaleDao;
	
	private SqlMapClient smc;
	
	private DogSaleDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static DogSaleDao getInstance() throws RemoteException{
		if(dogSaleDao == null) {
			dogSaleDao = new DogSaleDaoImpl();
		}
		return dogSaleDao;
	}

	@Override
	public List<DogSaleVO> getAllDogSale() throws RemoteException{
		List<DogSaleVO> dogSale_list = new ArrayList<DogSaleVO>();
		
		try {
			dogSale_list = smc.queryForList("dogsaleTest.getAllDogSale");
		}catch (SQLException e) { 
			e.printStackTrace();
		}
		return dogSale_list;
	}

	@Override
	public int insertDogSale(DogSaleVO vo) throws RemoteException{
		int cnt = 0;
		
		try {
			Object obj = smc.insert("dogsaleTest.insertDogSale", vo);
			
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
	public int updateDogSale(DogSaleVO vo) throws RemoteException{
		int cnt = 0;
		
		try {
			cnt = smc.update("dogsaleTest.updateDogSale", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}


	@Override
	public int deleteDogSale(DogSaleVO vo) throws RemoteException{
	int cnt = 0;
		
		try {
			cnt = smc.delete("dogsaleTest.getdeleteDogSale", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public List<DogSaleVO> getSearchDogSale(DogSaleVO vo) throws RemoteException{
		List<DogSaleVO> DogSaleList = new ArrayList<DogSaleVO>();
		
		try {
			DogSaleList = smc.queryForList("dogsaleTest.getSearchDogSale", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return DogSaleList;
	}

	@Override
	public List<DogSaleVO> getDogSaleSearchList(DogSaleVO vo) throws RemoteException{
		List<DogSaleVO> dogSale_list = new ArrayList<DogSaleVO>();
			
			try {
				dogSale_list = smc.queryForList("dogsaleTest.getDogSaleSearchList",vo);
			}catch (SQLException e) { 
				e.printStackTrace();
			}
			return dogSale_list;
	}
}
	
	
	


