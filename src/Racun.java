public class Racun {

    private Kupac kupac;
    private Blagajnik blagajnik;
    private double ukupanIznosRacuna;
    private double saldoNaRacunu;

    public Racun(Kupac kupac, Blagajnik blagajnik, double ukupanIznosRacuna) {
        this.kupac = kupac;
        this.blagajnik = blagajnik;
        this.ukupanIznosRacuna = ukupanIznosRacuna;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public Blagajnik getBlagajnik() {
        return blagajnik;
    }

    public double getSaldoNaRacunu() {
        return saldoNaRacunu;
    }
}
