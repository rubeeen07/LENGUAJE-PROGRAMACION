public class Util
{
    private Util() {}
    
    // Devuelve true si x está en [a,b]
    public static boolean en(int x, int a, int b) {
        assert a<=b: "El extremo inferior del rango debe ser <= que el superior [%d,%d]"
            .formatted(a,b);
        return x>=a && x<=b;    
    }
    
    // Devuelve un número aleatorio en el rango [a,b]
    public static int generarAleatorio(int a, int b) {
        return (int)(Math.random()*(b-a+1))+a;
    }
    
    
}