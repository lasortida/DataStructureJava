package com.company;

import java.util.Scanner;

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
