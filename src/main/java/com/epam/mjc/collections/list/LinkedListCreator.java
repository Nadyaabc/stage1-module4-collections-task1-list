package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Iterator<Integer> it = sourceList.listIterator();
        while(it.hasNext())
        {
            int number = it.next();
            if (number %2==0) linkedList.addLast(number);
            else linkedList.addFirst(number);
        }
        return linkedList;
    }
}
