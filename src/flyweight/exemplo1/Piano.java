package flyweight.exemplo1;

import java.util.List;
import java.util.stream.Collectors;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> musica) {
		String musicaEmNotas = musica.stream()
				.map(nota -> nota.simbolo()).collect(Collectors.joining(" "));
		
		new Player().play(musicaEmNotas);
	}

}
