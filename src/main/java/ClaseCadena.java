public class ClaseCadena {
    public static String DevuelveIniciales(String nombre) {
        String iniciales = "";
        String[] palabras = nombre.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            iniciales += palabras[i].charAt(0) + ".";
        }
        return iniciales;
    }


}

