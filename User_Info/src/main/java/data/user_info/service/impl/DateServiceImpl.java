package data.user_info.service.impl;

import data.user_info.model.Datee;
import data.user_info.repository.DateRepository;
import data.user_info.service.DateService;

public class DateServiceImpl implements DateService {
    private DateRepository dateRepository;
    public DateServiceImpl(DateRepository dateRepository){
        this.dateRepository = dateRepository;
    }

    @Override
    public Datee saveDatee(Datee datee) {
        return null;
    }
}
