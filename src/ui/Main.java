package ui;
import java.util.Scanner;
public class Main  {// abro codigo
     public static void main(String args[]) { //abro main
     try (Scanner lector = new Scanner(System.in)) {
      //pido las variables que se van a usar en el main 
      int counter = 0;
       int amountTwenty = 0;
       int amountTen = 0;
       String seatPlacement = "";
       String seatDecision = "";
       String tenDecision = "";
       String twentyDecision = "";
       int flightPrice = 1000000;
       String feeDecision = "";
       int valueFlight = 0;
       //cierre de variables pedidas 
       System.out.println(" Hi, welcome to our flight agency, the cost of a flight is 1.000.000 pesos. "); 
        System.out.println(" Are you going to travel alone or acompanied?. "); 
      String amountPeople = lector.next();
         lector.nextLine();   
         if (amountPeople.equals("alone")){
          System.out.println(" Alright, how heavy is your lugage? "); 
      double weight = lector.nextDouble();
      if (weight < 5) {//abro if para recomendar la tarifa xs en caso de que la maleta pese menos de 5kg
           System.out.println(" We recommend you the XS fee, which it includes personal lugage with a maximum of 3 kg for a price of 175.00 pesos and you can also choose your seat, for an extra price of 50.000 pesos and 15.000 more in case you choose a seat next to a window or the corridor/ please type xs ");
      }//cierro if de recomendacion de xs
      if (weight <= 0){//abro parametro si pone peso negativo 
        System.out.println("ERROR, PESO INVALIDO");
        return;
      }//cierro parametro si elige peso negativo 
      if (weight >=5 && weight < 10){//abro if de recomendacion de s en caso de que el usuario tenga una maleta mayor igual a 5kg y menor que 10kg
       System.out.println ( " We recommend you the S fee, which it includes personal lugage with a maximum of 3 kg and mile accumulation for the price of 218.750 pesos, you can also choose your seat, for an extra price of 50.000 pesos and 15.000 more in case you choose a seat next to a window or the corridor, you can also add extra 10 kg personal lugage for an extra price of 50.000 pesos each, with a maximum of 3, please type s");
      }//cierro if de recomendacion de s
      
      if (weight >= 10) {//abro if de recomendacion de tarifa M en caso de que el usuario tenga una maleta mayo a 10 kg 
               System.out.println ( " We recommend you the M fee, it includes personal lugage with a maximum of 3 kg and mile accumulation for the price of 284.375 pesos, you can also choose your seat and also add extra 10 kg personal lugage for an extra price of 50.000 pesos each, with a maximum of 3, and you can also add extra 23 kg personal lugage for an extra price of 100.000 pesos each, with a maximum of 2");
      }//cierro if de M
      
      System.out.println("");
      System.out.println(" which one would u like to choose?, please type xs/s/m");
         feeDecision = lector.next();
         lector.nextLine();  
         /*
          * Abro if si elige tarifa xs
          */
         if (feeDecision.equals("xs")){//si elige que quiere la tarifa xs
             System.out.println(" would u like to choose your own seat?");
                        System.out.println(" yes/no ");
              seatDecision = lector.next();
         lector.nextLine(); 
          if (seatDecision.equals("no")){//en caso de que eliga que no quiere una elegir una silla se cierra if y de una le devuelve el valor del vuelo

          }
         if (seatDecision.equals("yes")){
         System.out.println("great, now would you like to sit next to a window, the corridor or neither?");
           seatPlacement = lector.next();
         lector.nextLine(); 
         }
         }//cierro if si elige la tarifa xs 
        /*
         * abro if si elige tarifa s
         */
         if (feeDecision.equals("s")){//abro code si elige que quiere la tarifa S
              System.out.println(" Alright then, would you like to add extra 10kg lugage ");
                    System.out.println(" yes/no ");
                      tenDecision = lector.next();
                     lector.nextLine();   
                     if (tenDecision.equals("yes")) {//abro if si elige que si quiere maletas de 10kg
                      System.out.println(" how many do you want? max 3 ");
                         amountTen = lector.nextInt();
                        lector.nextLine();
                        if (amountTen < 1 || amountTen > 3){//abro parametros de maletas de 10kg
                          System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                          return;
                        }//cierro parametros de maletas de 10kg
                         }//cierre si elige que si quiere maletas de 10kg
         if (tenDecision.equals("no")){//if si elige que no quiere maletas de 10kg
         }//cierre si elige que no quiere maletas de 10 kg 
          System.out.println(" would u like to choose your own seat? ");
                        System.out.println(" yes/no ");
             seatDecision = lector.next();
         lector.nextLine(); 
          if (seatDecision.equals("yes")){//abro if en caso de que el man eliga que quiere elegir sus sillas 
           System.out.println("great, now would you like to sit next to a window, the corridor or neither?");
           seatPlacement = lector.next();
         lector.nextLine(); 
          } //cierro if en caso de que el man si eliga escoger una silla 
          if (seatDecision.equals("no")){//abro if en cambio de que el man no eliga ninguan silla 
          } //cierro if en caso de que el man no eliga ninguna silla 
        }//cierro code si elige que quiere el s
         /*
          * aqui abro el if si quiere elegir la tarifa M
          */
         if (feeDecision.equals("m")){//abro if si el usuario elige la tarifa M
      System.out.println(" Alright then, would you like to add extra 10kg lugage ");
                    System.out.println(" yes/no ");
                      tenDecision = lector.next();
                     lector.nextLine();   
                     if (tenDecision.equals("yes")) {//abro if si elige que si quiere maletas de 10kg
                      System.out.println(" how many do you want? max 3 ");
                         amountTen = lector.nextInt();
                        lector.nextLine();
                        if (amountTen < 1 || amountTen > 3){//abro parametros de maletas de 10kg
                          System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                          return;
                        }//cierro parametros de maletas de 10kg
                         }//cierre si elige que si quiere maletas de 10kg
         if (tenDecision.equals("no")){
         }
            System.out.println("would u like to add 23kg lugage?");
         System.out.println("yes/no");
           twentyDecision = lector.next();
                     lector.nextLine();   
                     if (twentyDecision.equals("yes")){//abro if si elige que quiere maletas de 23 kg
                          System.out.println(" how many do you want? max 2 ");
                         amountTwenty = lector.nextInt();
                        lector.nextLine();
                        if (amountTwenty < 1 || amountTwenty > 2){//abro parametros de maletas de 23kg
                          System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                          return;
                        }//cierro parametros de maletas de 23kg
                     }//cierro if si desea maletas de 23kg
                       if (twentyDecision.equals("no")){//if si elige que no quiere maletas de 23kg   
         }//cierre si elige que no quiere maletas de 23kg
         }//cierro if de M finally
         //devuelvo variables de subprocesos
         int priceSeat = seatValue(seatDecision, seatPlacement);
       int tenPrice = tenValue(amountTen);
       int valueFee = feeValue(feeDecision);
       int twentyPrice = twentyValue(amountTwenty);
        valueFlight = priceSeat + flightPrice + tenPrice + valueFee + twentyPrice;
       //pan
       seatValue(seatDecision,seatPlacement);
       tenValue(amountTen);
       feeValue(feeDecision);
       twentyValue(amountTwenty);
       //final rico hermoso
         System.out.println(" the full price of ur flight is " + valueFlight);
        }
        /*
         * 
         *  
         * aqui empieza el if va acompanado, es decir, repeticiones con while 
         * 
         * 
         */
        if (amountPeople.equals("acompanied")){//abre if si el man va acompañado
          System.out.println(" how many people are you going with?");
           int manyPeople = lector.nextInt();
           lector.nextLine();
           int[] flightValue = new int [manyPeople + 1];
           while (counter <= manyPeople) {//abro repeticion 
            System.out.println(" Alright, how heavy is your lugage? "); 
            double weight = lector.nextDouble();
            if (weight < 5) {//cierro if de xs 
                 System.out.println(" We recommend you the XS fee, it includes personal lugage with a maximum of 3 kg for a price of 175.00 pesos and you can also choose your seat, for an extra price of 50.000 pesos and 15.000 more in case you choose a seat next to a window or the corridor/ please type xs ");
            }//ciero if de xs
            if (weight >=5 && weight < 10){//abro if de s 
             System.out.println ( " We recommend yoy the S fee, it includes personal lugage with a maximum of 3 kg and mile accumulation for the price of 218.750 pesos, you can also choose your seat, for an extra price of 50.000 pesos and 15.000 more in case you choose a seat next to a window or the corridor, you can also add extra 10 kg personal lugage for an extra price of 50.000 pesos each, with a maximum of 3, please type s");
            }//cierro if de s
            
            if (weight >= 10) {//abro if de M
                     System.out.println ( " We recommend you the M fee, it includes personal lugage with a maximum of 3 kg and mile accumulation for the price of 284.375 pesos, you can also choose your seat and also add extra 10 kg personal lugage for an extra price of 50.000 pesos each, with a maximum of 3, and you can also add extra 23 kg personal lugage for an extra price of 100.000 pesos each, with a maximum of 2");
            }//cierro if de M
            
            System.out.println("");
            System.out.println(" which one would u like to choose?, please type xs/s/m");
               feeDecision = lector.next();
               lector.nextLine();  
               /*
                * aqui estoy abrinedo el if si elige la tarifa xs 
                */
               if (feeDecision.equals("xs")){//si elige que quiere la xs
                   System.out.println(" would u like to choose your own seat?");
                              System.out.println(" yes/no ");
                              seatDecision = lector.next();
               lector.nextLine(); 
                if (seatDecision.equals("no")){
        
                }
               if (seatDecision.equals("yes")){
               System.out.println("great, now would you like to sit next to a window, the corridor or neither?");
                 seatPlacement = lector.next();
               lector.nextLine(); 
               }
               }//cierro si elige que quiere la xs
               /*
                * aqui estoy abriendo todo el procedimiento si el man elige que quiere la tarifa s
                */
               if (feeDecision.equals("s")){//abro code si elige que quiere s
                    System.out.println(" Alright then, would you like to add extra 10kg lugage ");
                          System.out.println(" yes/no ");
                            tenDecision = lector.next();
                           lector.nextLine();   
                           if (tenDecision.equals("yes")) {//abro if si elige que si quiere maletas de 10kg
                            System.out.println(" how many do you want? max 3 ");
                               amountTen = lector.nextInt();
                              lector.nextLine();
                              if (amountTen < 1 || amountTen > 3){//abro parametros de maletas de 10kg
                                System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                                return;
                              }//cierro parametros de maletas de 10kg
                               }//cierre si elige que siquiere maletas de 10kg
               if (tenDecision.equals("no")){//if si elige que no quiere maletas de 10kg
               }//cierre si elige que no quiere maletas de 10 kg 
                System.out.println(" would u like to choose your own seat? ");
                              System.out.println(" yes/no ");
                   seatDecision = lector.next();
               lector.nextLine(); 
                if (seatDecision.equals("yes")){//seat decision
                 System.out.println("great, now would you like to sit next to a window, the corridor or neither?");
                 seatPlacement = lector.next();
               lector.nextLine(); 
                }
                if (seatDecision.equals("no")){
                }
               }//cierro code si elige que quiere el s
               /*
                * aqui abro el if si quiere elegir la tarifa M
                */
               if (feeDecision.equals("m")){//ABRO IF DE M
            System.out.println(" Alright then, would you like to add extra 10kg lugage ");
                          System.out.println(" yes/no ");
                            tenDecision = lector.next();
                           lector.nextLine();   
                           if (tenDecision.equals("yes")) {//abro if si elige que si 
                            System.out.println(" how many do you want? max 3 ");
                               amountTen = lector.nextInt();
                              lector.nextLine();
                              if (amountTen < 1 || amountTen > 3){//abro parametros de maletas de 10kg
                                System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                                return;
                              }//cierro parametros de maletas de 10kg
                             }//cierre si elige que si
               if (tenDecision.equals("no")){//if si elige que no 
               }//cierre si elige que no
               //empieza 23
                  System.out.println("would u like to add 23kg lugage?");
               System.out.println("yes/no");
                 twentyDecision = lector.next();
                           lector.nextLine();   
                           if (twentyDecision.equals("yes")){//abro if si el man si quiere 23
                                System.out.println(" how many do you want? max 2 ");
                               amountTwenty = lector.nextInt();
                              lector.nextLine();
                              if (amountTwenty < 1 || amountTwenty > 2){//abro parametros de maletas de 23kg
                                System.out.println(" ERROR, CANTIDAD DE MALETAS INVALIDAS");
                                return;
                              }//cierro parametros de maletas de 23kg
                           }//cierro if si desea 23
                             if (twentyDecision.equals("no")){//if si elige que no quiere 23           
               }//cierre si elige que no
               }//ciero if de M finally
               //abro variables
               int priceSeat = seatValue(seatDecision, seatPlacement);
             int tenPrice = tenValue(amountTen);
             int valueFee = feeValue(feeDecision);
             int twentyPrice = twentyValue(amountTwenty);
              valueFlight = priceSeat + flightPrice + tenPrice + valueFee + twentyPrice;
             //cierro variables 
               System.out.println(" the full price of ur flight is " + valueFlight);
               seatValue(seatDecision,seatPlacement);
               tenValue(amountTen);
               feeValue(feeDecision);
               twentyValue(amountTwenty);
               flightValue[counter] = valueFlight;
               counter++;
              }//cierro while 
              System.out.println("el precio total por cada cuenta es de:");
              for (int i = 0; i < manyPeople + 1; i++) {// ABRO FOR QUE MEUSTRA LA CUENTA DE CADA PERSONA 
                System.out.println("Cuenta persona " + (i+1) + " = " + flightValue[i]);
            }//CIERRO FOR QUE MUESTRA LA CUENTA D CADA PERSONA 
              }//cierro if de acompañado 
            }// CIERRO scanner
          }//cierro main  

/*
 * Nombre de la subrutina: valor por silla
 * Descripcion: en esta se ve la eleccion de el usuario, si desea silla y en que posicion, para luegor multiplicar y sumar valores para entregar el valor total de eleccion de silla
 * entrada: 
 * eleccion de silla y lugar de la silla
 * Salida:
 * valor de eleccion de silla 
 */
       public static int seatValue (String seatDecision, String seatPlacement) {
        int valueSeat = 0;
        int placementValue = 0;
        valueSeat = seatDecision.equals("yes")? valueSeat + 50000 : valueSeat;
        valueSeat = seatDecision.equals("no")? valueSeat : valueSeat;
        placementValue = seatPlacement.equals("window")? placementValue + 15000: placementValue;
        placementValue = seatPlacement.equals("corridor")? placementValue + 15000 : placementValue;
        placementValue = seatPlacement.equals("neither")? placementValue : placementValue;
        int priceSeat = valueSeat + placementValue;
           return priceSeat;
     }//cierra subrutina 
     /*
      * Nombre de la subrutina: valor de precio de maletas 10 kg
      * Descripcion: en caso de que si eliga llevar maletas de 10kg aqui se multiplica la cantida de amletas por el precio de maletas individual 
      * Entradas:
      * Cantidad de maletas
      * Salidas:
      * precio total de maletas elegidas
      */
      public static int tenValue (int amountTen) {
        int tenPrice = 0;
        tenPrice = 50000 * amountTen;
           return tenPrice;
     }//cierra subrutina 
     /*
      * Nombre de la subrutina: valor de tarifa segun eleccion.
      * Descripcion: se lee el string del nombre de la tarifa (xs, s, m) y segun este se le suma el valor de acuerdo a la tarifa elegida 
      * Entradas:
      * Eleccion de tarifa 
      * Salidas:
      * valor de tarifa 
      */
     public static int feeValue (String feeDecision) {
      int valueFee = 0;
      valueFee = feeDecision.equals("xs")? valueFee + 175000 : valueFee;
      valueFee = feeDecision.equals("s")? valueFee + 218000 : valueFee;
      valueFee = feeDecision.equals("m")? valueFee + 283400 : valueFee;
         return valueFee;
   }//cierra subrutina 
   /*
    * Nombre de la subrutina: valor de maletas de 23kg 
    * Descripcion: al igual que la subrurtina de maletas de 10kg; en este tambien se hace lo mismo multiplicando la cantida de maletas elegidas por el precio individual de maleta 
    * Entradas:
    * cantidad de maletas de 23kg elegidas 
    * Salidas:
    * valor total de maletas de 23 kg elegidas 
    */
    public static int twentyValue (int amountTwenty) {
      int twentyPrice = 0;
      twentyPrice = 100000 * amountTwenty;
         return twentyPrice;
   }//cierra subrutina 
}//cierro code 