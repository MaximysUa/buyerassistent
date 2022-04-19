package ru.tkachenko.buyerassistent.summary.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import ru.tkachenko.buyerassistent.summary.entity.SummaryRowEntity;

public class SummaryEntityWriter {

    public static void writeToRow(XSSFCellStyle dateStyle, SummaryRowEntity summaryRowEntity, Row row, boolean isFullCopy) {
        if (isFullCopy) {
            writeFullEntityToRow(dateStyle, summaryRowEntity, row);
        } else {
            writeClippedEntityToRow(dateStyle, summaryRowEntity, row);
        }
    }

    private static void writeFullEntityToRow(XSSFCellStyle dateStyle, SummaryRowEntity summaryRowEntity, Row row) {
        row.createCell(0).setCellValue(summaryRowEntity.getSupplier());
        row.createCell(1).setCellValue(summaryRowEntity.getMill());
        row.createCell(2).setCellValue(summaryRowEntity.getBranch());
        row.createCell(3).setCellValue(summaryRowEntity.getSellType());
        row.createCell(4).setCellValue(summaryRowEntity.getClient());
        row.createCell(5).setCellValue(summaryRowEntity.getConsignee());
        row.createCell(6).setCellValue(summaryRowEntity.getProductType());
        row.createCell(7).setCellValue(summaryRowEntity.getProfile());
        row.createCell(8).setCellValue(summaryRowEntity.getGrade());
        row.createCell(9).setCellValue(summaryRowEntity.getRal());
        row.createCell(10).setCellValue(summaryRowEntity.getIssued());
        row.createCell(11).setCellValue(summaryRowEntity.getContract());
        row.createCell(12).setCellValue(summaryRowEntity.getSpec());
        row.createCell(13).setCellValue(summaryRowEntity.getPosition());
        row.createCell(14).setCellValue(summaryRowEntity.getAcceptMonth());
        row.createCell(15).setCellValue(summaryRowEntity.getYear());
        row.createCell(16).setCellValue(summaryRowEntity.getAccepted());
        row.createCell(17).setCellValue(summaryRowEntity.getPrice());
        row.createCell(18).setCellValue(summaryRowEntity.getAcceptedCost());
        row.createCell(19).setCellValue(summaryRowEntity.getShipped());
        row.createCell(20).setCellValue(summaryRowEntity.getShippedCost());
        Cell shippedDateCell = row.createCell(21);
        shippedDateCell.setCellValue(summaryRowEntity.getShippedDate());
        shippedDateCell.setCellStyle(dateStyle);
        row.createCell(22).setCellValue(summaryRowEntity.getVehicleNumber());
        row.createCell(23).setCellValue(summaryRowEntity.getInvoiceNumber());
        Cell invoiceDateCell = row.createCell(24);
        invoiceDateCell.setCellValue(summaryRowEntity.getInvoiceDate());
        invoiceDateCell.setCellStyle(dateStyle);
        row.createCell(25).setCellValue(summaryRowEntity.getFinalPrice());
        row.createCell(26).setCellValue(summaryRowEntity.getFinalCost());
    }

    private static void writeClippedEntityToRow(XSSFCellStyle dateStyle, SummaryRowEntity summaryRowEntity, Row row) {
        summaryRowEntity.getSupplier();
    }
}
