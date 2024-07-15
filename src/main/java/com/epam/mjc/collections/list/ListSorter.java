package com.epam.mjc.collections.list;

import javax.swing.event.InternalFrameEvent;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Iterator<String>itOuter = sourceList.listIterator();
        Iterator<String>itInner=sourceList.listIterator();
        ListComparator comparator = new ListComparator();
        /*
        while(itOuter.hasNext()){
            int i = 0;
            String a= itOuter.next();
            while(itInner.hasNext()){
                    String b = itInner.next();
                System.out.println(b);
                if (comparator.compare(a, b)>0){

                    int indexA = sourceList.indexOf(a);
                    int indexB = sourceList.indexOf(b);
                    sourceList.set(indexA, b);
                    sourceList.set(indexB, a);
                    sourceList.remove(indexA+1);
                    sourceList.remove(indexB+1);
                }

            }
        }*/
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (Math.abs(Integer.parseInt(a))  == Math.abs(Integer.parseInt(b))){
            if (Integer.parseInt(a) < Integer.parseInt(b)) return -1;
            if (Integer.parseInt(a) > Integer.parseInt(b)) return 1;
            else return 0;
        }
        String aa= String.format("%.0f",5*Math.pow(Integer.parseInt(a), 2)+3);
        String bb = String.format("%.0f",5*Math.pow(Integer.parseInt(b), 2)+3);
        return Integer.compare(Integer.parseInt(aa), Integer.parseInt(bb));
    }

}
