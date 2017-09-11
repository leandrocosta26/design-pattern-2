package br.com.alura.dp.bridge;

import java.io.IOException;
import java.net.URL;

public class GoogleMaps implements Maps {

    @Override
    public String getMaps() throws IOException {
        String url = "http://maps.google.com?q=rua marte";
        URL google = new URL(url);
        return google.openStream().toString();
    }
}
