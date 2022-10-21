import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String cityOfResidence;

    public Person(String name, String surname, int age, String cityOfResidence) {
        this.name = name;
        this.surname = surname;
        if (!hasAge()) {
            this.age = age;
        }
        if (hasAddress()) {
            this.cityOfResidence = cityOfResidence;
        }
    }

    public boolean hasAge() {
        if (getAge().getAsInt() > 0) {
            return true;
        } else return false;
    }

    public boolean hasAddress() {
        if (cityOfResidence == null) {
            return true;
        } else return false;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setAge(16);
        personBuilder.setAddress(this.cityOfResidence);
        return personBuilder;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else System.out.println("Возраст " + name + " неизвестен");
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        if (hasAddress()) {
            this.cityOfResidence = cityOfResidence;
        }
    }

    @Override
    public String toString() {
        return "имя= '" + name + '\'' +
                ", фамилия= '" + surname + '\'' +
                ", возраст= " + age +
                ", город проживания= '" + cityOfResidence + '\'';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
