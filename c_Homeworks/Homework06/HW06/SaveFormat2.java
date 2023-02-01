package HW06;

public class SaveFormat2 implements Saveable{
    @Override
    public void save(User user) {
        System.out.printf("Save Format 2 for user %s", user.getName());
    }
}
