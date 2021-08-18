package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    @Test
    public void quickSortTest1(){

        int[] quickSortArr = {8, 4, 23, 42, 16, 15};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr,0,5);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(quickSortArr));
    }

    @Test
    public void quickSortTest2(){

        int[] quickSortArr = {20, 18, 12, 8, 5, -2};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr,0,5);
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(quickSortArr));
    }

    @Test
    public void quickSortTest3(){

        int[] quickSortArr = {2, 10, 5, 2, 2, 9};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr,0,5);
        assertEquals("[2, 2, 2, 5, 9, 10]", Arrays.toString(quickSortArr));
    }

    @Test
    public void quickSortTest4(){

        int[] quickSortArr = {1, 3, 5, 7, 13, 11,17};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr,0,5);
        assertEquals("[1, 3, 5, 7, 11, 13, 17]", Arrays.toString(quickSortArr));
    }

    @Test
    public void quickSortTest5(){

        int[] quickSortArr = {4};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(quickSortArr,0,5);
        assertEquals("[4]", Arrays.toString(quickSortArr));
    }
}
