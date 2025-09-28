package assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment20_ReadPdf {

	public static void main(String[] args) throws Exception {
		String data = PdfUtil.readPdf("Transactions.pdf", 1, 1);
        double totalAmount = 0.0;

        // Use regex to match numbers (including decimals)
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            double amount = Double.parseDouble(matcher.group());
            System.out.println("Amount found : " + amount);
            totalAmount += amount;
        }

        System.out.println("------------------------");
        System.out.println("Total amount is : " + totalAmount);

	}

}
