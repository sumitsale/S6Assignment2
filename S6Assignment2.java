abstract class Instrument {
     protected String name;
     abstract public void play();
}

abstract class StringedInstrument extends Instrument {
     protected int numberOfStrings;
}

 class ElectricGuitar extends StringedInstrument {

     public ElectricGuitar() {
          super();
          this.name = "Guitar";
          this.numberOfStrings = 6;
     }

     public ElectricGuitar(int numberOfStrings) {
          super();
          this.name = "Guitar";
          this.numberOfStrings = numberOfStrings;
     }

     @Override
     public void play() {
          System.out.println("An electric " + numberOfStrings + "-string " + name
				+ " is rocking!");
     }
}

 class ElectricBassGuitar extends StringedInstrument {

     public ElectricBassGuitar() {
          super();
          this.name = "Bass Guitar";
          this.numberOfStrings = 4;
     }

     public ElectricBassGuitar(int numberOfStrings) {
          super();
          this.name = "Bass Guitar";
          this.numberOfStrings = numberOfStrings;
     }

     @Override
     public void play() {
          System.out.println("An electric " + numberOfStrings + "-string " + name
				+ " is rocking!");
     }
}


public class S6Assignment2 {

     public static void main(String[] args) {
          ElectricGuitar guitar = new ElectricGuitar();
          ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
          
          guitar.play();
          bassGuitar.play();

          guitar = new ElectricGuitar(7);
          bassGuitar = new ElectricBassGuitar(5);

          guitar.play();
          bassGuitar.play();
     }
}
