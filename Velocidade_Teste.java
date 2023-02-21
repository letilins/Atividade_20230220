import java.util.Scanner;

class Velocidade_Teste {
   
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Infome a marca do carro?");
        String Marca = entrada.nextLine();
        
        System.out.println("Infome o modelo do carro?");
        String Modelo = entrada.nextLine();
        
        System.out.println("Infome o ano do carro?");
        int AnoFabricacao = entrada.nextInt();
       
        System.out.println("Infome a Velocidade atual do carro?");
        int VelocidadeAtual = entrada.nextInt();
        
        Carro Carro = new Carro(Marca, Modelo, AnoFabricacao, VelocidadeAtual);

        Carro.getMarca();
        Carro.getModelo();
        Carro.getAnoFabricacao();
        Carro.Acelerar();
        Carro.Frear();
        
        Carro.imprimirInformacoes();

        entrada.close();
    }
   
        
        

        
        
} 


  
