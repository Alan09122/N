import java.util.Scanner;
public class Calificaciones {
    void main(){
        float cal1 = 180.00f;
        float cal2 = 190.00f;
        float cal3 = 100.00f;

        float calF = (cal1 + cal2 + cal3)/3;

        if (calF < 0 || calF > 100){
            IO.println("Calificacion Invalida");
        } else if (calF >= 90){
            IO.println("Exelente");
        } else if (calF > 70){
            IO.println("Aprobaste");
        } else if (calF < 70){
            IO.println("Reprobaste");
        }
    }
}
