package Hw;

import java.util.ArrayList;
import java.util.List;

public class Person<T> {

    private T data = null;

    private List<Person<T>> children = new ArrayList<>();

    private Person<T> parent = null;

    public Person(T data) {
        this.data = data;
    }

    public Person<T> addChild(Person<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<Person<T>> children) {
        children.forEach(each -> each.setParent(this));
        this.children.addAll(children);
    }

    public List<Person<T>> getChildren() {

        return children;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    private void setParent(Person<T> parent) {

        this.parent = parent;
    }

    public Person<T> getParent() {

        return parent;
    }


    // Нахождение корня дерева из любого узла
    public Person getRoot() {
        if (parent == null) {
            return this;
        }
        return parent.getRoot();
    }
}
