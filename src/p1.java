import java.util.*;
public class p1 {
    static int size = 10;
    static int[] s = new int[size];
     public static void push_stack() {


         int count = -1;

         if (count == size ) {
             System.out.println("stack is full");
         } else {
             count++;
             s[size - count] = count;
         }

     }

     public static void pop() {

         int [] s = new int[10];
         int count = 0;
         for (int i =0; i > s[i]; i-- ){
             count--;
             System.out.println("Pop stack deleted value" + count);
         }
     }

     public static void display(){


         int count = 0;

         if (count == - 1){

             System.out.println("stack empty");
             return;

         }else{
             for (int i = 0; i >= 0; i--)
             System.out.println(s[i]);
         }
     }

    public static void exit(){

        System.out.println("exit the program");

    }

    static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         while(true){
             System.out.println("1.push menu");
             System.out.println("2.pop menu");
             System.out.println("3.display menu");
             System.out.println("4.Exit");
             System.out.println("select menu");
             int a = sc.nextInt();

         if (a == 1){
             System.out.println("1.You selected push menu " );
             push_stack();
         } else if (a == 2) {
             pop();
             System.out.println("2.You selected pop menu " );
         } else if (a == 3) {
             System.out.println("3.You selected display menu "  );
             display();
         } else if (a == 4) {
             System.out.println("4.Exit");
         }else{
             System.out.println("invalid value");
             sc.close();
             return;
         }


         }


    }

}





