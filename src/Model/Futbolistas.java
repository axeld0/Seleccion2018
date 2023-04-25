package Model;

public class Futbolistas extends IntegranteAFA implements IDiaPartido{
    private int numero;
    private String puesto;

    public Futbolistas()
    {
        numero = 0;
        puesto = "";
    }

    public Futbolistas(String nombre, String apellido, int edad, int numero, String puesto)
    {
        super(nombre, apellido, edad);
        this.numero = numero;
        this.puesto = puesto;
    }

    @Override
    public String jugarPartido() {
        return "Juega";
    }


    @Override
    public String toString() {
        return  " Futbolista {" +
                  super.toString() +
                ", numero= " + numero +
                ", puesto= " + puesto +
                "}\n\t  ";
    }
}
