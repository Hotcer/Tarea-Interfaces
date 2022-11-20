public class main {

    static CocheCRUD cocheCRUD;
    public static void main(String[] args) {

        CocheCRUDImpl coche = new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();


    }
}
