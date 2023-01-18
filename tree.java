package Homework;

public class Tree {

    public static void main(String[] args) {
        Person<String> root = createTree();
        printTree(root, " ");

    }

    private static Person<String> createTree() {
        Person<String> root = new Person<>("Person");

        Person<String> node0 = root.addChild(new Person<String>("Grandfather"));
        Person<String> node1 = node0.addChild(new Person<String>("Father"));

        Person<String> node11 = node1.addChild(new Person<String>("Son"));
        Person<String> node111 = node11.addChild(new Person<String>("Grandson"));
        Person<String> node112 = node11.addChild(new Person<String>("Granddaughter"));

        Person<String> node12 = node1.addChild(new Person<String>("Daughter"));

        Person<String> node2 = node0.addChild(new Person<String>("Mother"));

        Person<String> node21 = node2.addChild(new Person<String>("Grandson"));
        Person<String> node211 = node2.addChild(new Person<String>("Grandson"));
        return root;
    }

    private static <T> void print_Tree(Person<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each ->  printTree(each, appender + appender));
    }
}
