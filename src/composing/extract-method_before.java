void printOwing() {
  printBanner();
  printDetails(name, getOutstanding());
}

void printDetails (String name, double standing) {
  System.out.println("name: " + name);
  System.out.println("amount: " + standing);
}