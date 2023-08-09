/*
 1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda:
el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la 
fecha de alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo 
normal y sumándole el atributo particular de cada barco. En los veleros se suma el 
número de mástiles, en los barcos a motor se le suma la potencia en CV y en los yates
se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases
y los métodos necesarios que permitan al usuario elegir el barco que quiera alquilar 
y mostrarle el precio final de su alquiler.n the template in the editor.
 */
package ejercicio1extra4guia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Isabel
 */
public class Ejercicio1extra4Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Velero b1=new Velero(2, "abc", 20, 2000);
        BarcoMotor bmotor=new BarcoMotor(50, "123ab", 20, 1980);
        Yate yate=new Yate(3, 100, "12asd", 5, 1990);
        Alquiler a1=new Alquiler("pepe", "1234567", LocalDate.of(2000,04,02), LocalDate.of(2000,05,02), "de lado", b1);
        Alquiler a2=new Alquiler("luna", "12345", LocalDate.of(2000,04,02), LocalDate.of(2000,05,12), "con ancla", yate);
        System.out.println(b1.modulo());
       yate.modulo();
       a2.precioFinal();
        a1.numDiasAlquiler();
       a1.precioFinal();
//        Barco b2=new BarcoMotor(1, "dfg", 1, 2005);
//        Alquiler a2=new Alquiler("lola", "2468203", LocalDate.of(2000,07,02), LocalDate.of(2000,11,02), "de lado", b2);
//        Barco b3=new Yate(2, 50, "hijk", 20, 2008);
//        Barco b4=new Yate(1, 1, "lmn", 1, 2007);
//        Alquiler a3=new Alquiler("dany", "22223333", LocalDate.of(2000,07,02), LocalDate.of(2000,07,03), "costado", b3);
//        System.out.println("yate  "+a3.getPrecioFinal()+"pesos");
//        System.out.println(((int) ChronoUnit.DAYS.between(a3.getFechaAlquiler(), a3.getFechaDevolucion())));
//        System.out.println(b4.modulo());

        
    }
    
}
