import java.util.Arrays;
import java.util.Scanner;

public class Shuffle {
    public static void shu(int n,int a[]) {
        int[] re=new int[2*n];
        for(int i=0;i<n;i++){
            re[2*i]=a[i];
            re[2*i+1]=a[n+i];
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
        int n=sc.nextInt();
        shu(n, arr);
    }
}
