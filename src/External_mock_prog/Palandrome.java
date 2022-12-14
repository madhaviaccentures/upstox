package External_mock_prog;

public class Palandrome {
	public static void main(String[] args) {
		String org="NITIN";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
		if(org.equals(rev)) {
			System.out.println("string is palandrome");
		}
		else {
			System.out.println("string is not palandrome");
		}
		}	
	}


