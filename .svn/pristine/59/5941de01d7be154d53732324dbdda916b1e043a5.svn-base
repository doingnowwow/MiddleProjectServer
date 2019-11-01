package kr.or.ddit.dao.memberSearch;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemberSearchVO;

public class MemSearchDaoImpl implements MemSearchDao {
	
	private static MemSearchDaoImpl dao = new MemSearchDaoImpl();
	private SqlMapClient smc;
	
	private MemSearchDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static MemSearchDaoImpl getInstance() {
		if( dao == null) {
			dao = new MemSearchDaoImpl();
		}
		return dao;
	}
	

	@Override
	public List<MemberSearchVO> getAllMember()
			throws RemoteException {
		List<MemberSearchVO> mem_list = null;
		try {
			mem_list = smc.queryForList("mems.getAllMember");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return mem_list;
	}

	@Override
	public List<MemberSearchVO> getMemberByTF(MemberSearchVO ms)
			throws RemoteException {
		List<MemberSearchVO> mem_sear_list = null;
		try {
			mem_sear_list = smc.queryForList("mems.getMemberByTF", ms);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return mem_sear_list;
	}

	@Override
	public List<MemberSearchVO> getAllMemPet()
			throws RemoteException {
		List<MemberSearchVO> pet_list = null;
		try {
			pet_list = smc.queryForList("mems.getAllMemPet");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pet_list;
	}

	@Override
	public List<MemberSearchVO> getMemPetByTF(MemberSearchVO ms)
			throws RemoteException {
		List<MemberSearchVO> pet_sear_list = null;
		try {
			pet_sear_list = smc.queryForList("mems.getMemPetByTF", ms);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pet_sear_list;
	}

	@Override
	public List<MemberSearchVO> getAllComMem()
			throws RemoteException {
		List<MemberSearchVO> com_list = null;
		try {
			com_list = smc.queryForList("mems.getAllComMem");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return com_list;
	}

	@Override
	public List<MemberSearchVO> getComMemByTF(MemberSearchVO ms)
			throws RemoteException {
		List<MemberSearchVO> com_sear_list = null;
		try {
			com_sear_list = smc.queryForList("mems.getComMemByTF", ms);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return com_sear_list;
	}

}
