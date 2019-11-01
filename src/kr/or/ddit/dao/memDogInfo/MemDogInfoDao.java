package kr.or.ddit.dao.memDogInfo;

import kr.or.ddit.vo.MemDogVO;

public interface MemDogInfoDao {

	
	
	
	public MemDogVO getDogInfo(MemDogVO mdvo); //강아지들 정보 가쟈오기
	
	public int updateDog(MemDogVO mdvo); //강아지 정보 수정
	
	public int deleteDog(MemDogVO mdvo); // 강아지 정보 삭제
	
	
}
