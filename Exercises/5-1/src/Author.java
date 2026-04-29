public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, char gender, String email) {
        this.name = name;
        if (gender == 'm'|| gender == 'f') this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
