package com.taskagile.domain.application;

import java.util.List;

import com.taskagile.domain.model.team.Team;
import com.taskagile.domain.model.user.UserId;

/**
 * TeamService
 */
public interface TeamService {

  /**
   * Find the teams that created by a user
   *
   * @param userId the id of the user
   * @return a list of teams or an empty list if none found
   */
  List<Team> findTeamsByUserId(UserId userId);

  /**
   * Create a new team
   *
   * @param command the command instance
   * @return the newly created team
   */
  Team createTeam(CreateTeamCommand command);
}