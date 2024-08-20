public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.newStack();

        stack.push("One");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("Six");
        stack.push("Seven");
        stack.push("8");
        stack.push("9");
        stack.push("10");

        stack.print();

        stack.pop();

        stack.push("11");
        stack.push("12");
        System.out.println();
        stack.print();

    }
}
