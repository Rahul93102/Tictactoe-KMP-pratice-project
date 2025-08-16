package com.beapps.tictactoe_game

import android.app.Application
import com.beapps.tictactoe_game.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApp)
        }
    }
}



@Preview
@Composable
fun AppAndroidPreview() {
    TicTacToeBoard(
        modifier = Modifier.size(300.dp),
        gameState = GameState(board = arrayOf(
            arrayOf('X', null, null),
            arrayOf(null, 'O', 'O'),
            arrayOf(null, 'X', null),
        )),
        xPlayerColor = Color.Green,
        oPlayerColor = Color.Blue,
        onTurn = {_ , _ ->},
    )
}
