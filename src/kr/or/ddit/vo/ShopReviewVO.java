package kr.or.ddit.vo;

import java.io.Serializable;

public class ShopReviewVO implements Serializable{

	private int re_no; //리뷰번호
	
	
	private String re_writer; //작성자
	private String re_cont; // 내용
	private String re_star; //평점
	private String re_date; //날짜
	private int prod_id; // 상품번호
	private int mem_no; //회원번호
	private String mem_id; // 회원아이디
	
	
	
	
	public ShopReviewVO(int re_no, String re_writer, String re_cont, String re_star, String re_date, int prod_id,
			int mem_no, String mem_id) {
		super();
		this.re_no = re_no;
		this.re_writer = re_writer;
		this.re_cont = re_cont;
		this.re_star = re_star;
		this.re_date = re_date;
		this.prod_id = prod_id;
		this.mem_no = mem_no;
		this.mem_id = mem_id;
	}
	public ShopReviewVO() {
		super();
		
	}
	
	public ShopReviewVO(String text, String text2, String text3) {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
	public String getRe_writer() {
		return re_writer;
	}
	public void setRe_writer(String re_writer) {
		this.re_writer = re_writer;
	}
	public String getRe_cont() {
		return re_cont;
	}
	public void setRe_cont(String re_cont) {
		this.re_cont = re_cont;
	}
	public String getRe_star() {
		return re_star;
	}
	public void setRe_star(String re_star) {
		this.re_star = re_star;
	}
	public String getRe_date() {
		return re_date;
	}
	public void setRe_date(String re_date) {
		this.re_date = re_date;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	
	

   


}
