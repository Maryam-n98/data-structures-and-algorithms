package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTest1(){

        int [] merge = {8, 4, 23, 42, 16, 15};
        MergeSort mergeSort = new MergeSort();
        MergeSort.mergeSort(merge);
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(merge));
    }

    @Test
    public void mergeSortTest2(){

        int [] merge ={30, 20, 15, 14, 7, -5};
        MergeSort mergeSort = new MergeSort();
        MergeSort.mergeSort(merge);
        assertEquals("[-5, 7, 14, 15, 20, 30]",Arrays.toString(merge));
    }

    @Test
    public void mergeSortTest3(){

        int [] merge  = {2, 10, 2, 2, 1, 5 };
        MergeSort mergeSort = new MergeSort();
        MergeSort.mergeSort(merge );
        assertEquals("[1, 2, 2, 2, 5, 10]",Arrays.toString(merge ));
    }


    @Test
    public void mergeSortTest(){

        int [] merge  = {3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(merge );
        assertEquals("[3]",Arrays.toString(merge));
    }
}
