package vesehi2;

import java.util.Scanner;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    String name;
    float cgpa;
    String course;

    public Student(String name, float cgpa, String course) {
        this.name = name;
        this.cgpa = cgpa;
        this.course = course;
    }
    static void search(TreeSet<Student> set){
        for(Student c : set){
            if(c.cgpa >= 8.7){
                System.out.println("Name of Student " + c.name);
                System.out.println("cgpa of Student " + c.cgpa);
                System.out.println("course of Student " + c.course);
            }
        }
    }
    static void show(TreeSet<Student> set){
        for(Student c : set){
            if(c.cgpa < 7.3){
                System.out.println("Name of Student " + c.name);
                System.out.println("cgpa of Student " + c.cgpa);
                System.out.println("course of Student " + c.course);
            }
        }
    }

    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<Student>();
        boolean temp = false;
        System.out.println("Do you want to enter New Student Detail enter 1 for Yes 2 for No");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        temp = a == 1;
        while(temp){
            System.out.println("Enter Name");
            String n = in.nextLine();
            System.out.println("Enter CGPA");
            float c = in.nextFloat();
            in.nextLine();
            System.out.println("Enter course");
            String s = in.nextLine();
            set.add(new Student(n,c,s));
            System.out.println("Do you want to enter New Student Detail enter 1 for Yes 2 for No");
            a = in.nextInt();
            in.nextLine();
            temp = a == 1;
        }
        System.out.println("----------------------------Search Method---------------------------");
        search(set);
        System.out.println("----------------------------Show Method---------------------------");
        show(set);
    }

    @Override
    public int compareTo(Student o) {
      if(cgpa > o.cgpa){
          return 1;
      }
      else if(cgpa < o.cgpa){
          return -1;
      }
      else {
          return 0;
      }
    }
}
