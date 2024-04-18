package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.dto.rs.ad.Ads;
import ru.skypro.homework.dto.rq.ad.CreateOrUpdateAd;
import ru.skypro.homework.dto.rs.ad.Ad;
import ru.skypro.homework.dto.rs.ad.ExtendedAd;

@Slf4j
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/ads")
public class AdController { //advertisement контроллер- объявление контроллера

    @PostMapping
    public ResponseEntity<?> createAd(@RequestPart("properties") CreateOrUpdateAd properties, @RequestPart("image") MultipartFile image) {
        return ResponseEntity.ok(new Ad());
    }

    @GetMapping
    public ResponseEntity<?> getAds() {
        return ResponseEntity.ok(new Ads());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAdById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(new ExtendedAd());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok().build();
    }

    /**
     *
     * @param id
     * <b>Посмотреть можно ли использовать RequestPart????</b>
     * @return
     */
    @PatchMapping("/{id}")
    public ResponseEntity<?> getAdById(@PathVariable("id") Integer id, @RequestBody CreateOrUpdateAd createOrUpdateAd) {
        return ResponseEntity.ok(new Ad());
    }

    @GetMapping("/me")
    public ResponseEntity<?> getMe() {
        return ResponseEntity.ok(new Ads());
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<?> getAdById(@PathVariable("id") Integer id, @RequestBody User user) {
        return ResponseEntity.ok(new User());
    }

}
