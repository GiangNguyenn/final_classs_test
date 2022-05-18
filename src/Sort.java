import java.util.Arrays;
import java.util.Scanner;
class Sort {
    void sort (int[] array) {
        int n = array.length;
        for (int i=0;i<n-1;i++) {
            int low_index = i;
            for (int j=i; j<n; j++) {
                if (array[j]<array[low_index])
                    low_index=j;
            }
            int temp = array[low_index];
            array[low_index] = array[i];
            array[i] = temp;
        }
    }
    static void printArray(int[] array) {
        int n=array.length-1;
        int i=0;
        while (i<=n)
            System.out.println(array[i++]+" ");
        System.out.println();
    }

//    static void printArray(int[] array) {
//        int n=array.length;
//        int i=0;
//        while (i<n){
//            System.out.println(array[i]+" ");
//            i++;}
//        System.out.println();}

    public static void main(String[] args) {
        int i;
        int[] array = new int[5];


        Scanner myObj = new Scanner(System.in);
        for (i=0; i<5; i++) {
            int val = myObj.nextInt();
            System.out.println(val);
            array[i] = val;
        }
        System.out.println(myObj);

        Sort ob = new Sort();
        ob.sort(array);
        printArray(array);
    }
}