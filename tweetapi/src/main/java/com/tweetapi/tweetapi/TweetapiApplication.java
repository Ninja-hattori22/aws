package com.tweetapi.tweetapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/tweet")
public class TweetapiApplication {

	private List<Tweet> tweets = new ArrayList<>();

    @PostMapping
    public Tweet addTweet(@RequestBody Tweet tweet) {
        tweets.add(tweet);
        return tweet;
    }

    @GetMapping
    public List<Tweet> getTweets() {
        return tweets;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(TweetapiApplication.class, args);
	}

}
