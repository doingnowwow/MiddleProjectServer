package kr.or.ddit.dao.join;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.ComVO;

public interface iComJoinDao extends Remote{
	
	public List<ComVO> comSelectId(ComVO cv) throws RemoteException;
	
	public List<ComVO> comSelectEmail(ComVO cv) throws RemoteException;
	
	public int insertCom(ComVO cv) throws RemoteException;
	
}
