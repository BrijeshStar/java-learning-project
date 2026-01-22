import java.util.*;
public class sorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // manual sorting (bubble sort)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

