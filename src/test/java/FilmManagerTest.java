import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void addFilm() {
        String film1 = "Harry Potter 1";
        String film2 = "Harry Potter 2";
        String film3 = "Harry Potter 3";
        String film4 = "Harry Potter 4";
        String film5 = "Harry Potter 5";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {"Harry Potter 1", "Harry Potter 2", "Harry Potter 3", "Harry Potter 4", "Harry Potter 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void maxLimit() {
        String film1 = "Harry Potter 1";
        String film2 = "Harry Potter 2";
        String film3 = "Harry Potter 3";
        String film4 = "Harry Potter 4";
        String film5 = "Harry Potter 5";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {"Harry Potter 5", "Harry Potter 4", "Harry Potter 3", "Harry Potter 2", "Harry Potter 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxLimitIfWantChooseAmount() {
        String film1 = "Harry Potter 1";
        String film2 = "Harry Potter 2";
        String film3 = "Harry Potter 3";
        String film4 = "Harry Potter 4";
        String film5 = "Harry Potter 5";
        String film6 = "Harry Potter 6";
        String film7 = "Harry Potter 7";

        FilmManager manager = new FilmManager(2);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        String[] expected = {"Harry Potter 7", "Harry Potter 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

