package manipulandolinkedlists;

import manipulandoarrays.ManipulandoArrays;

import java.util.*;

public class ManipulandoLinkedsLists {

    private List list;
    private String nomes[] = {"pedro", "jose", "rodrigo", "gamba"};

    public ManipulandoLinkedsLists(){

        list = new LinkedList();

    }

    public void insereRetornaContrario(){

        for (int i = 0 ; i < nomes.length ; i++){

            list.add(nomes[i]);

        }

        printReversedList(list);

    }

    public void printReversedList(List list){

        ListIterator iterator = list.listIterator(list.size());

        System.out.println( "\nReversed List:" );

        while(iterator.hasPrevious())
            System.out.print( iterator.previous() + " " );

    }

}
