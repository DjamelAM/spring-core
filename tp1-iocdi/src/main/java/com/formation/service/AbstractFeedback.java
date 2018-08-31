package com.formation.service;

import java.io.IOException;

public abstract class AbstractFeedback implements IFeedback {

	@Override
	public void say(String something) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int giveMeTheCaptainAge(float boatSize, int nbMast) {
		return (int) Math.round(Math.pow(boatSize, 2.0) + Math.cos((double) nbMast) * 42);
	}

}
