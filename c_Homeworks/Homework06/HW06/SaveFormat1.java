package HW06;

public class SaveFormat1 implements Saveable{
    @Override
    public void save(User user) {
        System.out.printf("Save Format 1 for user %s", user.getName());
    }
}
