package test.src.datastructure;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import src.datastructure.Graph;

import java.util.ArrayList;

/**
 * Graph Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>2月 6, 2020</pre>
 */
public class GraphTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: insertEdges(int v1, int v2)
     */
    @Test
    public void testInsertEdges() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setVertices(ArrayList<String> vertices)
     */
    @Test
    public void testSetVertices() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getEdgesNum()
     */
    @Test
    public void testGetEdgesNum() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getIndexOfVertices(String vertex)
     */
    @Test
    public void testGetIndexOfVertices() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: dfs(int vertex)
     */
    @Test
    public void testDfs() throws Exception {
//TODO: Test goes here...
        ArrayList<String> vertices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vertices.add("a"+i);
        }
        Graph graph = new Graph(5);
        graph.setVertices(vertices);
        graph.insertEdge(0, 1);
        graph.insertEdge(2, 4);
        graph.insertEdge(1, 0);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 4);
        int dfs = graph.dfs(2);
        System.out.println(dfs);
    }

    /**
     * Method: bfs(int vertex)
     */
    @Test
    public void testBfs() throws Exception {
//TODO: Test goes here...
        ArrayList<String> vertices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vertices.add("a"+i);
        }
        Graph graph = new Graph(5);
        graph.setVertices(vertices);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 3);
        graph.insertEdge(1, 4);
        int bfs = graph.bfs(0);
        System.out.println(bfs);
    }


} 
