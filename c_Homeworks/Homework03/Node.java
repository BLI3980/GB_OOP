
public class Element<E> {
    private E data;
    public Element<E> next = null;
    public boolean isNext(){
        return next != null;
    }

    Element(E data){
        set(data);
    }
    Element(){}
    void set(E data){
        this.data = data;
    }
    void add(E data){
        if(isNext()){ //if next != null
            next.add(data);
        }
        else{
            next = new Element<>(data);
//            System.out.println(next);
//            System.out.println(data);
        }
    }
    E get(){
        return data;
    }
}
