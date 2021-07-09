package Task3.model.entity;

public enum Notebook {
    FIRST("Name1", "Patronymic1", "Surname1", "login123"),
    SECOND("Name2", "Patronymic2", "Surname2", "123login"),
    THIRD("Name3", "Patronymic3", "Surname3", "123login123");

    private String name;
    private String patronymic;
    private String surname;
    private String login;

    Notebook(String name, String patronymic, String surname, String login) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.login = login;
    }

    public static void hasLogin(String login) throws IncorrectLoginException {
        for (Notebook notebook : Notebook.values()) {
            if (login.equals(notebook.getLogin())) {
                throw new IncorrectLoginException(login);
            }
        }
    }

    public String getLogin() {
        return login;
    }
}
