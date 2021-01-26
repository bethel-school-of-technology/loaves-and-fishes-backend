package com.loavesandfish.needposts;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	@Autowired
    NeedPostsRepository dao;
	
	@GetMapping("/needposts")
	public List<Post> getNeedPosts() {
	    List<Post> foundNeedPosts = dao.findAll();
	    return foundNeedPosts;
	}
	
	@PostMapping("/needposts")
	public ResponseEntity<Post> addPost(@RequestBody Post post) {
		post.setTimestamp(LocalDateTime.now());
		Post newMessage = dao.save(post);
		return ResponseEntity.ok(newMessage);
	}
}

