package struct.oop.interfacing;

public interface Football extends Sports {
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfHalf(int half);
}