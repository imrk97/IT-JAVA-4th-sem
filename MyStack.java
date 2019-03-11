package Stackinjava;
import java.util.*;
import java.lang.*;

/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MyStack
{
    static int top=-1;
    static int capacity=20;
    static int [] stack=new int [capacity];
    public static void push(int x){
        if(top==capacity-1){
            System.out.println("The stack is full");
            
        }
        else{
            top=top+1;
            stack[top]=x;
        }
    }
    public static void pop(){
        int value=0;
        if(top==-1){
            System.out.println("the stack is empty");
           
        }
        else{
            value=stack[top];
            top=top-1;
           
        }
         System.out.println("the popped value is "+value);
    }
    public static void display(){
        System.out.println("The stack is: ");
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String [] args){
        int ch;
        while(true){
            System.out.println("Please choose");
            System.out.println("1. Push into Stack");
            System.out.println("2. Pop out of the stack");
            System.out.println("3. Display the stack");
            System.out.println("4. Exit");
            Scanner sc=new Scanner(System.in);
            
            ch= sc.nextInt();
           
            if(ch==1){
                System.out.print("Enter the value you want to push:");
                int y=sc.nextInt();
                push(y);
            }
            else if(ch==2){
                pop();
            }
            else if(ch==3){
                
                display();
            }
            else if(ch==4){
                System.exit(0);
            }
            else{
                System.out.println("Choose the correct option.");
            }
        }
    }
}
