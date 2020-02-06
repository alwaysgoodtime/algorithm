package test.src.sort;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.StraightSelectSorting;

import java.util.Date;

/** 
* StraightSelectSorting Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class StraightSelectSortingTest { 

@Before
public void before() throws Exception {
    Date date = new Date();
    long time = date.getTime();
    System.out.println(time);
} 

@After
public void after() throws Exception {
    Date date = new Date();
    long time = date.getTime();
    System.out.println(time);
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
    int[] sort = StraightSelectSorting.sort(a);
    for (int s: sort
    ) {
        System.out.print(s+"\t");
    }
} 


} 
