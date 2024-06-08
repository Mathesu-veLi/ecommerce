package entities;

public class Cpf {
  private String formattedCpf;

  public Cpf(String originalCpf) {
    this.formattedCpf = originalCpf.replaceAll("\\D", "");
  }

  // TODO: Calls the validate function in the constructor and throw a Error if cpf is invalid

  public boolean validate() {
    if (formattedCpf.length() != 11) return false;
    
    String cpfWithoutFinalDigits = formattedCpf.substring(0, formattedCpf.length() - 2);

    String newCpf = cpfWithoutFinalDigits;
    for (int i = 0; i < 2; i++) {
      newCpf += discoverDigit(newCpf);
    }

    return newCpf.equals(formattedCpf);
  }

  private String discoverDigit(String cpf) {
    int sum = 0;
    for (int i = 0, multiplier = cpf.length() + 1; i < cpf.length(); i++, multiplier--) {
      int actualDigit = Character.getNumericValue(cpf.charAt(i));
      sum += actualDigit * multiplier;
    }

    int digit = (sum * 10) % 11;
    if (digit > 9) digit = 0;

    return String.valueOf(digit);
  }

  @Override
  public String toString() {
    return formattedCpf;
  }
}
