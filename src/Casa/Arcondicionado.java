package Casa;

import java.util.Scanner;

public class Arcondicionado {
    Scanner scan = new Scanner(System.in);

    String status = "OFF";
    double temperatura;
    double tempambiente = 23;
    int onoff;

    void imprimirstatus() {
        System.out.println("Ar condicionado\nStatus: " + status + "\nTemperatura ar: " + temperatura +"" +
                "\nTemperatura ambiente: " + tempambiente + "°C"+ "\n\nEscolha uma opção:\n1-Ligar/Desligar" +
                "\n2-Alterar temperatura");
        onoff =scan.nextInt();
    }
}


