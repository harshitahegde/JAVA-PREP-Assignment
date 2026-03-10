public class BubbleSort {

    public static void main(String[] args) {

        int list[] = {9, 3, 7, 1, 5};

        for(int pass = 0; pass < list.length-1; pass++) {

            for(int j = 0; j < list.length-pass-1; j++) {

                if(list[j] > list[j+1]) {

                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}