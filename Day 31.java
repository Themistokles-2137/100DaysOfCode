interface Instructor {
    public void Name();
  }
  class Instruct implements Instructor {
    public void Name() {
      System.out.println("Rakesh Singh");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Instruct myName = new Instruct(); 
      myName.Name();
    }
  }