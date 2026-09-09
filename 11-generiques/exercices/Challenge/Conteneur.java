public interface Conteneur<T>{
	void ajouter(T element);
	T retirer();
	boolean estVide();
	int taille();
}