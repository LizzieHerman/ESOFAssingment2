package intsort;

/**
 *
 * @author Lizzie Herman and Hayley Smith
 */
public class InsertionSort implements ISortStrategy{
    public int[] mathSort(int[] integers){
        int key, j;  
        for (int i = 1; i < integers.length; i++){
            key = integers[i];
            for(j = i - 1; j >= 0 && integers[j] > key; j--){
                integers[j + 1] = integers[j];
            }
            integers[j + 1] = key;
        }
        return integers;
    }
}
