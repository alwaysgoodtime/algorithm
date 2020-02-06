package test.src.classic;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import src.classic.KMP;

/** 
* KMP Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 5, 2020</pre> 
* @version 1.0 
*/ 
public class KMPTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: KMPSearch(String origin, String pattern) 
* 
*/ 
@Test
public void testKMPSearch() throws Exception { 
//TODO: Test goes here...
    String origin = "aaaaaab";//目标字符串
    String pattern = "aababaaa"; //匹配字符串
    int i = KMP.KMPSearch(origin,pattern);
    System.out.println(i);
} 


} 
