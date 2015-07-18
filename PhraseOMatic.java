/**
 * @author esdras
 */
public class PhraseOMatic {
    
    //Definindo um Array de String
    String[] wordListOne = {"Bytecode", "String", "Javac", "Float", "Integer"};
    String[] wordListTwo = {"ParseInt", "EJB", "JSF", "JVM"};
    String[] wordListThree = {"Final", "JDBC", "Connection"};
    
    public static void main(String[] args){
        
        //Descobrindo quantas palavras estao no Array
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        System.out.println("Quantidade de palavras da Lista Um: " + oneLength);
        System.out.println("Quantidade de palavras da Lista Dois: " + twoLength);
        System.out.println("Quantidade de palavras da Lista Tres: " + threeLength);
        
        //Escolhe as palavras do Array de modo aleatorio
        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);
        
        //Coloca todas as listas em um objeto String
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];
        
        System.out.println("\n" + phrase + " Sao componentes da linguagem Java");
    }
}
