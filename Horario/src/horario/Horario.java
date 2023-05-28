package horario;

public class Horario {

    public static void main(String[] args) {

        Horas h = new Horas();

        do {
            h.ExibirMenu();
            h.SetOPC();

            if (h.GetOPC() < 0 || h.GetOPC() >= 2) {
                h.ExibirOPCInvalida();
                h.Sair();

            }
            if (h.GetOPC() == 0) {
                h.Sair();

            } else {
                
                if (h.GetOPC() == 1) {
                    
                    h.SetHora();
                        if (h.GetHora() <= 11) {
                            System.out.println("***Bom Dia***");
                            h.ExibirHora();
                        } 
                        
                        if ( h.GetHora() >= 12 && h.GetHora() <= 18 ) {
                            System.out.println("***Boa Tarde***");
                            h.ExibirHora();
                        }
                        
                        if (h.GetHora() >= 19) {
                            System.out.println("****Boa noite****");
                            h.ExibirHora();
                        }
                }

            }
        } while (h.GetOPC() >= 0 && h.GetOPC()<=2 );

    }
}
