void main() {

    int[] a = {85, 85, 71, 89, 89, 10, 71,91,91,91,92};
    int count = 1;
    int temp;

    for (int i = 0; i < a.length; i++) {

        for (int j = count + 1; j < a.length; j++ ){

            if (a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }

        }

    System.out.println("3 rd highest number " + a[a.length - 6]);

    }





