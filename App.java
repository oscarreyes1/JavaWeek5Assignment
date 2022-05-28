interface Logger {

  public void Log(String text);

  public void Error(String text);

}


class AsteriskLogger implements Logger {
  public void Log(String text) {
    System.out.println("***" + text + "***");
  }

  public void Error(String text) {
    System.out.println("*****************");
    System.out.println("***Error:" + text + "***");
    System.out.println("*****************");

  }
}


class SpacedLogger implements Logger {
  public void Log(String text) {

    for (int i = 0; i < text.length(); i++) {
      System.out.print(text.charAt(i) + " ");

    }
  }

  public void Error(String text) {
    System.out.print("ERROR:");

    for (int i = 0; i < text.length(); i++) {
      System.out.print(text.charAt(i) + " ");

    }

  }
}


public class App {

  public static void main(String[] args) {
    
    AsteriskLogger asteriskLogger = new AsteriskLogger();
    asteriskLogger.Log("Hello");

    asteriskLogger.Error("Hello");

    SpacedLogger spacedLogger = new SpacedLogger();
    spacedLogger.Log("Hello");

    System.out.println();

    spacedLogger.Error("Hello");

  }

}
