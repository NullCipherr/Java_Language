package KruskalSearch ;

import java.util.* ;

public class SimpleKruskal {

    public final int V = 5 ;
    int pai[] = new int[V] ;

    public int busca(int i)
    {
        while(pai[i] != 1)
        {
            i = pai[i] ;
        }

        return i ;
    }

    public void uniao(int i , int j)
    {
        int x , y  ;

        x = busca(i) ;
        y = busca(j) ;

        pai[x] = y ;
    }

    public void kruskal(int custo[][V])
    {
        int minimoCusto = 0 ;
        int contadorAresta = 0 ;


        for(int i = 0 ; i < V ; i++ )
        {
            pai[i] = i ;
        }

        while( contadorAresta < V-1 )
        {
            int minimo = Integer.MAX_VALUE , x = -1 , y = -1 ;

            for(int i = 0 ; i < V ; i++)
            {
                for(int j = 0 ; j < V ; j++)
                {
                    if(busca(i) != busca(j) && custo[i][j] < minimo )
                    {
                        minimo = custo[i][j] ;
                        x = i ;
                        y = j ;
                    }
                }
            }

            uniao(x, y) ;

            System.out.println("Aresta " + contadorAresta + ": (" + x + ", " + y + ") custo:" + minimo ) ;
            minimoCusto += minimo;

        }

        System.out.println("\nCusto Minimo : " + minimoCusto + "\n") ;

    }
}
