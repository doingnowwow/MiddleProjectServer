package kr.or.ddit.dao.prodPay;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.ProdPayVO;

public interface ProdPayDao {
	
	
	
	public List<ProdPayVO> getProdPayAllList(ProdPayVO vo) throws RemoteException;  // 출력 및 검색 
	
	public int insertProdPay(ProdPayVO vo)  throws RemoteException; //리뷰생성
	
}
