package com.spring.apple.model;

public class BasePage {

	/*�� ��ȸ �Ǽ�*/
	protected int	totalCnt = 0;
	
	/*������ NO 1 ���� ����*/
	protected int	pageNo = 0;
	
	/*�� �������� ��ȸ �Ǽ�*/
	protected int	rowsPerPage = 0;
	
	/*ȭ�鿡 ������ ������ ����*/
	protected int	pageSize = 0;
	
	/*�� ������ ��*/
	protected int	totalPage = 0;
	
	/*�� ȭ���� ���� ������ ��ȣ*/
	protected int	startPageNo = 0;
	
	/*�� ȭ���� �� ������ ��ȣ*/
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
