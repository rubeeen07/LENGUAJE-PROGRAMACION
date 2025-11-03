public class Principal
{
    public static void main(String[] args) {
        Tanque t1=new Tanque();
        Tanque t2=new Tanque(3,5);
        Tanque t3=new Tanque('S');
        // Tanque t4=new Tanque(-1,5);  <- Error: fila no válida
        // Tanque t5=new Tanque(3,11);  <- Error: columna no válida
        Tanque t6=new Tanque('O');
        System.out.printf("Tanque t1: %s\n", t1);
        System.out.printf("Tanque t2: %s\n", t2);
        System.out.printf("Tanque t3: %s\n", t3);
        System.out.printf("Tanque t6: %s\n", t6);        
        // Tanque t6=new Tanque('A');
        // t6.avanzar(1);   <- Error: dirección inesperada
        // System.out.println("El tanque 6 avanza 1 posición");
        // System.out.printf("Tanque t6: %s\n", t6); 
        t6.girar();
        System.out.printf("El tanque t6 ha girado\n", t6); 
        System.out.printf("Tanque t6: %s\n", t6); 
        t6.girar();
        System.out.printf("El tanque t6 ha girado otra vez\n", t6); 
        System.out.printf("Tanque t6: %s\n", t6); 
        
        System.out.printf("Tanque 1: %s\n", t1);
        System.out.println("El tanque t1 gira 2 veces"); 
        t1.girar(2);
        System.out.printf("Tanque t1: %s\n", t1);
        System.out.println("El tanque t1 gira 4 veces"); 
        t1.girar(4);
        System.out.printf("Tanque t1: %s\n", t1); 
    }
}