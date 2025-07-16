import java.util.Scanner;

public class ConsecOne {
    public static void maxOnes(int a[]) {
        int max=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }

        }
        System.out.println(max);
        
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
        int [] arr= new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        maxOnes(arr);
    }
}
