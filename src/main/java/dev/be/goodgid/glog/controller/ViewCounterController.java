package dev.be.goodgid.glog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.be.goodgid.glog.controller.dto.ViewCountRequest;
import dev.be.goodgid.glog.service.ViewCounterService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ViewCounterController {

    private final ViewCounterService viewCounterService;

    @PostMapping("/increase/view-count")
    public ResponseEntity increaseViewCount(@RequestBody ViewCountRequest viewCountRequest) {
        viewCounterService.IncreaseViewCount(viewCountRequest);
        return ResponseEntity.ok().build();

    }
}
