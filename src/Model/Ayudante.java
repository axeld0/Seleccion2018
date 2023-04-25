package Model;

public class Ayudante extends IntegranteAFA implements IDiaPartido,IPreparacion {

    private String metodologia;

    public Ayudante()
    {
        metodologia = "";
    }

    public  Ayudante (String name, String apellido, int edad, String metodologia)
    {
        super(name, apellido, edad);
        this.metodologia = metodologia;
    }

    public String getMetodologia() {
        return metodologia;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Ayudante{" +
                " metodologia='" + metodologia + '\'' +
                "} " ;
    }


    /**sobrecarga metodos de interfaz**/
    @Override
    public String jugarPartido()
    {
        return "Juega, desde afuera y asistiendo al DT";
    }

    @Override
    public String prepararPartido()
    {
        return "Asiste en la preparacion, planteando alternativas y brindando informacion sobre el rival.";
    }


}
