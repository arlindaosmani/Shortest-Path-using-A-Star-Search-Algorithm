package Rruga_e_shkurter;
import java.awt.Color;
import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;


public class Map extends JPanel {
    Image img = Toolkit.getDefaultToolkit().getImage("src\\Rruga_e_shkurter\\harta.png");
    AstarSearchAlgo obj = new AstarSearchAlgo();

    public Map() {
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Rruga Me e Shkurter"+"-Sipas Algoritmit A*(A-Star)");
        f.setSize(610, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d= ( Graphics2D)g;
        g2d.setStroke(new BasicStroke(3f));
        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
        g.setColor(Color.BLACK);
        g.drawImage(img, 0, 0, 600, 590, this);
        Color bl = new Color(248, 0, 0);
        Color lg = new Color(0, 128, 64);
        g.setFont(new Font("Times New Roman", Font.BOLD,12));

        if (obj.n1) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Podujeve", 390, 185);
        g.fillOval(410, 190, 5, 5);
        if (obj.n2) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Prishtine", 410, 250);
        g.fillOval(430, 255, 5, 5);
        if (obj.n3) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Mitrovice", 295, 135);
        g.fillOval(315, 140, 5, 5);
        if (obj.n4) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Leposaviq", 240, 80);
        g.fillOval(270, 85, 5, 5);
        if (obj.n5) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Zvecan", 250, 140);
        g.fillOval(270,145,5,5);
        if (obj.n6) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Zubin", 190, 155);
        g.drawString("Potok", 190, 165);
        g.fillOval(205,165,5,5);
        if (obj.n7) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Vushtrri", 300, 200);
        g.fillOval(320,205,5,5);
        if (obj.n8) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Skenderaj", 220, 220);
        g.fillOval(250,225,5,5);
        if (obj.n9) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Istog", 150,220);
        g.fillOval(160,225,5,5);
        if (obj.n10) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Obiliq", 330, 240);
        g.fillOval(350,245,5,5);
        if (obj.n11) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Drenas", 270,270);
        g.fillOval(290,275,5,5);
        if (obj.n12) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Kamenice", 515, 280);
        g.fillOval(535,285,5,5);
        if (obj.n13) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Novoberde", 440, 290);
        g.fillOval(470,295,5,5);
        if (obj.n14) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("  Fushe", 325, 270);
        g.drawString("  Kosove", 325, 280);
        g.fillOval(345,285,5,5);
        if (obj.n15) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Lipjan", 350,325);
        g.fillOval(370,330,5,5);
        if (obj.n16) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Malisheve", 220, 325);
        g.fillOval(240,330,5,5);
        if (obj.n17) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Kline", 180,270);
        g.fillOval(190,275,5,5);
        if (obj.n18) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Peje", 64,250);
        g.fillOval(74,255,5,5);
        if (obj.n19) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Decan", 70,305);
        g.fillOval(90,310,5,5);
        if (obj.n20) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Gjakove", 100,375);
        g.fillOval(120,380,5,5);
        if (obj.n21) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Rahovec", 180, 370);
        g.fillOval(200,375,5,5);
        if (obj.n22) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Prizren", 220,450);
        g.fillOval(240,455,5,5);
        if (obj.n23) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Shterpce", 300,430);
        g.fillOval(320,435,5,5);
        if (obj.n24) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Ferizaj", 370,380);
        g.fillOval(390,385,5,5);
        if (obj.n25) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Kacanik", 390,430);
        g.fillOval(410,435,5,5);
        if (obj.n26) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Viti", 440,400);
        g.fillOval(440,405,5,5);
        if (obj.n27) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Shtime", 320, 355);
        g.fillOval(340,360,5,5);
        if (obj.n28) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Gjilan", 470,350);
        g.fillOval(480,355,5,5);
        if (obj.n29) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Suhareke", 264,390);
        g.fillOval(284,395,5,5);
        if (obj.n30) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Dragash", 200, 510);
        g.fillOval(220,515,5,5);
        if(obj.n31) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Lluzhan", 409 , 220);
        g.fillRect(429, 225, 5, 5);
        if(obj.n32) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Komoran", 350,300 );
        g.fillRect(370, 305, 5, 5);
        if(obj.n33) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Junik", 80,350 );
        g.fillRect(90, 355, 5, 5);
        if(obj.n34) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Rastavice", 110,320 );
        g.fillRect(130, 325, 5, 5);
        if(obj.n35) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Sllatine", 290,240 );
        g.fillRect(310, 245, 5, 5);
        if(obj.n36) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Duhel", 290,370 );
        g.fillRect(300, 375, 5, 5);
        if(obj.n37) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Kerpimeh", 350,140 );
        g.fillRect(370, 145, 5, 5);
        if(obj.n38) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Plave", 210,480 );
        g.fillRect(220, 485, 5, 5);
        if(obj.n39) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Xerxe", 160,390 );
        g.fillRect(170, 395, 5, 5);
        if(obj.n40) g.setColor(bl);
        else g.setColor(lg);
        g.drawString("Prevalle", 255,460 );
        g.fillRect(275, 465, 5, 5);

         if(obj.e1){//Leposaviq-Podujeve
             g.setColor(bl);
             g.drawLine(270, 85, 410, 190);
             g.drawString(obj.distancaQytete[1]+"",270/2+410/2,85/2+190/2);
         }
        if(obj.e2){//Leposaviq-Zvecan
            g.setColor(bl);
            g.drawLine(270, 85, 270,145);
            g.drawString(obj.distancaQytete[2]+"",270/2+270/2,85/2+145/2);
        }
        if(obj.e3){//Leposaviq-Mitrovice
            g.setColor(bl);
            g.drawLine(270, 85, 315, 140);
            g.drawString(obj.distancaQytete[3]+"",270/2+315/2,85/2+140/2);
        }
        if(obj.e4){//Zvecan-Mitrovice
            g.setColor(bl);
            g.drawLine(270,145, 315, 140);
            g.drawString(obj.distancaQytete[4]+"",270/2+315/2,145/2+140/2);
        }
        if(obj.e5) {//Zvecan-Zubin Potok
            g.setColor(bl);
            g.drawLine(270, 145, 205, 160);
            g.drawString(obj.distancaQytete[5] + "", 270 / 2 + 205 / 2, 145 / 2 + 160 / 2);
        }
        if(obj.e6){//Mitrovice-Zubin Potok
            g.setColor(bl);
            g.drawLine(315, 140, 205,160);
            g.drawString(obj.distancaQytete[6]+"",315/2+205/2,140/2+160/2);
        }
        if(obj.e7){//Mitrovice-Vushtrri
            g.setColor(bl);
            g.drawLine(315, 140, 320,205);
            g.drawString(obj.distancaQytete[7]+"",315/2+320/2,140/2+205/2);
         }
        if(obj.e9){//Mitrovice-Skenderaj
            g.setColor(bl);
            g.drawLine(315, 140, 250,225);
            g.drawString(obj.distancaQytete[9]+"",315/2+250/2,140/2+225/2);
           }
        if(obj.e10){//Zubin Potok-Skenderaj
            g.setColor(bl);
            g.drawLine(205,160, 250,225);
            g.drawString(obj.distancaQytete[10]+"",205/2+250/2,160/2+225/2);
        }
        if(obj.e11){//Zubin Potok-Istog
            g.setColor(bl);
            g.drawLine(205,160, 160,225);
            g.drawString(obj.distancaQytete[11]+"",205/2+160/2,160/2+225/2);
        }
        if(obj.e13){//Podujeve-Obiliq
            g.setColor(bl);
            g.drawLine(410, 190, 350,245);
            g.drawString(obj.distancaQytete[13]+"",410/2+350/2,190/2+245/2);
        }
        if(obj.e14){//Podujeve-Vushtrri
            g.setColor(bl);
            g.drawLine(410, 190, 320,205);
            g.drawString(obj.distancaQytete[14]+"",410/2+320/2,190/2+205/2);
        }
        if(obj.e15){//Vushtrri-Obiliq
            g.setColor(bl);
            g.drawLine(320,205, 350,245);
            g.drawString(obj.distancaQytete[15]+"",320/2+350/2,205/2+245/2);
        }
        if(obj.e16){//Vushtrri-Drenas
            g.setColor(bl);
            g.drawLine(320,205, 290,275);
            g.drawString(obj.distancaQytete[16]+"",320/2+290/2,205/2+275/2);
        }
        if(obj.e17){//Prishtine-Kamenice
            g.setColor(bl);
            g.drawLine(430, 255, 535,285);
            g.drawString(obj.distancaQytete[17]+"",430/2+535/2,255/2+285/2);
        }
        if(obj.e18){//Prishtine-Novoberde
            g.setColor(bl);
            g.drawLine(430, 255, 470,295);
            g.drawString(obj.distancaQytete[18]+"",430/2+470/2,255/2+295/2);
        }
        if(obj.e19){//Prishtine-FusheKosove
            g.setColor(bl);
            g.drawLine(430, 255, 345,285);
            g.drawString(obj.distancaQytete[19]+"",430/2+345/2,255/2+285/2);
        }
        if(obj.e20){//Prishtine-Obiliq
            g.setColor(bl);
            g.drawLine(430, 255, 350,245);
            g.drawString(obj.distancaQytete[20]+"",430/2+350/2,255/2+245/2);
        }
        if(obj.e21){//Prishtine-Lipjan
            g.setColor(bl);
            g.drawLine(430, 255, 370,330);
            g.drawString(obj.distancaQytete[21]+"",430/2+370/2+5,255/2+330/2);
        }
        if(obj.e22){//Kamenice-Novoberde
            g.setColor(bl);
            g.drawLine(535,285, 470,295);
            g.drawString(obj.distancaQytete[22]+"",535/2+470/2,285/2+295/2);
        }
        if(obj.e23){//Kamenice-Gjilan
            g.setColor(bl);
            g.drawLine(535,285, 480,355);
            g.drawString(obj.distancaQytete[23]+"",535/2+480/2,285/2+355/2);
        }
        if(obj.e24){//Novoberde-Lipjan
            g.setColor(bl);
            g.drawLine(470,295, 370,330);
            g.drawString(obj.distancaQytete[24]+"",470/2+370/2,295/2+330/2);
        }
        if(obj.e25){//Novoberde-Gjilan
            g.setColor(bl);
            g.drawLine(470,295, 480,355);
            g.drawString(obj.distancaQytete[25]+"",470/2+480/2,295/2+355/2);
        }
        if(obj.e26){//Obiliq-FusheKosove
            g.setColor(bl);
            g.drawLine(410, 190, 345,285);
            g.drawString(obj.distancaQytete[26]+"",410/2+345/2,190/2+285/2);
        }
        if(obj.e27){//Obiliq-Drenas
            g.setColor(bl);
            g.drawLine(410, 190, 290,275);
            g.drawString(obj.distancaQytete[27]+"",410/2+290/2,190/2+275/2);
        }
        if(obj.e28){//FusheKosove-Lipjan
            g.setColor(bl);
            g.drawLine(345,285, 370,330);
            g.drawString(obj.distancaQytete[28]+"",345/2+370/2,285/2+330/2);
        }
        if(obj.e29){//FusheKosove-Drenas
            g.setColor(bl);
            g.drawLine(345,285, 290,275);
            g.drawString(obj.distancaQytete[29]+"",285/2+290/2,285/2+275/2);
        }
        if(obj.e30){//Drenas-Lipjan
            g.setColor(bl);
            g.drawLine(290,275, 370,330);
            g.drawString(obj.distancaQytete[30]+"",290/2+370/2,275/2+330/2);
        }
        if(obj.e31){//Drenas-Malisheve
            g.setColor(bl);
            g.drawLine(290,275, 240,330);
            g.drawString(obj.distancaQytete[31]+"",290/2+240/2,275/2+330/2);
        }
        if(obj.e32){//Drenas-Skenderaj
            g.setColor(bl);
            g.drawLine(290,275, 250,225);
            g.drawString(obj.distancaQytete[32]+"",290/2+250/2,275/2+225/2);
        }
        if(obj.e33){//Skenderaj-Kline
            g.setColor(bl);
            g.drawLine(250,225, 190,275);
            g.drawString(obj.distancaQytete[33]+"",250/2+190/2,225/2+275/2);
        }
        if(obj.e34){//Skenderaj-Istog
            g.setColor(bl);
            g.drawLine(250,225, 160,225);
            g.drawString(obj.distancaQytete[34]+"",250/2+160/2,225/2+225/2);
        }
        if(obj.e35){//Istog-Peje
            g.setColor(bl);
            g.drawLine(160,225, 74,255);
            g.drawString(obj.distancaQytete[35]+"",250/2+74/2,225/2+255/2);
        }
        if(obj.e36){//Istog-Kline
            g.setColor(bl);
            g.drawLine(160,225, 190,275);
            g.drawString(obj.distancaQytete[36]+"",160/2+190/2,225/2+275/2);
        }
        if(obj.e37){//Peje-Decan
            g.setColor(bl);
            g.drawLine(74,255, 90,310);
            g.drawString(obj.distancaQytete[37]+"",74/2+90/2,255/2+310/2);
        }
        if(obj.e38){//Decan-Gjakove
            g.setColor(bl);
            g.drawLine(90,310, 120,380);
            g.drawString(obj.distancaQytete[38]+"",90/2+120/2,310/2+380/2);
        }
        if(obj.e39){//Peje-Kline
            g.setColor(bl);
            g.drawLine(74,255, 190,275);
            g.drawString(obj.distancaQytete[39]+"",74/2+190/2,255/2+275/2);
        }
        if(obj.e40){//Kline-Gjakove
            g.setColor(bl);
            g.drawLine(190,275, 120,380);
            g.drawString(obj.distancaQytete[40]+"",190/2+120/2,275/2+380/2);
        }
        if(obj.e41){//Kline-Malisheve
            g.setColor(bl);
            g.drawLine(190,275, 240,330);
            g.drawString(obj.distancaQytete[41]+"",190/2+240/2,275/2+330/2);
        }
        if(obj.e42){//Gjakove-Rahovec
            g.setColor(bl);
            g.drawLine(120,380, 200,375);
            g.drawString(obj.distancaQytete[42]+"",120/2+200/2,380/2+375/2);
        }
        if(obj.e43){//Gjakove-Prizren
            g.setColor(bl);
            g.drawLine(120,380, 240,455);
            g.drawString(obj.distancaQytete[43]+"",120/2+240/2,380/2+455/2);
        }
        if(obj.e44){//Malisheve-Suhareke
            g.setColor(bl);
            g.drawLine(240,330, 284,395);
            g.drawString(obj.distancaQytete[44]+"",240/2+284/2,330/2+395/2);
        }
        if(obj.e45){//Suhareke-Rahovec
            g.setColor(bl);
            g.drawLine(284,395, 200,375);
            g.drawString(obj.distancaQytete[45]+"",284/2+200/2,395/2+375/2);
        }
        if(obj.e46){//Suhareke-Prizren
            g.setColor(bl);
            g.drawLine(284,395, 240,455);
            g.drawString(obj.distancaQytete[46]+"",284/2+240/2+10,395/2+455/2);
        }
        if(obj.e48){//Suhareke-Ferizaj
            g.setColor(bl);
            g.drawLine(284,395, 390,385);
            g.drawString(obj.distancaQytete[48]+"",284/2+390/2,395/2+385/2);
        }
        if(obj.e49){//Suhareke-Shterpce
            g.setColor(bl);
            g.drawLine(284,395, 320,435);
            g.drawString(obj.distancaQytete[49]+"",284/2+320/2,395/2+435/2);
        }
        if(obj.e50){//Rahovec-Prizren
            g.setColor(bl);
            g.drawLine(200,375, 240,455);
            g.drawString(obj.distancaQytete[50]+"",200/2+240/2,375/2+455/2);
        }
        if(obj.e52){//Prizren-Shterpce
            g.setColor(bl);
            g.drawLine(240,455, 320,435);
            g.drawString(obj.distancaQytete[52]+"",240/2+320/2,455/2+435/2);
        }
        if(obj.e53){//Shterpce-Ferizaj
            g.setColor(bl);
            g.drawLine(320,435,390,385);
            g.drawString(obj.distancaQytete[53]+"",320/2+390/2,435/2+385/2);
        }
        if(obj.e54){//Shterpce-Kacanik
            g.setColor(bl);
            g.drawLine(320,435, 410,435);
            g.drawString(obj.distancaQytete[54]+"",320/2+410/2,435/2+435/2);
        }
        if(obj.e55){//Kacanik-Ferizaj
            g.setColor(bl);
            g.drawLine(410,435, 390,385);
            g.drawString(obj.distancaQytete[55]+"",410/2+390/2,435/2+385/2);
        }
        if(obj.e56){//Kacanik-Viti
            g.setColor(bl);
            g.drawLine(410,435, 440,405);
            g.drawString(obj.distancaQytete[56]+"",410/2+440/2,435/2+405/2);
        }
        if(obj.e57){//Shtime-Lipjan
            g.setColor(bl);
            g.drawLine(340,360, 370,330);
            g.drawString(obj.distancaQytete[57]+"",340/2+370/2+5,360/2+330/2);
        }
        if(obj.e58){//Shtime-Ferizaj
            g.setColor(bl);
            g.drawLine(340,360, 390,385);
            g.drawString(obj.distancaQytete[58]+"",340/2+390/2,360/2+385/2);
        }
        if(obj.e59){//Ferizaj-Lipjan
            g.setColor(bl);
            g.drawLine(390,385, 370,330);
            g.drawString(obj.distancaQytete[59]+"",390/2+370/2,385/2+330/2);
        }
        if(obj.e60){//Ferizaj-Viti
            g.setColor(bl);
            g.drawLine(390,385, 440,405);
            g.drawString(obj.distancaQytete[60]+"",390/2+440/2,385/2+405/2);
        }
        if(obj.e61){//Ferizaj-Gjilan
            g.setColor(bl);
            g.drawLine(390,385, 480,355);
            g.drawString(obj.distancaQytete[61]+"",390/2+480/2,385/2+355/2);
        }
        if(obj.e62){//Gjilan-Viti
            g.setColor(bl);
            g.drawLine(480,355, 440,405);
            g.drawString(obj.distancaQytete[62]+"",480/2+440/2,355/3+405/2);
        }
        if(obj.e63){//Gjilan-Lipjan
            g.setColor(bl);
            g.drawLine(480,355, 370,330);
            g.drawString(obj.distancaQytete[63]+"",480/2+370/2,355/2+330/2);
        }
        if (obj.e64) {//Podujeve-Lluzhan
            g.setColor(bl);
            g.drawLine(410,190,429,225);
            g.drawString(obj.distancaQytete[64]+"",410/2+429/2,190/2+225/2);
        }
        if(obj.e65) {//Lluzhan-Prishtine
            g.setColor(bl);
            g.drawLine(429,225,430, 255);
            g.drawString(obj.distancaQytete[65]+"",429/2+430/2+5,225/2+255/2);
        }
        if(obj.e66) {//Podujeve-Kerpimeh
            g.setColor(bl);
            g.drawLine(410, 190,370, 145);
            g.drawString(obj.distancaQytete[66]+"",410/2+370/2,190/2+145/2);
       }
        if(obj.e67) {//Kerpimeh-Mitrovice
            g.setColor(bl);
            g.drawLine(370, 145,315, 140);
            g.drawString(obj.distancaQytete[67]+"",370/2+315/2,145/2+140/2);
        }
        if(obj.e68) {//Obiliq-Sllatine
            g.setColor(bl);
            g.drawLine(350,245,310, 245);
            g.drawString(obj.distancaQytete[68]+"",350/2+310/2,245/2+245/2);
        }
        if(obj.e69) { //Drenas-Sllatine
            g.setColor(bl);
            g.drawLine(290,275,310, 245);
            g.drawString(obj.distancaQytete[69]+"",290/2+310/2,275/2+245/2);
        }
        if(obj.e70) { //FusheKosove-Sllatine
            g.setColor(bl);
            g.drawLine(345,285,310, 245);
            g.drawString(obj.distancaQytete[70]+"",345/2+310/2,285/2+245/2);
        }
        if(obj.e71) { //Lipjan-Sllatine
            g.setColor(bl);
            g.drawLine(370,330,310, 245);
            g.drawString(obj.distancaQytete[71]+"",370/2+310/2,330/2+245/2);
        }
        if(obj.e72) { //Gjakove-Xerxe
            g.setColor(bl);
            g.drawLine(120,380,170, 395);
            g.drawString(obj.distancaQytete[72]+"",120/2+170/2,380/2+395/2);
        }

        if(obj.e73) {// Rahovec-Xerxe
            g.setColor(bl);
            g.drawLine(200, 375, 170, 395);
            g.drawString(obj.distancaQytete[73] + "", 200 / 2 + 170 / 2, 375 / 2 + 395 / 2);
        }

        if(obj.e74) { //Prizren-Plave
            g.setColor(bl);
            g.drawLine(240,455,220, 485);
            g.drawString(obj.distancaQytete[74]+"",240/2+220/2-20,455/2+485/2);
        }
        if(obj.e75) { //Dragash-Plave
            g.setColor(bl);
            g.drawLine(220,515,220, 485);
            g.drawString(obj.distancaQytete[75]+"",220/2+220/2+5,515/2+485/2);
        }
        if(obj.e76) { //Prizren-Prevalle
            g.setColor(bl);
            g.drawLine(240,455,275, 465 );
            g.drawString(obj.distancaQytete[76]+"",240/2+275/2,455/2+465/2);
        }
        if(obj.e77) { //Shterpce-Prevalle
            g.setColor(bl);
            g.drawLine(320,435,275, 465 );
            g.drawString(obj.distancaQytete[77]+"",320/2+275/2,435/2+465/2);
        }
        if(obj.e78) { //Shtime-Komoran
            g.setColor(bl);
            g.drawLine(340,360,370, 305 );
            g.drawString(obj.distancaQytete[78]+"",340/2+370/2,360/2+305/2);
        }
        if(obj.e79) { //Drenas-Komoran
            g.setColor(bl);
            g.drawLine(290,275,370, 305 );
            g.drawString(obj.distancaQytete[79]+"",290/2+370/2,275/2+305/2);
        }
        if(obj.e80) { //Decan-Junik
            g.setColor(bl);
            g.drawLine(90,310,90, 355 );
            g.drawString(obj.distancaQytete[80]+"",90/2+90/2,310/2+355/2);
        }
        if(obj.e81) { //Gjakove-Junik
            g.setColor(bl);
            g.drawLine(120,380,90, 355 );
            g.drawString(obj.distancaQytete[81]+"",120/2+90/2,380/2+355/2);
        }
        if(obj.e82) { //Rastavice-Junik
            g.setColor(bl);
            g.drawLine(130, 325,90, 355 );
            g.drawString(obj.distancaQytete[82]+"",130/2+90/2,325/2+355/2);
        }
        if(obj.e83) { //Decan-Rastavice
            g.setColor(bl);
            g.drawLine(90,310,130, 325);
            g.drawString(obj.distancaQytete[83]+"",90/2+130/2,310/2+325/2);
        }
        if(obj.e84) { //Gjakove-Restavice
            g.setColor(bl);
            g.drawLine(120,380,130, 325);
            g.drawString(obj.distancaQytete[84]+"",120/2+130/2,380/2+325/2);
        }
        if(obj.e85) { //Shtime-Duhel
            g.setColor(bl);
            g.drawLine(340,360,300, 375);
            g.drawString(obj.distancaQytete[85]+"",340/2+300/2+10,360/2+375/2+10);
        }
        if(obj.e86) { //Suhareke-Duhel
            g.setColor(bl);
            g.drawLine(284,395,300, 375);
            g.drawString(obj.distancaQytete[86]+"",284/2+300/2-20,395/2+375/2-5);
        }

        if(obj.e87) { //Drenas-Kline
            g.setColor(bl);
            g.drawLine(290,275,190,275);
            g.drawString(obj.distancaQytete[87]+"",290/2+190/2,275/2+275/2);
        }
        if(obj.e88) {//Kline-Decan
            g.setColor(bl);
            g.drawLine(190, 275, 90, 310);
            g.drawString(obj.distancaQytete[88] + "", 190 / 2 + 90 / 2, 275 / 2 + 310 / 2);
        }
            if(obj.e89) {// Xerxe-Prizren
            g.setColor(bl);
            g.drawLine( 170, 395,240,455);
            g.drawString(obj.distancaQytete[89] + "", 170 / 2 + 240 / 2, 395 / 2 + 455 / 2);
        }
        g.setColor(Color.BLACK);
        g.drawString("Gjithesej: "+obj.totalCost+"km", 0, 620);
        g.drawString("Rruga: "+ obj.pathi+"",0,640);
        g.setColor(Color.lightGray);
        g.drawRect(450, 10, 140, 80);
        g.setColor(lg);
        g.fillOval(465, 30, 12, 12);
        g.fillRect(465, 50, 12, 12);
        g.drawString(" - Qytetet e Kosoves", 465+14, 40);
        g.drawString(" - Fshatrat e Kosoves", 465+14, 60);

    }

}
