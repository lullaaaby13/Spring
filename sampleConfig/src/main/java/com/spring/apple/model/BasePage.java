package com.spring.apple.model;

public class BasePage {

	/*총 조회 건수*/
	protected int	totalCnt = 0;
	
	/*페이지 NO 1 부터 시작*/
	protected int	pageNo = 0;
	
	/*한 페이지당 조회 건수*/
	protected int	rowsPerPage = 0;
	
	/*화면에 보여질 페이지 갯수*/
	protected int	pageSize = 0;
	
	/*총 페이지 수*/
	protected int	totalPage = 0;
	
	/*한 화면의 시작 페이지 번호*/
	protected int	startPageNo = 0;
	
	/*한 화면의 끝 페이지 번호*/
	protected int	endPageNo = 0;

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getrowsPerPage() {
		return rowsPerPage;
	}

	public void setrowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartPageNo() {
		return startPageNo;
	}

	public void setStartPageNo(int startPageNo) {
		this.startPageNo = startPageNo;
	}

	public int getEndPageNo() {
		return endPageNo;
	}

	public void setEndPageNo(int endPageNo) {
		this.endPageNo = endPageNo;
	}
	
	
	
	
}
