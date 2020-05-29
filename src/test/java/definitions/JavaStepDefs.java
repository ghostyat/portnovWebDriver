package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class JavaStepDefs {
    @Given("I write java step")
    public void iWriteJavaStep() {
        System.out.println("Hello world");
        String firstName="Peter";
        String lastName="Orange";
        System.out.println(firstName);
        System.out.println(lastName);
        String fN = "Hey";
        String lN = "Kitty";
        System.out.println(fN+ " "+lN);

    }

    @And("I print {string} in console")
    public void iPrintConsole(String arg0) {
        System.out.println(arg0);
        System.out.println(arg0.toLowerCase());
        System.out.println(arg0.length());
        System.out.println(arg0.toUpperCase());

    }

    @And("I compare {string} and {string}")
    public void iCompareAnd(String arg0, String arg1) {
        if (arg0.equalsIgnoreCase(arg1)){
            System.out.println("Strings are equal: " +arg0 + " and " + arg1);
        }
        else {
            System.out.println("Strings are not equal");
        }
    }

    @And("I do action with {string} and {string}")
    public void iDoActionWithAnd(String arg0, String arg1) {
        System.out.println("First variable is " + arg0);
        System.out.println("Second variable is " + arg1);
        System.out.println(arg0+" is == to " +arg1 +"? " +(arg1==arg0)); //not use with string or object
        System.out.println("Is " +arg0 +" equal to " +arg1 +" ? " + arg0.equals(arg1));
    }

    @Given("I run operators with {int} and {int}")
    public void iRunOperatorsWithAnd(int arg0, int arg1) {
        if (arg0<arg1){
            System.out.println(arg0 +" is smaller than " + arg1);
        }
        else if (arg0==arg1){
            System.out.println(arg0 + " is equal to " + arg1);
        }
        else {
            System.out.println(arg0 +" is larger than " + arg1);
        }
        System.out.println("The sum the two integers is " + (arg0+arg1));
        System.out.println("The product of the two integers is " + (arg0*arg1));
        System.out.println("The difference the two integers is " + (arg0-arg1));
        System.out.println("The division of the two integers is " + (arg0/arg1));
    }

    @Given("I compare boolean {string} and {string}")
    public void iCompareBooleanAnd(String arg0, String arg1) {
        if (arg0.equals(arg1)){
            System.out.println("Equal!");
        }
        else {
            System.out.println("Not Equal!");
        }
    }

    @Given("I print URL in {string} page")
    public void iPrintURLInPage(String arg0) {
        if (arg0.equalsIgnoreCase("google")){
            System.out.println("https://www.google.com ");
        }
        else if (arg0.equalsIgnoreCase("sample")){
            System.out.println("http://skryabin.com/webdriver/html/sample.htmlc");
        }
        else {
            System.out.println("http://www." + arg0 +".com");
        }
    }


    @Given("I have an array goceryList")
    public void iHaveAnArrayGoceryList() {

        String[] arg0={"Egg", "pen", "Toy", "Conditioner"};

        for (int i = 0; i < arg0.length; i++)
        {System.out.print(i +": ");
            System.out.println(arg0[i]);
        }

        for (String j : arg0) {
            System.out.println(j);
        }
    }

    @Given("I have a for loop")
    public void iHaveAForLoop() {
        int[] arr = {3,9,14,8,3,10};
        for (int i = 0; i < arr.length; i++)
        { System.out.println(arr[i]); }

    }

    @Given("I have a for-each loop")
    public void iHaveAForEachLoop() {
        int[] arr = {3,9,14,8,3,10};
        for (int element : arr)
        { System.out.println(element); }
    }

    @Given("I print array goceryList")
    public void iPrintArrayGoceryList() {
    String[] groceryList = {"milk","fish","apple","orange","banana"};
    for (int i=0; i <groceryList.length; i++){
            System.out.println(i +": " + groceryList[i]);
        }

    }

    @Given("I have a foreach gocery loop")
    public void iHaveAForeachGoceryLoop() {
        String[] groceryList = {"milk","fish","apple","orange","banana"};
        for (String elem: groceryList){
            System.out.println(elem);
        }
    }

    @Given("I print numeric array")
    public void iPrintNumericArray() {
        int[] numbers={0,1,2,3,4,5,6,7,8,9};
    }
}
