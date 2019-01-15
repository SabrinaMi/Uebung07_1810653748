import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aufgabe2
{
    public static void main(String[] args)
    {

        try
        {
            int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Gibt bitte eine ganze Zahl ein."));
            int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib eine weitere ganze Zahl ein."));

            int summe = zahl1 / zahl2;

            System.out.println(summe);

        } catch (ArithmeticException ex)
        {
            ex.printStackTrace(); // wird mir eine FEhler gemeldet und dann genau gezeigt wo dieser Fehler ist

        } catch (NumberFormatException ex)
        {
            ex.printStackTrace();
        } catch (NullPointerException ex)
        {
            ex.printStackTrace();
        } catch (RuntimeException ex)
        {
            ex.printStackTrace();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

}
