public class Stack {
    Object[] stackMas;
    int top = 0;

    public int getTop() {
        return top;
    }

    public void newStack() {
        stackMas = new Object[10];
    }

    public void push(Object newStack) {
        if (top < stackMas.length) {
            stackMas[top++] = newStack;
        }
    }

    public Object pop() {
        Object number = stackMas[getTop() - 1];
        top--;
        return number;
    }

    public Object peek() {
        return stackMas[getTop() - 1];
    }

    public Object getIndex(int index) {
        return stackMas[index];
    }

}
