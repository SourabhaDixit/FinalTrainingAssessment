

package javabasicoops;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionArrayList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Collection elem=new ArrayList();// creating array list
        System.out.println("List some types of Insurance and its birthyear");
        elem.add("Health Insurance");// adding elements  
        elem.add(1986);
        elem.add("Motor Insurance");
        elem.add(1988);
        elem.add("Home Insurance");
        elem.add(1950);
        Iterator i= elem.iterator();
        while(i.hasNext())//returns true if there is another line in input
        {
            System.out.println(i.next());
    
        }
        System.out.println("Remove the data of Motor Insurance");
        elem.remove("Motor Insurance");//removing element
        elem.remove(1988);
        Iterator j= elem.iterator();//an object that can be used to loop through collection
        
        while(j.hasNext())//returns true if there is another line in input
        {
            System.out.println(j.next());
    
        }
    }

}
