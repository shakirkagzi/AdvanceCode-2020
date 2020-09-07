package design.pattern.facade;

import lombok.Getter;
import lombok.Setter;


public class Report {

    private ReportHeader header;
    private ReportData data;
    private ReportFooter footer;

    public Report(){

    }

    public ReportHeader getHeader() {
        return header;
    }

    public void setHeader(ReportHeader header) {
        this.header = header;
    }

    public ReportData getData() {
        return data;
    }

    public void setData(ReportData data) {
        this.data = data;
    }

    public ReportFooter getFooter() {
        return footer;
    }

    public void setFooter(ReportFooter footer) {
        this.footer = footer;
    }
}
