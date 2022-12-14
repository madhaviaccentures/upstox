package External_mock_prog;

public class Count_whitespaces {
	public static void main(String[] args) {
		String s="m a d h a v i";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '){
				count++;
			}	
		}
		System.out.println(count);
		}
	}

