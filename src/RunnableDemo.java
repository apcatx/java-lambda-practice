public class RunnableDemo {
  public static void main(String[] args) {

    // !! - Write an anonymous Runnable class here
    Runnable anonymousRun = new Runnable() {
      @Override
      public void run() {
        System.out.println("Anonymous run");
      }
    };
    anonymousRun.run();

    //It can just print out "Anonymous run" or similar


    // !! - Write a lambda function here
    //It can also print out something like "Lambda run"
    Runnable lambdaRun = () -> System.out.println("Lambda run");

    lambdaRun.run();
  }
}