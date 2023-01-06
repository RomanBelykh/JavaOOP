public class Men extends Person {
    private boolean militaryDuty = false;
    private boolean notSick = true;
    private boolean father = false;
    private int children = 0;
    String gender = "Men";

    public Men() {
    }

    public boolean isFather() {
        if (children > 0) {
            setFather(true);
            return father;
        }
        return father;
    }

    public void setFather(boolean father) {
        this.father = father;
    }

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

    public boolean isMilitaryDuty() {
        if (age >= 18 && notSick) {
            setMilitaryDuty(true);
            return militaryDuty;
        }
        return militaryDuty;
    }

    public void setMilitaryDuty(boolean militaryDuty) {
        this.militaryDuty = militaryDuty;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Men --> " +
                " name = '" + getName() + '\'' +
                ", birthday = '" + getBirthday() + '\'' +
                ", age = '" + getAge() + '\'' +
                ", gender = '" + getGender() + '\'' +
                ", militaryDuty = " + isMilitaryDuty();
    }
}