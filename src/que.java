import java.util.*;
public class que {
    int size = 10;
    int front = 0;
    int rear = -1;
    int [] arr = new int [size];

    public void display_ue(){
        if (front > rear){
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("value of display menu");

        for (int i =front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
    public void insert(int d){
      if (rear == size - 1){
          System.out.println("Queue is Full");
      }else {
            rear++;
            arr[rear]=d;
          System.out.println("Queue is pushed" );
      }
    }
    public void delete(){
        if  (rear < front){
            System.out.println("Queue is Empty");
            return;
        }
        int remove = arr[front];
        System.out.println("Value deleted in Queue " + remove);

            if (front == size) front = 0;
            front ++;
        }
    public void search_ue(int e) {
        if (front > rear) {

            System.out.println("Empty Queue");
            return;
        }
        for (int i = front; i <= rear; i++) {
            {
                if (arr[i] == e) {
                    System.out.println("Found in Queue" + e);
                    return;
                }
                System.out.println("not found in Queue");
            }
        }
    }
    static void main() {
        que st = new que();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please select menu");
            System.out.println("1.Insert menu");
            System.out.println("2.delete menu");
            System.out.println("3.Display menu");
            System.out.println("4.Search menu");
            System.out.println("5.Exit");
            int b = sc.nextInt();

            if (b == 1){
                System.out.println("1.Enter value of insert");
                System.out.println("Enter Value In Queue");
                int d = sc.nextInt();
                st.insert(d);
             }else if (b==2){
                System.out.println("2.Enter value of delete");
                st.delete();
            } else if (b == 3) {
                System.out.println("3.You select display menu");
                st.display_ue();
            } else if (b == 4) {
                System.out.println("4.You select search menu");
                System.out.println("Please Enter number");
                int e = sc.nextInt();
                st.search_ue(e);
            } else if (b == 5) {
                System.out.println("5.Exit");
                sc.close();
                return;
            }else {
                System.out.println("invalid value ");
            }
        }
    }
}
