package com.hsg.dpatterns.factory;

public class FileExporterFactory {

    public enum FileType {
        PDF,
        EXCEL;
    }

    public static FileExporter getInstance(FileType fileType) {
        switch (fileType) {
            case EXCEL:
                return new ExcelExporter();
            case PDF:
                return new PdfExporter();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
