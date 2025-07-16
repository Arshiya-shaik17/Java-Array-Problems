import java.util.Scanner;

public class CountEven {
    public static void digitCount(int n,int a[]) {
        int ev_sum=0;
        for(int i=0;i<n;i++){
            int temp=a[i];
            int count=0;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            if(count%2==0){
                ev_sum++;
            }
        }
        
        System.out.println(ev_sum);

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
        int [] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        digitCount(m, arr);
        
    }
}
