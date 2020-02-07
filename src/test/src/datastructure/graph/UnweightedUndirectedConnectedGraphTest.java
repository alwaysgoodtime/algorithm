package test.src.datastructure.graph;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import src.datastructure.graph.UnweightedUndirectedConnectedGraph;

import java.util.ArrayList;

/**
 * Graph Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>2月 6, 2020</pre>
 */
public class UnweightedUndirectedConnectedGraphTest {

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
        UnweightedUndirectedConnectedGraph unweightedUndirectedConnectedGraph = new UnweightedUndirectedConnectedGraph(5);
        unweightedUndirectedConnectedGraph.setVertices(vertices);
        unweightedUndirectedConnectedGraph.insertEdge(0, 1);
        unweightedUndirectedConnectedGraph.insertEdge(2, 4);
        unweightedUndirectedConnectedGraph.insertEdge(1, 0);
        unweightedUndirectedConnectedGraph.insertEdge(1, 2);
        unweightedUndirectedConnectedGraph.insertEdge(1, 4);
        int dfs = unweightedUndirectedConnectedGraph.dfs(2);
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
        UnweightedUndirectedConnectedGraph unweightedUndirectedConnectedGraph = new UnweightedUndirectedConnectedGraph(5);
        unweightedUndirectedConnectedGraph.setVertices(vertices);
        unweightedUndirectedConnectedGraph.insertEdge(0, 1);
        unweightedUndirectedConnectedGraph.insertEdge(0, 2);
        unweightedUndirectedConnectedGraph.insertEdge(1, 2);
        unweightedUndirectedConnectedGraph.insertEdge(1, 3);
        unweightedUndirectedConnectedGraph.insertEdge(1, 4);
        int bfs = unweightedUndirectedConnectedGraph.bfs(0);
        System.out.println(bfs);
    }


} 
