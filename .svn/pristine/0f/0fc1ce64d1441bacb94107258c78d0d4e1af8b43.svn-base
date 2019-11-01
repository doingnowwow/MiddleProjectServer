package kr.or.ddit.dao.faq;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.FaqVO;

public class FaqDaoImpl implements FaqDao {
	
	private static FaqDaoImpl faqDao;
	
	private SqlMapClient smc;
	
	private FaqDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static FaqDao getInstance() {
		if(faqDao == null) {
			faqDao = new FaqDaoImpl();
		}
		return faqDao;
	}

	@Override
	public List<FaqVO> getAllFaq(int faq_no) {
		List<FaqVO> m_list = null;
		
		try {
			m_list = smc.queryForList("faq.getAllFag", faq_no);
		}catch (SQLException e) { 
			e.printStackTrace();
		}
		return m_list;
	}

	@Override
	public int insertFaq(FaqVO fv) {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("insertFaq", fv);
			
			if(obj == null) {
				cnt = 1;
			}else {
				
			}
		}catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
			
		}
		return cnt;
	}

	@Override
	public int updateFaq(FaqVO fv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("faq.updateFaq", fv);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteFaq(int faq_no) {
		int cnt = 0;
		
		try {
			cnt = smc.delete("faq.deleteFaq", faq_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<FaqVO> getSearchFaq(FaqVO fv) {
		List<FaqVO> faqList = new ArrayList<>();
		
		try {
			smc.queryForList("faq.getSearchFaq", fv);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return faqList;
	}
	
	
	
}
