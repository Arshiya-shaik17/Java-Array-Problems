import java.util.Scanner;

public class Pivot {
    public static int piv(int a[]) {
        int tsum=0;
        int ls=0;
        for(int i:a){
             tsum+=i;
        }
        for(int i = 0;i<a.length;i++){
            if(ls==tsum-ls-a[i]){
                return i;
            }
            ls+=a[i];
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(piv(arr));
    }
}
