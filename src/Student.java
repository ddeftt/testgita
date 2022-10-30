public class Student {
    public String imie;
    public String nick;
    public String Nrindeksu;
    public String nazwisko;
    public String email;

public void przedstawSie() {
    System.out.println("Nazywam się " + imie + " " + nazwisko);
}

public void zalogujSie() {
    System.out.println("Loguje sie za pomocą " + nick);
}

public void  podajNrIndeksu() {
    System.out.println("Mój numer indeksu to: " + Nrindeksu);
}

}
