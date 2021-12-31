import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pruebas{

    /*public static void main(String[] args) {
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
				encriptar();
            }else if(opc == 2){
                desencriptar();
            }else{
                System.out.println("\nEscribe 1 o 2");
                rep = true;
            }
        }while(rep);
    }*/


    public static void main(String[] args) throws IOException {
        /*BufferedImage bufferedImage = null;

        File file = new File("C:/Users/Poncho Mondragon/Desktop/Rojo.jpg");

        bufferedImage = ImageIO.read(file);

        System.out.println("Width: " + bufferedImage.getWidth() + " Heigth: " + bufferedImage.getHeight());

        bufferedImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);

        Color c = new Color(bufferedImage.getRGB(0,0));

        System.out.println("Color: " + c.getBlue());*/


        //InputStream inputStream = new FileInputStream("C:/Users/Poncho Mondragon/Desktop/Rojo.jpg"); //Archivo jpg de la imagen
        //ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);

        /*BufferedImage bufferedImage = ImageIO.read(new File("C:/Users/Poncho Mondragon/Desktop/Rojo.jpg"));
        System.out.println("Width: " + bufferedImage.getWidth() + " Heigth: " + bufferedImage.getHeight());

        BufferedImage bufferedImage1 = new BufferedImage(98, 40, BufferedImage.TYPE_4BYTE_ABGR);


        int cont = 0;
        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                Color color = new Color(bufferedImage.getRGB(i,j));
                Color newColor;
                if(cont % 2 != 0){
                    newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 0);
                }else{
                    newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                }
                System.out.println(newColor.getRGB());
                bufferedImage1.setRGB(i,j, newColor.getRGB());
                cont++;
            }
        }
        int pixel = bufferedImage1.getRGB(0,1);

        int alpha = (pixel >> 24) & 0xff;

        System.out.println("Color: " + alpha);*/

        /*int p = bufferedImage.getRGB(0,0);
        int a = 0;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;

        //p =

        System.out.println("a: " + a + " r: " + r + " g: " + g + " b: " + b);
        System.out.println("p: " + p);
        p = (a<<24) | (r<<16) | (g<<8) | b;
        System.out.println("P: " + p);
        bufferedImage.setRGB(0,0, p);
        System.out.println(bufferedImage.getRGB(0,0));*/


        // Color oa = new Color(bufferedImage.getRGB(0,1), true);

        /*int pixel = oa.getRGB();

        int alpha = (pixel >> 24) & 0xff;

        System.out.println("Alfa: " + alpha);*/



        /*File file = new File("C:/Users/Poncho Mondragon/Desktop/RojoEncriptado.png");

        ImageIO.write(bufferedImage1, "png", file);*/

        /*InputStream inputStream = new FileInputStream("C:/Users/Poncho Mondragon/Desktop/RojoEncriptado.jpg"); //Archivo jpg de la imagen
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
        BufferedImage bufferedImage = ImageIO.read(imageInputStream);

        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                Color color = new Color(bufferedImage.getRGB(i,j), true);
                System.out.println(color.getAlpha());
            }
        }*/



       /* Color color = new Color(bufferedImage.getRGB(0,0));
        Color newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 240);
        Color colorcito = new Color(newColor.getRGB(), true);

        int pixel = colorcito.getRGB();

        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel >> 0) & 0xff;



        System.out.println("Color : " + color.getRGB() + " New Color: " + newColor.getRGB() + " Colorcito alpha: " + alpha);*/





        /*for(int i = 0; i < bufferedImage.getWidth() ; i++) {
            for (int j = 0; j < bufferedImage.getHeight(); j++) {
                Color color = new Color(bufferedImage.getRGB(i,j));
                Color newColor = new Color(65, 7, 62);
                bufferedImage.setRGB(i,j,newColor.getRGB());
            }
        }

        File file = new File("C:/Users/Poncho Mondragon/Desktop/MoradoEncriptado.jpg");

        ImageIO.write(bufferedImage, "jpg", file);*/

        desencriptar();

    }

    /*public static void main(String args[])throws IOException{
        BufferedImage img = null;
        File f = null;

        //read image
        try{
            f = new File("C:/Users/Poncho Mondragon/Desktop/Chanekito.jpg");
            img = ImageIO.read(f);
        }catch(IOException e){
            System.out.println(e);
        }

        //get image width and height
        int width = img.getWidth();
        int height = img.getHeight();

        System.out.println("Color: " + img.getRGB(0,0));

        //convert to grayscale
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int p = img.getRGB(x,y);

                int a = 0;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;

                //calculate average
                int avg = (r+g+b)/3;

                //replace RGB value with avg
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;

                img.setRGB(x, y, p);
            }
        }

        System.out.println("Oa: " + img.getRGB(0,0));

        //write image
        try{
            f = new File("C:/Users/Poncho Mondragon/Desktop/Output.jpg");
            ImageIO.write(img, "jpg", f);
        }catch(IOException e){
            System.out.println(e);
        }
    }//main() ends here*/

    public static void encriptar(){

        System.out.println("Ingresa la ruta completa del archivo que contiene el mensaje oculto");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        String mensaje = Prueba.readMessage(file);

        byte[] bytes = mensaje.getBytes(StandardCharsets.US_ASCII);

        java.util.List<String> listASCII = new ArrayList<String>();

        for (byte i : bytes) {
            listASCII.add(Integer.toBinaryString(i));
        }

        binario(listASCII);

    }


    public static void binario(List<String> list){
        StringBuilder message = new StringBuilder();
        for(String ascii : list) {
            int aux = 8 - ascii.length();
            for(int i = 0; i < aux; i++) {
                ascii = "0"+ascii;
            }
            message.append(ascii).append(" ");
        }
        System.out.println(message.toString());

        /*try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Poncho Mondragon/Desktop/MensajeOcultoEncriptado.txt"));
            bufferedWriter.write(message.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public static void desencriptar(){
        System.out.println("Ingresa el mensaje a desencriptar");
        Scanner scanner = new Scanner(System.in);
        String mensaje = scanner.nextLine();

        String[] binary = mensaje.split(" ");

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
