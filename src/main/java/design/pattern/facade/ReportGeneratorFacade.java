package design.pattern.facade;


public class ReportGeneratorFacade {
    public static void generateReport(ReportType type, String location) {
        if (type == null) {
            // throes business exceptions
        }
        Report report = new Report();
        report.setData(new ReportData());
        report.setHeader(new ReportHeader());
        report.setFooter(new ReportFooter());

        ReportWriter reportWriter = new ReportWriter();

        switch (type) {
            case HTML:
                reportWriter.writeHtmlReport(report, location);
                break;
            case PDF:
                reportWriter.writePdfReport(report, location);
                break;
        }
    }
}
