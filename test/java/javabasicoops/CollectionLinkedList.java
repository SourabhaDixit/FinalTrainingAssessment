package javabasicoops;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> values=new LinkedList<String>();  // creating linked list
		System.out.println("List some of Bank names and its details");
		values.add("Canara Bank:");  //adding elements
		values.add(" -It is a central public sector undertaking under the ownership of Ministry of Finance, Government of India."
		+"\n -It is headquartered in Bangalore. Established in 1906 at Mangalore by Ammembal Subba Rao Pai");  
		values.add("HDFC Bank:");  
		values.add(" -HDFC Bank Limited is a wholly-owned subsidiary of the Housing Development Finance Corporation. "
		+ "\n -It is headquartered in Mumbai. "
		+ "\n -It is India's largest wholly-owned subsidiary of the Housing Development Finance Corporation by assets."
		+ "\n -It si the world's 10th largest subsidiary of the Housing Development Finance Corporation by market capitalisation as of April 2021.");  
		Iterator<String> itr=values.iterator();  
		while(itr.hasNext()){  //returns true if there is another line in input
		System.out.println(itr.next());  
		}  
		
	}

}
