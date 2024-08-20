import java.util.Arrays;

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

//    public void removeStek(Object[] stackMas) {
//        Arrays.fill(stackMas, null);
//    }

    public void pop() {
        stackMas[MAXSIZE - 2] = null;
        MAXSIZE--;
    }

    public Object peek() {
        return stackMas[MAXSIZE - 1];
    }

    public Object getIndex(int index) {
        return stackMas[index];
    }


}
