package com.loavesandfish.needposts;

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
	public ResponseEntity<Post> postPost(@RequestBody Post post) {

	    // Saving to DB using an instance of the repo interface.
	    Post createdPost = dao.save(post);

	    // RespEntity crafts response to include correct status codes.
	    return ResponseEntity.ok(createdPost);
	}
}

