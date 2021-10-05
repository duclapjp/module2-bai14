public class InsertionSort {
    static int [] arr = {2,5,9,4,3,10};
    public static void insertionSort(int[] array){
        int pos,x;
        for (int i = 1; i < array.length ; i++) {
            x= array[i];
            pos=i;
            while(pos>0 && x <array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos]=x;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
