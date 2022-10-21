public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String cityOfResidence;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
            return this;
        } else throw new IllegalArgumentException("Некоректный возраст");


    }

    public PersonBuilder setAddress(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
        return this;
    }

    public Person build() {
        String e = "Нужно заполнить обязательные поля";
        if (name == null) {
            throw new IllegalStateException(e);
        } else if (surname == null) {
            throw new IllegalStateException(e);

        } else
            return new Person(name, surname, age, cityOfResidence);
    }
}
