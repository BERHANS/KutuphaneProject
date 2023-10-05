package com.berhan.repository;

import com.berhan.repository.entity.Yazar;
import com.berhan.utility.MyFactoryRepository;

public class YazarRepository extends MyFactoryRepository<Yazar,Long> {

    public YazarRepository() {
        super(new Yazar());
    }
}
