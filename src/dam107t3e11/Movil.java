
package dam107t3e11;

public interface Movil  {
    final int DATOS_SEGUNDO_VIDEOLLAMADA=2;
    void efectuarLlamada(int segundos);
    void navegar(int mb);
    boolean recargar(int importe);
    float consultarSaldo();
}
