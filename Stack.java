public class Stack {
    private Object[] stackMas;
    private int MAXSIZE;

    protected void newStack() {
        stackMas = new Object[++MAXSIZE];
    }

    protected void push(Object newStack) {
        stackMas[MAXSIZE - 1] = newStack;
        Object[] newStackMas = new Object[++MAXSIZE];
        addTo(stackMas, newStackMas);
        stackMas = newStackMas;
        addTo(newStackMas, stackMas);
    }

    private void addTo(Object[] mas1, Object[] mas2) {
        System.arraycopy(mas1, 0, mas2, 0, MAXSIZE - 1);
    }

    protected void pop() {
        stackMas[MAXSIZE - 1] = null;
    }

    protected void peek() {
        System.out.println("Последний элемент " + stackMas[MAXSIZE - 2]);
    }

    protected void print() {
        for (int i = 0; i < stackMas.length - 1; i++) {
            System.out.println(i + " = " + stackMas[i]);
        }
    }

}
