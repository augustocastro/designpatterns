package flyweight.exemplo1;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.ws.util.StringUtils;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	public Nota getNota(String nome)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Nota nota = NotasMusicais.notas.get(nome);
		if (nota == null) {
			Class<?> classeCarregada = Class.forName("flyweight.exemplo1." + StringUtils.capitalize(nome));
			Nota notaInstanciada = (Nota) classeCarregada.newInstance();
			NotasMusicais.notas.put(nome, notaInstanciada);
		}
		return NotasMusicais.notas.get(nome);
	}

}
