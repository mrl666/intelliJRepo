package org.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println();//sout

        //Apache commons StringUtils
        String nullString = null;
        String emptyString = "";
        String blankString = "\n \t   \n";

        if (StringUtils.isEmpty(nullString)) {
            System.out.println("nullString isn't null");
        }

        if(StringUtils.isEmpty(emptyString)) {
            System.out.println("emptyString is empty");
        }

        if(StringUtils.isBlank(blankString)) {
            System.out.println("blankString is blank");
        }

        //Functional programming
        System.out.println(incrementByOneFunction.apply(1));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
        // Consumer Functional interface. like a void method
        greetCustomerConsumer.accept("Maria");
        System.out.println(isStringLongThanFiveCharsPredicate.test("Marias"));
    }

    //Functional programming
    static Function<Integer, Integer> incrementByOneFunction = number -> number++;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    static Consumer<String> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer);
    static Predicate<String> isStringLongThanFiveCharsPredicate = stringToTest ->
            stringToTest.length() > 5;

}
