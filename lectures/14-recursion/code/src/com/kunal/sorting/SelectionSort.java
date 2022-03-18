public class selection {
    public static void main(String[] args) {
        int[] num = { 6,4,3,2,1} ;
        selcsort(num, num.length ,0 , 0 );
        System.out.println(Arrays.toString(num));
    }
    static void selcsort(int[] arr , int r , int c , int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[max]){
                selcsort(arr, r , c+1 , c);
            }
            else {
                selcsort(arr , r, c+1 , max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp ;
            selcsort(arr, r-1 , 0 , 0);
        }

    }
}
