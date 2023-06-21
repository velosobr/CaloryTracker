package com.velosobr.calorytracker.navigation

import androidx.navigation.NavController
import com.velosobr.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}
