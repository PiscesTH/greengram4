package com.green.greengram4.feed.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FeedToggleFavDto {
    private int ifeed;
    private int iuser;
}
