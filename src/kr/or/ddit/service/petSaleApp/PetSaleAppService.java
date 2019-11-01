package kr.or.ddit.service.petSaleApp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.ComVO;
import kr.or.ddit.vo.PetSaleAppVO;

public interface PetSaleAppService extends Remote {

	/**
	 * 예약 현황조회
	 */
	public List<PetSaleAppVO> getAllApp(PetSaleAppVO pv) throws RemoteException;
	
	/**
	 * 분양 신청 반려 버튼
	 */
	public int updatePetInfo(PetSaleAppVO pv) throws  RemoteException;
	
	/**
	 * 분양 신청 추가 
	 */
	public int insertApp(PetSaleAppVO pv) throws RemoteException;
}
