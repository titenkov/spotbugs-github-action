public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

  /**
   * Example for "NP: Method with Boolean return type returns explicit null" {@code (NP_BOOLEAN_RETURN_NULL)}.
   */
  public Boolean booleanMethod() {
    return null;
  }

  /**
   * Example for "CNT: Rough value of known constant found" {@code (CNT_ROUGH_CONSTANT_VALUE)}.
   */
  public static double circumference(double diameter) {
    return diameter * 3.141;
  }

  /**
   * Example for "CN: Class defines clone() but doesn't implement Cloneable" {@code (CN_IMPLEMENTS_CLONE_BUT_NOT_CLONEABLE)}.
   */
  @Override
  public Object clone() {
    return new HelloWorld();
  }

}
