package kr.or.ddit.dao.join;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public class JoinDaoImpl implements IJoinDao {

	private SqlMapClient smc;
	
	private static JoinDaoImpl joinDao;
	private JoinDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static JoinDaoImpl getInstance() {
		if(joinDao == null) {
			joinDao = new JoinDaoImpl();
		}
		return joinDao;
	}
	
	@Override
	public List<MemberVO> selectId(MemberVO mv) throws RemoteException {
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			memberList = (List<MemberVO>) smc.queryForList("join.selectId", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public List<MemberVO> selectEmail(MemberVO mv) throws RemoteException {
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			memberList = (List<MemberVO>) smc.queryForList("join.selectEmail", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}
	

	@Override
	public int insertMember(MemberVO mv) throws RemoteException {
		int cnt = 0;
		try {
			Object obj = smc.insert("join.insertMember", mv);
			if(obj == null) {
				cnt = 1;
			}else {
				cnt = 0;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertMemDog(MemDogVO dv) throws RemoteException  {
		int cnt = 0;
		try {
			Object obj = smc.insert("join.insertMemDog", dv);
			if(obj == null) {
				cnt = 1;
			}else {
				cnt = 0;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
