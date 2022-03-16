package Casa;

import java.util.Scanner;

public class Arcondicionado {
    Scanner scan = new Scanner(System.in);

    String status = "OFF";
    double temperatura;
    double tempambiente = 23;
    int onoff;

    public void setStatus(String status) {
        this.status = status;
    }

    void imprimirstatus() {
        System.out.println("Ar condicionado\nStatus: " + status + "\nTemperatura ar: " + temperatura +"" +
                "\nTemperatura ambiente: " + tempambiente + "°C"+ "\n\nEscolha uma opção:\n0-Retornar\n" +
                "1-Ligar/Desligar" + "\n2-Alterar temperatura");

        onoff =scan.nextInt();
        if (onoff == 1 && status == "OFF"){
           setStatus("ON");
           imprimirstatus();
        }else {setStatus("OFF");
            imprimirstatus();}

        }
    }



