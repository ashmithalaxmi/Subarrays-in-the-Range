import java.util.Scanner;

public class SubarrayInRange {
    public static void subArray(int[] arr, int a, int b){
        for(int i=a;i<=b;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int a= sc.nextInt();
        int b= sc.nextInt();

        subArray(arr, a, b);
    }
}
