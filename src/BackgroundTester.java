import biuoop.DrawSurface;

import java.awt.*;
import java.io.*;

public class BackgroundTester {

    public static void main(String[] args) {
        BufferedReader reader=null;
        try{
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("read.txt")));
            String line;
            PrintWriter is = null;
            is = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Ass.txt")));
            while((line = reader.readLine())!=null){
                printIt(line,is);
                if(line.equals("")){
                    System.out.println("works");
                }
                System.out.println(line);
            }
            if (is!= null){
                is.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (reader!= null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter is = null;
        try{
            is = new PrintWriter(new OutputStreamWriter(new FileOutputStream("New.txt")));
            is.print("Boom");
            is.println("223");
            is.println("33");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        is.close();


    }
    public static void printIt(String str, PrintWriter p){
        p.println(str);
    }

    /**
     * @param d .
     */
    private static void drawOn(DrawSurface d) {
        int startX = 30;
        int startY = 45;
        int width = 25;
        int height = 20;
        int gap1 = 25;
        int gap = 20;
        Color back = new Color(0xFFDBFFE7, true);
        back.getRGB();
        d.setColor(back);
        d.fillRectangle(0, 0, 800, 600);
        d.setColor(Color.BLACK);
        // Head
        d.fillRectangle(startX + (gap1 * 1), startY + (gap * 5), width * 4, height);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 4), width * 2, height);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 3), width * 4, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 4), width * 3, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 5), width * 4, height);
        d.fillRectangle(startX + (gap1 * 1), startY + (gap * 6), width, height);
        d.fillRectangle(startX + (gap1 * 2), startY + (gap * 7), width, height);
        d.fillRectangle(startX + (gap1 * 3), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 9), width, height);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 10), width, height);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 17), startY + (gap * 6), width, height);
        d.fillRectangle(startX + (gap1 * 16), startY + (gap * 7), width, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 8), width * 2, height);
        d.fillRectangle(startX + (gap1 * 13), startY + (gap * 9), width, height);
        d.fillRectangle(startX + (gap1 * 12), startY + (gap * 10), width, height);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 11), width * 6, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 8), width, height);
        // Body
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 12), width * 2, height);
        d.fillRectangle(startX + (gap1 * 3), startY + (gap * 13), width, height * 2);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 14), width, height);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 13), width, height * 7);
        d.fillRectangle(startX + (gap1 * 13), startY + (gap * 13), width, height * 7);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 20), width * 2, height);
        d.fillRectangle(startX + (gap1 * 9), startY + (gap * 19), width * 2, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 20), width * 2, height);
        d.fillRectangle(startX + (gap1 * 13), startY + (gap * 11), width, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 12), width, height);
        d.fillRectangle(startX + (gap1 * 15), startY + (gap * 13), width, height * 3);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 16), width, height);
        // Coloring with shades of green
        Color green3 = new Color(0xFFA5DF81, true);
        green3.getRGB();
        d.setColor(green3);
        d.fillRectangle(startX + (gap1 * 2), startY + (gap * 6), width, height);
        d.fillRectangle(startX + (gap1 * 3), startY + (gap * 7), width, height);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 9), width, height);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 5), width * 9, height * 4);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 4), width * 3, height);
        d.fillRectangle(startX + (gap1 * 16), startY + (gap * 6), width, height);
        Color green1 = new Color(0xFF1AA14F, true);
        green1.getRGB();
        d.setColor(green1);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 5), width, height);
        d.fillRectangle(startX + (gap1 * 8), startY + (gap * 4), width, height);
        d.fillRectangle(startX + (gap1 * 10), startY + (gap * 4), width, height);
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 13), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 15), startY + (gap * 7), width, height);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 10), width * 6, height);
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 13), width, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 19), width, height);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 19), width, height);
        Color green2 = new Color(0xFF82D856, true);
        green2.getRGB();
        d.setColor(green2);
        d.fillRectangle(startX + (gap1 * 8), startY + (gap * 19), width, height);
        d.fillRectangle(startX + (gap1 * 12), startY + (gap * 19), width, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 14), width, height * 2);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 9), width * 7, height);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 5), width, height * 3);
        d.fillRectangle(startX + (gap1 * 9), startY + (gap * 5), width, height * 3);
        d.fillRectangle(startX + (gap1 * 3), startY + (gap * 6), width * 2, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 6), width * 2, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 7), width * 2, height);
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 7), width, height);
        d.fillRectangle(startX + (gap1 * 12), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 7), width, height);
        // Eyes
        d.setColor(Color.BLACK);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 8), width, height);
        d.fillRectangle(startX + (gap1 * 11), startY + (gap * 8), width, height);
        d.setColor(Color.WHITE);
        d.fillRectangle(startX + (gap1 * 7), startY + (gap * 12), width * 6, height * 7);
        d.fillRectangle(startX + (gap1 * 5), startY + (gap * 13), width, height);
        d.fillRectangle(startX + (gap1 * 6), startY + (gap * 12), width, height);
        d.fillRectangle(startX + (gap1 * 14), startY + (gap * 13), width, height);
        Color brown1 = new Color(0xFFB16939, true);
        brown1.getRGB();
        d.setColor(brown1);
        d.fillRectangle(startX + (gap1 * 8), startY + (gap * 13), width * 3, height * 6);
        d.fillRectangle(startX + (gap1 * 8), startY + (gap * 12), width, height);
        d.fillRectangle(startX + (gap1 * 10), startY + (gap * 12), width, height);
        Color brown2 = new Color(0xFF65321B, true);
        brown2.getRGB();
        d.setColor(brown2);
        d.fillRectangle(startX + (gap1 * 4), startY + (gap * 14), width, height * 6);
        d.fillRectangle(startX + (gap1 * 8), startY + (gap * 16), width * 3, height * 2);
        Color brown3 = new Color(0xFFFDF1C8, true);
        brown3.getRGB();
        d.setColor(brown3);
        d.fillRectangle(startX + (gap1 * 12), startY + (gap * 11), width, height * 7);
        d.fillRectangle(startX + (gap1 * 13), startY + (gap * 12), width, height);
        d.setColor(Color.BLACK);
        d.drawText(500, 220, "Another level you shall conquer,", 20);
        d.drawText(550, 260, "Padawan.", 23);
    }

}


