import java.util.Scanner;

class Sort {

    //TODO:
    // * 6 bugs:
    // * for (int j = i; j < n; j++) -> for (int j = 0; j < n - 1; j++)
    // * if (array[j] < array[low_index]) -> if (array[j] < array[j + 1])
    // * low_index = i; -> low_index = j;
    // * int temp = array[low_index];
    //   array[low_index] = array[i];
    //   array[i] = temp; -> move to if (array[j] > array[low_index]) and change variables
    // *  while (i < n) ->  while (i <= n)
    // * System.out.println(array[++i] + " "); -> System.out.println(array[i++] + " ");

    void sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int low_index = i;
            for (int j = i; j < n; j++) {
//            for (int j = 0; j < n - 1; j++) {
                if (array[j] < array[low_index]) {
//                if (array[j] > array[j + 1]) {
//                    low_index = i;
                    low_index = j;
//                    int temp = array[low_index];
//                    array[low_index] = array[low_index + 1];
//                    array[low_index + 1] = temp;
                }
            }
            int temp = array[low_index];
            array[low_index] = array[i];
            array[i] = temp;
        }
    }

    static void printArray(int array[]) {
        int n = array.length - 1;
        int i = 0;
//        while (i < n)
        while (i <= n)
//            System.out.println(array[++i] + " ");
            System.out.println(array[i++] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int i;
        int array[] = new int[5];
        Scanner myObj = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            int val = myObj.nextInt();
            array[i] = val;
        }
        Sort ob = new Sort();
        ob.sort(array);
        printArray(array);
    }
}