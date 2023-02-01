package HW06;

public class SaveManager {
    Saveable saveUser;

    public SaveManager(Saveable saveUser) {
        this.saveUser = saveUser;
    }

    public void save (User user){
        saveUser.save(user);
    }
}
