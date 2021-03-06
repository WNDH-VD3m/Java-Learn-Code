package test5;

public class Box<T>{

    public T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello world"));
        System.out.printf("Integer: %d\n\n", integerBox.get());
        System.out.printf("String: %s\n\n", stringBox.get());

    }
}
