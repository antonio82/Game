package com.thecolony.tractus.player.ai.battle;
//will be used to add changes to specific stats of ships
public class BattleUpgrades {
private String stat;
private double amount;
public BattleUpgrades()
{
	stat = "none";
	amount = 0;
}
public BattleUpgrades(String s, double a)
{
	stat = s;
	amount = a;
}
public String getStat()
{
	return stat;
}
public double getAmount()
{
	return amount;
}
}