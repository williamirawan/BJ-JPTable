import java.util.Scanner;
public class Main {
public Main(){
  
int angka1;
int angka2;
int x;
boolean p1;
boolean p2;
Scanner in = new Scanner(System.in);

while(true) {
System.out.println(" $$$$$$$     $$$$$                       $$$$$   $$$$$$$    $$$$$$$$         $$        $$              ");
System.out.println(" $$    $$       $$                          $$   $$    $$      $$            $$        $$              ");
System.out.println(" $$    $$       $$                          $$   $$    $$      $$   $$$$$$   $$$$$$$   $$    $$$$$$    ");
System.out.println(" $$$$$$$        $$       $$$$$$             $$   $$$$$$$       $$        $$  $$    $$  $$   $$    $$   ");
System.out.println(" $$    $$  $$   $$                    $$    $$   $$            $$   $$$$$$$  $$    $$  $$   $$$$$$$$   ");
System.out.println(" $$    $$  $$   $$                    $$    $$   $$            $$  $$    $$  $$    $$  $$   $$         ");
System.out.println(" $$$$$$$    $$$$$$                     $$$$$$    $$            $$   $$$$$$$  $$$$$$$   $$    $$$$$$$   ");
System.out.println(" ");
   
System.out.println("1. Start The Simulation!!");
System.out.println("2. Close App");
System.out.print("Choice: ");

x = in.nextInt();
switch(x) {
   case 1:
     do{System.out.print("Input The First Number [1 - 100](Inclusive): ");
        angka1 = in.nextInt(); } while(angka1 < 1 && angka1 > 100);
       
     do{System.out.print("Input The Second Number [1 - 100](Inclusive): ");
        angka2 = in.nextInt(); } while(angka2 < 1 && angka2 > 100);
     
System.out.println(" ");       
System.out.println("+ (String Type): "+angka1+" + "+angka2);
System.out.println(" (Character Type): "+(char)angka1+" "+(char)angka2);
System.out.println("* (Integer Type): "+(angka1*angka2));
System.out.println("/ (Floating Type): "+((float)angka1/(float)angka2));
System.out.println("Input 1 == Input 2 (Boolean Type): "+(angka1 == angka2));
System.out.println(" ");
       
	   System.out.println("Data Type: Integer");
       System.out.println("+ : "+(angka1 + angka2));
       System.out.println("- : "+(angka1 - angka2));
       System.out.println("* : "+(angka1 * angka2));
       System.out.println("/ : "+(angka1 / angka2));
       System.out.println("% : "+(angka1 % angka2));
       System.out.println(" ");
        
do{System.out.print("Give Me Value For p1[True | False]: ");
    p1 = in.nextBoolean(); } while(p1 != true && p1 != false);
do{System.out.print("Give Me Value For p2[True | False]: ");
    p2 = in.nextBoolean(); } while(p2 != true && p2 != false);

	System.out.println(" ");
	System.out.println("Logical Table");
	System.out.println("!P1: "+p1);
    System.out.println("!P2: "+p2);
    System.out.println("&&: "+(p1 && p2));
    System.out.println("||: "+(p1 || p2));
    System.out.println(" ");
    
break;
      
   case 2:
   System.exit(0);
   
break;
   } } }
 
public static void main(String[] args) {
new Main(); }}