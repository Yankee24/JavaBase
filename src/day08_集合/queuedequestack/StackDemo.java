package day08_集合.queuedequestack;

import java.util.Stack;

/**
 * @author xiao儿
 * @date 2019/9/3 8:35
 * @Description StackDemo
 *
 * Stack类：栈，先进后出的线性数据结构
 */
public class StackDemo {
    public static void main(String[] args) {
        stack();
    }

    private static void stack() {
        Stack<String> stack = new Stack<>();
        // 压栈
        stack.push("Bin");
        stack.push("Jack");
        stack.push("Job");
        stack.push("Tom");

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
