public class EncryptionModule2 {
public void encodeBasedOnNetworkAndDatabase() throws IOException
    {
        URL url;
        url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
        InputStream in;
        in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        int c;
        c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    
    }
}