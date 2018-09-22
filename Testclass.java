package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class Testclass {

	
		 public static void main(String args[]) throws SAXException, JAXBException{      
			  Vector<String> v=new Vector<String>();//creating vector  
			  v.add("umesh");//method of Collection  
			  v.addElement("irfan");//method of Vector  
			  v.addElement("kumar");  
			  //traversing elements using Enumeration  
			  Enumeration e=v.elements();  
			  while(e.hasMoreElements()){  
			   System.out.println(e.nextElement());  
			  }  
			  Iterator itr=v.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			    
			}   
			  ListIterator a=(ListIterator) v.listIterator();
			  
			  while(a.hasNext()) {
				  System.out.println(a.next());
			  }
	}

}
