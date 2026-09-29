public class Config {
    private static Config instance;

    private Config(){
        System.out.println("Configuração do sistema inicializada");
    }

    public static synchronized Config getInstance(){
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    public void Mensagem(){
        System.out.println("Hello Mensagem, eba :)");
    }
}