package com.example.wc19.model

data class WCData(
    val match_list: List<Match>
)

data class Match(
    val match_day: String,
    val match_number: String,
    val match_time: String,
    val team_one: TeamOne,
    val team_two: TeamTwo,
    val total_match: Int,
    val venue: String
)

data class TeamTwo(
    val country: String,
    val flag: String,
    val player: String,
    val win: Int
)

data class TeamOne(
    val country: String,
    val flag: String,
    val player: String,
    val win: Int
)