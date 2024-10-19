import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Por favor crie a conta");
        System.out.println("c - para corrente");
        System.out.println("p - para poupança");
        String escolha = scan.nextLine();

        if(escolha.equals("c")){
            ContaCorrente banco = new ContaCorrente(Double.parseDouble(scan.nextLine()), criaPessoa(scan));



            while(true){
                
                Menu();
                escolha = scan.nextLine();

                if(escolha.toLowerCase().equals("d")){


                }
                else if(escolha.toLowerCase().equals("s")){


                }
                else if(escolha.toLowerCase().equals("e")){


                }
                else if(escolha.toLowerCase().equals("f")){


                }
                else{
                    System.out.println();
                }


    
                break;
            }
        }
        else{
            while(true){
                
    
                break;
            }
        }





        scan.close();
    }
    private static Pessoa criaPessoa(Scanner scan){
        Pessoa pes = new Pessoa();
        System.out.println("Nome da pessoa: ");
        pes.setNome(scan.nextLine());

        System.out.println("Idade da pessoa");
        pes.setIdade(Integer.parseInt(scan.nextLine()));

        System.out.println("Insira o salário mensal dele: ");
        pes.setSalarioMensal(Double.parseDouble(scan.nextLine()));

        return pes;
    }

    private static void Menu(){

        System.out.println("Qual opção deseja executar?");
        System.out.println("d - deposito");
        System.out.println("s - saque");
        System.out.println("e - extrato");
        System.out.println("f - finalizar");
    }
}
