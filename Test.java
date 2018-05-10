
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {1,2};
		int[]b= {3,4};
		b=a;
		a[0]= 9;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}

}
