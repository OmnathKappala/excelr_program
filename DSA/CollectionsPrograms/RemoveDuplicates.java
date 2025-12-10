package CollectionsPrograms;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr={1,2,3,6,9,11,2,4,1,5,3};
        Set<Integer>set=new TreeSet<>(Collections.reverseOrder());
        for(int element:arr){
            set.add(element);

        }
        System.out.println(set);

    }
    
}
