import KruskalSearch.SimpleKruskal ;

public class Main {
    public void Main(String[] args)
    {
        SimpleKruskal kruskal = new SimpleKruskal() ;

        int grafo[][kruskal.V] = {
        { Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 6, Integer.MAX_VALUE },
        { 2, Integer.MAX_VALUE, 3, 8, 5 },
        { Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, 7 },
        { 6, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, 9 },
        { Integer.MAX_VALUE, 5, 7, 9, Integer.MAX_VALUE },


        kruskal.kruskal(grafo) ;
    }
}
