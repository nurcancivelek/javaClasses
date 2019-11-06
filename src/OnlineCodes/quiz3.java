package OnlineCodes;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj = "I LIKE JAVA";
		System.out.println(obj.charAt(3));
		
		String str = "0123456789";
		System.out.println(str.substring(4));
		
		 String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);
	      
	      String str_Sample = "RockStar";
	      System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
		
	}

}
