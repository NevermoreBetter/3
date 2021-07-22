package com.company;

import java.util.ArrayList;

public class BinaryT {
    class Node {
        Students data;
        Node right;
        Node left;

        Node (Students data){
            this.data=data;
        }
    }

    private Node root;

    public BinaryT(){
        root=null;
    }

    public void add(Students students){
        root=insert(root,students);
    }

    private  Node insert(Node current, Students students){
        if(current == null){
            return new Node(students);
        }
        else {
            if(students.StudentID<current.data.StudentID){
                current.left=insert(current.left, students);
            }
            else if(students.StudentID>current.data.StudentID){
                current.right=insert(current.right, students);
            }
        }
        return current;
    }

    public void print(){
        inOrder(root);
    }

    private void inOrder(Node current){
        if(current == null){
            return;
        }
        inOrder(current.left);
        System.out.println(current.data.toString());
        inOrder(current.right);
    }

    public ArrayList find(){
        ArrayList<Students> list = new ArrayList<Students>();
        if(root==null){
            System.out.println("Empty tree");
        }
        search(root, list);
        return list;
    }

    private void search(Node current, ArrayList list){
        if(current==null){
            return;
        }
        search(current.left, list);
        if (current.data.Height==current.data.Weight+110){
            list.add(current.data);
        }
        search(current.right, list);
    }
}
