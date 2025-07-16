import java.util.Scanner;

public class MissingInRange{
    public static int piv(int n,int a[]) {
        
        int tsum=n*(n+1)/2;
        int sum=0;
        for(int i:a){
             sum+=i;
        }
        return tsum-sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(piv(n, arr));
    }
}
