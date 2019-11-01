package kr.or.ddit.dao.ILogin;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.ComVO;
import kr.or.ddit.vo.MemberVO;

public class LoginDaoImpl implements ILoginDao {
	
	private SqlMapClient smc;
	
	private static LoginDaoImpl logDao;
	private LoginDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static LoginDaoImpl getInstance() {
		if(logDao == null) {
			logDao = new LoginDaoImpl();
		}
		return logDao;
	}

	@Override
	public List<MemberVO> memberLogin(MemberVO mv) throws RemoteException{
		List<MemberVO> memList = null;
		
		try {
			memList = (List<MemberVO>) smc.queryForList("loginUser.select", mv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}

	@Override
	public List<MemberVO> idSearch(MemberVO mv) throws RemoteException{
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			memberList = (List<MemberVO>)smc.queryForList("loginUser.idSearch", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public List<MemberVO> pwSearch(MemberVO mv) throws RemoteException{
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			memberList = (List<MemberVO>)smc.queryForList("loginUser.pwSearch", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public List<MemberVO> memNoSearch(MemberVO mv) throws RemoteException{
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			memberList = (List<MemberVO>)smc.queryForList("loginUser.memNoSearch", mv);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return memberList;
	}
	
	@Override
	public List<ComVO> comnoSearch(ComVO cv) throws RemoteException{
		List<ComVO> comList = new ArrayList<ComVO>();
		try {
			comList = (List<ComVO>)smc.queryForList("loginUser.comnoSearch", cv);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return comList;
	}

	@Override
	public List<ComVO> isCom(ComVO cv) throws RemoteException {
		List<ComVO> memList = new ArrayList<ComVO>();
		try {
			memList = (List<ComVO>) smc.queryForList("loginUser.isCom", cv);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}
	

	public List<MemberVO> isMemPwchek(MemberVO mv) throws RemoteException{
		List<MemberVO> memList = new ArrayList<MemberVO>();
		
		try {
			memList = smc.queryForList("loginUser.getMemPw",mv);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return  memList;
	}
	

}
