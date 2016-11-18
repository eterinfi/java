package struct.oop.interfacing;

interface Event {}

public interface Hockey extends Sports, Event {
	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
}