import java.util.ArrayList;

public class Boite<T> implements Conteneur<T> {
    private ArrayList<T> elements = new ArrayList<>();

    @Override
    public void ajouter(T element) {
        elements.add(element);
    }

    @Override
    public T retirer() {
        if (estVide()) {
            return null;
        }
        return elements.remove(0); // Retire le premier élément
    }

    @Override
    public boolean estVide() {
        return elements.isEmpty();
    }

    @Override
    public int taille() {
        return elements.size();
    }

    // Pour afficher le contenu facilement
    public void afficher() {
        System.out.print("[");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i));
            if (i < elements.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}