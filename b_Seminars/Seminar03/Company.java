import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
// user Field
    private User user;

// Company Constructor
    public Company(User user) {
        this.user =user;
    }

// Overridden iterator for user
    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            // An iterator takes a list created by deepTree method and iterates it
            List<User> employees = deepTree(user);
            Iterator<User> userIterator = employees.iterator();
            @Override
            public boolean hasNext() {
                return userIterator.hasNext();
            }
            @Override
            public User next() {
                return userIterator.next();
            }
        };
    }

// Method which takes a tree organization list and return a simple list using recursion
    private List<User> deepTree(User user){
        List<User> result = new ArrayList<>();
        result.add(user);
        if(user.getSubordinates().size() == 0){
            return result;
        }
        for (User subordinates: user.getSubordinates()) {
            result.addAll(deepTree(subordinates));
        }
        return result;
    }
}
