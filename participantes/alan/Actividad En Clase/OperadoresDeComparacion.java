public class OperadoresDeComparacion {
    void main(){
        String act = "ACTIVO";
        //.equals
        boolean activo = act.equals("ACTIVO");
        IO.println(activo);

        //&& AND Ambas deben cumplirse pra ser verdadero
        boolean comi = true;
        boolean bebi = false;

        boolean santisfecho = comi && bebi;
        IO.println(santisfecho);

        // || OR Una debe cumplirse para ser verdadero
        boolean feliz = comi || bebi;
        IO.println(feliz);

        //! NOT Invierte negativo a positivo y positivo a negativo
        IO.println(!feliz);
        IO.println(!santisfecho);
    }
}
