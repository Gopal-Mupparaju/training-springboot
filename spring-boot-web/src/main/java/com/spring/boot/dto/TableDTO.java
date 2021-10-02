package com.spring.boot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TABLE_INFO")
public class TableDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Long tableId;
	
	@Column(name = "TABLE_NO")
	private String tableNo;
	
	@Column(name = "SEATING_COUNT")
	private int seatingCount;
	
	public TableDTO(Long tableId, String tableNo, int seatingCount) {
		super();
		this.tableId = tableId;
		this.tableNo = tableNo;
		this.seatingCount = seatingCount;
	}

	public TableDTO(String tableNo, int seatingCount) {
		super();
		this.tableNo = tableNo;
		this.seatingCount = seatingCount;
	}
	
	public TableDTO() {
		super();
	}
	
	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public String getTableNo() {
		return tableNo;
	}
	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}
	public int getSeatingCount() {
		return seatingCount;
	}
	public void setSeatingCount(int seatingCount) {
		this.seatingCount = seatingCount;
	}
}
