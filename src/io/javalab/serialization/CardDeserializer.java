package io.javalab.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CardDeserializer {
    public static void main(String[] args) {
        Card card=null;
        try(
                FileInputStream fileInputStream=new FileInputStream("card.ser");
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            ){
            card=(Card)objectInputStream.readObject();
            System.out.println(card);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
