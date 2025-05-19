public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Obra de Teatro", 450);
        Entrada entrada2= new Entrada("Festival Ceremonia", 4856);

       entrada1.mostrarInformacion();
       entrada2.mostrarInformacion();

        //Uso del record
        Entrada_Record entrada3 = new Entrada_Record("Corona Capital", 5678);
                entrada3.mostrarInformacion();
    }
}
