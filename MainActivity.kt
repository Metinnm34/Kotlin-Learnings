package com.han.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        println("-------Integer------")


        var a  = 3
        var b  = 5

        println(a * b)

        var age = 35

        val result = age / 2 * 8

        println(result)


         //Defining
        val myInteger : Int

        //Initialize


        val c : Int = 5

        println(c/2)


        //Double && Float

        println("-------Double && Float------")

        val pi = 3.14

        println(pi * 4)


        val myFloat = 3.14f

        println(myFloat * 4)



        //String

        println("-------String------")


        val myString = "Metin"

        val name = "Metin"
        val surname = "Murteza"


        val fullname = name + " " + surname

        println(fullname)




        //Boolean

        println("-------Boolean------")
        var myBoolean : Boolean = true
        myBoolean = false


        var isAlive = true

        println(3 < 5)
        println(6 < 1 + 2)
        println(3 != 3)

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && AND-ve (3 && 5)vb.
        // || or - yada (3 || 5 )vb.




      /*  age = 48

        println(age)


        //Constants


        val time = 12

*/


    }
}