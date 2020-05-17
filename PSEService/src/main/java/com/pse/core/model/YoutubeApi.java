package com.pse.core.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class YoutubeApi {

	@Value("${youtube.apikey}")
	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}
	
}
