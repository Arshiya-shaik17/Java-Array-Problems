import java.util.Scanner;

public class Stock {
    
    public static int profit(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                int profit = arr[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(profit(arr));
    }
    
    
}
