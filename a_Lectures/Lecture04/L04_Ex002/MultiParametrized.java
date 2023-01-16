package L04_Ex002;

public class MultiParametrized<E1, E2, E3> {

    public E1 value1;
    public E2 value2;
    public E3 value3;


    public MultiParametrized(E1 value1, E2 value2, E3 value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public String toString(){
        return String.format("E1 type: %s E1 type: %s E2 type: %s",
        value1.getClass().getSimpleName(),
        value2.getClass().getSimpleName(),
        value3.getClass().getSimpleName());
    }
}
