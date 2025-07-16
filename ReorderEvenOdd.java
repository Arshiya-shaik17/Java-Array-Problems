import java.util.Arrays;
import java.util.Scanner;

public class ReorderEvenOdd {
    public static void reorder(int a[] ) {
        int n=a.length;
        int r=n-1;
        int temp=0;
        int[] re=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                    re[temp]=a[i];
                    temp++;
                }
                else{
                    re[r--]=a[i];
                }
              
            }
            System.out.println(Arrays.toString(re));
    
            
        }
        
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
        int [] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        reorder(arr);
        
    }

}