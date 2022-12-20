package com.example.springbatchdemo.processor;

import com.example.springbatchdemo.model.Transaction;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author NH 2022-12-20
 */
public class CustomItemProcessor implements ItemProcessor<Transaction, Transaction> {

    public Transaction process(Transaction item) {
        return item;
    }
}
