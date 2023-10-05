package com.berhan.service;

import com.berhan.repository.KitapRepository;
import com.berhan.repository.entity.Kitap;
import com.berhan.utility.MyFactoryService;

public class KitapService extends MyFactoryService<Kitap,Long> {
    public KitapService() {
        super(new Kitap());
    }


}
