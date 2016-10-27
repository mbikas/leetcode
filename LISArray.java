import java.util.Arrays;
import java.util.Scanner;


public class LISArray {

	static int totalCount = 0;
	static void backtrack(int pos, int a[], int m, int n){
	    int i,j;
	    if(pos == m){
	        
	        boolean isSolution = true;
	        int start = 0;
	        for(i=1;i<=n;i++){
	        	boolean found = false;
	            for(j=start;j<m;j++){
	            	if(a[j] == i){
	            		start = j+1;
	            		found = true;
	            		break;
	            	}
	            }
	            if(!found)isSolution=false;
	        }
	        if(isSolution){
	        	totalCount++;
	        	//for(i=0;i<m;i++)System.out.print(a[i]+"");
		        //System.out.println();
	        }
	        return;
	    }
	    
	    for(int ind=1;ind<=n;ind++){
	        a[pos] = ind;
	        backtrack(pos+1, a, m,n);
	    }
	}

	
	
	
	static long LISCount(int m, int n){
		int max = 1000002;
		
		int a[]= new int[max];
		backtrack(0, a, m,n);
		return max;
		
	}
	
	public static void main(String[] args) {
		totalCount = 0;
		LISCount(6,4);
		System.out.println(totalCount);
		
		totalCount = 0;
		LISCount(6,5);
		System.out.println(totalCount);
		totalCount = 0;
		LISCount(6,6);
		System.out.println(totalCount);
		
		Scanner reader = new Scanner(System.in);  
		int cases = reader.nextInt();
		while(cases > 0){
			
			int m = reader.nextInt();
			int n = reader.nextInt();
			totalCount = 0;
			LISCount(m,n);
			System.out.println(totalCount);
			
			cases--;
		}
		reader.close();

	}

}
