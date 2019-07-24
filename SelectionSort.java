import java.util.Arrays;


public class SelectionSort{

    public static int[] selection_sort(int[] arr){

        for (int i=0; i<arr.length; i++){

            int min = i;

            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
    
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;

        }
    return arr;
    }


    public static void main(String[] args){

        int[] array1 = {5,2,7,1,2,6,9,2};
        test(array1);

        int[] array2 = {};
        test(array2);

        int[] array3 = {1};
        test(array3);

        int[] array4 = {1,2,3,4,5,6,7,8};
        test(array4);

        int[] array5 = {6,5,4,3,2,1};
        test(array5);

        int[] array6 = {1,1,1,1,1,1};
        test(array6);

        int[] array7 = {-5,6,-2,4,0,1,-3,2,-4,-2,1,-10};
        test(array7);

    }


    public static void test(int[] arr){
        System.out.println("Unsorted: "+Arrays.toString(arr));
        int[] sorted_arr = selection_sort(arr);
        System.out.println("Sorted: "+Arrays.toString(sorted_arr));
        boolean sorted = true;
        for (int i=0; i<arr.length-1; i++){
            if (sorted_arr[i]>sorted_arr[i+1]){
                sorted = false;
            }
        }
        System.out.println("Correct sorted: "+sorted+"\n");
    }

}

