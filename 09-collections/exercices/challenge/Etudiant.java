public class Etudiant{
	private String nom;
	private int age;
	private String classe;
	public Etudiant(String nom, int age, String classe){
		this.nom = nom;
		this.age = age;
		this.classe = classe;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getClasse(){
		return this.classe;
	}
	public void setClasse(String classe){
		this.classe = classe;
	}
	public void afficherInfos(){
		System.out.println("le nom est : "+ nom+" age est "+age+"classe est "+classe);
	}
}
	