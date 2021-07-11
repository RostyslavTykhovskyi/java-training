package ImmutableEqualsHashCode;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public int hashCode() {
        return ((name == null) ? 0 : name.hashCode()) + age * 31 + ((group == null) ? 0 : group.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        } else if (obj.getClass() == getClass()) {
            Student student = (Student) obj;
            return name.equals(student.getName()) && age == student.getAge() && group.equals(student.getGroup());
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }
}
