
abstract public class User {
    private String name;
    private String surname;
    private String email;
    private int age;
    private int AM;
    

    public User() {}

    public User(String name, String surname, String email, int age, int AM) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.AM = AM;       
    }


    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", age=" + age + ", AM=" + AM + '}';
    }
       
}
