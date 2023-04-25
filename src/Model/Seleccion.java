package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Seleccion {

    private ArrayList<Futbolistas> roster;
    private Entrenador [] dt;

    private Ayudante ayudante;

    private Masajista masajista;

    public Seleccion()
    {
        roster = new ArrayList<>();
        dt = new Entrenador[1];
        ayudante = new Ayudante();
        masajista = new Masajista();
    }

    public Seleccion(ArrayList<Futbolistas> roster, Entrenador[] dt , Ayudante ayudante, Masajista masajista)
    {
        this.roster = roster;
        this.dt = dt;
        this.ayudante = ayudante;
        this.masajista = masajista;
    }



    public String agregarIntegranteDeSeleccion(IntegranteAFA a)
    {
        String rta = "";
        if(a instanceof  Futbolistas)
        {
            if(roster.size() < 23)
            {
                roster.add((Futbolistas) a);
                rta = "se ha agregado exitosamente un jugador a la seleccion.";
            }
            else
            {
                rta = gestionarExcepcion(a);
            }
        }
        else if (a instanceof Entrenador)
        {
            if(this.dt[0] == null) {
                this.dt[0] = (Entrenador) a;
                rta = "se ha agregado un dt al roster.";
            }
            else {
                rta = gestionarExcepcion(a);
            }
        }
        else if (a instanceof  Masajista)
        {
            this.masajista = (Masajista) a;
            rta= "Se ha agregado un masajista a la seleccion";
        }
        else if (a instanceof  Ayudante)
        {
            this.ayudante = (Ayudante) a;
            rta= "Se ha agregado un masajista a la seleccion";
        }

        return rta;
    }


    public String gestionarExcepcion(IntegranteAFA f)
    {
        return "Se ha completado el roster. No se puede agregar el integrante";
    }



    @Override
    public String toString() {
        return "Seleccion {" +
                "\nroster= " + roster +
                "\n\n\t\t Dt= " + Arrays.toString(dt) +
                "\n\t\t Ayudante=> " + ayudante +
                "\n\t\t Masajista=> " + masajista +
                "\n}";
    }



}
