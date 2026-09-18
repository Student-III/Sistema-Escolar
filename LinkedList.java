
package com.mycompany.sistemaescolar;


public class LinkedList<t> implements IList<t> {
    private Node<t> first;
    private int size;
    
    public LinkedList (){
        this.size=0;
    }

    @Override
    public void add(t t) {
        Node<t> node=new Node<t>(t);
        if(isEmpty()){
            first=node;
        }else{
            Node<t> cursor=first;
            while (cursor.getNext()!=null){
                cursor=cursor.getNext();
            }
            cursor.setNext(node);
        }
        size++;
    }

     @Override
    public void add(t t, int index) {
        if (index>=0 && index<=size){
            if(index==0){
                first=new Node<t>(t,first);
            }else{
                Node<t> cursor=first;
                for (int i = 0; i < index-1; i++) {
                    cursor=cursor.getNext();
                }
                Node<t> node=new Node<t>(t);
                node.setNext(cursor.getNext());
                cursor.setNext(node);
            }
            size++;
            
        }else{
            throw new UnsupportedOperationException("Fuera de rango");
        }
    }
    
    @Override
    public t remove(int index) {
        if(index>0 && index<size){
            Node<t> aux;
            if (index==0){
                aux=first;
                first=first.getNext();
            }else{
                Node<t> cursor = first;
                for(int i=0;i<index-1;i++){
                cursor=cursor.getNext();
            }
            aux=cursor.getNext();
            cursor.setNext(aux.getNext());
            }
            size--;
            return aux.getInfo();
        }else{
            throw new UnsupportedOperationException("Numero fuera de rango ");
        }
        
    }

    @Override
    public t get(int index) {
        if(index>=0 && index<size){
            Node<t> cursor =first;
            for (int i = 0; i < index; i++) {
                cursor=cursor.getNext();
            }
            return cursor.getInfo();
        }else{
            throw new UnsupportedOperationException("Fuera de rango");
        }
        
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

   
    
}
