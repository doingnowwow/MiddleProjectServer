package kr.or.ddit.dao.adddog;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.util.SqlMapClientFactory;
import kr.or.ddit.vo.MemDogVO;

public class AddDogDaoImpl implements AddDogDao{
    
	private SqlMapClient smc;
	
	private static AddDogDao AddDao;
	
	private AddDogDaoImpl() { 
		smc = SqlMapClientFactory.getInstance();
		
	}
	
	
	public static AddDogDao getInstance() {
		if(AddDao == null) {
			AddDao = new AddDogDaoImpl();
		}
		
		return AddDao;
	}


	@Override
	public List<MemDogVO> getAllDog(String mem_dog_no) {
		List<MemDogVO> d_list = null;
		
		try {
			d_list = smc.queryForList("dog.getAlldog", mem_dog_no);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return d_list;
	}

	//삽입
	@Override
	public int insertdog(MemDogVO dv) {
		int cnt = 0;
		
		try {
			Object obj = 
				smc.insert("dog.insertdog", dv);
			if(obj == null) {
				cnt = 1;
			}
		} catch (SQLException e) {
			 e.printStackTrace();
		}
		
		return cnt;

	}

    //수정
	@Override
	public int updatedog(MemDogVO db) {
		int cnt = 0;
		try {
			cnt = smc.update("dog.updateDog", db);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

    //삭제
	@Override
	public int deletedog(MemDogVO da) {
		int cnt = 0;
		
		try {
			cnt=smc.delete("dog.deleteDog", da);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	


}
