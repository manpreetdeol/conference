package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerrepository) {
        this.repository = speakerrepository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(final SpeakerRepository repository) {
        this.repository = repository;
    }
}
