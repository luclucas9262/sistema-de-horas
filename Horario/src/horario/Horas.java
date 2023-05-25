package horario;

import java.util.Scanner;



public class Horas {

    private int hora, opc;

    Scanner entrada = new Scanner(System.in);

    public void SetHora() {
        System.out.println("Digite a hora atual");
        this.hora = entrada.nextInt();
        }

    public int GetHora() {
        return this.hora;

        }

    public void ExibirHora() {
        System.out.println("***Horário é : " + hora+" ***");
        }

    public void SetOPC() {
        System.out.println("Digite a opção");
        this.opc = entrada.nextInt();

        }

    public int GetOPC() {
        return this.opc;
        }

    public void ExibirOPCInvalida() {
        System.out.println("Opção Inválida! ");

        }
    
    //***sair metodo***//
    public void Sair() {
        System.out.println("Sistema Encerrado");
        System.exit(0);
        }

    public void ExibirMenu() {
        System.out.println("1  - Ver as Horas");
        System.out.println("0  - Sair");
        }

}
