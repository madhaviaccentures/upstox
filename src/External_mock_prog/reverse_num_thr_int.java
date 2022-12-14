package External_mock_prog;

public class reverse_num_thr_int {
	public static void main(String[] args) {
		int num=24537;
		int k;
		
		while(num>0) {
			k=num%10;//7
			num=num/10;//2453
			
			System.out.print(k);
		}
	}

}
