package io.javalab.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardSerializer {
    public static void main(String[] args) {
        Card card = new Card(23452634, "Priyo", true, 12000.90);

        try(
                FileOutputStream fileOutputStream = new FileOutputStream("card.ser");
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
                ) {
            objectOutputStream.writeObject(card);
            System.out.println("Card serialized!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
