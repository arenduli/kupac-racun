import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopisRacuna {
    private List<Racun> racuni;

    public PopisRacuna() {
        this.racuni = new ArrayList<>();
    }

    // dodaje novi račun u popis
    public void dodajRacun(Racun racun) {
        racuni.add(racun);
    }

    // kreira tekstualnu datoteku i upisuje račune u nju
    public void spremi(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Racun racun : racuni) {
                writer.write("Kupac: " + racun.getKupac().ucitajPodatke() + "\n");
                writer.write("Blagajnik: " + racun.getBlagajnik().ucitajPodatke() + "\n");
                writer.write("Saldo na računu: " + racun.getSaldoNaRacunu() + "\n");
                writer.write("--------------------------------------------------\n");
            }
        } catch (IOException e) {
            System.out.println("Greška pri upisu podataka u datoteku: " + e.getMessage());
        }
    }
}
