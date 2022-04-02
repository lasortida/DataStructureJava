package com.company;

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

