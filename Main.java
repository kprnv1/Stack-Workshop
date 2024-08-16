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
        stack.push("10 double");

        for (int i = 0; i < stack.getTop(); i++) {
            System.out.println(stack.getIndex(i));
        }
        System.out.println();

        System.out.println("Последний элемент = " + stack.peek());
        System.out.println("Удаляем последний элемент = " + stack.pop());
        System.out.println("Теперь последний элемент = " + stack.peek());

        System.out.println();

        for (int i = 0; i < stack.getTop(); i++) {
            System.out.println(stack.getIndex(i));
        }

        System.out.println();
        System.out.println("И снова добавим один элемент");
        stack.push("10 double");
        for (int i = 0; i < stack.getTop(); i++) {
            System.out.println(stack.getIndex(i));
        }
    }
}
