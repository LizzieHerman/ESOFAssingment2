package intsort;

import java.util.*;

/**
 *
 * @author Lizzie Herman and Hayley Smith
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of integers to be sorted: ");
        int input = scanner.nextInt();
        int[] integers = new int[input];
        int[] second = new int[input];
        for(int i = 0; i < input; i++){
            System.out.print("Input next integer to be sorted: ");
            integers[i] = scanner.nextInt();
            second[i] = integers[i];
        }
        System.out.println("Input integer of software you would like to use.\nMathematica = 0, Mtool = 1, MyMath = 2");
        int program = scanner.nextInt();
        MathSoftware software;
        switch(program){
            case 0:
                software = new Mathematica();
                break;
            case 1:
                software = new MTool();
                break;
            case 2:
                software = new MyMath();
                break;
            default:
                software = new MTool();
                break;
        }
        software.performSort(integers);
        System.out.println("Sorted Integers:");
        for(int i = 0; i < input; i++){
            System.out.print(integers[i] + " ");
        }
        System.out.println("\nInput integer of sorting algorithm you would like to use.\nInsertion Sort = 0, Merge Sort = 1, Buble Sort = 2");
        int algorithm = scanner.nextInt();
        switch(algorithm){
            case 0:
                software.setSortStrategy(new InsertionSort());
                break;
            case 1:
                software.setSortStrategy(new MergeSort());
                break;
            case 2:
                software.setSortStrategy(new BubbleSort());
                break;
        }
        software.performSort(second);
        for(int i = 0; i < input; i++){
            System.out.print(second[i] + " ");
        }
        
        System.out.println();
    }
}
