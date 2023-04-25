import Model.*;

public class Main {
    public static void main(String[] args)
    {
        Entrenador scaloni = new Entrenador("Lionel", "Scaloni", 43,"4-4-2", "Ofensivo" );
        Futbolistas messi = new Futbolistas("Lionel", "Messi", 36, 10, "Delantero");
        Ayudante aimar = new Ayudante("Pablito", "Aimar", 45,"ser facha" );
        Masajista masa = new Masajista("Pablo", "Masaje", 46 ,"Licenciado en masajes deportivos", 34 );
        Futbolistas lautaro = new Futbolistas("Lautaro", "Martinez", 30, 22, "Delantero");

        Seleccion scaloneta = new Seleccion();
        System.out.println(scaloneta.agregarIntegranteDeSeleccion(scaloni));
        System.out.println(scaloneta.agregarIntegranteDeSeleccion(messi));
        System.out.println(scaloneta.agregarIntegranteDeSeleccion(masa));
        System.out.println(scaloneta.agregarIntegranteDeSeleccion(aimar));
        System.out.println(scaloneta.agregarIntegranteDeSeleccion(lautaro));

        System.out.println(scaloni.jugarPartido());

        System.out.println(scaloneta);
    }
}