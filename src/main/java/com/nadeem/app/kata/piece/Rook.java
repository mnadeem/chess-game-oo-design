package com.nadeem.app.kata.piece;

import com.nadeem.app.kata.Piece;
import com.nadeem.app.kata.Color;
import com.nadeem.app.kata.Position;
/**
 * @author Nadeem Mohammad
 *
 */
public class Rook extends Piece {

	public Rook(int id, Color color) {
		super(id, color);
	}

	@Override
	public String getName() {
		return "Rook";
	}

	@Override
	public boolean validate(Position destination) {
		return true;
	}

}
