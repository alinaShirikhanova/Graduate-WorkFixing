package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.rq.ad.CreateOrUpdateAd;
import ru.skypro.homework.dto.rs.ad.Ad;
import ru.skypro.homework.dto.rs.ad.ExtendedAd;
import ru.skypro.homework.entity.AdEntity;

@Service
public class AdMapper {
//
//    /**
//     * Пребразование DTO {@link CreateOrUpdateAd} в сущность {@link AdEntity}
//     * @param createOrUpdateAd
//     */
//
//    public AdEntity createOrUpdateAdToEntity(CreateOrUpdateAd createOrUpdateAd) {
//        AdEntity adEntity = new AdEntity();
//        adEntity.setTitle(createOrUpdateAd.getTitle());
//        adEntity.setPrice(createOrUpdateAd.getPrice());
//        adEntity.setDescription(createOrUpdateAd.getDescription());
//        return adEntity;
//    }
//
//    public CreateOrUpdateAd adEntityToCreateOrUpdateAdDto(AdEntity adEntity) {
//        CreateOrUpdateAd createOrUpdateAd = new CreateOrUpdateAd();
//        createOrUpdateAd.setTitle(adEntity.getTitle());
//        createOrUpdateAd.setPrice(adEntity.getPrice());
//        createOrUpdateAd.setDescription(adEntity.getDescription());
//        return createOrUpdateAd;
//    }
//
//    public ExtendedAd adEntityToExtendedAd(AdEntity adEntity) {
//        ExtendedAd extendedAd = new ExtendedAd();
//        extendedAd.setPk(adEntity.getId());
//        extendedAd.setDescription(adEntity.getDescription());
//        extendedAd.setImage(adEntity.getImage());
//        extendedAd.setPrice(adEntity.getPrice());
//        extendedAd.setTitle(adEntity.getTitle());
//        extendedAd.setAuthorFirstName(adEntity.getAuthor().getFirstName());
//        extendedAd.setAuthorLastName(adEntity.getAuthor().getLastName());
//        extendedAd.setUsername(adEntity.getAuthor().getUsername());
//        extendedAd.setPhone(adEntity.getAuthor().getPhone());
//        return extendedAd;
//    }
//
//    public Ad adEntityToAd(AdEntity adEntity) {
//        Ad ad = new Ad();
//        ad.setAuthor(adEntity.getAuthor().getId());
//        ad.setImage(adEntity.getImage());
//        ad.setId(adEntity.getId());
//        ad.setPrice(adEntity.getPrice());
//        ad.setTitle(adEntity.getTitle());
//        return ad;
//    }
//
//









}
