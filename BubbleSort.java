package intsort;

/**
 *
 * @author Lizzie Herman and Hayley Smith
 */
public class BubbleSort implements ISortStrategy{
    public int[] mathSort(int[] integers){
        for (int i = 1; i < integers.length; i ++) {
            for(int j = i - 1; j >= 0 && integers[j] > integers[j + 1]; j--){
                swap(integers,j);
            }
        }
        return integers;
    }
    public void swap(int[] v, int k){
        int temp = v[k];
        v[k] = v[k + 1];
        v[k + 1] = temp;
    }
}
