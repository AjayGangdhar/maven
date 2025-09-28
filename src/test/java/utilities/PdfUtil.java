package utilities;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfUtil {

	public static String readPdf(String fileName, int startPage, int endPage ) throws Exception {
		String text= "";
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\TestData\\" + fileName);
		PDDocument document = PDDocument.load(fis);
		
		PDFTextStripper pdf = new PDFTextStripper();
		pdf.setStartPage(startPage);
		pdf.setEndPage(endPage);
		
		text = pdf.getText(document);
		
		
		return text;
	}
}
