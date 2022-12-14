package External_mock_prog;

public class length_of_no_using_int {
	public static void main(String[] args) {
		int i= 1234567;
		int count=0;
		while(i>0) {
			i=i/10;
			count++;
		}
		System.out.println(count);
	}

}
