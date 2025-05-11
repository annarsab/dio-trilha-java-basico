public class Metodos {

    public double somar (int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ...;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }

    //throws Excecption indica que o método ao ser utilizado poderá gerar uma exceção
    public double dividir (int dividendo, int divisor) throws Exception{
    }

    //este método não pode ser visto por outras classes
    private void metodo Privado(){

    }

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }

    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }

    public void gravaCliente (String nome, String cpf){
        //este método tem a finalidade de gravar informações do cliente
        //por que não criar um objeto cliente e passar como parâmetro?
        //exemplo abaixo
    }

    public void gravarCliente (Cliente cliente){

    }

    //ou   

    public void gravar (Cliente cliente){}
}
