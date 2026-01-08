/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.findminelemofarray;
import java.io.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class FindMinElemOfArray 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a count of elements in array");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var nElems = Integer.parseInt(bufStdIn.readLine());
        if(nElems == 0)
        {
            System.out.println("Empty arrays not allowed");
            System.exit(1);
        }
        var iNumbers = new int[nElems];
        var oRnd = new Random();
        System.out.println("Generating array by filling " + nElems + " elements");
        for(int i = 0; i < nElems; i++)
        {
            iNumbers[i] = oRnd.nextInt(1, 100);
            System.out.format("%d ", iNumbers[i]);
        }
        var iMin = iNumbers[0];
        var nIndex = 0;
        for(int i = 1; i < nElems; i++)
        {
            if(iNumbers[i] < iMin)
            {
                iMin = iNumbers[i];
                nIndex = i;
            }
        }
        System.out.format
        (
           "\r\nFound minimum element:%d with index %d\r\n", 
           iMin, nIndex
        );
    }
}
