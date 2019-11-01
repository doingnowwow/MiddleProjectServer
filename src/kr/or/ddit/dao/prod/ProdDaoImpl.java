package kr.or.ddit.dao.prod;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.ProdVO;

public class ProdDaoImpl implements ProdDao{

	private static ProdDaoImpl prodDao;
	private SqlMapClient smc;
	
	private ProdDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ProdDao getInstance() {
		if(prodDao == null) {
			prodDao = new ProdDaoImpl();
		}
		return prodDao;
	}

	@Override
	public List<ProdVO> getAllProd() throws RemoteException {
		List<ProdVO> p_list = null;
		
		try {
			p_list = smc.queryForList("prodTest.getAllProd");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return p_list;
	}

	@Override
	public int insertProd(ProdVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			 Object obj = smc.insert("prodTest.insertProd", vo);
			if(obj == null) {
				cnt = 1;
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<ProdVO> SearchProd(ProdVO vo) throws RemoteException {
		List<ProdVO> prodList = new ArrayList<>();
		
		try {
				smc.queryForList("prodTest.SearchProd", vo) ;
			}catch(SQLException e) {
				e.printStackTrace();
			}
				return prodList;
	}

	@Override
	public int updateProd(ProdVO vo) throws RemoteException {
		int cnt = 0;
		
		try {
			cnt = smc.update("prodTest.updateProd", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteProd(ProdVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt=smc.delete("prodTest.deleteProd", vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<ProdVO> getSelectedProd(ProdVO vo) throws RemoteException {
		List<ProdVO> p_list = null;
		
		try {
			p_list = smc.queryForList("prodTest.select", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return p_list;
	}

	@Override
	public List<ProdVO> getSearchProdList(ProdVO vo) throws RemoteException {
		List<ProdVO> p_list = null;
		
		try {
			p_list = smc.queryForList("prodTest.getSearchProdList", vo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return p_list;
	}

	@Override
	public List<ProdVO> selectReviewProd(ProdVO prod_id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
