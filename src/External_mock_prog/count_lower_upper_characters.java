package External_mock_prog;

public class count_lower_upper_characters {
	public static void main(String[] args) {
		String s="Madhavi KadaM";
		char n;
		int count=0;
		int temp=0;
		for(int i=0;i<s.length();i++) {
			n=s.charAt(i);
			for(int j=65;j<=90;j++) {//char can be used A-Z
				if(j==n) {
					count++;
				}
			}
			for(int k=97;k<=122;k++) {//char can be used a-z
				if(n==k) {
					temp++;
				}
			}
		}
		System.out.println("no of uppercase char are:"+count);//3
		System.out.println("no of lowercase char are:"+temp);//9
	}

}
