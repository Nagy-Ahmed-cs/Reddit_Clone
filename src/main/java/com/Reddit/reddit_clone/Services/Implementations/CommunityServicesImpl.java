package com.Reddit.reddit_clone.Services.Implementations;

import com.Reddit.reddit_clone.Model.Dtos.CommunityDtos.CommunityReqDto;
import com.Reddit.reddit_clone.Model.Dtos.CommunityDtos.CommunityResDto;
import com.Reddit.reddit_clone.Model.Entities.Community;
import com.Reddit.reddit_clone.Model.Entities.User;
import com.Reddit.reddit_clone.Model.Mappers.CommunityMapper;
import com.Reddit.reddit_clone.Repos.CommunityRepo;
import com.Reddit.reddit_clone.Repos.UserRepo;
import com.Reddit.reddit_clone.Services.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class CommunityServicesImpl implements CommunityService {
    @Autowired

    private CommunityRepo communityRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CommunityMapper communityMapper;
    @Override
    public CommunityResDto createCommunity(CommunityReqDto dto) {
        Optional<User>user=userRepo.findById(dto.getUserId());
        if(user.isPresent()){
            Community community=communityMapper.toEntity(dto);
            community.setCreatedBy(user.get());
            user.get().getCommunities().add(community);
            userRepo.save(user.get());
            return communityMapper.toResponse(communityRepo.save(community));
        }
        return null;
    }

    @Override
    public String joinCommunity(String userEmail, String communityName) {
        Optional<User>user=userRepo.findByUserEmail(userEmail);
        Optional<Community>community=communityRepo.findByCommunityName(communityName);
        if(user.isPresent()&&community.isPresent()){
            if(user.get().getJoinedCommunities().contains(community.get())){
                return "The user is already in the community ...\n";
            }
            user.get().getJoinedCommunities().add(community.get());
            community.get().getMembers().add(user.get());
            communityRepo.save(community.get());
            userRepo.save(user.get());

            return "Completely joined the community ......\n";
        }
        return "User is not here or the community is not provided........\n ";
    }

    @Override
    public String deleteCommunity(String userEmail, String communityName) {
        Optional<User>user=userRepo.findByUserEmail(userEmail);
        Optional<Community>community=communityRepo.findByCommunityName(communityName);
        if(user.isPresent()&&community.isPresent()) {
            if(community.get().getCreatedBy().getUserEmail().equals(userEmail)) {
                community.get().setDeleteAt(LocalDateTime.now());
                communityRepo.save(community.get());
                return "The community deleted successfully ....\n";
            }
        }

        return "The community is not here or you Entered the wrong Email address....\n";
    }

    @Override
    public CommunityResDto getCommunityDetails(String communityName) {
        Optional<Community>community=communityRepo.findByCommunityName(communityName);
        if(community.isPresent()){
            return communityMapper.toResponse(community.get());
        }
        else {
            return null;
        }
    }

    @Override
    public List<CommunityResDto> getAllCommunities() {
        return communityMapper.toResponses(communityRepo.findAll());
    }
}
