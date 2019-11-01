package kr.or.ddit.dao.shopsell;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.SellVO;

public class ShopSellDaoImpl implements ShopSellDao {
	
	private SqlMapClient smc;
	
	public static ShopSellDaoImpl selldao = new ShopSellDaoImpl();
	
	private ShopSellDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
		
	}
	
	public static ShopSellDaoImpl getInstance() {
		if(selldao == null ) {
			selldao = new ShopSellDaoImpl();
		}
		
		return selldao;
	}
	
	
	

	@Override
	public List<SellVO> sellListAll() throws RemoteException {
		// TODO Auto-generated method stub
		
		ArrayList<SellVO> sellList = null;
		
		try {
			sellList = (ArrayList<SellVO>) smc.queryForList("shop.shopSellListAll");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return sellList;
	}

	@Override
	public List<SellVO> sellCnt() throws RemoteException {
		ArrayList<SellVO> sellCnt = null;
		try {
			sellCnt = (ArrayList<SellVO>) smc.queryForList("shop.shopSellCnt");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return sellCnt;
	}

}
