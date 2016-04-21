/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;


/**
 *
 * @author AcerPC
 */


public class Practice extends Stack{
    

    /**
     * @param args the command line arguments
     */
    
    private Node top = null;
    private int numElems = 0;
    
    
    public void push(Object itemObj){
        Node newNode = new Node(itemObj, top);
        top = newNode;
        numElems++;
    }
    
    public void pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empth");
        }else{
            Node oldNode = top;
            top = top.next;
            numElems--;
            oldNode = null;
        }
    }
   
    public void makeEmpty(){
        while(top != null){
            Node previous = top;
            top = top.next;
            previous = null;
        }
        numElems = 0;
    }
    
    public Object top(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }else{
            return top.item;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }
    
    public int size(){
        return numElems;
    }
    
    private class Node {
        private Object item;
        private Node next;
        
        private Node(Object element, Node nodeLink){
            item = element;
            next = nodeLink;
        }
    }
    
   public static void main(String args[]) {
      JavaApplication1 myLinkedStack = new JavaApplication1();
      myLinkedStack.push(new)
   }
        
        
        

        
    
}
    
    