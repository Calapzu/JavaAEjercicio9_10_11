package iterator;

public interface UsuarioIterator {
    //Hay mas usuarios en el iterador??
    boolean hayMas();
    //Reinicia el contador (El iterador)
    void reinicia();
    //Obtiene el siguiente
    Usuario siguiente();
}
