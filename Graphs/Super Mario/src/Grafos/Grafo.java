package Grafos ;

import java.util.LinkedList ;
import java.io.File ;
import java.io.FileNotFoundException ;
import java.util.Scanner ;

public class Grafo {
    
    public int qtdeVertices;  
    public Vertice[] vertices; //CONTEM OS VERTICES
    public LinkedList<Vertice> ordTopologica; //ORDENAÇÃO TOPOLÓGICA, SE APLICA USANDO BUSCA EM PROFUNDIDADE

    //RECEBE A QUANTIDADE DE VERTICES DO GRAFO
    public Grafo(int n)
    {
        /*try
        {
            File arq = new File("src/Grafo.txt") ;
            Scanner scan = new Scanner() ;

            while(scan.hasNextLine())
            {

            }

            scan.close() ;

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Erro no Arquivo !!.") ;
            e.printStackTrace() ;
            return null ;
        }*/


        this.qtdeVertices = n ;
        vertices = new Vertice[n] ;

        //CRIA OS VERTICES DO GRAFO
        for (int i = 0; i < n; i++)
        {
            vertices[i] = new Vertice(i) ;
        }
        
        ordTopologica = new LinkedList() ; //CRIA UMA LISTA LIGADA PARA A ORDENAÇÃO TOPOLÓGICA
        
    }
    
    public void buscaLargura (Vertice s)
    {
        
        int i ;
        
        for(i = 0 ; i < qtdeVertices ; i++)
        {
            vertices[i].cor = 'b' ;
            vertices[i].pai = null ;
            vertices[i].d = Integer.MAX_VALUE ;
        }
        s.cor = 'c' ;
        s.d = 0 ;
        
        LinkedList <Vertice> lista = new LinkedList() ;
        
        lista.add(s) ;
        
        while( lista.isEmpty() != true)
        {
            s = lista.getFirst() ;
            lista.remove() ;
            
            for (Vertice v : s.adj){
                if(v.cor == 'b'){
                    v.cor = 'c' ;
                    v.pai = s ;
                    v.d = s.d++ ;
                    lista.add(v) ;
                }
            }
            
            s.cor = 'p' ;  
        }
        
    }
    
    public void buscaProfundidade()
    {
        
        int i, temp=0;
        
        for(i=0;i<qtdeVertices;i++){ //PERCORRE TODOS OS VÉRTICES E SETA A COR COMO BRANCO E PAI NULO
            vertices[i].cor='b';
            vertices[i].pai=null;
        }
    
        for(i=0;i<qtdeVertices;i++){
            if(vertices[i].cor=='b')
                temp=visitaDfs(vertices[i], temp);
        }
        
    }
    
    public int visitaDfs(Vertice v, int temp)
    {
        
        temp++;
        v.cor='c';
        v.d=temp;
        
        for(Vertice u : v.adj){ //PERCORRE A LISTA ADJ DO VERTICE
            if(u.cor=='b'){
                u.pai=v;
                temp=visitaDfs(u, temp); //VISITA OS VERTICES ADJ EM SEGUINTE
            }
        }
        v.cor='p';
        temp++;
        v.f=temp;   
        ordTopologica.addFirst(v);
        return temp;
    }
        
    public void addAresta(int u, int v)
    {
        vertices[u].adj.add(vertices[v]);
    }
    
    public void primAlgoritmo()
    {
        
        
    }
 
}
