package bridge.exmeplo1;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		String googleMaps = "http://maps.googlr.com.br/maps?q=" + rua;
		URL url;
		try {
			url = new URL(googleMaps);
			InputStream openStream = url.openStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
