/**
 * @ author : Percy Ratheko
 * version : 1.0.o
 *The notebook class
 */

import java.util.concurrent.Callable;
import java.util.function.Consumer;


public class NoteBook
{

    public static void main(String[] args)
    {

        sayHello();

        // lambda expression with zero inputs
        final Runnable stringConsumer3 = () -> sayHello();
        stringConsumer3.run();

        // using a method reference
        final Runnable stringConsumer4 = NoteBook::sayHello;
        stringConsumer4.run();

        printNote("uhm....im lost");

        // lambda expression with one input
        final Consumer<String> stringConsumer1 = (String s) -> printNote(s);
        stringConsumer1.accept("modisha wa dikgomo");

        // using a method reference for the same operation
        final Consumer<String> stringConsumer2 = NoteBook::printNote;
        stringConsumer2.accept("...umdali the creator");





    }



    public static void printNote(final String note)
    {
        System.out.println(note);
    }

    public static void sayHello(){
        System.out.println("...hello to the world");
    }




}
