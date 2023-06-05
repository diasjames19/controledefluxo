package com.org.teste;
public class ParametrosInvalidosException {

        int parametroUm;
        int parametroDois;
    
     /**
     * @param num1
     * @param num2
     * @throws Exception
     */
    public void analalizarValores(int num1, int num2) throws Exception{

           
                if(num1<num2){
                    int cont = num2 - num1;
                    for(int indice = 1; indice <= cont;indice++){
                        System.out.println("Imprimindo o número " + indice );
                    }
                }
                else{
                    throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro");
                }
            }
     }

   
