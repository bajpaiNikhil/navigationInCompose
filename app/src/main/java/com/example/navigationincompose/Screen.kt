package com.example.navigationincompose

import android.util.Log

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"

sealed class Screen( val route : String ){
    object Home : Screen(route = "home_screen")
    object Detail : Screen(
        route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"
    ) {
        //        fun passId(id : Int): String{
//            //to pass a single value
//            Log.d("Args","just a log ${this.route}")
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
        fun passNameAndId(id: Int, name: String): String {
            return "detail_Screen/$id/$name"
        }
    }
    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "signUp_Screen")
}
