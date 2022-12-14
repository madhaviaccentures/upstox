package External_mock_prog;

public class Reverse_sentence {
	public static void main(String[] args) {
		String org="My Name is madhavi";
		String rev="";
		/*for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}System.out.println(rev);*/
		
		for(int i=0;i<org.length();i++) {
			rev=org.charAt(i)+rev;
		}System.out.println(rev);
		
		
	}

}
