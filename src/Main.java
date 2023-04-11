public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setId(1);
        p.setName("Sabina");
        p.setAge(20);
        p.setExperience(3);
        p.setProfession("Full-stack developer");
        p.introducing();

        Person p1 = new Person();
        p1.setId(2);
        p1.setName("Xanim");
        p1.setAge(20);
        p1.setExperience(5);
        p1.setProfession("Backend developer");
        p1.introducing();

        Person p2 = new Person();
        p2.setId(3);
        p2.setName("Aisha");
        p2.setAge(20);
        p2.setExperience(2);
        p2.setProfession("Frontend developer");
        p2.introducing();



    }
}