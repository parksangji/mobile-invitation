package com.example.mobileinvitation.repository;

import com.example.mobileinvitation.domain.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Integer> {

}
