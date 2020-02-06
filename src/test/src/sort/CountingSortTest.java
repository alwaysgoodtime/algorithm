package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.CountingSort;

import java.util.Arrays;

/** 
* CountingSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class CountingSortTest { 

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
    int[] a = {11,18,25,36,63,232,232,43,323};
    int[] sort = CountingSort.sort(a);
    System.out.println(Arrays.toString(sort));
}

} 
