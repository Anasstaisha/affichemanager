public class FilmManager {
    private String[] films = new String[0];
    private final int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        int i = 0;
        while (i < films.length) {
            tmp[i] = films[i];
            i++;
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int filmsAmount = Math.min(films.length, limit);
        String[] tmp = new String[filmsAmount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
