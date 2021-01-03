
package prueba10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba10 {

   public static void burbuja(String vec1[]){
        int i,j,x=vec1.length;
        String aux;
        for(i=0;i<x;i++){
            for(j=i+1;j<x;j++){
                if(vec1[i].charAt(0)>vec1[j].charAt(0)){
                    aux=vec1[i];
                    vec1[i]=vec1[j];
                    vec1[j]=aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        int opc,x,i,j;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes: "));
        String []vec1=new String[x];
        String []vec2=new String[x];
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("\t..:MENU:.."+
                    "\n1. Ingreso de nombres"+
                    "\n2. Ordenar nombres"+
                    "\n3. Mostrar nombres"+
                    "\n4. Finalizar"+
                    "\n\nDigite una opcion: "));
         switch(opc){
            case 1: 
                for(i=0;i<x;i++){
                    vec1[i]= JOptionPane.showInputDialog((i+1)+". Digite el nombre del estudiante:");
                    vec2[i]=vec1[i];
                }break;
           case 2: 
                String cadena="";
                burbuja(vec1);
                for(i=0;i<x;i++){
                    cadena+=(i+1)+". "+vec1[i]+"\n";
                }
                JOptionPane.showMessageDialog(null,"\tORDENANDO LOS NOMBRES POR METODO BURBUJA\n"+cadena);
                break;
            case 3: 
                String cade="";
                for(i=0;i<x;i++){
                    cade+=(i+1)+". "+vec2[i]+"\n";
                }
                JOptionPane.showMessageDialog(null,"\tMOSTRANDO NOMBRES\n"+cade);
                break;
            case 4:
                System.out.println("\n\tGRACIAS POR USAR EL MENÚ");break;           
         }      
         
        }while(opc!=4);
       
    }    
    
}