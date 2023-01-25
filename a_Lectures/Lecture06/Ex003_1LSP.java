import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
public class Ex003_1LSP {
    public static void main(String[] args) throws Exception {
        List<Animal_L06_1> list =
        new ArrayList<>(Arrays.asList(new Cat_L06_1(), new Fish_L06_1() ));
        for (var animal : list) {
            System.out.println(animal.getType());
            System.out.println(animal.getLegsCount());
        }
    }
}

abstract class Animal_L06_1 {
    public String getType() {
        return "Зверушка";
    }

    public int getLegsCount() throws Exception {
        return 0;
    }
}

class Cat_L06_1 extends Animal_L06_1 {

    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Fish_L06_1 extends Animal_L06_1 {
     @Override
     public String getType() {
        return "Рыбка";
     }
     public int getLegsCount() throws Exception {
        throw new Exception("я же рыбка...");
     }
}