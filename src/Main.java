import fr.rpg.monde.Monde;

public class Main {

    public static void main(String[] args) {
        Monde.combat(Monde.personnageFactory(),Monde.monstreFactory());

    }

}
