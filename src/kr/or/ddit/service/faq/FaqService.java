package kr.or.ddit.service.faq;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.vo.FaqVO;

public interface FaqService extends Remote{
	
	/**
	 * 자주 묻는 질문 전체 보기
	 */
	public List<FaqVO> getAllFaq(int faq_no) throws RemoteException;
	
	/**
	 *  자주 묻는 질문 생성
	 */
	public int insertFaq(FaqVO fv) throws RemoteException;
	/**
	 * 자주 묻는 질문 수정
	 */
	public int updateFaq(FaqVO fv) throws RemoteException;
	
	/**
	 * 자주 묻는 질문 삭세
	 */
	public int deleteFaq(int faq_no) throws RemoteException;
	
	/**
	 * 자주 묻는 질문 검색
	 */
	public List<FaqVO> getSearchFaq(FaqVO fv) throws RemoteException;
	
}
