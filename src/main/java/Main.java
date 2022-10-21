public class Main {
    public static void main(String[] args) {
        Person woman = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        woman.happyBirthday();
        Person son = woman.newChildBuilder()
                .setName("Антошка")
                .build();
        son.happyBirthday();
        System.out.println("У " + woman + " есть сын, " + son);
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
