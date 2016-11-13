import java.util.Scanner;
public class ProyectoFinal{
public static void main(String[] args){
int b=0, b1=-1, b2=-1, b3=-1, b4=-1;
int op=0;
String[] sumador= new String[40];
String[] restador= new String[40];
String[] multipl= new String[40];
String[] divis= new String[40];
Scanner input=new Scanner(System.in);
do{
System.out.println("Escoga una opcion:");
System.out.println("1- Si desea sumar 2 numeros.");
System.out.println("2- Si desea restar 2 numeros.");
System.out.println("3- Si desea multiplicar 2 numeros.");
System.out.println("4- Si desea dividir 2 numeros.");
System.out.println("5- Ver Bitacora:");
System.out.println("6- Borrar Bitacora:");
System.out.println("7- Salir:");
System.out.println("Respuesta:");
//capturamos en una variable la opcion que escogio el usuario
op=input.nextInt();

switch (op){
case 1:
double n1, n2, suma;
b1=b1+1;

System.out.println("Ingrese un numero: ");
Scanner s1 = new Scanner(System.in);
n1=s1.nextDouble();
System.out.println("Ingrese otro numegro: ");
Scanner s2 = new Scanner(System.in);
n2=s2.nextDouble();
suma=n1+n2;
sumador[b1]=n1+"+"+n2+"="+""+suma;

System.out.println("El resultado es: " +suma +'\n');

System.out.println("Presione una tecla para desplegar el menu nuevamente");

Scanner l1 = new Scanner(System.in);
String c1= " ";
c1 = l1.nextLine();

break;
case 2:
double n3, n4, resta;
b2=b2+1;

System.out.println("Ingrese un numero: ");
Scanner s3 = new Scanner(System.in);
n3=s3.nextDouble();
System.out.println("Ingrese otro numegro: ");
Scanner s4 = new Scanner(System.in);
n4=s4.nextDouble();
resta=n3-n4;
restador[b2]=n3+"-"+n4+"="+""+resta;
System.out.println("El resultado es: " + resta +'\n');

System.out.println("Presione una tecla para desplegar el menu nuevamente");

Scanner l2 = new Scanner(System.in);
String c2= " ";
c2 = l2.nextLine();

break;

case 3:
double n5, n6, multiplicar;
b3=b3+1;

System.out.println("Ingrese un numero: ");
Scanner s5 = new Scanner(System.in);
n5=s5.nextDouble();
System.out.println("Ingrese otro numegro: ");
Scanner s6 = new Scanner(System.in);
n6=s6.nextDouble();
multiplicar=n5*n6;
multipl[b3]=n5+"*"+n6+"="+""+multiplicar;
System.out.println("El resultado es: " + multiplicar +'\n');

System.out.println("Presione una tecla para desplegar el menu nuevamente");

Scanner l3 = new Scanner(System.in);
String c3= " ";
c3 = l3.nextLine();

break;

case 4:
double n7, n8, dividir;
b4=b4+1;

System.out.println("Ingrese un numero: ");
Scanner s7 = new Scanner(System.in);
n7=s7.nextDouble();
System.out.println("Ingrese otro numegro: ");
Scanner s8 = new Scanner(System.in);
n8=s8.nextDouble();
if(n8!=0){
dividir=n7/n8;
divis[b4]=n7+"/"+n8+"="+""+dividir;
System.out.println("El resultado es: " + dividir +'\n');
}
else{
System.out.println("la division entre 0 no es valida");
}
System.out.println("Presione una tecla para desplegar el menu nuevamente");

Scanner l4 = new Scanner(System.in);
String c4= " ";
c4 = l4.nextLine();

break;
// desde aqui

case 5:
System.out.println("Las operaciones realizadas fueron: " +'\n');
int su=0, re=0, mu=0, di=0;
while(su<40){

if(sumador[su]==null || sumador[su]==""){
if(restador[re]==null || restador[re]==""){
if(multipl[mu]==null || multipl[mu]==""){
if(divis[di]==null || divis[di]==""){

System.out.println("Presione una tecla para desplegar el menu nuevamente");

String c5 = " ";
Scanner l5 = new Scanner(System.in);
c5 = l5.nextLine();

break;

}
else{
System.out.println(divis[di]);

di=di+1;}
}else{
System.out.println(multipl[mu]);

mu=mu+1;
}
}else{
System.out.println(restador[re]);

re=re+1;
}
}else{
System.out.println(sumador[su]);

su=su+1;
}
}

break;

case 6:
double bor;

System.out.println("Para Borrar la informacion presione 1, si no lo desea hacer presione 2");
Scanner ifc = new Scanner(System.in);
bor = ifc.nextInt();
if(bor==1){
for(int a=0; a<40; a++){
sumador[a]="";
restador[a]="";
multipl[a]="";
divis[a]="";
}
su=0; re=0; mu=0; di=0; b1=-1; b2=-1; b3=-1; b4=-1;

System.out.println("La informacion se ha borrado" +'\n');
}

System.out.println("Presione una tecla para desplegar el menu nuevamente");
String c6 = " ";
Scanner l6 = new Scanner(System.in);
c6 = l6.nextLine();
break;

case 7:
break;

default:
System.out.println("Opcion No Valida" +'\n');
System.out.println("Presione una tecla para desplegar el menu nuevamente");
String c8 = " ";
Scanner l8 = new Scanner(System.in);
c8 = l8.nextLine();
break;
}
}while (op!=7);
}
}
