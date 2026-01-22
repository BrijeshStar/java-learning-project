import java.util.*;

public class Queue {
    int size = 10;
    int front = 0;
    int rear = -1;
    int[] arr = new int[size];


    public void insert(int d) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = d;
        System.out.println("Inserted: " + d);
    }


    public void delete() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        int remove = arr[front];
        front++;
        System.out.println("Deleted: " + remove);
    }


    public void display_ue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue elements are:");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }


    public void search_ue(int e) {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            if (arr[i] == e) {
                System.out.println("Found: " + e + " at index " + i);
                return;
            }
        }
        System.out.println("Not found in queue");
    }

    public static void main(String[] args) {
        que st = new que();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Search");
            System.out.println("5.Exit");

            int b = sc.nextInt();

            if (b == 1) {
                System.out.println("Enter value:");
                int d = sc.nextInt();
                st.insert(d);

            } else if (b == 2) {
                st.delete();

            } else if (b == 3) {
                st.display_ue();

            } else if (b == 4) {
                System.out.println("Enter number to search:");
                int e = sc.nextInt();
                st.search_ue(e);

            } else if (b == 5) {
                System.out.println("Exit");
                sc.close();
                return;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
