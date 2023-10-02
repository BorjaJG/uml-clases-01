public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //* Se crea una nueva instancia de la clase  ComputerMainframe y se le asigna  valores a
        // sus atributos para que los imprima con el metodo toString.

        ComputerMainframe computerMainframe = new ComputerMainframe();

        computerMainframe.brand = "e23";
        computerMainframe.model = "24534h";
        computerMainframe.price = 25.5;
        computerMainframe.speed = "45335GH";

        System.out.println(computerMainframe.toString());


        //*  Se crea una nueva instancia de la clase  ComputerProcessor y se le asigna  valores a
          // sus atributos para que los imprima con el metodo toString.

        ComputerProcessor computerProcessor = new ComputerProcessor();

        computerProcessor.brand = "A345";
        computerProcessor.model = "554543y";
        computerProcessor.price = 200.03;
        computerProcessor.speed = "947GH";

        System.out.println(computerProcessor.toString());

        //*    Se crea una nueva instancia de la clase  GraphicCard y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.

        GraphicCard graphicCard = new GraphicCard();

        graphicCard.brand = "Racer";
        graphicCard.model = "453ty";
        graphicCard.price = 24.0;
        graphicCard.speed = "453GH";

        System.out.println(graphicCard.toString());


        //* Se crea una nueva instancia de la clase  HDD y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.



        HDD hdd = new HDD();

        hdd.brand = "hp";
        hdd.model = "234t1";
        hdd.price = 12.0;
        hdd.speed = "843GH";

        System.out.println(hdd.toString());

        //*  Se crea una nueva instancia de la clase  Mouse  y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.
        Mouse mouse = new Mouse();

        mouse.brand = "racer";
        mouse.model = "5442t";
        mouse.price = 341.0;
        mouse.speed = "394383GH";

        System.out.println(mouse.toString());

        //* Se crea una nueva instancia de la clase  Perpherals y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.

        Perpherals perpherals = new Perpherals();

        perpherals.brand = "Price";
        perpherals.model = "324k";
        perpherals.price = 54.0;
        perpherals.speed = "54GH";

        System.out.println(perpherals.toString());

        //*  Se crea una nueva instancia de la clase  PowerSupply y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.

        PowerSupply powerSupply = new PowerSupply();

        powerSupply.brand = "Sirius";
        powerSupply.model = "34g34";
        powerSupply.price = 34.0;
        powerSupply.speed = "344Gh";

        System.out.println(powerSupply.toString());


        //* Se crea una nueva instancia de la clase  RAM y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.


        RAM ram = new RAM();

        ram.brand = " Racer ";
        ram.model = "45224g";
        ram.price = 244.0;
        ram.speed = "23424GH";

        System.out.println(ram.toString());

        //* Se crea una nueva instancia de la clase  Screen y
        // se le asigna  valores a sus atributos para que los imprima con el metodo toString.

        Screen screen = new Screen();

        screen.brand = " Racer ";
        screen.model = " 34324yr ";
        screen.price = 25.0;
        screen.speed = " 243243GH ";

        System.out.println(screen.toString());








    }
}