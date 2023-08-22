package com.social.interaction.repository;


import com.social.interaction.entities.PostDataGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PostDataUsersRepository extends JpaRepository<PostDataGroups, Long> {

}

