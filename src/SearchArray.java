class SearchArray {

    // TODO:
    // * 2 bugs:
    // * mid = first + last / 2; -> mid = (first + last) / 2;
    // * while (first < last) -> while (first <= last)

    public static void search(int data[], int first, int last, int key) {
        int mid = (first + last) / 2;
//        while (first < last) {
        while (first <= last) {
            if (data[mid] < key) {
                first = mid + 1;
            } else if (data[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
//            mid = first + last / 2;
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 90;
        int last = arr.length - 1;
        search(arr, 0, last, key);
    }
}