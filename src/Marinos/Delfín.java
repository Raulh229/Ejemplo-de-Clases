package Marinos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Delfín extends Marinos {
    private boolean sabeTrucos;
    private boolean obedeceOrdenes;

    Delfín(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión,
            boolean sabeTrucos, boolean obedeceOrdenes) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
        this.sabeTrucos = sabeTrucos;
        this.obedeceOrdenes = obedeceOrdenes;
    }

    protected void hazTruco() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Marinos/Delfin.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException f) {
            System.out.println("No encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void setSabeTrucos(boolean sabeTrucos) {
        this.sabeTrucos = sabeTrucos;
    }

    protected boolean getSabeTrucos() {
        return this.sabeTrucos;
    }

    protected void setObedeceOrdenes(boolean obedeceOrdenes) {
        this.obedeceOrdenes = obedeceOrdenes;
    }

    protected boolean getObedeceOrdenes() {
        return this.obedeceOrdenes;
    }
}