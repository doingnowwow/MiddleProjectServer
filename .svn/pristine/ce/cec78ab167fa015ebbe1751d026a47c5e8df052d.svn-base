package kr.or.ddit.dao.myInfoCart;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.CartVO;
import kr.or.ddit.vo.ProdVO;

public interface MyInfoCartDao {

	
	
	
	
	/**
	 * 로그인한 회원의 장바구니 생성
	 * @param mem_no 로그인한 회원의 아이디
	 * @return
	 */
	public int insertCart(String mem_no);
	
	
	/**
	 * 로그인한 회원의 장바구니 내역 가져오기
	 * 
	 * @param id
	 *            로그인한 회원 아이디
	 * @return 회원의 장바구니 내역
	 */
	public List<ProdVO> getcartProd(String id);

	/**
	 * 장바구니 상세테이블에서 상품번호와 같은 데이터의 수량 가져오기
	 * 
	 * @param params
	 *            prod_id 상품일련번호
	 * @return CartVO
	 */
	public CartVO gerprod(Map<String, String> params);

	/**
	 * 장바구니 테이블에 있는 상품 수량 update
	 * 
	 * @param cartVO
	 * @return 작업성공1 실패 0
	 */
	public int updateCartQty(CartVO cartVO);

	/**
	 * 장바구니 listview에 서 상품 선택 삭제 기능
	 * 
	 * @param params
	 *            회원아이디, 상품아이디
	 * @return
	 */
	public int deleteCartProd(Map<String, String> params);
	
	
	
	

}