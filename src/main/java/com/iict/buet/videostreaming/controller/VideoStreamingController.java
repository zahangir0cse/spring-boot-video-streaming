package com.iict.buet.videostreaming.controller;

import com.iict.buet.videostreaming.service.VideoStreamingService;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class VideoStreamingController {

    private final VideoStreamingService service;

    public VideoStreamingController(VideoStreamingService service) {
        this.service = service;
    }

    @GetMapping(value = "/video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideo(@PathVariable String title,
                                   @RequestHeader("Range") String range) {
        return service.getVideo(title);
    }
}