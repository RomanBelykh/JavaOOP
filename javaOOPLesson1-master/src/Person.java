public class Person {
    String name;
    String birthday;
    int age;
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // Оставил для примера, но это неправильно,
        this.age = age;           // не должно быть возможсти менять возраст,
    }                             // он должен автоматически высчитываться из даты рождения

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "age='" + age + '\'' +
                '}';
    }

    public void say() {
        System.out.println("Hello");
    }

    public void see() {
        System.out.println("I see you");
    }

    public void hear() {

    }

    public void toGo() {

    }

    public void run() {

    }

    public void eat() {

    }

    public void drink() {

    }

    public void printGender() {

    }
}