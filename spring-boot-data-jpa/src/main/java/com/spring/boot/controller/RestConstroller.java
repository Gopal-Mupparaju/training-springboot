package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.TableInfo;
import com.spring.boot.service.TableService;

@RestController
@RequestMapping("/api")
public class RestConstroller {
	
	@Autowired
	private TableService tableService;

	@GetMapping(value="/tables", produces = {MediaType.APPLICATION_JSON_VALUE, 
			MediaType.APPLICATION_XML_VALUE})
	public List<TableInfo> getTables(){
		return tableService.getTables();
	}
	
	@RequestMapping(value = "/table/{tableId}", method=RequestMethod.GET)
	public TableInfo getTableInfo(@PathVariable String tableId) {
		return tableService.getTableInfo(Long.parseLong(tableId));
	}
	
	@RequestMapping(value = "/table/add", method=RequestMethod.POST)
	public TableInfo addtable(@RequestBody TableInfo tableInfo) {

		return tableService.addTable(tableInfo);
	}
	
	@RequestMapping(value = "/table/delete/{tableId}", method=RequestMethod.DELETE)
	public void deleteTable(@PathVariable String tableId) {
		
		
		tableService.deleteTable(Long.parseLong(tableId));
	}
	
	
	
	
}
