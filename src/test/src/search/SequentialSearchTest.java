package test.src.search; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.search.BinarySearch;
import src.search.SequentialSearch;

/** 
* SequentialSearch Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class SequentialSearchTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: search(int[] array, int target) 
* 
*/ 
@Test
public void testSearch() throws Exception { 
//TODO: Test goes here...
    int[] a = {1,2,3,4,7,5,7};
    int search = SequentialSearch.search(a, 3);
    System.out.println(search);

} 


} 
