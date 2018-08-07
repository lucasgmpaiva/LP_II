
/**
 * Escreva a descrição da classe Celular aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Celular
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int saldo;
    

    /**
     * COnstrutor para objetos da classe Celular
     */
    public Celular()
    {
        // inicializa variáveis de instância
        this.saldo = 1000;
    }
    
    public Celular(int valor){
        if(valor >=0){
            this.saldo = valor;
        } else {
            System.out.println("Valor informado para saldo é inválido! Portanto, estamos definindo 0.");
            this.saldo = 0;
        }
            
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int getSaldo()
    {
        // ponha seu código aqui
        return this.saldo;
    }
    
    public void setSaldo(int novoSaldo){
            this.saldo = novoSaldo;
    }
    
    public void topUp(int valor){
        if(valor > 0){
            this.saldo+=valor;
        } else {
            System.out.println("Valor de recarga inválido!");
        }
    }
    public void utilizarCelular(int valor){
        if(valor <= this.saldo){        
           this.saldo-=valor;
        } else {
            System.out.println("Você não tem créditos suficientes!");
        }
    }
   
}
