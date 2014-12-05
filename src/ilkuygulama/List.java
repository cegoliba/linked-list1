/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilkuygulama;

/**
 *
 * @author cngz
 */
public class List {
    
    class Item {

        int _value;
        Item _next;
        
        Item(int value, Item next) {
            _value = value;
            _next = next;
        }        
    }
    
    private Item list;
    
    public List() {
        list = null;
    }
    
    public void Insert(int value) {
        Item temp = list;
        Item prev = list;
        if (temp == null) {
            Item item = new Item(value, null);
            temp = item;
            list = temp;
            return;
        }
        
        if (value < temp._value) {
            Item item = new Item(value, list);
            temp = item;
            list = temp;
            return;
        }
        
        temp = temp._next;
        while (temp._next != null && temp._value > value) {
            temp = temp._next;
            prev = prev._next;
        }
        
        Item item = new Item(value, null);
        prev._next = item;
        item._next = temp;
        
    }
    
    public void Display() {
        Item temp = list;
        while (temp != null) {
            System.out.print(temp._value + " ");
            temp=temp._next;
        }
    }
    
}
