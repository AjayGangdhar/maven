package assignments;

public class Assignment18_Palindrome {

	public static void main(String[] args) {
		
		String org= "race a car";
		String mod= org.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		String rev= new StringBuilder(mod).reverse().toString();
		
		if (rev.equalsIgnoreCase(mod)) {
			System.out.println(mod + " is Palindrome");
		}else
			System.out.println(mod + " is not Palindrome");

	}

}
