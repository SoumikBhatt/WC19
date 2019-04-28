package com.example.wc19.model

data class TeamListModel(
    val team_list: List<Team>
)

data class Team(
    val icon: String,
    val player_list: List<Player>,
    val team_name: String,
    val team_ranking: String
)

data class Player(
    val player_eight: String,
    val player_eleven: String,
    val player_fifteen: String,
    val player_five: String,
    val player_four: String,
    val player_fourteen: String,
    val player_nine: String,
    val player_one: String,
    val player_seven: String,
    val player_six: String,
    val player_ten: String,
    val player_thirteen: String,
    val player_three: String,
    val player_twelve: String,
    val player_two: String
)