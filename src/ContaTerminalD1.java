import java.util.Scanner;

public class ContaTerminalD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String regexNum = "\\d{4}";         
        String regexAgen = "\\d{3}-\\d";
        int num = -1; 
        String agencia; 
        String input;
        
        System.out.println("Por favor, digite seu Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Por favor, agora digite seu Sobrenome: ");
        String sobreNome = sc.nextLine();

        String nomeCompleto = concatNome(nome, sobreNome);
        
        //NÚMERO
        do { 
            System.out.println("Por favor, digite o Número - [0000]");
            input = sc.next();

            if(input.matches(regexNum)){
                num = Integer.parseInt(input);
            }else{
                System.out.println("Entrada Inválida.");
            }
        } while (num == -1);
        
        //AGÊNCIA
        do { 
            System.out.println("Por favor, digite a Agência -[000-0]");
            agencia = sc.next();

            if(!agencia.matches(regexAgen) == true){
                System.out.println("Entrada Inválida.");
            }
        } while (!agencia.matches(regexAgen));

        System.out.println("Digite o seu Saldo: ");
        double saldo = sc.nextDouble();
                
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, \nsua agência é %s, conta %s e seu saldo %.2f já está disponível para saque. ", nomeCompleto, agencia, input, saldo);
        
        sc.close();
    }
        
    public static String concatNome(String nome, String sobreNome){
        return (nome.trim() + " " + sobreNome.trim()).toUpperCase();
    }
}