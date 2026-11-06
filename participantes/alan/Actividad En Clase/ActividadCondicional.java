public class ActividadCondicional {
    void main(){
        double compra = 500;
        double tasa = 0;

        if (compra >= 500){
            tasa = 0.10;
        } else if (compra >= 200){
            tasa = 0.05;
        } else if (compra == 199) {
            tasa = 0;
        }

        double descuento = compra * tasa;
        double subtotal = compra - descuento;

    }
}
