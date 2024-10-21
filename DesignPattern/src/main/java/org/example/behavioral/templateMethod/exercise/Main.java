package org.example.behavioral.templateMethod.exercise;

public class Main {
    public static void main(String[] args) throws Exception{
        User user=new User("234321451","Mohamed Saad-eldeen"
                ,"mohamedsaaad16@gmail.com","18069 Ismail Yasin El-Obour 9th district");

        MessageService jsonFormatter=new MessageService(new JsonFormatter());
        MessageService xmlFormatter=new MessageService(new XMLFormatter());
        MessageService plainTextFormatter=new MessageService(new PlainTextFormatter());

        System.out.println("====================Json Format================================");
        jsonFormatter.printMessage(user);
        System.out.println();
        System.out.println("====================XML Format================================");
        xmlFormatter.printMessage(user);
        System.out.println();
        System.out.println("====================Plain Text Format================================");
        plainTextFormatter.printMessage(user);

    }
}
