
// Include input and output streams
import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        // Creates file writer
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        
        // Writes these two lines to the file
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        
        // Writes i to the tables
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        // Closes the table, body, and html file
        file.write("</table>\n</body>\n</html>");
        file.close();
        
        // Creates file reader
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        
        // Writes to console
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // Closes reader
        reader.close();
    }
}
