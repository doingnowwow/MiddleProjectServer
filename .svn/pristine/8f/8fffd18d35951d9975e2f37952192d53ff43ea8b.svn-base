package kr.or.ddit.dao.dogSaleAdd;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.DogSaleAddVO;

//서현작업중
public class DogSaleAddDaoImpl implements DogSaleAddDao {
	
	private SqlMapClient smc;
	
	public static  DogSaleAddDaoImpl dao = new DogSaleAddDaoImpl();
	
	private DogSaleAddDaoImpl()	{
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static DogSaleAddDaoImpl getInstance() {
		if (dao == null) {
			dao = new DogSaleAddDaoImpl();
		}
		return dao;
	}

	@Override
	public int insertDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		int cnt = 0;
		Object obj;
		try {
			obj = smc.insert("dogSaleAdd.insertDogSaleAdd", vo);
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
	public int deleteDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.delete("dogSaleAdd.deleteDogSaleAdd",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<DogSaleAddVO> AllSaleAddList(int com_no) throws RemoteException {
		List<DogSaleAddVO> dsaList = new ArrayList<DogSaleAddVO>();
		
		try {
			dsaList = (ArrayList<DogSaleAddVO>) smc.queryForList("dogSaleAdd.AllSaleAddList", com_no);
		}catch(SQLException e) {
			System.out.println("분양추가 에러");
			e.printStackTrace();
		}
		return dsaList;
	}

	@Override
	public int updateDogSaleAdd(DogSaleAddVO vo) throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.update("dogSaleAdd.updateDogSaleAdd",vo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
