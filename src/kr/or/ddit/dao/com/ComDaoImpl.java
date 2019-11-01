package kr.or.ddit.dao.com;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.ComVO;

public class ComDaoImpl implements ComDao {
	
	private SqlMapClient smc;
	
	private static ComDaoImpl dao = new ComDaoImpl();
	
	private ComDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	
	public static ComDaoImpl getInstance() {
		if(dao ==null) {
			dao = new ComDaoImpl();
			
		}
		return dao;
	}
	
	

	//비밀번호 가져와서 마이페이지 들어가기 ...맞나?
	@Override 
	public ComVO getCom_pw(ComVO cvo) {
		
		ComVO vo = new ComVO();
		try {
			vo = (ComVO) smc.queryForObject("comInfo.getComPw",cvo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return vo;
	}

	@Override
	public ComVO ComgetDefaulInfo(ComVO cvo) {
		ComVO vo = new ComVO();

		try {
			vo = (ComVO) smc.queryForObject("comInfo.getComDefaultInfo", cvo);
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return vo;
	}

	//회원정보수정
	@Override
	public int updateCom(ComVO cvo) {
		int cnt = 0;
		
		try {
			cnt = smc.update("comInfo.updateCom",cvo);
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteCom(ComVO cvo) {
		int cnt = 0;
		try {
			cnt = smc.update("comInfo.deleteCom",cvo);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}


	@Override
	public List<ComVO> SearchComInfo(int com_no) throws RemoteException{
	List<ComVO> Com_list = null;
		try {
			Com_list = smc.queryForList("comInfo.getComAllInfo", com_no);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Com_list;	
	}


	@Override
	public ComVO searchCom(ComVO com) throws RemoteException {
		ComVO resCom = null;
		Object obj;
		try {
			obj = smc.queryForObject("comInfo.seachComvo", com);
			resCom = (ComVO) obj;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resCom;
	}


	//전체회원조회
	@Override
	public List<ComVO> getAllComMember() throws RemoteException {
		
		ArrayList<ComVO> ComMList = null;
		
		try {
			ComMList = (ArrayList<ComVO>) smc.queryForList("comInfo.getAllMember");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ComMList;
	}
	

}
