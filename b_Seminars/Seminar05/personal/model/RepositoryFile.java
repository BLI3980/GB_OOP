package personal.model;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String createUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        writeToFile(users);
        return id;
    }

    @Override
    public void updateUserDetails(User newUser) {
        List<User> users = getAllUsers();
        User target = users.stream().filter(i -> i.getId().equals(newUser.getId())).
                findFirst().get();
        target.setFirstName(newUser.getFirstName());
        target.setLastName(newUser.getLastName());
        target.setPhone(newUser.getPhone());
        writeToFile(users);
    }

    @Override
    public void deleteUser(String deleteUserId) {
        List<User> users = getAllUsers();
        List<User> tempList = new ArrayList<>();
        User toDelete = users.stream().filter(i -> i.getId().equals(deleteUserId)).
                findFirst().get();

        for (User user: users) {
            if(user.getId().equals(toDelete.getId())){
                continue;
            }
            tempList.add(user);
        }
        writeToFile(tempList);
    }

    private void writeToFile(List<User> users){
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
