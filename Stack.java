public class Stack {
    private Object[] stackMas;
    int MAXSIZE;

    public void newStack() {
        stackMas = new Object[++MAXSIZE];
    }

    public Object[] push(Object newStack) {
        stackMas[MAXSIZE - 1] = newStack;
        Object[] newStackMas = new Object[++MAXSIZE];
        addTo(stackMas, newStackMas);
        stackMas = newStackMas;
        addTo(newStackMas, stackMas);
        return stackMas;
    }

    public Object[] addTo(Object[] mas1, Object[] mas2) {
        System.arraycopy(mas1, 0, mas2, 0, MAXSIZE - 1);
        return mas2;
    }

    public void pop() {
        stackMas[MAXSIZE - 1] = null;
    }

    public Object peek() {
        System.out.println("Последний элемент " + stackMas[MAXSIZE - 2]);
        return stackMas[MAXSIZE - 2];
    }

    public void print() {
        for (int i = 0; i < stackMas.length - 1; i++) {
            System.out.println(i + " = " + stackMas[i]);
        }
    }

}
