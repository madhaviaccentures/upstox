package External_mock_prog;

public class first_letter_capital {
	public static void main(String[] args) {
		String s="my country is india";
		String r="";
		String ar[]=null;
		ar=s.split(" ");
		for(int i=0;i<ar.length;i++) {
			String k=ar[i].substring(0, 1).toUpperCase()+ar[i].substring(1);
			r=r+" "+k;
		}
		r=r.substring(1);
		System.out.println(r);
	}

}
