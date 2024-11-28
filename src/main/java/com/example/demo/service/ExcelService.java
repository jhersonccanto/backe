package com.example.demo.service;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.ImportResults;


@Service
public interface ExcelService {
	  ImportResults importData(MultipartFile file) throws IOException, SQLException;
}
