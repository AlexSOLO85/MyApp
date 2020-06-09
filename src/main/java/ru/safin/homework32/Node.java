package ru.safin.homework32;

public class Node {
    private int id;
    private Node leftChild;
    private Node rightChild;

    public Node(int id) {
        this.id = id;
    }

    public boolean isLeaf() {
        return (this.leftChild == null && this.rightChild == null);
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getId() {
        return id;
    }
}
