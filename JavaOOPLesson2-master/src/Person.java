import interfaces.Human;

public class Person implements Human {
    String name;
    String birthday;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void say() {
        System.out.println(this.name + ": I say");
    }

    public void say(String words) {
        System.out.println(this.name + ": Say: " + words);
    }

    @Override
    public void see() {
        System.out.println(this.name + ": I see");
    }

    public void see(String object) {
        System.out.println(this.name + ": I see " + object);
    }

    @Override
    public void hear() {
        System.out.println(this.name + ": I hear");
    }

    public void hear(String object) {
        System.out.println(this.name + ": I hear " + object);
    }

    @Override
    public void toGo() {
        System.out.println(this.name + ": I toGo");
    }

    public void toGo(String object) {
        System.out.println(this.name + ": I toGo " + object); // Тут требуется гибкость в выражениях ))
    }

    @Override
    public void run() {
        System.out.println(this.name + ": I run");
    }

    public void run(String object) {
        System.out.println(this.name + ": I run " + object);
    }

    @Override
    public void eat() {
        System.out.println(this.name + ": I eat");
    }

    public void eat(String object) {
        System.out.println(this.name + ": I eat " + object);
    }

    @Override
    public void drink() {
        System.out.println(this.name + ": I drink");
    }

    public void drink(String object) {
        System.out.println(this.name + ": I drink " + object);
    }

    @Override
    public boolean sleep(boolean sleep) {
        if (!sleep){
            System.out.println(this.name + ": Я сейчас не сплю");
        } else {
            System.out.println(this.name + ": Я сплю");
        }
        return sleep;
    }
}
