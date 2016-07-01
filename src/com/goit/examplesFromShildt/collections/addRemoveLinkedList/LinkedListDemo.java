package com.goit.examplesFromShildt.collections.addRemoveLinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        System.out.println("LinkedList is " + ll);

        ll.addFirst("M");
        System.out.println("LinkedList after addFist M " + ll);

        ll.add(2, "test");
        System.out.println("LinkedList after add element with index 2 " + ll);

        System.out.println(ll.remove(5) + " will be removed ");
        System.out.println("LinkedList after removing " + ll);

        System.out.println();
        System.out.println("Fisrt elemnt " + ll.removeFirst() + " will be removed");
        System.out.println("LinkedList after removing" + ll);

        System.out.println();
        System.out.println("Last element " + ll.removeLast() + " will be removed");
        System.out.println("LinkedList after removing" + ll);

        System.out.println();
        System.out.println("Get element by index 2 is " + ll.get(2));

        System.out.println();
        System.out.println("Set new value to elemnt with index 2 " +
                ll.set(2, ll.get(2) + " someString"));
        System.out.println(ll);
    }
}
