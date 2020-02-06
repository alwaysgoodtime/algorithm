package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.BucketSort;

import java.util.Arrays;

/** 
* BucketSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class BucketSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sort(int[] array) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    int[] a = {0,5,6,9,2,4,5,7};
    int[] sort = BucketSort.sort(a);
    System.out.println(Arrays.toString(sort));
} 


} 
