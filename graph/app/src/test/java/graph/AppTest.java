/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void addVertex(){
        Graph graph = new Graph();
        graph.addVertex("Lio");
        graph.addVertex("Mocka");

        assertNotNull(graph.getVertices());
        assertEquals(2,graph.size());
        assertEquals("[Vertex{data='Lio'}, Vertex{data='Mocka'}]",graph.getVertices().toString());
    }

    @Test
    public void printGraph(){
        Graph graph = new Graph();
        graph.addVertex("Lio");
        graph.addVertex("Mocka");
        graph.addEdge("Lio","Mocka");
        assertEquals("Vertex{data='Lio'}[Vertex{data='Mocka'}]Vertex{data='Mocka'}[Vertex{data='Lio'}]",graph.printGraph().toString());
    }
    @Test
    public void getEdge(){
        Graph graph = new Graph();
        graph.addVertex("Lio");
        graph.addVertex("Mocka");
        graph.addEdge("Lio","Mocka");
        assertEquals("[Vertex{data='Mocka'}]",graph.getNeighbors("Lio").toString());
    }
    @Test
    public void removeVertex(){
        Graph graph = new Graph();
        graph.addVertex("Lio");
        graph.addVertex("Mocka");
        graph.addVertex("Bondo2");
        graph.removeVertex("Lio");
        assertEquals(2,graph.size());
    }

    @Test
    void removeEdge(){
        Graph graph = new Graph();
        graph.addVertex("Lio");
        graph.addVertex("Mocka");
        graph.addVertex("Bondo2");
        graph.addEdge("Lio","Mocka");
        graph.addEdge("Lio","Bondo2");
        graph.removeEdge("Lio","Mocka");
        assertEquals("[Vertex{data='Bondo2'}]",graph.getNeighbors("Lio").toString());
    }

    @Test
    void emptyGraph(){
        Graph graph = new Graph();
        assertEquals(0,graph.size());
    }
    @Test
    public void oneVertexAndOneEdge(){
        Graph graph = new Graph();

        graph.addVertex("Lio");
        graph.removeEdge("Lio","Lio");

        assertEquals("Vertex{data='Lio'}[]",graph.printGraph());
    }
    @Test
    public void breathFirst(){
        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addVertex("Arendelle");
        graph1.addVertex("Metroville");
        graph1.addVertex("Monstroplolis");
        graph1.addVertex("Narnia");
        graph1.addVertex("Naboo");

        graph1.addEdge("Pandora", "Arendelle");
        graph1.addEdge("Arendelle", "Metroville");
        graph1.addEdge("Arendelle", "Monstroplolis");
        graph1.addEdge("Metroville", "Narnia");
        graph1.addEdge("Metroville", "Naboo");
        graph1.addEdge("Metroville", "Monstroplolis");
        graph1.addEdge("Monstroplolis", "Naboo");
        graph1.addEdge("Narnia", "Naboo");

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo]",graph1.bft( "Pandora").toString());
    }
    @Test
    public void oneVertex(){
        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        assertEquals("[Pandora]",graph1.bft("Pandora").toString());
    }
    @Test
    void NotEmpty(){
        Graph graph1 = new Graph();
        graph1.addVertex("Pandora");
        assertNotNull("[Pandora]",graph1.bft("Pandora").toString());
    }
    @Test
    public void notAllVertexHaveEdge(){

        Graph graph1 = new Graph();

        graph1.addVertex("Pandora");
        graph1.addVertex("Arendelle");
        graph1.addVertex("Metroville");

        graph1.addEdge("Pandora", "Metroville");

        assertEquals("[Pandora, Metroville]",graph1.bft("Pandora").toString());
    }
}
