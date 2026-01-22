import java.util.*;
public class satck
{
    int size = 10;
    int count = 0;
    int[] arr = new int[size];
    public void display() {
        if (count == 0){
            System.out.println("stack is empty" );
            return;
        }
        for (int i = 0; i < count; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void push_stack(int value){
        if (count == size ){
            System.out.println("satck is full");
        }
        else {
            arr[count] = value;
            count++;
            System.out.println(value + " stack is pushed");
        }
    }
    public void pop_stack() {
        if (count == 0) {
            System.out.println("stack is empty");
        } else {
            count--;
            arr[count] = 0;
            System.out.println("stack deleted");
        }
    }
    public void search_method(int b){
        if (count == 0){
            System.out.println("empty stack "  );
            return;
        }
        for (int i = 0; i < count; i++) {
            if (arr[i] == b) {
                System.out.println("found in stack " + arr[i]);
                return;
            }
        }
        System.out.println("not found in stack ");
    }
    public static void main(String[] args) {
         satck st = new satck();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.push menu");
            System.out.println("2.pop menu");
            System.out.println("3.display menu");
            System.out.println("4.Search ");
            System.out.println("5.Exit");
            System.out.println("select menu");
            int a = sc.nextInt();
            if (a == 1){
                System.out.println("1.You selected push menu " );
                System.out.println("Enter Value");
                int value = sc.nextInt();
                st.push_stack(value);

            } else if (a == 2) {
                System.out.println("2.You selected pop menu " );
                st.pop_stack();

            } else if (a == 3) {
                System.out.println("3.You selected display menu "  );
                st.display();

            } else if (a == 4) {
                System.out.println("4.You selected search menu ");
                System.out.println("please select stack value ");
                int b = sc.nextInt();
                st.search_method(b);

            } else if (a == 5) {
                System.out.println("5.Exit");
                sc.close();
                return;

            }else{
                System.out.println("invalid value");
            }
        }
    }
}