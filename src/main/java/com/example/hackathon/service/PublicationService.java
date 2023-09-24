package com.example.hackathon.service;

import com.example.hackathon.dto.publication.PublicationRequest;
import com.example.hackathon.dto.publication.PublicationResponse;

import java.util.List;

public interface PublicationService {
    List<PublicationResponse> getAll(String token);

    void save(String token, PublicationRequest publicationRequest);

    PublicationResponse getPublicationById(String token, Long petitionId);

    void commentToPetition(String token, Long petitionId, String comment);

    void delete(String token, Long publicationId);

    void likeToPublication(String token, Long publicationId);
}
