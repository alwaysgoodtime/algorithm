package test.src.search; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.search.BinarySearch;
import src.search.FibonacciSearch;

/** 
* FibonacciSearch Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class FibonacciSearchTest { 

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
} 

/** 
* 
* Method: fibonacci(int length) 
* 
*/ 
@Test
public void testFibonacci() throws Exception { 
//TODO: Test goes here...
    int[] a = {1,2,3,5,6,7,7,7,7,8};
    int search = FibonacciSearch.search(a, 8);
    System.out.println(search);
} 


} 
