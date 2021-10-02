package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.dto.TableDTO;
import com.spring.boot.model.TableInfo;
import com.spring.boot.repository.TableDataRespository;

@Service
public class TableService {

	@Autowired
	TableDataRespository dataRespository;
	
	public List<TableInfo> getTables() {
		List<com.spring.boot.dto.TableDTO> list= dataRespository.findAll();
		
		List<TableInfo> tableInfos = new ArrayList<>();
		
		list.stream().forEach(tabledata -> {
			TableInfo info = new TableInfo();
			info.setTableNo(tabledata.getTableNo());
			info.setSeatingCount(tabledata.getSeatingCount());
			info.setTableId(tabledata.getTableId());
			tableInfos.add(info);
		});
		
		return tableInfos;
		
	}
	
	public TableInfo getTableInfo(Long tableId) {
		Optional<com.spring.boot.dto.TableDTO> info= dataRespository.findById(tableId);
		
		TableInfo tableInfo = new TableInfo();
		if(info.isPresent()) {
			com.spring.boot.dto.TableDTO tabledata= info.get();
			tableInfo.setTableId(tabledata.getTableId());
			tableInfo.setTableNo(tabledata.getTableNo());
			tableInfo.setSeatingCount(tabledata.getSeatingCount());
		}
		
		return tableInfo;
	}
	

	public TableInfo addTable(TableInfo info) {
		TableDTO dto = new TableDTO(info.getTableNo(), info.getSeatingCount());
		
		TableDTO tabledata= dataRespository.save(dto);
		
		TableInfo tableInfo = new TableInfo();
		tableInfo.setTableId(tabledata.getTableId());
		tableInfo.setTableNo(tabledata.getTableNo());
		tableInfo.setSeatingCount(tabledata.getSeatingCount());
		
		return tableInfo;
		
	}
	
	public void deleteTable(Long tableId) {
		
		dataRespository.deleteById(tableId);
	}
}
