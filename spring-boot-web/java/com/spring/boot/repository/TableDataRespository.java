package com.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.dto.TableDTO;

public interface TableDataRespository extends JpaRepository<TableDTO, Long> {

}
