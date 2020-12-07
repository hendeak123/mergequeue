package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> alpha = new LinkedList<String>();
        Queue<String> omega = new LinkedList<String>();
        alpha.add("One");
        alpha.add("Two");
        alpha.add("Three");
        alpha.add("Four");
        alpha.add("Five");
        alpha.add("Six");
        alpha.add("Seven");
        alpha.add("Eight");
        alpha.add("Nine");
        alpha.add("Ten");
        omega.add("Eleven");
        omega.add("Twelve");
        omega.add("Thirteen");
        omega.add("Fourteen");
        omega.add("Fifteen");
        System.out.println(alpha);
        System.out.println(omega);
        mergeQueues(alpha, omega);
    }

    private static void mergeQueues(Queue<String> alpha, Queue<String> omega) {
        while (!omega.isEmpty()) {
            alpha.add(omega.peek());
            omega.remove();
        }
        System.out.println(alpha);
    }
}
