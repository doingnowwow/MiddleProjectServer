package kr.or.ddit.dao.prodPay;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.ProdPayVO;

public class ProdPayDaoImpl implements ProdPayDao{

	
	//외부에서 객체 생성을 막음
			private static ProdPayDaoImpl dao = new ProdPayDaoImpl();
			private SqlMapClient smc; //xml연결
			
			private ProdPayDaoImpl() {
				smc = SqlMapClientFactory.getInstance();
			}
			
			//객체 생성 및 제공
			public static ProdPayDaoImpl getInstance() {
				
				if(dao == null) {
					dao = new ProdPayDaoImpl();
				}
				return dao;
				
			}

			@Override
			public List<ProdPayVO> getProdPayAllList(ProdPayVO vo) throws RemoteException {
			
				ArrayList<ProdPayVO> pPayList = new ArrayList<ProdPayVO>();
				
				try {
					pPayList = (ArrayList<ProdPayVO>) smc.queryForList("prodPay.getProdPayAllList", vo);
				} catch (SQLException e) {
					System.out.println("에러");
					e.printStackTrace();
				}
				return pPayList;
			}
				
				
			
			@Override
			public int insertProdPay(ProdPayVO vo) throws RemoteException {
				int cnt = 0;
				Object obj;
				try {
					obj = smc.insert("prodPay.insertProdPay",vo);
					if(obj == null) {
						cnt =1;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				return cnt;
			}

}


