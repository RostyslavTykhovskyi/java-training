package Task3.model;

public class Note {
    private String name;
    private String patronymic;
    private String surname;
    private String login;

    @Override
    public String toString() {
        return "Note:\n\tName: " + name + "\n\tPatronymic: " + patronymic + "\n\tSurname: " + surname
                + "\n\tLogin: " + login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
