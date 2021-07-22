package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	BinaryT b = new BinaryT();
	b.add(new Students("A","A",185, 75, 5435));
	b.add(new Students("B","B",176,80,5185));
	b.add(new Students("C","C",180,70,6546));
	b.add(new Students("D","D",170,64, 6265));
	b.print();
	ArrayList<Students> list = b.find();
	System.out.println("list: " + list.toString());
    }
}
