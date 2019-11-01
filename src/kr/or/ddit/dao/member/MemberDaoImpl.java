package kr.or.ddit.dao.member;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemDogVO;
import kr.or.ddit.vo.MemberVO;

public class MemberDaoImpl  implements IMemberDao {
	
	private static MemberDaoImpl memDao;
	private SqlMapClient smc;
	
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IMemberDao getInstance() {
		if(memDao == null) {
			memDao = new MemberDaoImpl();
		}
		return memDao;
	}
	
	@Override
	public MemberVO login(String mem_id, String mem_pw) throws RemoteException{
		MemberVO mem = new MemberVO();
		
		try {
			mem.setMem_id(mem_id);
			mem.setMem_pw(mem_pw);
			
			mem = (MemberVO) smc.queryForObject("member.login", mem);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return mem;
	}

	@Override
	public List<MemberVO> getAllMember() throws RemoteException{
		List<MemberVO> m_list = null;
		
		try {
			m_list = smc.queryForList("member.getAllMember");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return m_list;
	}

	@Override
	public List<MemDogVO> getDogList(int mem_no) throws RemoteException{
		List<MemDogVO> m_list = null;
		
		try {
			m_list = smc.queryForList("member.getmemDogList", mem_no);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return m_list;
	}

	@Override
	public int updateMember(MemberVO mv) throws RemoteException{
		int cnt = 0;
		
		try {
			cnt = smc.update("member.updateMember", mv);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteMember(String mem_id)throws RemoteException {
		int cnt = 0;
		
		try {
			cnt=smc.delete("member.deleteMember", mem_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<MemberVO> getSearchMember(MemberVO mv)throws RemoteException {
		List<MemberVO> memList = new ArrayList<>();
		
		try {
			smc.queryForList("member.getSearchMember", mv) ;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}

	@Override
	public boolean getMember(String mem_id) throws RemoteException{
		boolean chk = true;
		try {
			int cnt = (int)smc.queryForObject("member.getMemberCnt", mem_id);
			if(cnt > 0) {
				chk = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chk;
	}

	
	
	@Override
	public int updategrade(MemberVO mem_point)throws RemoteException {
		int cnt = 0;
		try {
			cnt = smc.update("member.updategrade", mem_point);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<MemberVO> getgrade(int mem_point)throws RemoteException {
		List<MemberVO> g_list = null;
		
		try {
			g_list = smc.queryForList("member.getGrade", mem_point);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return g_list;
	}

	@Override
	public List<MemberVO> getAllMemberAll() throws RemoteException {
		
		List<MemberVO> getAllMemberAll = null;
		try {
			getAllMemberAll = smc.queryForList("member.getList");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return getAllMemberAll;
	}
	

}
    
	
	
 	


