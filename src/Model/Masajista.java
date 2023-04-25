package Model;

public class Masajista extends IntegranteAFA implements IAsistencia {
    private String titulo;
    private int aniosDeExperiencia;



    /**constructores**/
    public Masajista()
    {
        titulo = "";
        aniosDeExperiencia =0;
    }

    public Masajista(String nombre, String apellido, int edad, String titulo, int aniosDeExperiencia)
    {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }


    /**getters**/

    public String getTitulo() {
        return titulo;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    /**toString**/
    @Override
    public String toString() {
        return  "Masajista{" + super.toString() +
                ", titulo='" + titulo + '\'' +
                ", aniosDeExperiencia=" + aniosDeExperiencia +
                "} ";
    }

    /**sobrecarga de metodos de interfaz**/

    @Override
    public String asistencia()
    {
        return "asiste haciendo masajes, evitando lesiones y aliviando malestares musculares.";
    }


}
