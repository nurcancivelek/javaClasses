package OnlineCodes;

public class StringToCharArrayBB {
	public static void main(String[] args) {
		
		String str=new String("Ceku is here");
		char[] array=str.toCharArray();
		for(char c:array) {
			System.out.println(c);
		}
		for(int i=str.length()-1; 1>=0;i--) {
			System.out.println(str.charAt(i));
		}
	}

}
