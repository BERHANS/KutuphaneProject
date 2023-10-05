package com.berhan.repository;

import com.berhan.repository.entity.Kullanici;
import com.berhan.utility.MyFactoryRepository;

public class KullaniciRepository extends MyFactoryRepository<Kullanici,Long> {
    public KullaniciRepository() {
        super(new Kullanici());
    }
}
