package com.berhan.repository;

import com.berhan.repository.entity.Kitap;
import com.berhan.utility.MyFactoryRepository;

public class KitapRepository extends MyFactoryRepository<Kitap,Long> {
    public KitapRepository() {
        super(new Kitap());
    }
}
