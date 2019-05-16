package com.faysal.wc19.model

import com.google.gson.annotations.SerializedName

data class PlayerDetailsModel(
    val battingStyle: String,
    val born: String,
    val bowlingStyle: String,
    val country: String,
    val creditsLeft: Int,
    val currentAge: String,
    val `data`: Data,
    val fullName: String,
    val imageURL: String,
    val majorTeams: String,
    val name: String,
    val pid: Int,
    val playingRole: String,
    val profile: String,
    val provider: Provider,
    val ttl: Int,
    val v: String
)

data class Data(
    val batting: Batting,
    val bowling: Bowling
)

data class Batting(
    val ODIs: ODIs,
    val T20Is: T20Is,
    val firstClass: FirstClass,
    val listA: ListA,
    val tests: Tests
)

data class T20Is(
    @SerializedName("100")
    val hundred: String,
    @SerializedName("4s")
    val fours: String,
    @SerializedName("50")
    val fifty: String,
    @SerializedName("6s")
    val six: String,
    val Ave: String,
    val BF: String,
    val Ct: String,
    val HS: String,
    val Inns: String,
    val Mat: String,
    val NO: String,
    val Runs: String,
    val SR: String,
    val St: String
)

data class ListA(
    @SerializedName("100")
    val hundred: String,
    @SerializedName("4s")
    val fours: String,
    @SerializedName("50")
    val fifty: String,
    @SerializedName("6s")
    val six: String,
    val Ave: String,
    val BF: String,
    val Ct: String,
    val HS: String,
    val Inns: String,
    val Mat: String,
    val NO: String,
    val Runs: String,
    val SR: String,
    val St: String
)

data class FirstClass(
    @SerializedName("100")
    val hundred: String,
    @SerializedName("4s")
    val fours: String,
    @SerializedName("50")
    val fifty: String,
    @SerializedName("6s")
    val six: String,
    val Ave: String,
    val BF: String,
    val Ct: String,
    val HS: String,
    val Inns: String,
    val Mat: String,
    val NO: String,
    val Runs: String,
    val SR: String,
    val St: String
)

data class ODIs(
    @SerializedName("100")
    val hundred: String,
    @SerializedName("4s")
    val fours: String,
    @SerializedName("50")
    val fifty: String,
    @SerializedName("6s")
    val six: String,
    val Ave: String,
    val BF: String,
    val Ct: String,
    val HS: String,
    val Inns: String,
    val Mat: String,
    val NO: String,
    val Runs: String,
    val SR: String,
    val St: String
)

data class Tests(
    @SerializedName("100")
    val hundred: String,
    @SerializedName("4s")
    val fours: String,
    @SerializedName("50")
    val fifty: String,
    @SerializedName("6s")
    val six: String,
    val Ave: String,
    val BF: String,
    val Ct: String,
    val HS: String,
    val Inns: String,
    val Mat: String,
    val NO: String,
    val Runs: String,
    val SR: String,
    val St: String
)

data class Bowling(
    val ODIs: ODIsX,
    val T20Is: T20IsX,
    val firstClass: FirstClassX,
    val listA: ListAX,
    val tests: TestsX
)

data class ODIsX(
    @SerializedName("10")
    val tenWickets: String,
    @SerializedName("4w")
    val fourWickets: String,
    @SerializedName("5w")
    val fiveWickets: String,
    val Ave: String,
    val BBI: String,
    val BBM: String,
    val Balls: String,
    val Econ: String,
    val Inns: String,
    val Mat: String,
    val Runs: String,
    val SR: String,
    val Wkts: String
)

data class T20IsX(
    @SerializedName("10")
    val tenWickets: String,
    @SerializedName("4w")
    val fourWickets: String,
    @SerializedName("5w")
    val fiveWickets: String,
    val Ave: String,
    val BBI: String,
    val BBM: String,
    val Balls: String,
    val Econ: String,
    val Inns: String,
    val Mat: String,
    val Runs: String,
    val SR: String,
    val Wkts: String
)

data class FirstClassX(
    @SerializedName("10")
    val tenWickets: String,
    @SerializedName("4w")
    val fourWickets: String,
    @SerializedName("5w")
    val fiveWickets: String,
    val Ave: String,
    val BBI: String,
    val BBM: String,
    val Balls: String,
    val Econ: String,
    val Inns: String,
    val Mat: String,
    val Runs: String,
    val SR: String,
    val Wkts: String
)

data class TestsX(
    @SerializedName("10")
    val tenWickets: String,
    @SerializedName("4w")
    val fourWickets: String,
    @SerializedName("5w")
    val fiveWickets: String,
    val Ave: String,
    val BBI: String,
    val BBM: String,
    val Balls: String,
    val Econ: String,
    val Inns: String,
    val Mat: String,
    val Runs: String,
    val SR: String,
    val Wkts: String
)

data class ListAX(
    @SerializedName("10")
    val tenWickets: String,
    @SerializedName("4w")
    val fourWickets: String,
    @SerializedName("5w")
    val fiveWickets: String,
    val Ave: String,
    val BBI: String,
    val BBM: String,
    val Balls: String,
    val Econ: String,
    val Inns: String,
    val Mat: String,
    val Runs: String,
    val SR: String,
    val Wkts: String
)

data class Provider(
    val pubDate: String,
    val source: String,
    val url: String
)