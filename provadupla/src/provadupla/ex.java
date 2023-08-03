package provadupla;

public class ex {

}

import java.util.Scanner;
public class Exercicio{
     public static void main(String[] args){
           int a, b, c, aux;
           Scanner entrada-new Scanner(System. in);
           System.out.println("Informeoprimeiro valor ");
         a- entrada.nextInt();
           System.out.println("Informeosegundo valor ");
           b=entrada.nextInt();
           System.out.println("Informeoterceiro valor ");
           C=entrada.nextInt();
           if(a<b){
                 aux-a;
               a=b;
                b=aux;
          if(a<c){
                 aux-a;
                 a=c;
                 C=aux;
           if(b<c){
                 aux-b;
                 b=c;
                 C-aux;
           System.out.println(a+" "+b+" "+c);