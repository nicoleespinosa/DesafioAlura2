import br.com.alura.soundwave.classes.MinhasPreferidas;
import br.com.alura.soundwave.classes.Musica;
import br.com.alura.soundwave.classes.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("She");
        musica1.setArtista("Tyler, The Creator");
        musica1.setAlbum("Goblin");
        musica1.setGenero("Hip Hop");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("PodPah");
        podcast1.setHost("Igor Cavalari e Thiago Marques");


        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);

    }
}