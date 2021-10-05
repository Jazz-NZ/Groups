package com.studentnetwork.groups.Groups;


import com.studentnetwork.groups.Groups.database.PostDB;
import com.studentnetwork.groups.Groups.database.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin("*") // because acces controll allow origin error
@RestController
@RequestMapping("/")
@Controller
public class RestHandler {

    @Autowired
    PostRepository postRepository;

    //treba da dobije userId i na osnovu toga da salje zahteve odredjenim grupama

    //{userId}
    @RequestMapping("/{groupId}")
    public List<PostDB> getItem(@PathVariable("groupId") String groupId) {


        int gId = Integer.parseInt(groupId);
        System.out.println(gId);
        List<PostDB> posts = postRepository.findAllByGroupId(gId);
        //System.out.println(posts.stream().findFirst().get().getText());

        for (PostDB postdb : posts) {
            System.out.println(postdb.getText());


        }

        return posts;

//
//        Group group = new Group();
//        group.setGroupId(gId);
//        group.setGroupPosts(posts);
//
//
//        ResItem item = new ResItem("Nikola","Zivanovic",Collections.singletonList(group));
//
//        return Collections.singletonList(item);

     /*   return Collections.singletonList( new ResItem("Nikola","Zivanovic",
                Arrays.asList(new Group(1,"Matematika 1",
                        Arrays.asList(new Post("101","Prvi"), new Post("101","Drugi"))),

        new Group(2,"Programski jezici",
                Arrays.asList(new Post("101","Prvi"), new Post("101","Drugi")))

                )));
*/
    }


    //method for adding new post
    @RequestMapping("/post/{userID}/{groupID}/{postText}")
    public String getPost(@PathVariable("userID") String userID, @PathVariable("groupID") String groupID,
                          @PathVariable("postText") String postText) {

        System.out.println("Saving new post");
        return "Saved";

    }


}