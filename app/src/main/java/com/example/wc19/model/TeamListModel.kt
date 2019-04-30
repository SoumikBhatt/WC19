package com.example.wc19.model

import java.io.Serializable

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
    val player_eight: PlayerEight,
    val player_eleven: PlayerEleven,
    val player_fifteen: PlayerFifteen,
    val player_five: PlayerFive,
    val player_four: PlayerFour,
    val player_fourteen: PlayerFourteen,
    val player_nine: PlayerNine,
    val player_one: PlayerOne,
    val player_seven: PlayerSeven,
    val player_six: PlayerSix,
    val player_ten: PlayerTen,
    val player_thirteen: PlayerThirteen,
    val player_three: PlayerThree,
    val player_twelve: PlayerTwelve,
    val player_two: PlayerTwo
) :Serializable

data class PlayerTwo(
    val image: String,
    val name: String
) :Serializable

data class PlayerTen(
    val image: String,
    val name: String
):Serializable

data class PlayerThree(
    val image: String,
    val name: String
):Serializable

data class PlayerFour(
    val image: String,
    val name: String
):Serializable

data class PlayerSix(
    val image: String,
    val name: String
):Serializable

data class PlayerFourteen(
    val image: String,
    val name: String
):Serializable

data class PlayerNine(
    val image: String,
    val name: String
):Serializable

data class PlayerEleven(
    val image: String,
    val name: String
):Serializable

data class PlayerThirteen(
    val image: String,
    val name: String
):Serializable

data class PlayerOne(
    val image: String,
    val name: String
):Serializable

data class PlayerFifteen(
    val image: String,
    val name: String
):Serializable

data class PlayerSeven(
    val image: String,
    val name: String
):Serializable

data class PlayerTwelve(
    val image: String,
    val name: String
):Serializable

data class PlayerEight(
    val image: String,
    val name: String
):Serializable

data class PlayerFive(
    val image: String,
    val name: String
):Serializable