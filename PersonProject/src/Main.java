public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");
    
        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }
    
        antti.growOlder();
    
        System.out.println(antti); // same as System.out.println(antti.toString());
        System.out.println(pekka); // same as System.out.println(pekka.toString());
    }    
}
