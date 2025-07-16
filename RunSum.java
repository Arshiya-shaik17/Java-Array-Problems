import java.util.Arrays;
import java.util.Scanner;

public class RunSum {

    public static void sumElments(int n,int a[]) {
        int[] re=new int[n];
        re[0]=a[0];
        for(int i=1;i<n;i++){
                re[i]=re[i-1]+a[i-1];
        } 
        System.out.println(Arrays.toString(re));  
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumElments(n, arr);
        
    }
    
}
