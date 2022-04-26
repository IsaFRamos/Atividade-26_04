import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        String file = "arquivo.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
            System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("ERRO!");
            e.printStackTrace();
        }

        System.out.println("O sistema foi finalizado.");
    }
}
