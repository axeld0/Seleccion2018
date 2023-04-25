package Model;

public abstract class IntegranteAFA {

    private String name;
    private String apellido;
    private int edad;



    /**constructore**/

    public IntegranteAFA()
    {
        name= "";
        apellido = "";
        edad = 0;
    }

    public IntegranteAFA(String name , String apellido , int edad)
    {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }


    /**getters**/

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return  "Nombre=" + name +
                ", Apellido=" + apellido +
                ", Edad=" + edad +
                "}";
    }
}
