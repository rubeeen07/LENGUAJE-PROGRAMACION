public class Principal
{
    public static void main(String[] args) {
        // Crear dos alumnos usando el segundo y tercer constructor
        // Asignar nombre y apellidos al alumno creado con el tercer constructor
        // Mostrar alumnos por pantalla usando una sola sentencia println y formatted
        Alumno a1=new Alumno("PEPE");
        Alumno a2=new Alumno("JUANITO", 1988);
        a2.setNombre("JUAN");
        a2.setApe1("PARRA");
        a2.setApe2("GÓMEZ");
        System.out.printf("%s\n%s\n", a1, a2);
        System.out.println(a1.contarPares(1,10));       // contarPares devuelve siempre 0
    }
    
   
    
    private static void m2() {
        Alumno a1=new Alumno();
        // Alumno a2=new Alumno("");
        // Alumno a3=new Alumno("\t   "); 
        System.out.println(a1);            
    }
    
    private static void m1() {
       Alumno a1=new Alumno();
       Alumno a2=new Alumno("PEPE");
       Alumno a3=new Alumno("JUAN", 1982);
       
       System.out.println(a1);
       System.out.println(a2);
       System.out.println(a3);
       
       System.out.printf("Alumno 1: %s - Alumno 2: %s - Alumno 3: %s\n", a1, a2, a3);
       String texto1="Alumno 1: %s".formatted(a1);
       String texto2=String.format("Alumno 2: %s", a2);
       System.out.println(texto1+"\n"+texto2);
    }
   
}