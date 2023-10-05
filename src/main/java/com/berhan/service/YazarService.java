package com.berhan.service;

import com.berhan.repository.YazarRepository;
import com.berhan.repository.entity.Yazar;
import com.berhan.utility.MyFactoryService;

public class YazarService extends MyFactoryService<Yazar,Long> {
    public YazarService() {
        super(new Yazar());
    }
}
