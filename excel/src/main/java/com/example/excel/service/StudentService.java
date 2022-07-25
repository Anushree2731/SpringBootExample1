package com.example.excel.service;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import com.example.excel.pojo.Student;


@Service
public class StudentService {
	
	
	
	public void saveData(Student stu) {
		
		 try {
	            String filename = "C:\\Users\\anushree\\Desktop\\anushree\\Book.xls" ;
	            HSSFWorkbook workbook = new HSSFWorkbook();
	            HSSFSheet sheet = workbook.createSheet("FirstSheet");  

	            HSSFRow rowhead = sheet.createRow((short)0);
	            rowhead.createCell(0).setCellValue(stu.getId());
	            rowhead.createCell(1).setCellValue(stu.getName());
	            rowhead.createCell(2).setCellValue(stu.getAddress());
	            rowhead.createCell(3).setCellValue(stu.getEmail());

	            HSSFRow row = sheet.createRow((short)1);
	            row.createCell(0).setCellValue("01");
	            row.createCell(1).setCellValue("Anushree AR");
	            row.createCell(2).setCellValue("India");
	            row.createCell(3).setCellValue("anushree.ar@gmail.com");

	            FileOutputStream fileOut = new FileOutputStream(filename);
	            workbook.write(fileOut);
	            fileOut.close();
	            workbook.close();
	            System.out.println("Your excel file has been generated!");

	        } catch ( Exception ex ) {
	            System.out.println(ex);
	        }
	}

	public Student getData(Student student) {
		student.setName("Anushree");
		student.setAddress("Ramnagar, Karnataka");
		student.setEmail("anushree.ar@gmail.com");
		student.setId("3456");
		return student;
	
		
	}	
	
	
	

}
