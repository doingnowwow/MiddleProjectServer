package kr.or.ddit.vo;

import java.io.Serializable;

public class DogSaleDtVO implements Serializable {

	private String sale_no; //분양번호
	private String dog_no; //애견번호
	private int com_no; //사업자번호
	private int seq_no; //순서번호
	private int mem_no; //분양신청자 회원번호
	private String accp_yn; //분양여부
	private String req_date; //승인날짜
	
	
	@Override
	public String toString() {
		return "DogSaleDtVO [sale_no=" + sale_no
				+ ", dog_no=" + dog_no
				+ ", com_no=" + com_no
				+ ", seq_no=" + seq_no
				+ ", mem_no=" + mem_no
				+ ", accp_yn=" + accp_yn
				+ ", req_date=" + req_date + "]";

		
		
	}


	public String getSale_no() {
		return sale_no;
	}


	public void setSale_no(String sale_no) {
		this.sale_no = sale_no;
	}


	public String getDog_no() {
		return dog_no;
	}


	public void setDog_no(String dog_no) {
		this.dog_no = dog_no;
	}


	public int getCom_no() {
		return com_no;
	}


	public void setCom_no(int com_no) {
		this.com_no = com_no;
	}


	public int getSeq_no() {
		return seq_no;
	}


	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}


	public int getMem_no() {
		return mem_no;
	}


	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}


	public String getAccp_yn() {
		return accp_yn;
	}


	public void setAccp_yn(String accp_yn) {
		this.accp_yn = accp_yn;
	}


	public String getReq_date() {
		return req_date;
	}


	public void setReq_date(String req_date) {
		this.req_date = req_date;
	}
	
	
}
