package External_mock_prog;

public class find_dupli_no {
	public static void main(String[] args) {
		int ar[]= {4,3,9,4,6};
		
		
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					//System.out.println("the duplicate element is:"+ar[j]);
					System.out.println(ar[j]);
				}
				
			}
		}
		
		
	  }	
}
