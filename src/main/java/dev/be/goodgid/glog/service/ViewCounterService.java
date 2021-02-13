package dev.be.goodgid.glog.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.swing.text.View;

import org.springframework.stereotype.Service;

import dev.be.goodgid.glog.controller.dto.ViewCountRequest;
import dev.be.goodgid.glog.domain.Url;
import dev.be.goodgid.glog.domain.ViewCounter;
import dev.be.goodgid.glog.repository.UrlRepository;
import dev.be.goodgid.glog.repository.ViewCounterRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ViewCounterService {

    private final UrlRepository urlRepository;
    private final ViewCounterRepository viewCounterRepository;

    public void IncreaseViewCount(ViewCountRequest viewCountRequest) {

//        if (viewCountRequest.getAccessUrl().contains("localhost")) {
//            return;
//        }

        Url url = urlRepository.findByUrlValue(viewCountRequest.getAccessUrl())
                               .orElseGet(() -> {
                                   Url newUrl = Url.builder()
                                                   .urlValue(viewCountRequest.getAccessUrl())
                                                   .build();
                                   urlRepository.save(newUrl);
                                   return newUrl; });

        ViewCounter viewCounter = ViewCounter.builder()
                                       .url(url)
                                       .build();
        viewCounterRepository.save(viewCounter);

        List<ViewCounter> viewCounterList = viewCounterRepository.findAll();
        for (ViewCounter vc : viewCounterList){
            System.out.println(vc);
        }
    }

}
