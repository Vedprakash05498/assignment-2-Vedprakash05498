/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Ved", 6, 5));
        studentList.add(new Student(2, "Ni", 7, 1));
        studentList.add(new Student(3, "MO", 7, 6));
        studentList.add(new Student(4, "So", 4, 7));
        studentList.add(new Student(5, "Pr", 6, 8));
        MyCircularQueue queue = new MyCircularQueue();
        queue.enQueue(studentList);
        queue.printQueue();
    }
}

