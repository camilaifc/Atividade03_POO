package atividade03;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de Z: ");
        double z = sc.nextDouble();
        System.out.println("Informe o valor de R: ");
        double r = sc.nextDouble();
        System.out.println("Informe o tipo de tinta a ser utilizada (1,2 ou 3): ");
        int tinta = sc.nextInt();

        double g = Math.sqrt(Math.pow(z,2)+Math.pow(r,2));

        double area = 3.14 * r * (r + g);
        double x = area * 3.45;
        
        double latas = Math.ceil(x/18);
        
        double valor = 0;

        switch (tinta) {
            case 1:
                valor = 238.9 * latas;
                break;
            case 2:
                valor = 467.98 * latas;
                break;
            case 3:
                valor = 758.34 * latas;
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
        
	System.out.println("Área total: "+area);
	System.out.println("Litros: "+x);
        System.out.println("Será necessário comprar "+(int)latas+" latas de 18 litros.");
        System.out.printf("Valor total da compra: R$ %.2f",valor);
    }
}
