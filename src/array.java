
class array {

	public static void main(String[] args) {
		int i,n=5;
		int j=1;
		int a[]=new int [n];
		for(i=0;i<n;j++,i++)
		{
			a[i]=j*j;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);

	}
	}
}
