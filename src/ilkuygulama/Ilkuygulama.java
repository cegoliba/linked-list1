package ilkuygulama;

// @author cegoliba
public class Ilkuygulama {

    public static void main(String[] args) {
        // TODO code application logic here

        // list object
        List lst = new List();

        //build the list with nodes
        lst.Insert(5);
        lst.Insert(2);
        lst.Insert(3);
        lst.Insert(1);
        lst.Insert(4);

        // print the nodes of the list
        lst.Display();

       // System.out.println(lst.toString());
    }

}
