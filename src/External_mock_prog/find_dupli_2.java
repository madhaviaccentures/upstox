package External_mock_prog;

public class find_dupli_2 {
	public static void main(String[] args) {
		String s="12345345";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}if(count>=2) {
				System.out.println(s.charAt(i)+"repeated no:"+count);
			}
			count=0;
		}
	}

}
