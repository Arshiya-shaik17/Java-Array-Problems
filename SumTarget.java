import java.util.Scanner;

public class SumTarget {
    public static void checkSum(int target,int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("["+i+" "+j+"]");
                    break;
                }
                else{
                   System.out.print("[-1,-1]");
                }
            }

        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
        int [] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        checkSum(target, arr);
    }
    
}
