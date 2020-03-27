package IteratingThroughArray;



public class PersonHandler {

    private Person[] personArray;

    // constructor
    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        int x = 0;
        String result = ""; //initialize "result"

        while (x < personArray.length) {
            result += personArray[x];
            x++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";

        for (int x = 0; x < personArray.length; x++)
            result += personArray[x];
        return result;
    }

    public String forEachLoop() {
        String result = "";

        for (Person x : getPersonArray()) {
            result += x;
        }
        return result;
    }
    public Person[] getPersonArray (){
        return personArray;
    }
}
