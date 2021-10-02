package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.model.TableInfo;
import com.spring.boot.service.TableService;

@org.springframework.stereotype.Controller
@RequestMapping("/hotel")
public class Controller {
	
	@Autowired
	private TableService tableService;
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	@RequestMapping("/add-table")
    public String addTable(Model model) {
		TableInfo info = new TableInfo();
		model.addAttribute("table",info);
        return "add-table";
    }

	@GetMapping(value="/tables")
	public String getTables(Model model){
		model.addAttribute("tables", tableService.getTables());
		return "view-tables";
	}
	
	@RequestMapping(value = "/table/{tableId}", method=RequestMethod.GET)
	public TableInfo getTableInfo(@PathVariable String tableId) {
		return tableService.getTableInfo(Long.parseLong(tableId));
	}
	
	@RequestMapping(value = "/table/add", method=RequestMethod.POST)
	public String addtable(@ModelAttribute TableInfo tableInfo, Model model) {

		tableService.addTable(tableInfo);
		
		model.addAttribute("tables", tableService.getTables());
		return "view-tables";
	}
	
	@RequestMapping(value = "/table/delete/{tableId}", method=RequestMethod.DELETE)
	public String deleteTable(@PathVariable String tableId, Model model) {
		
		
		tableService.deleteTable(Long.parseLong(tableId));
		
		model.addAttribute("tables", tableService.getTables());
		return "view-tables";
	}
	
	
	
	
}
