import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personnel implements Iterable<User>{
// userList Field
    private List<User> userList = new ArrayList<>();

// userList Getter
    public List<User> getUserList() {
        return userList;
    }

// Method for adding new user to the userList
    public Personnel addUser(User newUser){
        userList.add(newUser);
        return this;
    }

// Method for returning the size of the userList
    public int size(){
        return userList.size();
    }

// Overridden iterator for userList
    @Override
    public Iterator<User> iterator(){
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < userList.size();
            }

            @Override
            public User next() {
                return userList.get(index++);
            }
        };
    };
}
