package kr.or.ddit.dao.point;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.BookingInfoVO;
import kr.or.ddit.vo.PointVO;

public interface PointDao extends Remote{
	
	/**
	 * 호텔 결제를 통한 적립금 처리
	 * @param vo
	 * @return
	 */
	public int insertPointReserv(PointVO vo) throws RemoteException;
	
	
	/**
	 * 회원번호를 통한 vo마일리지 호출
	 * @param vo
	 * @return
	 * @throws RemoteException
	 */
	public int searchMyPoint(PointVO vo) throws RemoteException;
	
	/**
	 * 회원번호를 통해 포인트리스트 가져오기
	 * @param mem_no
	 * @return
	 * @throws RemoteException
	 */
	public List<PointVO> searchMem_no(int mem_no) throws RemoteException;
	

}
