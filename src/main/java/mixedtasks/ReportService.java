package mixedtasks;

import java.util.List;

public class ReportService {
  public static void exportAsGenericReport(List<?> list) {
    for (OBject item : list) {
      System.out.println(item);
    }
  }
}
