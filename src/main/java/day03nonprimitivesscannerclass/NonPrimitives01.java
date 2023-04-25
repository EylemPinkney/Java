package day03nonprimitivesscannerclass;

public class NonPrimitives01 {

    public static void main(String[] args) {

        String studentName = "Tom Hanks";
        String teacherName = "Tom Hanks";
        String parentName = new String("Tom Hanks");

        int age = 12;

        /*

        What are the differences between "Primitive" and "Non-Primitive" data types?
        1)"Non-Primitive" data is stored in Heap Memory and "Primitive" data is stored in Stack Memory.
        2)"Non-Primitive" data types are infinitely many, "Primitive" data types are just 8
        3)"Non-Primitive" can be created by Java and JAva Developers, but "Primitive" data types can be created just by JAva.
        4)"Non-Primitive" data type names start with upper case, but "Primitive" data type names start with lower case.
        *5)"Non-Primitive" data types have !)Value and 2)Methods in them
           "Primitive" data types have one value
         */

        /*
        1)When you create a String, Java will check String Pool first. If the value exist in the String Pool, Java will not create
        a new container and Java will use the existing container.

        2But if the String Pool doesnt have the value you assigned, Java will create a new container.

        2)Sometimes we may need a different container even the values are the same.How can we do it?
        "String parentName = new String("Tom Hanks");" creates a new container in the Heap Memory.


         */


    }
}
