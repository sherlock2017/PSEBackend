package com.pse.core.model;

import com.google.api.services.youtube.model.SearchResult;

public class Video {

	private SearchResult singleVideo;
	//private String id;
	//private String title;
	//private String thumbnail;

	public SearchResult getSingleVideo() {
		return singleVideo;
	}

	public void setSingleVideo(SearchResult singleVideo) {
		this.singleVideo = singleVideo;
	}
	
	
}
