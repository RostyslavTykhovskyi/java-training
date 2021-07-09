package Task3.model.entity;

public class IncorrectLoginException extends Exception {
    private String login;

    public IncorrectLoginException(String login) {
        super("This login is taken: " + login);
        this.login = login;
    }
}
