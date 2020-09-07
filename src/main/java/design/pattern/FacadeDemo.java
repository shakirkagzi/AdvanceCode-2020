package design.pattern;

import design.pattern.facade.ReportGeneratorFacade;
import design.pattern.facade.ReportType;

public class FacadeDemo {
    public static void main(String[] args) {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.HTML,"dummylocation_HTML");
        reportGeneratorFacade.generateReport(ReportType.PDF,"dummylocation_PDF");
    }
}
