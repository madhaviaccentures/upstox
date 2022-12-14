package External_mock_prog;

public class reverse_num_thr_string {
	public static void main(String[] args) {
		String s="1234567";
		String r="";
		for(int i=0;i<s.length();i++) {
		r=s.charAt(i)+r;	
		}
		System.out.println(r);
	}

}
