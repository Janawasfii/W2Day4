package com.company;

public class Main {

    public static void main(String[] args) {

//EX1
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//two numbers , takes two numbers as input
       /* try{
        System.out.print("Input first number:");
        int number1=scan.nextInt();
        System.out.print("Input second second number:");
        int number2=scan.nextInt();
            System.out.println(number1 + " + " + number2 + " = " +(number1+number2));
            System.out.println(number1 + " - " + number2 + " = " +(number1-number2));
            System.out.println(number1 + " x " + number2 + " = " +(number1*number2));
            System.out.println(number1 + " / " + number2 + " = " +(number1/number2));
            System.out.println(number1 + " mod " + number2 + " = " +(number1%number2));
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Can't enter a string");
        }catch (Exception e) {
            System.err.println("An unexpected error occurred"}
        */


//EX2
// Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
      /*  try{
        System.out.print("Input a number:");
        int number=scan.nextInt();
        for(int i=1; i<=10;i++){
            int result=0;
            result= i*number;
            System.out.println(number+ " x " + i + " = " +result);}}
        catch(InputMismatchException e){
            System.out.print("Invalid input please enter only a number");}
            catch (Exception e) {
            System.err.println("An unexpected error occurred"}}
       */

//EX3
// Write a Java program to print the area and perimeter of a circle
     /*   try{
            System.out.println("Radius:");
            double raduis = scan.nextDouble();

            check(raduis);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());}
        catch(InputMismatchException e){
        System.out.println("Invalid input please enter only a number");
        }catch (Exception e) {
            System.err.println("An unexpected error occurred"}
        } }
        public static void check(double raduis) throws Exception{
                if (raduis < 0) {
                    throw new Exception("Raduis must be positive number");}
            double area = Math.PI * raduis * raduis;
            double perimeter = 2 * Math.PI * raduis;
            System.out.println("Perimeter is: " + perimeter);
            System.out.println("Area is:" + area);

 }}*/

//EX4
//Java program to find out the average of a set of integers
     /*   try {
            int count, sum = 0;
            double avg;
            System.out.println("Enter the count of numbers: ");
            count = scan.nextInt();
            for (int i = 1; i <= count; i++) {
                System.out.println("Enter an integer: ");
                int number = scan.nextInt();
                sum += number;
                checks(count); }
            avg = (double) sum / count;
            System.out.println("The average is:" + avg);
        } catch (ArithmeticException E) {
            System.out.println("Invalid");
        }catch(InputMismatchException e){
            System.out.println("Invalid input please enter only a number");
         }catch (Exception e) {
            System.err.println("An unexpected error occurred"}}
    public static void checks(int count) throws Exception {
        if (count == 0) {
            throw new Exception("Cannot calculate avg");
        }

    }*/
//}

//EX5
// Write a Java program that accepts three integers as input, adds the first two integers
//together, and then determines whether the sum is equal to the third integer.
       /* try{
        int firNum, secNum,thirNum,total;
        System.out.print("Input the first number: ");
        firNum = scan.nextInt();
        System.out.print("Input the second number: ");
        secNum = scan.nextInt();
        System.out.print("Input the third number: ");
        thirNum = scan.nextInt();
        total= firNum+ secNum;
        boolean isEqualtoSum = total == thirNum;
        System.out.println("The result is:" +isEqualtoSum);}
        catch (InputMismatchException e){
            System.out.println("Invalid input please enter only a number");
        }catch (Exception e) {
            System.err.println("An unexpected error occurred"}

        }}*/


//EX6
//Write a Java program to reverse a word
       /* try{
      System.out.print("Input a word:");
        String word =scan.nextLine();
        String word2=" ";
        for(int i=word.length()-1; i>=0; i--){
            word2= word2+word.charAt(i);
        }System.out.print("Reverse word: "+word2);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input please enter only a string");
        }catch (Exception e) {
            System.err.println("An unexpected error occurred"}}*/



//EX7
// Java program to check whether the given number is even or odd
      /* try{
       System.out.println("Enter a number:");
        int num= scan.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");}
        else{
            System.out.println("The number is Odd");
        }}catch (InputMismatchException e) {
        System.err.println("Invalid input please enter only a number");
       } catch (Exception e) {
        System.err.println("An unexpected error occurred");}}}

       //*/
//EX8
// Java program to convert the temperature in Centigrade to Fahrenheit
       /* try{
        System.out.println("Enter temperature in Centigrade:");
        double centi= scan.nextDouble();
        double fahr =(centi*9.0/5.0)+32.0;
        System.out.println("Temperature in Fahrenheit is:"+fahr);}
        catch (InputMismatchException e) {
            System.err.println("Invalid input please enter only a number");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred");}}}*/

//EX9
//Write a Java program that takes a string and a number from the user,then prints the
//character in the given index.
      /* try{
        System.out.print("Input a string: ");
        String str = scan.nextLine();
        System.out.print("Input a number: ");
        int ind;
        do {
           while (!scan.hasNextInt()) {
           System.out.println("Input a string:");
           scan.next();
            }
           ind = scan.nextInt();
           } while (ind < 0 || ind >= str.length());
           char character = str.charAt(ind);
            System.out.println(character);}
        catch (InputMismatchException e) {
        System.err.println("Invalid input please enter a string for the first input  and an integer for the index");
        } catch (NoSuchElementException e) {
        System.err.println("Scanner encountered unexpected end of input");}}}*/

//EX10
       /* try{
        System.out.print("Width:");
        double width = scan.nextDouble();
        System.out.print("Height: ");
        double height = scan.nextDouble();
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.printf("Area is: %.2f\n"+ width+"*"+ height, area);
        System.out.printf("Perimeter is: %.2f\n"+"2("+width+"*"+height+")" ,perimeter);}
     catch (InputMismatchException e){
            System.out.println("Please enter numbers for width and height.");}
     finally {
        scan.close();
    }}}*/
    }
}
