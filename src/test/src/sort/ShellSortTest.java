package test.src.sort; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.sort.ShellSort;

/** 
* ShellSort Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class ShellSortTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sory(int[] array) 
* 
*/ 
@Test
public void testSort() throws Exception {
//TODO: Test goes here...
    int[] a = {8,9,1,7,2,3,5,4,6,0,34,45,45,23,4234,343242,21313,12312};
    int[] sort = ShellSort.sort(a);
    for (int s: sort
    ) {
        System.out.print(s+"\t");
    }

} 


} 
