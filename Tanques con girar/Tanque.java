public class Tanque
{
    private static final int MIN_FILA=0;
    private static final int MAX_FILA=5;
    private static final int MIN_COLUMNA=0;
    private static final int MAX_COLUMNA=9;
    private static final String DIRECCIONES="NESO";
    private static final char DIRECCION='N';            // Dirección por defecto
        
    private int fila;       // >=0
    private int columna;    // >=0
    private char direccion; // N {N,E,S,O}
    
    public Tanque() {
        this(DIRECCION);    
    }  
    
    public Tanque(int fila, int columna) {
        setFila(fila);
        setColumna(columna);
        setDireccion(DIRECCION);
    }
    
    public Tanque(char direccion) {
        setFila(Util.generarAleatorio(MIN_FILA, MAX_FILA));
        setColumna(Util.generarAleatorio(MIN_COLUMNA, MAX_COLUMNA));
        setDireccion(direccion);
    }
    
    private void setFila(int fila) {
        assert Util.en(fila, MIN_FILA, MAX_FILA):
            "La fila %d no está en el rango [%d,%d]".formatted(fila, MIN_FILA, MAX_FILA);        
        this.fila=fila;        
    }
    
    private void setColumna(int columna) {
        assert Util.en(columna, MIN_COLUMNA, MAX_COLUMNA): "La columna %d no está en el rango [%d,%d]"
                .formatted(columna, MIN_COLUMNA, MAX_COLUMNA);        
        this.columna=columna;        
    } 
    
    public void setDireccion(char direccion) {
        assert DIRECCIONES.indexOf(direccion)>=0:
            "La dirección no es válida [direccion=%c] [válidas=%s]".formatted(direccion, DIRECCIONES);
        this.direccion=direccion;
    }    
    
    public void avanzar(int distancia) {
        assert distancia>=0: 
            "La distancia debe ser >=0 [distancia=%d]".formatted(distancia);
        if (direccion=='N')
            setFila(fila-distancia);
        else if (direccion=='E')
            setColumna(columna+distancia);
        else if (direccion=='S')
            setFila(fila+distancia);
        else if (direccion=='O')
            setColumna(columna-distancia);
        else {                             // PROGRAMACIÓN DEFENSIVA 
            System.err.printf("Dirección inesperada=%c", direccion);
            System.exit(1);
        }
    }
    
    public void girar() {    
        int i=DIRECCIONES.indexOf(direccion);
        setDireccion(DIRECCIONES.charAt((i+1)%DIRECCIONES.length()));
    }
    
    public void girar(int n) {
        assert n>=1: "El número de giros debe ser >=1 [n=%d]".formatted(n);
        for (int i=1; i<=n; i++)
            girar();
    }
    
    public String toString() {
        return "(%d,%d) %c".formatted(fila, columna, direccion);
    }
}















