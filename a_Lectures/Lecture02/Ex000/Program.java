package Ex000;

// Access modifiers:
// 1. Public - have access from anywhere
// 2. Private - have access from within current class
// 3. Protected - have access from within current class and inherited classes

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 123;
//        System.out.println(f1.value);
        f1.printCount();

//        Foo.count = 123000;

        Foo f2 = new Foo();
        f2.value = 222;
//        System.out.println(f2.value);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 444;
//        System.out.println(f3.value);
        f3.printCount();
    }

}
