package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {

        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int retVal;
        retVal = this.name.compareTo(nameOfNewNode);

        if(retVal == 0){

        }
        else if(retVal > 0){    //is name greater than nameOfNewNode?
            if(left == null){
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }
        else { //(retVal < 0)    //is name less than nameOfNewNode?
            if(right == null){
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {

        List<String> partial = null;

        if(left != null){
            partial = left.names();
        }
        //add name to list
        if(partial == null){
            partial = new ArrayList();
        }
        partial.add(name);
        if(right != null){
            partial.addAll(right.names());
        }

        return partial;
    }
}

// Citations:
// http://javarevisited.blogspot.com/2013/08/-example-to-merge-or-join-multiple-List-in-Java.html
// https://www.javatpoint.com/java-string-compareto