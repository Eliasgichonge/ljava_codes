public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Elias Mwita");
        encap.setAge(24);
        encap.setIdNum("1234ms");

        System.out.println("Name: " + encap.getName() + "\nAge: " + encap.getAge());
        System.out.println("Identity Number: " +encap.getIdNum());
    }
}
