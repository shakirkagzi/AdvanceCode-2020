package design.pattern.facade;

public class ReportWriter {
    public void writeHtmlReport(Report report,String location){
        report.getHeader().getReportHeader();
        report.getFooter().getReportFooter();
        report.getData().getReportData();
    }

    public void writePdfReport(Report report,String location){
        report.getHeader().getReportHeader();
        report.getFooter().getReportFooter();
        report.getData().getReportData();
    }
}
