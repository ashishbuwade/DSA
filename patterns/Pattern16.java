/*
		1 
		1 2 1 
		1 2 3 2 1 
		1 2 3 4 3 2 1 
		1 2 3 4 5 4 3 2 1 
 */

package patterns;

public class Pattern16 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				System.out.print(++count +" ");
			}
			
			for(int k=1;k<i;k++) {
				System.out.print(--count +" ");
			}
				
			System.out.println();
		}
	}
	
}
