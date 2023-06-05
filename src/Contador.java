import java.util.Scanner;

import com.org.teste.ParametrosInvalidosException;

public class Contador {

    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        
        ParametrosInvalidosException dados = new ParametrosInvalidosException();

         Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        dados.analalizarValores(parametroUm, parametroDois);

   

    }

}

    

