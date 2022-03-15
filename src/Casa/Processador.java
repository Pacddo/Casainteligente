package Casa;

import java.util.Scanner;

public class Processador {
    Scanner scan = new Scanner(System.in);
    Arcondicionado arcondicionado = new Arcondicionado();

    int number;


    void imprimirmensagem() {
        System.out.println("Qual opção deseja escolher?\n1-AR CONDICIONADO\n2-CORTINA\n3-FOGÃO\n4-GELADEIRA\n5-LUZES");
    }

    void numeroescolhido() {
        number = scan.nextInt();
        if (number == 1) arcondicionado.imprimirstatus();



    }
}
