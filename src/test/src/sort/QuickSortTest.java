package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.BubbleSort;
import src.sort.QuickSort;

import java.util.Arrays;

/** 
* QuickSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class QuickSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] array, int first, int last) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    int[] a = {0,5,6,9,2,4,5,7};
    int[] sort = QuickSort.sort(a,0,a.length-1);
    System.out.println(Arrays.toString(sort));
} 


} 
