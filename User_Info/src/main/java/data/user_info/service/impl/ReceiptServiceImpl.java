package data.user_info.service.impl;

import data.user_info.model.Receipt;
import data.user_info.repository.ReceiptRepository;
import data.user_info.service.ReceiptService;

public class ReceiptServiceImpl implements ReceiptService {
    private ReceiptRepository receiptRepository;
    public ReceiptServiceImpl(ReceiptRepository receiptRepository){
        this.receiptRepository =receiptRepository;
    }

    @Override
    public Receipt saveReceipt(Receipt receipt) {
        return null;
    }
}
