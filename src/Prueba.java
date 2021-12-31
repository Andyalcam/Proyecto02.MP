import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) throws IOException {

        int opc;

        boolean rep = false;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("*** BIENVENIDO ***");
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("Ingrese el número de la opción deseada.");
            opc = in.nextInt();
            if(opc == 1){
                encriptacion();
            }else if(opc == 2){
                desencriptacion();
            }else{
                System.out.println("\nEscribe 1 o 2");
                rep = true;
            }
        }while(rep);
    }

    public static void encriptacion() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la ruta completa del archivo de texto que se ocultará");
        String file = in.nextLine();

        String message = readMessage(file);

        System.out.println("Ingresa la ruta completa de la imagen que se va a encriptar");

        String image = in.nextLine();

        BufferedImage bufferedImage = ImageIO.read(new File(image));

        if(((bufferedImage.getWidth()*bufferedImage.getHeight())/8) -1 < message.length()){
            System.out.println("Ingresa un texto mas pequeño o una imagen de mayor dimensión");
        }else {
            BufferedImage bufferedImageARGB = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            String binary = encriptar(message);
            int cont = 0;

            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    Color color = new Color(bufferedImage.getRGB(i, j));
                    Color newColor;
                    if (cont == binary.length()) {
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 253);
                    } else if (cont < binary.length()) {
                        int aux = Integer.parseInt(binary.substring(cont, cont + 1));
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255 - aux);
                    } else {
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                    }
                    bufferedImageARGB.setRGB(i, j, newColor.getRGB());
                    cont++;
                }
            }

            File encrypt = new File("C:/Users/Poncho Mondragon/Desktop/ImagenEncriptada.png");

            ImageIO.write(bufferedImageARGB, "png", encrypt);
        }
    }

    public static String encriptar(String message){

        byte[] bytes = message.substring(0,message.length()-1).getBytes(StandardCharsets.US_ASCII);

        java.util.List<String> listASCII = new ArrayList<String>();

        for (byte i : bytes) {
            listASCII.add(Integer.toBinaryString(i));
        }

        return binario(listASCII);

    }


    public static String binario(List<String> list){

        StringBuilder message = new StringBuilder();
        for (String ascii : list) {
            int aux = 8-ascii.length();
            for(int i = 0; i < aux; i++) {
                ascii = "0"+ascii;
            }
            message.append(ascii);
        }
        return message.toString();


        /*try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Poncho Mondragon/Desktop/MensajeOcultoEncriptado.txt"));
            bufferedWriter.write(message.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public static void desencriptacion() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la ruta completa de la imagen");
        String image = in.nextLine();
        BufferedImage bufferedImage = ImageIO.read(new File(image));
        String message = "";

        for (int i = 0; i < 200; i++) {
                Color color = new Color(bufferedImage.getRGB(0,i), true);
                if(color.getAlpha() == 253)
                    break;
                message += 255- color.getAlpha();
                if((i+1) % 8 == 0 )
                    message += " ";

        }

        desencriptar(message);


    }

    public static void desencriptar(String message){
        String[] binary = message.split(" ");
        System.out.println(convertBinary(binary));
    }

    public static String convertBinary(String[] arr){
        StringBuilder message = new StringBuilder();

        for(String character : arr){

            message.append((char) Integer.parseInt(character, 2));
        }


        return message.toString();
    }


    public static String readMessage(String name){
        String message = "";
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(name))){
            while((line = reader.readLine()) != null){
                message += line + " ";
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

}