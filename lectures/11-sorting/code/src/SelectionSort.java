public class Selection {
    public static void main(String[] args) {
        int[] arr = {7,8,5,4,9,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
                
            }
            if (min != i) {
                swap(arr, min, i);
            }
            
        }

    }
}
