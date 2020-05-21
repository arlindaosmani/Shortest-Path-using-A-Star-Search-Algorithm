package Rruga_e_shkurter;


import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class AstarSearchAlgo{
    //Nodes-Qytetet
    static boolean n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32,n33,n34,n35,n36,n37,n38,n39,n40;
    //Edges-Lidhjet e qyteteve mes vete
    static boolean e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e48, e49, e50, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63,e64,e65,e66,e67,e68,e69,e70,e71,e72,e73,e74,e75,e76,e77,e78,e79,e80,e81,e82,e83,e84,e85,e86,e87,e88,e89;
    //Kostoja totale
    static int totalCost=0;
    static List<Node> path = new ArrayList<Node>();
    //Distanca e seciles lidhje
    static int[] distancaQytete= new int[90];
    static String pathi="";

    String qyteti1="";
    String qyteti2="";
    int Qyteti1;
    int Qyteti2;
    PaneliInput paneliInput= new PaneliInput();
    ActionListener ac= new ActionListener() {

        public void actionPerformed(ActionEvent actionEvent) {
            // TODO Auto-generated method stub
            qyteti1=paneliInput.getLabel1();
            qyteti2=paneliInput.getLabel2();
            paneliInput.dispose();

        }
    };


    public AstarSearchAlgo()
    {paneliInput.confirm.addActionListener(ac);
    }



    public static void main(String[] args){
        AstarSearchAlgo obj= new AstarSearchAlgo();
        while(obj.qyteti1.equals("")) {

        }




        // public static void main(String[] args){
        //inicializimi i secilit qytet
        //hVal eshte distanca ne vije te drejte e cdo qyteti me Dragashin
        ArrayList<Node> nodes= new ArrayList<>();
        Node Podujeve = new Node("Podujeve",104.12);
        nodes.add(Podujeve);
        Node Prishtine = new Node("Prishtine",78.94);
        nodes.add(Prishtine);
        Node Mitrovice = new Node("Mitrovice",92.45);
        nodes.add(Mitrovice);
        Node Leposaviq = new Node("Leposaviq",119.23);
        nodes.add(Leposaviq);
        Node Zvecan = new Node("Zvecan",95.36);
        nodes.add(Zvecan);
        Node ZubinPotok = new Node("ZubinPotok",94.67);
        nodes.add(ZubinPotok);
        Node Vushtrri = new Node("Vushtrri",88.20);
        nodes.add(Vushtrri);
        Node Skenderaj = new Node("Skenderaj",76.98);
        nodes.add(Skenderaj);
        Node Istog = new Node("Istog",72.74);
        nodes.add(Istog);
        Node Obiliq = new Node("Obiliq",77.18);
        nodes.add(Obiliq);
        Node Drenas = new Node("Drenas",65.67);
        nodes.add(Drenas);
        Node Kamenice = new Node("Kamenice",95.63);
        nodes.add(Kamenice);
        Node Novoberde = new Node("Novoberde",88.07);
        nodes.add(Novoberde);
        Node FusheKosove = new Node("FusheKosove",73.11);
        nodes.add(FusheKosove);
        Node Lipjan = new Node("Lipjan",63.77);
        nodes.add(Lipjan);
        Node Malisheve = new Node("Malisheve",82.51);
        nodes.add(Malisheve);
        Node Kline = new Node("Kline",69.06);
        nodes.add(Kline);
        Node Peje = new Node("Peje", 72.83);
        nodes.add(Peje);
        Node Decan = new Node("Decan",60.97);
        nodes.add(Decan);
        Node Gjakove = new Node("Gjakove",39.73);
        nodes.add(Gjakove);
        Node Rahovec = new Node("Rahovec",37.43);
        nodes.add(Rahovec);
        Node Prizren = new Node("Prizren",017.79);
        nodes.add(Prizren);
        Node Shterpce = new Node("Shterpce", 36.52);
        nodes.add(Shterpce);
        Node Ferizaj = new Node("Ferizaj",53.38);
        nodes.add(Ferizaj);
        Node Kacanik = new Node("Kacanik",53.12);
        nodes.add(Kacanik);
        Node Viti = new Node("Viti",64.67);
        nodes.add(Viti);
        Node Shtime = new Node("Shtime",51.92);
        nodes.add(Shtime);
        Node Gjilan = new Node("Gjilan",80.52);
        nodes.add(Gjilan);
        Node Suhareke = new Node("Suhareke",36.23);
        nodes.add(Suhareke);
        Node Dragash = new Node("Dragash",0);
        nodes.add(Dragash);
        Node Lluzhan=new Node("Lluzhan",94.44);
        nodes.add(Lluzhan);
        Node Komoran= new Node("Komoran",60.65);
        nodes.add(Komoran);
        Node Junik=new Node("Junik",55.61);
        nodes.add(Junik);
        Node Rastavice=new Node("Rastavice",54.82);
        nodes.add(Rastavice);
        Node Sllatine=new Node("Sllatine",67.28);
        nodes.add(Sllatine);
        Node Duhel=new Node("Duhel",42.64);
        nodes.add(Duhel);
        Node Kerpimeh=new Node("Kerpimeh",110.85);
        nodes.add(Kerpimeh);
        Node Plave=new Node("Plave",4.04);
        nodes.add(Plave);
        Node Xerxe=new Node("Xerxe",3.18);
        nodes.add(Xerxe);
        Node Prevalle=new Node("Prevalle",28.40);
        nodes.add(Prevalle);

        for(int i=0; i<nodes.size(); i++)
        {
            if(nodes.get(i).Value.equals(obj.qyteti1)){obj.Qyteti1=i;}
            if(nodes.get(i).Value.equals(obj.qyteti2)){obj.Qyteti2=i;}
        }

        //Inicializimi i lidhjeve
        Podujeve.adjacencies = new Edge[]{new Edge(Leposaviq,76), /*new Edge(Mitrovice,54),*/ new Edge(Obiliq, 30), new Edge(Vushtrri, 40), new Edge(Lluzhan,12),new Edge(Kerpimeh, 12)};
        Lluzhan.adjacencies=new Edge[] {new Edge(Podujeve,12), new Edge(Prishtine,23)};
        Prishtine.adjacencies = new Edge[]{ new Edge(Kamenice  ,59), new Edge(Novoberde ,41), new Edge(Obiliq,10), new Edge(Lipjan,18), new Edge(Lluzhan,20)};
        Mitrovice.adjacencies = new Edge[]{new Edge(Zvecan,5), new Edge(Leposaviq,47), new Edge(ZubinPotok,19), new Edge(Kerpimeh,39), new Edge(Vushtrri,12), new Edge(Skenderaj,22)};
        Leposaviq.adjacencies = new Edge[]{new Edge(Podujeve,76), new Edge(Zvecan,22), new Edge(Mitrovice,47)};
        Zvecan.adjacencies = new Edge[]{new Edge(Leposaviq,22), new Edge(Mitrovice,5), new Edge(ZubinPotok,22),};
        ZubinPotok.adjacencies = new Edge[]{new Edge(Zvecan,22), new Edge(Skenderaj,33), new Edge(Istog,44)};
        Vushtrri.adjacencies = new Edge[]{new Edge(Mitrovice,12), new Edge(Podujeve,40), new Edge(Obiliq,21), new Edge(Drenas, 36)};
        Skenderaj.adjacencies = new Edge[]{new Edge(Mitrovice,22), new Edge(ZubinPotok,33), new Edge(Drenas, 18), new Edge(Kline, 26), new Edge(Istog, 32)};
        Istog.adjacencies = new Edge[]{new Edge(ZubinPotok,44), new Edge(Skenderaj,32), new Edge(Peje, 24), new Edge(Kline, 14)};
        Obiliq.adjacencies = new Edge[]{new Edge(Podujeve,30), new Edge(Vushtrri,21), new Edge(Prishtine, 10), /*new Edge(FusheKosove, 18),*/ new Edge(Drenas, 25),new Edge(Sllatine,17)};
        Drenas.adjacencies = new Edge[]{new Edge(Kline,40),new Edge(Vushtrri,36), new Edge(Obiliq,25),/* new Edge(FusheKosove, 26), new Edge(Lipjan, 38),*/ new Edge(Malisheve, 24), new Edge(Skenderaj, 18),new Edge(Sllatine,20)};
        Kamenice.adjacencies = new Edge[]{new Edge(Prishtine,59), new Edge(Novoberde,22), new Edge(Gjilan,27)};
        Novoberde.adjacencies = new Edge[]{new Edge(Prishtine,41), new Edge(Kamenice,22), new Edge(Lipjan,43), new Edge(Gjilan, 22)};
        FusheKosove.adjacencies = new Edge[]{new Edge(Prishtine,7), /*new Edge(Obiliq, 18), new Edge(Lipjan, 17), new Edge(Drenas, 26),*/new Edge(Sllatine, 14)};
        Lipjan.adjacencies= new Edge[]{new Edge(Prishtine, 18), new Edge(Novoberde, 43), /*new Edge(FusheKosove, 17), new Edge(Drenas, 38),*/ new Edge(Shtime, 12), new Edge(Ferizaj, 20), new Edge(Gjilan, 39), new Edge(Sllatine,22)};
        Malisheve.adjacencies= new Edge[]{new Edge(Drenas, 24), new Edge(Kline, 28), new Edge(Suhareke, 24)};
        Kline.adjacencies=new Edge[]{new Edge(Decan,41),new Edge(Drenas,40),new Edge(Skenderaj, 26),new Edge(Istog, 14), new Edge(Peje, 29), new Edge(Gjakove, 25), new Edge(Malisheve, 28) };
        Peje.adjacencies=new Edge[]{ new Edge(Istog, 24), new Edge(Decan, 14), new Edge(Kline, 29)};
        Decan.adjacencies=new Edge[]{new Edge(Kline,41),new Edge(Gjakove,22),new Edge(Peje, 14), new Edge(Junik, 10), new Edge(Rastavice, 7)};
        Gjakove.adjacencies=new Edge[]{new Edge(Decan,22),new Edge(Kline,35),/*new Edge(Rahovec,21),new Edge(Prizren,36),*/ new Edge(Xerxe,14)};
        Rahovec.adjacencies=new Edge[]{/*new Edge(Gjakove,21),*/new Edge(Suhareke,17),new Edge(Prizren,46),new Edge(Xerxe,10)};
        Prizren.adjacencies=new Edge[]{new Edge(Xerxe,23),/*new Edge(Gjakove, 36),*/ new Edge(Suhareke, 31),new Edge(Rahovec, 46),/*new Edge(Dragash, 33),*/ /*new Edge(Shterpce, 41),*/new Edge(Plave,29),new Edge(Prevalle,30)};
        Shterpce.adjacencies=new Edge[]{new Edge(Suhareke, 63),/* new Edge(Prizren, 41),*/ new Edge(Ferizaj, 24),new Edge(Kacanik, 22),new Edge(Prevalle,16)};
        Ferizaj.adjacencies=new Edge[]{new Edge(Suhareke, 39), new Edge(Shterpce, 24), new Edge(Kacanik, 22), new Edge(Shtime, 13), new Edge(Lipjan, 20), new Edge(Viti, 21), new Edge(Gjilan, 33)};
        Kacanik.adjacencies=new Edge[]{new Edge(Shterpce, 25),new Edge(Ferizaj, 22), new Edge(Viti, 22)};
        Viti.adjacencies=new Edge[]{new Edge(Kacanik, 22),new Edge(Ferizaj, 21), new Edge(Gjilan, 20)};
        Shtime.adjacencies=new Edge[]{/*new Edge(Suhareke, 26),*/ new Edge(Lipjan, 12), new Edge(Ferizaj, 13), new Edge(Duhel,20)};
        Gjilan.adjacencies=new Edge[]{new Edge(Kamenice, 27),new Edge(Novoberde, 22), new Edge(Ferizaj, 33), new Edge(Viti, 20), new Edge(Lipjan, 39)};
        Suhareke.adjacencies=new Edge[]{new Edge(Malisheve, 24), new Edge(Rahovec, 17), new Edge(Prizren, 31), /*new Edge(Shtime, 26),*/ new Edge(Ferizaj, 39), new Edge(Shterpce, 63), new Edge(Duhel, 10)};
        Dragash.adjacencies=new Edge[]{/*new Edge(Prizren, 33),*/ new Edge(Plave,6)};
        Lluzhan.adjacencies=new Edge[] {new Edge(Podujeve,12), new Edge(Prishtine,20)};
        Komoran.adjacencies=new Edge[] {new Edge(Shtime, 25),new Edge(Drenas, 9)};
        Junik.adjacencies=new Edge[] {new Edge(Decan, 10), new Edge(Gjakove,20), new Edge(Rastavice, 6)};
        Rastavice.adjacencies=new Edge[] { new Edge(Decan, 7), new Edge(Gjakove,16), new Edge(Junik,6)};
        Sllatine.adjacencies=new Edge[] {new Edge(FusheKosove,14), new Edge(Drenas,20), new Edge(Lipjan,22), new Edge(Obiliq,17)};
        Duhel.adjacencies=new Edge[] {new Edge(Suhareke,10), new Edge(Shtime,20) };
        Kerpimeh.adjacencies=new Edge[] {new Edge(Podujeve,11), new Edge(Mitrovice,39)};
        Plave.adjacencies=new Edge[] {new Edge(Prizren,29), new Edge(Dragash,6)};
        Xerxe.adjacencies=new Edge[] {new Edge(Gjakove,14),new Edge(Rahovec,10),new Edge(Prizren,23)};
        Prevalle.adjacencies=new Edge[] {new Edge(Prizren,30),new Edge(Shterpce,16)};


        AstarSearch(nodes.get(obj.Qyteti1),nodes.get(obj.Qyteti2));
        List<Node> path = printPath(nodes.get(obj.Qyteti2));
        pathi+=path+"";

        if(path.contains(Podujeve)) n1=true;
        if(path.contains(Lluzhan)) n31=true;
        if(path.contains(Prishtine)) n2 =true;
        if(path.contains(Mitrovice)) n3 =true;
        if(path.contains(Leposaviq)) n4 =true;
        if(path.contains(Zvecan)) n5 =true;
        if(path.contains(ZubinPotok)) n6 =true;
        if(path.contains(Vushtrri)) n7 =true;
        if(path.contains(Skenderaj)) n8 =true;
        if(path.contains(Istog)) n9 =true;
        if(path.contains(Obiliq)) n10 =true;
        if(path.contains(Drenas)) n11 =true;
        if(path.contains(Kamenice)) n12 =true;
        if(path.contains(Novoberde)) n13 =true;
        if(path.contains(FusheKosove)) n14 =true;
        if(path.contains(Lipjan)) n15 =true;
        if(path.contains(Malisheve)) n16 =true;
        if(path.contains(Kline)) n17 =true;
        if(path.contains(Peje)) n18 =true;
        if(path.contains(Decan)) n19 =true;
        if(path.contains(Gjakove)) n20 =true;
        if(path.contains(Rahovec)) n21 =true;
        if(path.contains(Prizren)) n22 =true;
        if(path.contains(Shterpce)) n23 =true;
        if(path.contains(Ferizaj)) n24 =true;
        if(path.contains(Kacanik)) n25 =true;
        if(path.contains(Viti)) n26 =true;
        if(path.contains(Shtime)) n27 =true;
        if(path.contains(Gjilan)) n28 =true;
        if(path.contains(Suhareke)) n29 =true;
        if(path.contains(Dragash)) n30 =true;

//        if(path.contains(Lluzhan)) n31=true;
        if(path.contains(Komoran)) n32=true;
        if(path.contains(Junik)) n33=true;
        if(path.contains(Rastavice)) n34=true;
        if(path.contains(Sllatine)) n35=true;
        if(path.contains(Duhel)) n36=true;
        if(path.contains(Kerpimeh)) n37=true;
        if(path.contains(Plave)) n38=true;
        if(path.contains(Xerxe)) n39=true;
        if(path.contains(Prevalle)) n40=true;
        if(path.contains(Leposaviq)&&path.contains(Podujeve)) {e1=true; totalCost+=76; distancaQytete[1]=76;}
        if(path.contains(Leposaviq)&&path.contains(Zvecan)) {e2=true; totalCost+=22; distancaQytete[2]=22;}
        if(path.contains(Zvecan)&&path.contains(Mitrovice)) {e4=true; totalCost+=5; distancaQytete[4]=5;}
        if(path.contains(Zvecan)&&path.contains(ZubinPotok)) {e5=true;totalCost+=22; distancaQytete[5]=22;}
        if(path.contains(Mitrovice)&&path.contains(ZubinPotok)){ e6=true;totalCost+=19;distancaQytete[6]=19;}
        if(path.contains(Mitrovice)&&path.contains(Vushtrri)) {e7=true;totalCost+=12;distancaQytete[7]=12;}
        if(path.contains(Mitrovice)&&path.contains(Podujeve)) {e8=true;totalCost+=54;distancaQytete[8]=54;}
        if(path.contains(Mitrovice)&&path.contains(Skenderaj)){ e9=true;totalCost+=22;distancaQytete[9]=22;}
        if(path.contains(ZubinPotok)&&path.contains(Skenderaj)){ e10=true;totalCost+=33;distancaQytete[10]=33;}
        if(path.contains(ZubinPotok)&&path.contains(Istog)) {e11=true;totalCost+=44;distancaQytete[11]=44;}
        if(path.contains(Podujeve)&&path.contains(Obiliq)) {e13=true;totalCost+=30;distancaQytete[13]=30;}
        if(path.contains(Podujeve)&&path.contains(Vushtrri)) {e14=true;totalCost+=40;distancaQytete[14]=40;}
        if(path.contains(Vushtrri)&&path.contains(Obiliq)) {e15 =true;totalCost+=21;distancaQytete[15]=21;}
        if(path.contains(Vushtrri)&&path.contains(Drenas)) {e16=true;totalCost+=36;distancaQytete[16]=36;}
        if(path.contains(Prishtine)&&path.contains(Kamenice)){ e17=true;totalCost+=59;distancaQytete[17]=59;}
        if(path.contains(Prishtine)&&path.contains(Novoberde)){ e18=true;totalCost+=41;distancaQytete[18]=41;}
        if(path.contains(Prishtine)&&path.contains(FusheKosove)){ e19=true;totalCost+=7;distancaQytete[19]=7;}
        if(path.contains(Prishtine)&&path.contains(Obiliq)) {e20=true;totalCost+=10;distancaQytete[20]=10;}
        if(path.contains(Prishtine)&&path.contains(Lipjan)) {e21=true;totalCost+=18;distancaQytete[21]=18;}
        if(path.contains(Kamenice)&&path.contains(Novoberde)){ e22=true;totalCost+=22;distancaQytete[22]=22;}
        if(path.contains(Kamenice)&&path.contains(Gjilan)) {e23=true;totalCost+=27;distancaQytete[23]=27;}
        if(path.contains(Novoberde)&&path.contains(Lipjan)) {e24=true;totalCost+=43;distancaQytete[24]=43;}
        if(path.contains(Novoberde)&&path.contains(Gjilan)) {e25=true;totalCost+=22;distancaQytete[25]=22;}
        if(path.contains(Obiliq)&&path.contains(FusheKosove)){ e26=true;totalCost+=18;distancaQytete[26]=18;}
        if(path.contains(Obiliq)&&path.contains(Drenas)) {e27=true;totalCost+=25;distancaQytete[27]=25;}
        if(path.contains(FusheKosove)&&path.contains(Lipjan)) {e28=false;totalCost+=17;distancaQytete[28]=17;}
        if(path.contains(FusheKosove)&&path.contains(Drenas)) {e29=true;totalCost+=26;distancaQytete[29]=26;}
        if(path.contains(Drenas)&&path.contains(Lipjan)) {e30=true;totalCost+=38;distancaQytete[30]=38;}
        if(path.contains(Drenas)&&path.contains(Malisheve)){ e31=true;totalCost+=24;distancaQytete[31]=24;}
        if(path.contains(Drenas)&&path.contains(Skenderaj)) {e32=true;totalCost+=18;distancaQytete[32]=18;}
        if(path.contains(Skenderaj)&&path.contains(Kline)){ e33=true;totalCost+=26;distancaQytete[33]=26;}
        if(path.contains(Skenderaj)&&path.contains(Istog)) {e34=true;totalCost+=32;distancaQytete[34]=32;}
        if(path.contains(Istog)&&path.contains(Peje)) {e35=true;totalCost+=24;distancaQytete[35]=24;}
        if(path.contains(Istog)&&path.contains(Kline)){ e36=true;totalCost+=14;distancaQytete[36]=14;}
        if(path.contains(Peje)&&path.contains(Decan)) {e37=true;totalCost+=14;distancaQytete[37]=14;}
        if(path.contains(Decan)&&path.contains(Gjakove)){ e38=true;totalCost+=22;distancaQytete[38]=22;}
        if(path.contains(Peje)&&path.contains(Kline)) {e39=true;totalCost+=29;distancaQytete[39]=29;}
        if(path.contains(Kline)&&path.contains(Gjakove)) {e40=true;totalCost+=35;distancaQytete[40]=35;}
        if(path.contains(Kline)&&path.contains(Malisheve)) {e41=true;totalCost+=28;distancaQytete[41]=28;}
        if(path.contains(Malisheve)&&path.contains(Suhareke)){ e44=true;totalCost+=24;distancaQytete[44]=24;}
        if(path.contains(Suhareke)&&path.contains(Rahovec)) {e45=true; totalCost+=17;distancaQytete[45]=17;}
        if(path.contains(Suhareke)&&path.contains(Prizren)) {e46=true;totalCost+=31;distancaQytete[46]=31;}
        if(path.contains(Suhareke)&&path.contains(Ferizaj)) {e48=true;totalCost+=39;distancaQytete[48]=39;}
        if(path.contains(Suhareke)&&path.contains(Shterpce)) {e49=true;totalCost+=63;distancaQytete[49]=63;}
        if(path.contains(Shterpce)&&path.contains(Ferizaj)) {e53=true;totalCost+=24;distancaQytete[53]=24;}
        if(path.contains(Shterpce)&&path.contains(Kacanik)) {e54=true;totalCost+=25;distancaQytete[54]=25;}
        if(path.contains(Kacanik)&&path.contains(Ferizaj)) {e55=true;totalCost+=22;distancaQytete[55]=22;}
        if(path.contains(Kacanik)&&path.contains(Viti)) {e56=true;totalCost+=22;distancaQytete[56]=22;}
        if(path.contains(Shtime)&&path.contains(Lipjan)) {e57=true;totalCost+=12;distancaQytete[57]=12;}
        if(path.contains(Shtime)&&path.contains(Ferizaj)) {e58=true;totalCost+=13;distancaQytete[58]=13;}
        if(path.contains(Ferizaj)&&path.contains(Lipjan)) {e59=true;totalCost+=20;distancaQytete[59]=20;}
        if(path.contains(Ferizaj)&&path.contains(Viti)) {e60=true;totalCost+=21;distancaQytete[60]=21;}
        if(path.contains(Ferizaj)&&path.contains(Gjilan)) {e61=true;totalCost+=33;distancaQytete[61]=33;}
        if(path.contains(Gjilan)&&path.contains(Viti)) {e62=true;totalCost+=20;distancaQytete[62]=20;}
        if(path.contains(Gjilan)&&path.contains(Lipjan)) {e63=true;totalCost+=39;distancaQytete[63]=39;}
        if(path.contains(Podujeve)&& path.contains(Lluzhan)){e64=true; totalCost+=12; distancaQytete[64]=12; }
        if (path.contains(Lluzhan)&& path.contains(Prishtine)){e65=true; totalCost+=20; distancaQytete[65]=20;}
        if (path.contains(Podujeve)&&path.contains(Kerpimeh)){ e66=true; totalCost+=12; distancaQytete[66]=12;}
        if (path.contains(Kerpimeh)&&path.contains(Mitrovice)){e67 =true; totalCost+=39 ; distancaQytete[67]=39 ;}
        if (path.contains(Obiliq)&&path.contains(Sllatine)){e68 =true; totalCost+= 23; distancaQytete[68]=23 ;}
        if (path.contains(Drenas)&&path.contains(Sllatine)){e69 =true; totalCost+= 37; distancaQytete[69]= 37;}
        if (path.contains(FusheKosove)&&path.contains(Sllatine)){e70 =true; totalCost+= 35; distancaQytete[70]=35 ;}
        if (path.contains(Lipjan)&&path.contains(Sllatine)){e71 =true; totalCost+= 43; distancaQytete[71]=43 ;}
        if (path.contains(Gjakove)&&path.contains(Xerxe)){e72 =true; totalCost+= 14; distancaQytete[72]=14 ;}
        if (path.contains(Rahovec)&&path.contains(Xerxe)){e73 =true; totalCost+= 10; distancaQytete[73]=10 ;}
        if (path.contains(Prizren)&&path.contains(Plave)){e74 =true; totalCost+=29 ; distancaQytete[74]=29 ;}
        if (path.contains(Dragash)&&path.contains(Plave)){e75 =true; totalCost+= 6; distancaQytete[75]=6 ;}
        if (path.contains(Prizren)&&path.contains(Prevalle)){e76 =true; totalCost+=26 ; distancaQytete[76]= 26;}
        if (path.contains(Shterpce)&&path.contains(Prevalle)){e77 =true; totalCost+=13 ; distancaQytete[77]= 13;}
        if (path.contains(Shtime)&&path.contains(Komoran)){e78 =true; totalCost+= 22; distancaQytete[78]= 22;}
        if (path.contains(Drenas)&&path.contains(Komoran)){e79 =true; totalCost+=7 ; distancaQytete[79]= 7;}
        if (path.contains(Decan)&&path.contains(Junik)){e80 =true; totalCost+= 10; distancaQytete[80]=10 ;}
        if (path.contains(Gjakove)&&path.contains(Junik)){e81 =true; totalCost+=20 ; distancaQytete[81]=20 ;}
        if (path.contains(Rastavice)&&path.contains(Junik)){e82 =true; totalCost+=6 ; distancaQytete[82]=6 ;}
        if (path.contains(Decan)&&path.contains(Rastavice)){e83 =true; totalCost+= 7; distancaQytete[83]= 7;}
        if (path.contains(Gjakove)&&path.contains(Rastavice)){e84 =true; totalCost+=15 ; distancaQytete[84]=15 ;}
        if (path.contains(Shtime)&&path.contains(Duhel)){e85 =true; totalCost+= 20; distancaQytete[85]= 20;}
        if(path.contains(Suhareke)&&path.contains(Duhel)){e86=true; totalCost+=10; distancaQytete[86]=10;}
        if(path.contains(Drenas)&&path.contains(Kline)){e87=true; totalCost+=40; distancaQytete[87]=40;}
        if(path.contains(Kline)&&path.contains(Decan)){e88=true; totalCost+=41; distancaQytete[88]=41;}
        if(path.contains(Xerxe)&&path.contains(Prizren)){e89=true; totalCost+=23; distancaQytete[89]=23;}


        new Map();
        System.out.println("Path: " + path);
        System.out.println("Kostoja: "+ totalCost +"km");

    }
    public static List<Node> printPath(Node target){
        List<Node> path = new ArrayList<Node>();

        for(Node Node = target; Node!=null; Node = Node.parent){
            path.add(Node);
        }
        Collections.reverse(path);
        return path;
    }
    public static void AstarSearch(Node source, Node goal){

        Set<Node> explored = new HashSet<Node>();
        PriorityQueue<Node> queue = new PriorityQueue<Node>(20, new Comparator<Node>(){
                    //override compare method
                    public int compare(Node i, Node j){
                        if(i.f_scores > j.f_scores){
                            return 1;
                        }
                        else if (i.f_scores < j.f_scores){
                            return -1;
                        }
                        else{
                            return 0;
                        }
                    }
                }
        );
        //cost from start
        source.g_scores = 0;
        queue.add(source);
        boolean found = false;
        while((!queue.isEmpty())&&(!found)){
            //the Node in having the lowest f_score value
            Node current = queue.poll();
            explored.add(current);
            //goal found
            if(current.Value.equals(goal.Value)){
                found = true;
            }
            //check every child of current Node
            for(Edge e : current.adjacencies){
                Node child = e.target;
                double cost = e.cost;

                double temp_g_scores = current.g_scores + cost;
                double temp_f_scores = temp_g_scores + child.h_scores;
/*if child Node has been evaluated and
the newer f_score is higher, skip*/

                if((explored.contains(child)) &&
                        (temp_f_scores >= child.f_scores)){
                    continue;
                }
                /*else if child Node is not in queue or newer f_score is lower*/

                else if((!queue.contains(child)) || (temp_f_scores <
                        child.f_scores)){child.parent = current;
                    child.g_scores = temp_g_scores;
                    child.f_scores = temp_f_scores;
                    if(queue.contains(child)){queue.remove(child);
                    }
                    queue.add(child);
                }
            }
        }
    }

}
class Node{
    public final String Value;
    public double g_scores;
    public final double h_scores;
    public double f_scores = 0;
    public Edge[] adjacencies;
    public Node parent;
    public Node(String val, double hVal){
        Value = val;
        h_scores = hVal;
    }
    public String toString(){
        return Value;
    }
}
class Edge{
    public final double cost;
    public final Node target;
    public Edge(Node targetNode, double costVal){
        target = targetNode;
        cost = costVal;
    }

}