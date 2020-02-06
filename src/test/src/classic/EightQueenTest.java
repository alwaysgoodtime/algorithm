package test.src.classic; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import src.classic.EightQueen;

/** 
* EightQueen Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 6, 2020</pre> 
* @version 1.0 
*/ 
public class EightQueenTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: eightQueen() 
* 
*/ 
@Test
public void testEightQueen() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: checkQueen(int row) 
* 
*/ 
@Test
public void testCheckQueen() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: eightQueen(int queenCount) 
* 
*/ 
@Test
public void testEightQueenQueenCount() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: countPaths(int i) 
* 
*/ 
@Test
public void testCountPaths() throws Exception { 
//TODO: Test goes here...
    int i = EightQueen.eightQueen();
    System.out.println(i);
} 


} 
