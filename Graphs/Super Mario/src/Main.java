import Grafos.Grafo ;

import java.util.LinkedList ;

public class Main {
    
    public static void main(String[] args) {
        
        Grafo gr=new Grafo(14);
        
        gr.addAresta(0, 4);
        gr.addAresta(0, 5);
        gr.addAresta(0, 11);
        gr.addAresta(1, 2);
        gr.addAresta(1, 4);
        gr.addAresta(1, 8);
        gr.addAresta(2, 5);
        gr.addAresta(2, 6);
        gr.addAresta(2, 9);
        gr.addAresta(3, 2);
        gr.addAresta(3, 6);
        gr.addAresta(3, 13);
        gr.addAresta(4, 7);
        gr.addAresta(5, 8);
        gr.addAresta(5, 12);
        gr.addAresta(6, 5);
        gr.addAresta(8, 7);
        gr.addAresta(9, 10);
        gr.addAresta(9, 11);
        gr.addAresta(10, 13);
        gr.addAresta(12, 9);
        
        
        gr.buscaProfundidade();
        int i;
        
        for(int j=0;j<14;j++)
        {
            System.out.println("VERTICE " + j + " d: " + gr.vertices[j].d + " f: " + gr.vertices[j].f) ;
        }
        
        System.out.println() ;
        
        for(i=0;i<14;i++)
        {
            System.out.print(gr.ordTopologica.get(i).num + " -> ") ;
        }
    }
}
