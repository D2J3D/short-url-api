package ru.gridusov.shorturl.service;


import ru.gridusov.shorturl.model.entity.Url;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

public interface UrlService {
    Url createShortUrl(Url url) throws NoSuchAlgorithmException;
    Url findByShortUrlKey(String key);
    Url findByFullUrl(String fullUrl);
    void deleteUser(Long id);
    void deleteUserByKey(String key);
}
