package Grafos;

import java.util.List ;
import java.util.LinkedList ;


public class Vertice {
    
    public int num, d , f, grauSaida;
    public char cor ;
    public Vertice pai ;
    public List<Vertice> adj;
    
    public Vertice(int num)
    {
        this.num = num ;
        this.adj = new LinkedList<Vertice>() ;
    }
}













/*

public class Vertice {
    
    public int n; //POSIÇÃO NA MATRIZ ADJ
    public int d = -1 ; // VALOR DO VÉRTICE INICIAL, É SETADO COMO INFINITO (-1).
    public char cor = 'b' ; // COR INICIAL DO VÉRTICE É SETADO COMO 'b' (BRANCO) .
    public int qtdeArestas=0;
    
    public Vertice pai; // VÉRTICE PAI É O TIPO VÉRTICE, COM TODAS AS PROPRIEDADES DO VÉRTICE .

    public Vertice (){
        
    }
    
    
    
    
    
}


*/