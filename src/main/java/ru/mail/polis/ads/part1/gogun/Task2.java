package ru.mail.polis.ads.part1.gogun;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    private Task2(){
    }
    /*

        На e-olymp добился только 56% со стеком
        Залью, не зря же мучался)))

     */
    public static void main(final String[] argc) {
        Scanner scan = new Scanner(System.in);
        final String str = scan.nextLine();
        final LinkedList<Character> linkedList = new LinkedList<>();
        String s = "";
        for(final char c : str.toCharArray()) {
            if ((c == '(') | (c == '[')) {
                linkedList.push(c);
            }
            if ((c == ']') | (c == ')')){
                final char bracket = c == ']' ? '[' : '(';
                char tmp;
                while (!linkedList.isEmpty() && (tmp = linkedList.poll()) != bracket){
                    if (tmp == '(') {
                        s = "(" + s + ")";
                    }
                    if (tmp == '[') {
                        s = "[" + s + "]";
                    }
                }
                s = bracket + s + c;
            }
        }
        while (!linkedList.isEmpty()) {
            char a =  linkedList.pop();
            if (a == '(') {
                s = "(" + ")" + s;
            }
            if (a == '[') {
                s = "[" + "]" + s;
            }
        }
        System.out.println(s);
    }
}
