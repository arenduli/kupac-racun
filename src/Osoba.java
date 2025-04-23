public class Osoba {

    private String ime;
    private String prezime;
    private String OIB;

    public Osoba(String ime, String prezime, String OIB) {
        this.ime = ime;
        this.prezime = prezime;
        this.OIB = OIB;
    }

    // postavlja i dohvaca podatke o osobi
    public String ucitajPodatke() {
        return "Ime: " + ime + ", Prezime: " + prezime + ", OIB: " + OIB;
    }

    // ispisuje podatke o osobi
    public void prikaziPodatke() {
        System.out.println(ucitajPodatke());
    }
}
