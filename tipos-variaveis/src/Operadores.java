public class Operadores {
  public static void main(String[] args) {

    String nomeUm = "ANNA";
    String nomeDois = new String ("ANNA");

    System.out.println(nomeUm.equals(nomeDois));    

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 != numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);

    simNao = numero1 >= numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

   /*int a, b;
    a = 6;
    b = 6;
    String resultado = a==b ? "verdadeiro" : "falso";
    // operador ternario não se limita à String

    System.out.println(resultado); */ 
    /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE */
    /*if (a==b){
      resultado = ("Verdadeiro.");      
    } else {
      resultado = ("Falso.");
    }   
    
    System.out.println(resultado);*/
    /*int numero = 5;

    numero = - numero; 
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);*/

    //repetição para incrementar o valor em uma determinada concepção de novos valores que vamos querer reatribuir

    /*int numero = 5;
    //++numero;
    System.out.println(++ numero);
    System.out.println(numero);*/

    /*boolean variavel = true; // ou true

    //quero determinar que essa variável é falsa

    System.out.println(!variavel); //na memória, mas a variável original continua sendo true - simbolo de exclamação é NEGAÇÃO*/
 
  }

  
}
