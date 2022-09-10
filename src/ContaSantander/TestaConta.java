package ContaSantander;

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        ContaI minhaconta;
        minhaconta = new ContaI();

        // Digitar titular da conta
        System.out.println("Titular da Conta: ");
        String titular = sca.next();

        //Digitar agência
        System.out.println("Digite a Agencia: ");
        String agencia = sca.next();

        // Digita número da conta
        System.out.println("Digite a Conta: ");
        int numero = sca.nextInt();

        //Saldo Atual
        minhaconta.saldo = 1000.0;
        System.out.println("Saldo Atual: " + minhaconta.saldo);

        //Método com retorno onde retorna um valor para o código. Método sacar podemos devolver um valor booleano
        // indicando que a operação foi bem-sucedida.
        boolean conseguir = minhaconta.saca(2000);
        if(conseguir){
            System.out.println("Informamos sua retirada foi sucesso!");
        }else{
            System.out.println("Informamos sua retirada foi negada!");
        }

        //Sacar 200 reais
        minhaconta.sacar(200);

        //Deposita 500 reais
        minhaconta.depositar(500);
        System.out.println("Novo status -> Saldo Atual: " + minhaconta.saldo);
    }
}
