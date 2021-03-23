import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server
{
    public static String getLineFromKeyboard(String TextDeAfisat)
    {
        System.out.print(TextDeAfisat);

        Scanner keyb =  new Scanner(System.in);
        return keyb.nextLine();


    }

    public static int getIntFromKeyboard(String TextDeAfisat)
    {
        System.out.print(TextDeAfisat);

        Scanner keyb =  new Scanner(System.in);
        return keyb.nextInt();
    }

    public static float getFloatFromKeyboard(String TextDeAfisat)
    {
        System.out.print(TextDeAfisat);

        Scanner keyb =  new Scanner(System.in);
        return keyb.nextFloat();
    }

    public static void main()
    {


    }
    public static void main (String[] args)
    {
        int Nr_clienti;


        Nr_clienti = getIntFromKeyboard("Introduceti numarul de angajati : ");

        if (Nr_clienti < 1)
        {
            do
            {
                Nr_clienti = getIntFromKeyboard("Numarul de angajati introdus este prea mic. Introduceti alt numar: ");
            }
            while (Nr_clienti<= 1);
        }



        List<Client>lista_clienti = new ArrayList<>();

        System.out.println("\nIntroduceti datele clientilor:");
        for (int i = 0; i<Nr_clienti; i++)
        {
            Client Client = new Client();

            System.out.println("\n Clientul" + (i + 1));
            Client.setNume(getLineFromKeyboard("Nume: "));
            Client.setGen(getLineFromKeyboard("Gen: "));
            Client.setVarsta(getIntFromKeyboard("Varsta: "));
            Client.setCnp(getFloatFromKeyboard("CNP: "));

            lista_clienti.add(Client);
        }
        for(int i=0; i < lista_clienti.size(); i++)
        {
            System.out.println(lista_clienti.get(i) + ", ");
        }
    }
}
