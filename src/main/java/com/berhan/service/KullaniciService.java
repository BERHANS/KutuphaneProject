package com.berhan.service;

import com.berhan.repository.KullaniciRepository;
import com.berhan.repository.entity.Kullanici;
import com.berhan.utility.MyFactoryService;

public class KullaniciService extends MyFactoryService<Kullanici,Long> {
    public KullaniciService() {
        super(new Kullanici());
    }
}
