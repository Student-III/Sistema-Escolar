
package com.mycompany.sistemaescolar;
public class Node<t>{
    protected t info;
    protected Node<t> next ;
    
    public Node(t info){
        this.info=info;
        this.next=null;
        
    }
    public Node(t info,Node<t> next){
        this.info=info;
        this.next=next;
    }
    
    public t getInfo(){
        return info;
    }
    public void setInfo(t info) {
        this.info=info;
    }
    public Node<t> getNext(){
        return next;
    }
    
    public void setNext(Node<t> next){
        this.next=next;
    }
    
    
}
