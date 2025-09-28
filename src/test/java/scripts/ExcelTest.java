package scripts;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ExcelTest {

    public static void main(String[] args) {

        Map<String, List<Map<String, String>>> data = ExcelUtil.readWorkbookAsMap("Assignment 19.xlsx");

        // Example: Get first row of "ProductDetails" sheet
        String supplier = data.get("ProductDetails").get(1).get("Supplier");
        System.out.println("Supplier: " + supplier);

    
    }
}
