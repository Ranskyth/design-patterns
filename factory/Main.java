package factory;

public class Main {
    public static void main(){
        Ninja n1 = FabricaNinja.criarNinja("madara");
        n1.fabricar();
    }
    
}
