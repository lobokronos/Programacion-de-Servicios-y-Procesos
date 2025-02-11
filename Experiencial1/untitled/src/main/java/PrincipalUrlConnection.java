import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class PrincipalUrlConnection {

    public static void main(String[] args) {

        URL url = null;
        URLConnection urlCon = null;
        try {
            url = new URL("http://vbo.damiansu.com/saludo.html");
            urlCon = url.openConnection();

            BufferedReader in;
            InputStream inputStream = urlCon.getInputStream();
            in = new BufferedReader(new InputStreamReader(inputStream));

            String linea = null;
            while ((linea = in.readLine()) != null) {
                if (linea.contains("h1")) {
                    System.out.println(linea);
                }
            }
            in.close();
        } catch (Exception e) {

        }
    }

}
