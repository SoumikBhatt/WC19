package com.example.wc19.model

import java.io.Serializable

data class TeamModel(
    val team_list: List<Team>
)

data class Team(
    val icon: String,
    val player_list: List<Player>,
    val team_name: String,
    val team_ranking: String
):Serializable

data class Player(
    val image: String,
    val name: String,
    val pid:Int
):Serializable