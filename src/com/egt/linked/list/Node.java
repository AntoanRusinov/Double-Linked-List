package com.egt.linked.list;

public class Node<Type> {

    Type value;
    Node<Type> next;
    Node<Type> previous;

    public Node(Type element) {
	this.value = element;
	previous = null;
    }

    public Node<Type> getPrevious() {
	return previous;
    }

    public void setPrevious(Node<Type> previous) {
	this.previous = previous;
    }

    public Type getValue() {
	return value;
    }

    public void setValue(Type value) {
	this.value = value;
    }

    public Node<Type> getNext() {
	return next;
    }

    public void setNext(Node<Type> next) {
	this.next = next;
    }

    @Override
    public String toString() {
	return "Node [value=" + value + ", next=" + next + "]";
    }

}
