public class UserController {
    private UserStorage storage;

    public UserController(UserStorage storage){
        this.storage = storage;
    }

    public void setStorage(UserStorage storage) {
        this.storage = storage;
    }

    public void store(User user) {
        this.storage.store(user);
    }
}
