package com.metacube.question03;

public class Node {
    Employee emp;
    Node next;

    Node(Employee emp) {
        this.emp = emp;
        this.next = null;
    }
}
