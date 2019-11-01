package kr.or.ddit.dao.petSaleApp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.ComVO;
import kr.or.ddit.vo.PetSaleAppVO;

public interface PetSaleAppDao extends Remote{

	public List<PetSaleAppVO> getAllApp(PetSaleAppVO pv) throws RemoteException;

	public int updatePetInfo(PetSaleAppVO pv) throws RemoteException;
	
	public int insertApp(PetSaleAppVO pv) throws RemoteException;
}
