package factory;

public class FabricaNinja {
    public static Ninja criarNinja(String ninja){

        if(ninja.equalsIgnoreCase("itachi")){
            return new Itachi();
        }

        if(ninja.equalsIgnoreCase("madara")){
            return new Madara();
        }

        throw new UnsupportedOperationException("tipo de ninja invalido");

    }
}
