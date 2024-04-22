package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.rq.ad.CreateOrUpdateAd;
import ru.skypro.homework.entity.AdEntity;

@Mapper(componentModel = "spring")
public interface MapperAd {
    AdEntity createOrUpdateAdToEntity(CreateOrUpdateAd createOrUpdateAd);

    CreateOrUpdateAd adEntityToCreateAd(AdEntity adEntity);

}
