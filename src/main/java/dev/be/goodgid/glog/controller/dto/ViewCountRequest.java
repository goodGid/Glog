package dev.be.goodgid.glog.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;

@Getter
@JsonInclude(Include.NON_NULL)
public class ViewCountRequest {

    private String accessUrl;
}
