import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura del árbol");
        int altura=sc.nextInt();
//Hacemos estos 3 bucles para crear la pirámide/árbol, uno para los espacios y otro para los asteriscos,
        for(int i=1;i<=altura;i++){
            for(int j=1;j<=altura-i;j++){
                System.out.print(" ");
                //utilizamos esa fórmula para los asteriscos, ya que es para sacar números impares
            }for (int k=1;k<=(i*2)-1;k++){
                System.out.print("*");

            }
            System.out.println(" ");

        }

        }
    }
