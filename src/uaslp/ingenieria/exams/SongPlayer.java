package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {

    public void play(Song song) {
        Iterator<Nota> notas = song.getSongIterator();

        Instrumento instrumento = new Instrumento(notas);

        while (notas.hasNext()) {
            Nota nota = notas.next();

            instrumento.tocar(notas);

        }

    }

}
