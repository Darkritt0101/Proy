
package domPro;

/**
 * Esta clase define el objeto alumno y sus tres variables.
 * @author Adolfo
 * @version 2/4/2024/A
 */
public class Alumno {
    private long codigo;
    private String nombre;
    private double saldo;

    public Alumno(long codigo, String nombre, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
}
