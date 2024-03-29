package com.github.devit951.xoapp.xogame

import com.github.devit951.xoapp.board.BoardCoordinates
import com.github.devit951.xoapp.board.Cell

data class Player(val name: String, val figure: Figure): Moveable{

    override fun move(boardCoordinates: BoardCoordinates, cells: Array<Array<Cell?>>, onMoved: (BoardCoordinates, Player) -> Unit) {
        cells[boardCoordinates.row][boardCoordinates.column] = Cell(this)
        onMoved(boardCoordinates, this)
    }
}