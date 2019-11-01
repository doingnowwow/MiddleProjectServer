package kr.or.ddit.dao.shopsell;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.SellVO;

/**
 * 판매내역을 조회해볼까?
 * @author hanseon
 *
 */
public interface ShopSellDao  extends Remote{
	
	
	//판매내역조회하기
	
	public List<SellVO> sellListAll()  throws RemoteException;
	
	// 판매량 조회
	public List<SellVO> sellCnt() throws RemoteException;

}
