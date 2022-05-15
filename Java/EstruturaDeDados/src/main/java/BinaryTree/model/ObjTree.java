package BinaryTree.model;

public abstract class ObjTree<T extends Comparable<T>> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T other);
    public abstract String toString();

}
