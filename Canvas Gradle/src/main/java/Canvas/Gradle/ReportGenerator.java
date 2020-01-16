package Canvas.Gradle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReportGenerator 
{
	public void createReport()
	{
		try
		{
			File sourceFile = new File("./Report Template.xlsx");
			File targetFile = new File("Report.xlsx");
			//File sourceFile = new File("D:\\workspace\\Canvas Report Template\\Report Template.xlsx");
			//File targetFile = new File("D:\\workspace\\Canvas Execution Report\\Report.xlsx");
			FileUtils.copyFile(sourceFile, targetFile);
		}				
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	public void writeReport(String[] dataToWrite) throws IOException 
	{
		try 
		{
			File file = new File("Report.xlsx");
			//File file = new File("D:\\workspace\\Canvas Execution Report\\Report.xlsx");
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook report = new XSSFWorkbook(inputStream);
			XSSFSheet sheet1 = report.getSheet("Report");
			int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
			XSSFRow newRow = sheet1.createRow(rowCount+1);
			XSSFCellStyle style2 = report.createCellStyle();
			style2.setBorderTop(CellStyle.BORDER_THIN);
			style2.setBorderBottom(CellStyle.BORDER_THIN);
			style2.setBorderLeft(CellStyle.BORDER_THIN);
			style2.setBorderRight(CellStyle.BORDER_THIN);
			XSSFCell cell = newRow.createCell(0);
			cell.setCellValue(dataToWrite[0]);
			cell.setCellStyle(style2);
			cell = newRow.createCell(1);
			cell.setCellValue(dataToWrite[1]);
			cell.setCellStyle(style2);
			sheet1.autoSizeColumn(0);
			
			XSSFSheet sheet2 = report.getSheet("Summary");
			DateFormat sdf = new SimpleDateFormat();
			Date date = new Date();
			sheet2.getRow(7).getCell(3).setCellValue(sdf.format(date));
			
			FormulaEvaluator evaluator = report.getCreationHelper().createFormulaEvaluator();
			evaluator.evaluateAll();
			
			inputStream.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			report.write(outputStream);
			outputStream.close();	
		}		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
