package com.spring.boot.model;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TableInfo {

	private Long tableId;
	private String tableNo;
	private int seatingCount;
	
	public TableInfo(Long tableId) {
		super();
		this.tableId = tableId;
	}


	public TableInfo(String tableNo, int seatingCount) {
		super();
		this.tableNo = tableNo;
		this.seatingCount = seatingCount;
	}


	public TableInfo(Long tableId, String tableNo, int seatingCount) {
		super();
		this.tableId = tableId;
		this.tableNo = tableNo;
		this.seatingCount = seatingCount;
	}

	
	public TableInfo() {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(tableNo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TableInfo other = (TableInfo) obj;
		return Objects.equals(tableNo, other.tableNo);
	}

	
}
