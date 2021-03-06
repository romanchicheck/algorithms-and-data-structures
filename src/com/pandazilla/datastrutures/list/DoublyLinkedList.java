package com.pandazilla.datastrutures.list;

public class DoublyLinkedList<T> implements DoublyList {

    private int size;
    private DLNode<T> first;
    private DLNode<T> last;

    public DoublyLinkedList() {
    }

    @Override
    public Object getLast() {
        return last;
    }

    @Override
    public void insertLast(Object object) {
        DLNode newNode = new DLNode(object);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }
        last = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public DLNode<T> getFirst() {
        return first;
    }

    @Override
    public void insertFirst(Object object) {
        DLNode newNode = new DLNode(object);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrev(newNode);
        }
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public Object deleteFirst() {
        DLNode temp = first;
        first.getNext().setPrev(null);
        first = first.getNext();
        size--;
        return temp;
    }

    @Override
    public Object deleteLast() {
        DLNode temp = last;
        last.getPrev().setNext(null);
        last = last.getPrev();
        size--;
        return temp;
    }

    @Override
    public boolean find(Object key) {
        DLNode current = first;
        while (current != null) {
            if (current.getElement().equals(key)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void insertAfterKey(Object key, Object data) {
        DLNode current = first;
        while (current != null) {
            if (current.getElement().equals(key)) {
                if (current.equals(last)) {
                    insertLast(data);
                } else {
                    DLNode newNode = new DLNode(data);
                    newNode.setPrev(current);
                    newNode.setNext(current.getNext());
                    current.getNext().setPrev(newNode);
                    current.setNext(newNode);
                    size++;
                }
                break;
            }
            current = current.getNext();
        }
    }

    @Override
    public Object deleteByKey(Object key) {
        DLNode current = first;
        while (current != null) {
            if (current.getElement().equals(key)) {
                if (current.equals(first)) {
                    deleteFirst();
                } else if (current.equals(last)) {
                    deleteLast();
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                    size--;
                }
                return key;
            }
            current = current.getNext();
        }
        return null;
    }

    public void displayList() {
        DLNode current = first;
        while (current != null) {
            System.out.print("|" + current.getElement().toString());
            current = current.getNext();
        }
        System.out.print("|" + '\n' + "Size is: " + size());
        System.out.println('\n');
    }

    /**
     * Iterate trough the linked list. In loop, change next to prev, prev to current and current to next.
     */
    public void reverseList() {
        if (first == null || first.getNext() == null) {
            return;
        }
        DLNode prev = null;
        DLNode current = first;
        DLNode next;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        first = prev;
    }

    public void reverseListRecursive(DLNode head) {
        if (head == null || head.getNext() == null) {
            return;
        }
        DLNode next = head.getNext();
        head.setNext(head.getPrev());
        head.setPrev(next);
        first = next;
        reverseListRecursive(next);
        next.setNext(head);
    }

    public void displayListFromEnd() {
        DLNode current = last;
        while (current != null) {
            System.out.print("|" + current.getElement().toString());
            current = current.getPrev();
        }
        System.out.print("|" + '\n' + "Size is: " + size());
        System.out.println('\n');
    }

}
