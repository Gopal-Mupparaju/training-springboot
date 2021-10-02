package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.TableInfo;

@RestController
@RequestMapping("/api")
public class RestConstroller {

	@GetMapping(value="/tables", produces = {MediaType.APPLICATION_JSON_VALUE, 
			MediaType.APPLICATION_XML_VALUE})
	public List<TableInfo> getTables(){
		
		List<TableInfo> tablesList = new ArrayList<>();
		
		IntStream.range(1, 10).forEach(number -> {
			TableInfo info = new TableInfo();
			info.setTableNo("table-"+number);
			Random rm = new Random();
			info.setSeatingCount(rm.nextInt(10)+1);
			
			tablesList.add(info);
		});
		
		return tablesList;
	}
	
	@RequestMapping(value = "/table/{tableId}", method=RequestMethod.GET)
	public TableInfo getTableInfo(@PathVariable String tableId) {
		
		List<TableInfo> tablesList = new ArrayList<>();
		
		IntStream.range(1, 10).forEach(number -> {
			TableInfo info = new TableInfo();
			info.setTableNo("table-"+number);
			Random rm = new Random();
			info.setSeatingCount(rm.nextInt(10)+1);
			
			tablesList.add(info);
		});
		
		return tablesList.get(tablesList.indexOf(new TableInfo(tableId, 0)));
	}
	
	@RequestMapping(value = "/table/add", method=RequestMethod.POST)
	public TableInfo addtable(@RequestBody TableInfo tableInfo) {

		return tableInfo;
	}
	
	@RequestMapping(value = "/table/delete/{tableId}", method=RequestMethod.DELETE)
	public List<TableInfo> deleteTable(@PathVariable String tableId) {
		
		List<TableInfo> tablesList = new ArrayList<>();
		
		IntStream.range(1, 10).forEach(number -> {
			TableInfo info = new TableInfo();
			info.setTableNo("table-"+number);
			Random rm = new Random();
			info.setSeatingCount(rm.nextInt(10)+1);
			
			tablesList.add(info);
		});
		
		tablesList.remove(new TableInfo(tableId, 0));
		
		return tablesList;
	}
	
	
	
	
}
