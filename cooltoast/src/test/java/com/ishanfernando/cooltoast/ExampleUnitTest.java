package com.ishanfernando.cooltoast;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_sum(){

        int n = 6;
        int k = 3;
        int ar[] = {1,3 ,2 ,6 ,1, 2};
            int count = 0;
            if( n > 1){
                for(int c = 0 ; c < n - 1 ; c++){
                    for(int i = c+1 ; i < n ; i++){

                        if(ar[c] < ar[i] && (ar[c] +ar[i]) % k == 0  ){
                            System.out.println(ar[c] +" - "+ ar[i]);
                            count++;
                        } else{
                            System.out.println(ar[c] +" - "+ ar[i] +" -- ");
                        }
                    }
                }
            }

    }
}