import java.util.Arrays;
import java.util.Scanner;

public class CountSmall {
    public static void smallCount(int a[]) {
        int[] re=new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            re[i]=count;
            count=0;
        
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
        smallCount(arr);
    }
 
}
