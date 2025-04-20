public class AnotherMain {
  public static void main(String[] args) {
    List<String> customerNames = List.of("Alice", "Bob", "Charlie");
    List<Double> dailyRevenue = List.of(1250.75, 980.25, 1430.60);
    List<Integer> productRatings = List.of(4, 5, 3, 5);

    ReportService.exportAsGenericReport(customerNames);
    System.out.println("---");
    ReportService.exportAsGenericReport(dailyRevenue);
    System.out.println("---");
    ReportService.exportAsGenericReport(productRatings);
  } 
}
