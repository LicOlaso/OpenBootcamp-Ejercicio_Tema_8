public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Dario");
        persona.setTelefono(1165345678);
        System.out.println("==Mostrando=============================================");
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Telefono: "+persona.getTelefono());
    }
}