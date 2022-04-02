package com.company;

import java.util.Scanner;

class Element {
    int value;
    Element next;

    Element(int value, Element next){
        this.value = value;
        this.next = next;
    }
}

class Stack {
    Element start;

    public void push(int a){
        if (start == null){
            start = new Element(a, null);
            System.out.println("ok");
        }
        else{
            Element e = start;
            while (true){
                if (e.next == null){
                    e.next = new Element(a, null);
                    System.out.println("ok");
                    break;
                }
                e = e.next;
            }
        }
    }

    public void pop(){
        Element e = start;
        if (e.next != null){
            while (true){
                if (e.next.next == null){
                    System.out.println(e.next.value);
                    e.next = null;
                    break;
                }
                e = e.next;
            }
        }
        else{
            e = null;
        }
    }

    public void back(){
        Element e = start;
        if (e != null){
            while (true){
                if (e.next == null){
                    System.out.println(e.value);
                    break;
                }
                e = e.next;
            }
        }
    }

    public void size(){
        Element e = start;
        int result = 0;
        if (start == null){
            System.out.println(result);
        }
        else{
            while(true){
                result++;
                if (e.next == null){
                    break;
                }
                e = e.next;
            }
            System.out.println(result);
        }
    }

    public void clear(){
        start = null;
        System.out.println("ok");
    }

    public void exit(){
        System.out.println("bye");
    }
}

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        while(true){
            String command = sc.next();
            if (command.equals("push")){
                int number = sc.nextInt();
                stack.push(number);
            }
            if (command.equals("back")){
                stack.back();
            }
            if (command.equals("pop")){
                stack.pop();
            }
            if (command.equals("size")){
                stack.size();
            }
            if (command.equals("clear")){
                stack.clear();
            }
            if (command.equals("exit")){
                stack.exit();
                break;
            }
        }
    }
}
