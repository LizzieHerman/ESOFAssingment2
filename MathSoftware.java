package intsort;

/**
 *
 * @author Lizzie Herman and Hayley Smith
 */
public abstract class MathSoftware {
    protected ISortStrategy ss;
    
    public void setSortStrategy(ISortStrategy a){
        ss = a;
        System.out.println("changed sort startegy");
    }
    
    public int[] performSort(int[] integers){
        return ss.mathSort(integers);
    }
}
