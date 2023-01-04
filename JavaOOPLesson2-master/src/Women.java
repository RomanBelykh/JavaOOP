public class Women extends Person {
    boolean notSick = true;
    boolean mother = false;
    int children = 0;
    String gender = "Women";

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isNotSick() {
        return notSick;
    }

    public void setNotSick(boolean notSick) {
        this.notSick = notSick;
    }

    public boolean isMother() {
        if (children > 0) {
            setMother(true);
            return mother;
        }
        return mother;
    }

    public void setMother(boolean mother) {
        this.mother = mother;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Women() {

    }

    @Override
    public String toString() {
        return "Women --> " +
                " name='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", age=" + getAge() +
                ", mother=" + isMother() +
                ", gender='" + getGender() + '\'';
    }
}
