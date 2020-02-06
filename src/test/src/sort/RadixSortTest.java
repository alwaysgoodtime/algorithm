package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.RadixSort;

import java.util.Arrays;

/** 
* RadixSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class RadixSortTest { 

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
    int[] a = {8,9,1,7,2,3,5,4,6,0,34,45,45,23,4234,343242,21313,12312};
    int[] sort = RadixSort.sort(a);
    System.out.println(Arrays.toString(sort));
} 


} 
