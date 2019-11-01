package kr.or.ddit.service.faq;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.dao.faq.FaqDao;
import kr.or.ddit.dao.faq.FaqDaoImpl;
import kr.or.ddit.vo.FaqVO;

public class FaqServiceImpl implements FaqService {
	
	private static FaqServiceImpl faqService;
	
	private FaqDao faqDao;
	
	private FaqServiceImpl() throws RemoteException {
		faqDao = FaqDaoImpl.getInstance();
	}
	
	public static FaqServiceImpl getInstance() throws RemoteException {
		if(faqService == null) {
			faqService = new FaqServiceImpl();
		}
		return faqService;
	}

	@Override
	public List<FaqVO> getAllFaq(int faq_no) throws RemoteException {
		return faqDao.getAllFaq(faq_no);
	}

	@Override
	public int insertFaq(FaqVO fv) throws RemoteException{
		return faqDao.insertFaq(fv);
	}

	@Override
	public int updateFaq(FaqVO fv) throws RemoteException {
		return faqDao.updateFaq(fv);
	}

	@Override
	public int deleteFaq(int faq_no) throws RemoteException{
		return faqDao.deleteFaq(faq_no);
	}

	@Override
	public List<FaqVO> getSearchFaq(FaqVO fv) throws RemoteException {
		return faqDao.getSearchFaq(fv);
	}

}
