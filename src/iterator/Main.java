package iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();

        usuarios.crear(new Usuario("Uno", 1));
        usuarios.crear(new Usuario("Dos", 2));
        usuarios.crear(new Usuario("Tres", 3));
        usuarios.crear(new Usuario("Cuatro", 4));
        usuarios.crear(new Usuario("Cinco", 5));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuarios es: "+usuario.getNombre());
        }

        usuarios.crear(new Usuario("Sesis", 6));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuarios es: "+usuario.getNombre());


        usuarios.reinicia();
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuarios es: "+usuario.getNombre());
        }
    }


}
