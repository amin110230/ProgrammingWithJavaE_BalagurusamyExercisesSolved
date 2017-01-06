package collectionexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample {


    public static void main(String[] args) {
        
        List l = new LinkedList(); // duplicate allow
        l.add("List:angel");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);
        
        Set s = new HashSet(); // no duplicate and sorted
        s.add("Set:rose");
        s.add("schildt");
        s.add("mathew");
        s.add("schildt");
        print(s);
        
        SortedSet ss = new TreeSet();
        ss.add("Set:jasmine");
        ss.add("schildt");
        ss.add("mathew");
        ss.add("schildt");
        print(ss);
        
        LinkedHashSet sss = new LinkedHashSet(); // not sorted
        sss.add("Set:winslet");
        sss.add("schildt");
        sss.add("mathew");
        sss.add("schildt");
        print(sss);
        
        Map ml = new HashMap(); // no duplicate key
        ml.put("map", "HashMap");
        ml.put("schildt", "java2s");
        ml.put("mathew", "Hyden");
        ml.put("schildt", "java2");
        print(ml.keySet());
        print(ml.values());
        
        
        SortedMap sm = new TreeMap(); // sorted according to key
        sm.put("map", "HashMap");
        sm.put("schildt", "java2s");
        sm.put("mathew", "Hyden");
        sm.put("schildt", "java2");
        print(sm.keySet());
        print(sm.values());        
        
        LinkedHashMap lm = new LinkedHashMap(); // sorted according to key
        lm.put("map", "HashMap");
        lm.put("schildt", "java2");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2s");
        print(lm.keySet());
        print(lm.values());
    }
    
    static void print(Collection coll){
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem + " ");            
        }
        System.out.println();
    }
    
}
