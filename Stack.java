public class Stack {
    Object[] stackMas;
    int TOP = 0;

    public int getTop() {
        return TOP;
    }

    public void newStack() {
        stackMas = new Object[10];
    }

    public void push(Object newStack) {
        if (TOP < stackMas.length) {
            stackMas[TOP++] = newStack;
        }
    }

    public Object pop() {
        Object number = stackMas[getTop() - 1];
        TOP--;
        return number;
    }

    public Object peek() {
        return stackMas[getTop() - 1];
    }

    public Object getIndex(int index) {
        return stackMas[index];
    }

}
