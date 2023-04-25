package Model;

public class Entrenador extends IntegranteAFA implements IDiaPartido, IPreparacion{
    private String sistema;
    private String estilo;



    /**constructores**/

    public Entrenador()
    {
        sistema = "";
        estilo = "";

    }

    public Entrenador (String name , String apellido, int edad, String sistema, String estilo)
    {
        super(name, apellido, edad);
        this.sistema = sistema;
        this.estilo = estilo;
    }


    /**toString**/
    @Override
    public String toString() {
        return "Entrenador{" +
                super.toString() +
                "sistema='" + sistema + '\'' +
                ", estilo='" + estilo + '\'' +
                "} " ;
    }


    /**getters **/

    public String getSistema() {
        return sistema;
    }

    public String getEstilo() {
        return estilo;
    }


    /**sobrecarga de metodos de las interfaces**/
    @Override
    public String jugarPartido()
    {
        return "Juega, pero desde afuera de la cancha.";
    }

    @Override
    public String prepararPartido()
    {
        return "Plantea un sistema de acuerdo al rival";
    }



}
