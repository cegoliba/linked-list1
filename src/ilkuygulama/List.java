package ilkuygulama;
// @author cegoliba
public class List {   
    
    // Node structure
    class Item {
        int _value;
        Item _next;
        
        // Constructor of the new node with new values
        Item(int value, Item next) {
            _value = value;
            _next = next;
        }        
    }
    
    // Head of the list
    private Item list;
    
    // Constructor of the empty list
    public List() {
        list = null;
    }
    
    // Insert the new node into its own place in an ordered list
    public void Insert(int value) {
        Item temp = list;
        Item prev = list;
        
        // list is empty
        if (temp == null) {
            Item item = new Item(value, null);
            temp = item;
            list = temp;
            return;
        }
        
        // the value of the first node is greater than the value of the new node
        if (value < temp._value) {
            Item item = new Item(value, list);
            temp = item;
            list = temp;
            return;
        }
        
        // find the exact place of the node in the ordered list
        temp = temp._next;
        while (temp._next != null && temp._value > value) {
            temp = temp._next;
            prev = prev._next;
        }
        
        // create and put the new node into its own order in the list
        Item item = new Item(value, null);
        prev._next = item;
        item._next = temp;        
    }
    
    // Display the nodes of the list
    public void Display() {
        Item temp = list;
        while (temp != null) {
            System.out.print(temp._value + " ");
            temp=temp._next;
        }
    }   
    
}
