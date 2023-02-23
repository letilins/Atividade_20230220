
class Carro{
    String Marca;
    String Modelo;
    int AnoFabricacao;
    int VelocidadeAtual = 0;

    public Carro(String Marca, String Modelo, int AnoFabricacao, int VelocidadeAtual) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.AnoFabricacao = AnoFabricacao;
        this.VelocidadeAtual = VelocidadeAtual;
    }

	
    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getAnoFabricacao(){
        return AnoFabricacao;
    }

    public void Acelerar(){
        VelocidadeAtual += 10;
    }

    public void Frear(){
         VelocidadeAtual -= 10;
    } 


public void imprimirInformacoes() {
            System.out.println("A Marca do carro é " + Marca );
            System.out.println("O modelo do carro é " + Modelo );
            System.out.println("O ano da fabricação do carro é " + AnoFabricacao );
            System.out.println("A velocidade do meu carro é:" + VelocidadeAtual + " Km" );   

            
      
        }
}

