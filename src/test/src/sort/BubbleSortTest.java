package test.src.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.sort.BubbleSort;


/** 
* BubbloSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class BubbleSortTest {

@Before
public void before() throws Exception {
    System.out.println("开始");
} 

@After
public void after() throws Exception {
    System.out.println("完了");
} 

/** 
* 
* Method: sort(int[] test) 
* 
*/ 
@Test
public void testSort() throws Exception { 
//TODO: Test goes here...
    int[] a = {0,5,6,9,2,4,5,7};
    int[] sort = BubbleSort.sort(a);
    for (int s: sort
         ) {
        System.out.print(s+"\t");
    }
}


} 
