package controller;
import view.*;
import model.*;

public class DespertadorController {
    // aqui na controller vocês terão que colocar o switch/case

        public static String[] verOpcoes() {
return DespertadorModel.mostraropcoes();
        }


        public static String acaoDespertador(int opcaoUsuario) {
            String resposta = "";
            switch (opcaoUsuario) {
                case 1:
                    resposta = "Ok! Alarme adiado em: " + DespertadorView.adiar + " minutos.";
                    DespertadorView.minutoDespertar += DespertadorView.adiar;
                    if (DespertadorView.minutoDespertar > 60) {
                        DespertadorView.minutoDespertar = 60;
                    }
                    break;
            
                case 2:
                    System.out.println("Ok! Alarme parado.");
                    System.exit(0);
                    break;
    
                default:
                    resposta = "Opção inválida.";
                    break;
            }
            return resposta;
        }
    }







//tentativa falha //
        //int escolha = 1;

       // switch (escolha) {
       // case 1:
          //  System.out.println("Adiado 10 minutos...");
           // break;
           // case 2:
           // System.out.println("Alarme parado...");

      //  default:
      //      break;
  //  }

   //  }
        

   //  }

