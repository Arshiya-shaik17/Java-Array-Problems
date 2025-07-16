import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSort {
    public static void MergeASort(int a[],int b[]) {
        int n1=a.length;
        int n2=b.length;
        int[] re=new int[n1+n2];
        re=Arrays.copyOf(a,n1+n2);
        System.err.println(Arrays.toString(re));
        for(int i=0;i<n2;i++){
            re[n1+i]=b[i];
        }
        Arrays.sort(re);
        System.out.println(Arrays.toString(re));
        
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
        int [] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] arr2= new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        MergeASort(arr1, arr2);
    }
    

    
}
