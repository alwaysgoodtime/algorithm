package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.MergeSort;

import java.util.Arrays;

/** 
* MergeSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class MergeSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] sort) 
* 
*/ 
@Test
public void testSortSort() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: sort(int[] origin, int head, int tail, int[] temp) 
* 
*/ 
@Test
public void testSortForOriginHeadTailTemp() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: merge(int[] origin, int head, int tail, int[] temp) 
* 
*/ 
@Test
public void testMerge() throws Exception { 
//TODO: Test goes here...
    int[] a = {0,5,6,9,2,4,5,7};
    int[] sort = MergeSort.sort(a);
    System.out.println(Arrays.toString(sort));
}
} 
