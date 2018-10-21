package generar_boleto;
import java.util.Scanner;
//Clase principal
public class Generar_Boleto{
    // constructor
    private Scanner teclado;
    int origen, destino; 
    String tipo;
    float tarifa ;
    
    public Generar_Boleto() {
        teclado=new Scanner(System.in);
        System.out.println("'ESCRIBA CLAVE DEL DESTINO'"
                + "    Calikini = 120, Hechechakan=130, Tenabo=140, Campeche=150");
        System.out.print("Origen: ");
        origen=teclado.nextInt();
        System.out.print("Destino: ");
        destino=teclado.nextInt();
        System.out.print("Tipo: ");
        tipo=teclado.next();
        }
    //metodo de ventas
   public void Boleto()
   {
    System.out.println("-----------------------------------------------");   
      if (origen==120&& destino==130){
          tarifa=(float) 10.00;
      } else if (origen==120&& destino==140){
          tarifa=(float) 20.00;
      } else if (origen==120&& destino==150){
          tarifa=(float) 30.00;
      } else{
          tarifa=(float) 10.00;
      }
        
          System.out.println("La tarifa es : "+ tarifa );
      
   }
    //destructor
   protected void finalize() 
   {    
       System.out.println("-----------------------------------------------");
       System.out.println("Hemos destruido a " + origen + destino);
        } 
   
    // invocacion del constructor y el destructor
    public static void main(String[] ar) {
        Generar_Boleto coch;
        coch=new Generar_Boleto();
        coch.Boleto();
        coch = null;
        System.gc();
    }
}


