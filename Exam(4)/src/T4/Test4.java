package T4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		 List<Integer> lists= null ;
         lists  =new ArrayList<Integer>();
         for(int i=1;i<100;i++){
        	for(int j=1;j<51;j++){
        		if(i/10!=0){
        			lists.add(i/10);
        		}
        		 
        	}
         }
         Map< Integer,Integer > m =new TreeMap<Integer ,Integer>();
         Set<Integer> s=m.keySet();
         int[] m1=new int[lists.size()];
         for(int n=1;n<lists.size();n++){
         	m1[n]=lists.get(n);
         	 System.out.println(m1[n]);}
      
        
 		Iterator<Integer> l = s.iterator();
 		while(l.hasNext()){
 			System.out.println(l.next());
 		};
 		Collection<Integer> c=m.values();
 		Iterator<Integer> e = c.iterator();
 		while(e.hasNext()){
 			System.out.println(e.next());
 		};
     
     



	}

}
