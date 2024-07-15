package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        ListIterator<String> it = sourceList.listIterator();
        while (it.hasNext()) {
            it.next();
            if (it.hasNext()) it.next();
            if (it.hasNext()) {
                arrayList.add(it.next());
                arrayList.add(sourceList.get(it.nextIndex() - 1));
            }
        }
        return arrayList;
    }
}
