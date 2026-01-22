import java.util.*;
public class sortng {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int a = 5;


        for (int i = 0; i < a; i++){
            System.out.println("Enter any number and see the megic " );
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if (arr[i] < arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println("sorted number");
        for (int i = 0; i < a; i++){
            System.out.println(arr[i]);
        }

    }
}
