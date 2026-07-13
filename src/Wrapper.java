public class Wrapper {

    public static void main(String[] args){

//        Wrapper classes: They are used to turn primitive datatypes into their corresponding objects
//        This is usefully because these wrapper classes come up with useful methods to those datatypes
//        This wrapping is also necessary cz there some classes that only allow wrapped objects instead of single primitives

//        Auto-boxing: Is when Java compiler convert a primitive datatype into its corresponding object
//        Auto-unboxing: Is when java compiler does the reverse i.e. from object back to primitive


        // Auto-boxing

        Integer wrapperInt = 123;
        Boolean wrapperBool = true;
        Character wrapperCh = 'a';
        Double wrapperDouble = 15.5;

        String wrappedInt = wrapperInt.toString();
        System.out.println(wrappedInt);

        // Unboxing

        int primitiveInt = wrapperInt;
        boolean primitiveBool = wrapperBool;
        char primitiveCh = wrapperCh;
        double primitiveDouble = wrapperDouble;

//      We can also convert integers, booleans and characters into strings with .toString and reverse with parseInt ...
//      ⚠️ Each Datatype class has toString and parseInt methods

        String a = Integer.toString(25);
        String b = Double.toString(26.97);
        String d = Boolean.toString(true);
        String c = Character.toString('a');

        String whole = a + b + c + d;

        System.out.println(whole);


//        From Strings to ints, booleans and doubles

        int num1 = Integer.parseInt("1");
        boolean isGood = Boolean.parseBoolean("true");
        double price = Double.parseDouble("99.99");
    }
}
