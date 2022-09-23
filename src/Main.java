public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Piero");
        persona1.setEdad(21);
        persona1.setTelefono(962336436);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private int telefono;
    private String nombre;

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}