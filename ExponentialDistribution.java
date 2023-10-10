/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentialdistribution;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
public class ExponentialDistribution {

    static double getExponential()
                                                       {              
                                                            Random rand = new Random();                                                   
                                                        double value1 = Math.random();
                                                               double   lambda=1/value1;
                                                         return  Math.log(1-rand.nextDouble())/(-lambda);
                                                               
                                                       }                                               
                                                                    public static void main(String[] args) {
                                                                                    double t = 0;
                                                                                    double a,b;                                       
                                                                                  /*    a=Math.random();
                                                                                    b=Math.random();*/
                                                                                  a=getExponential();
                                                                                    b=getExponential(); 
                                                                              int[] Aarray =new int[20];
                                                                              int[] Barray =new int[20];
                                                                               int gapa = 0;
                                                                                            int gapb = 0;

                                                                                          for(int i=0;i<100000;i++){
                                                                                            if(b>a){     // compare gap b>gap a      
                                                                                                 gapb=0;
                                                                                              t=a;
                                                                                              a=a+Math.random();
                                                                                              gapa++; //   gap for total number                     
                                                                                            }
                                                                                            Aarray[gapa]++;
                                                                                          
                                                                                            if(a>b){  // compare gap a>gap b
                                                                                              gapa=0;
                                                                                              t=b;
                                                                                              b=b+Math.random();
                                                                                              gapb++;
                                                                                            }
                                                                                            Barray[gapb]++;
                                                                                           
                                                                                          }
                                                                             System.out.println("Array of Gap a Exponential Distribution "+Arrays.toString(Aarray));
                                                                                System.out.println("Array of Gap b Exponential Distribution "+Arrays.toString(Barray));
   }   }

