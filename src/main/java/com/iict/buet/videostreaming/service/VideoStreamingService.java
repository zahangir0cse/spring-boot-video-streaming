package com.iict.buet.videostreaming.service;

import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

@Service
public class VideoStreamingService {

//    private static final String FORMAT = "classpath:mp4/%s.mp4";
    private static final String FORMAT = "/Users/zahangiralam/Downloads/%s.mp4";

    private final ResourceLoader resourceLoader;

    public VideoStreamingService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    /*public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() -> this.resourceLoader.
                getResource( String.format(FORMAT, title)));
    }*/

    public Mono<Resource> getVideo(String title) {
        return Mono.fromSupplier(() ->  new PathResource(String.format(FORMAT, title)));
    }

}
