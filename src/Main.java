/*
 *  Created on: 21.10.2022
 *  Author:     Enno Stassny
 *  Task:       Prog_1_5_K_3_2
 */

/**
 * This program prints the value range of all primitive data types
 */
public class Main
{
    //Start of the program
    public static void main(String[] args)
    {
        //Value range for byte
        System.out.println("Value range for byte:    " + Byte.MIN_VALUE           + " - " + Byte.MAX_VALUE);

        //Value range for short
        System.out.println("Value range for short:   " + Short.MIN_VALUE          + " - " + Short.MAX_VALUE);

        //Value range for integer
        System.out.println("Value range for integer: " + Integer.MIN_VALUE        + " - " + Integer.MAX_VALUE);

        //Value range for long
        System.out.println("Value range for long:    " + Long.MIN_VALUE           + " - " + Long.MAX_VALUE);

        //Value range for float
        System.out.println("Value range for float:   " + Float.MIN_VALUE          + " - " + Float.MAX_VALUE);

        //Value range for double
        System.out.println("Value range for double:  " + Double.MIN_VALUE         + " - " + Double.MAX_VALUE);

        //Value range for char
        System.out.println("Value range for char:    " + (int)Character.MIN_VALUE + " - " + (int)Character.MAX_VALUE);

    }
}
