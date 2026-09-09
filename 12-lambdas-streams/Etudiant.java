public class Etudiant{
	private String nom;
	private int age;
	private double moyenne;
	private String filiere;
	public String getNom(){
		return nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public double getMoyenne(){
		return moyenne;
	}
	public void setMoyenne(double moyenne){
		this.moyenne = moyenne;
	}
	public String getFiliere(){
		return filiere;
	}
	public void setFiliere(String filiere){
		this.filiere = filiere;
	}
	@Override
	public String toString(){
		return "nom : ["+nom+"], age : ["+age+"], moyenne : ["+moyenne+"], filiere : ["+filiere+"]";
	}
}