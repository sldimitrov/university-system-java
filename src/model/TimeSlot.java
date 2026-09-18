package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class TimeSlot {
  private DayOfWeek day;
  private LocalTime start_time;
  private LocalTime end_time;
  private Room room;

  public TimeSlot(DayOfWeek day, Room room, LocalTime start_time, LocalTime end_time) {
    if (start_time.isAfter(end_time)) {
      throw new IllegalArgumentException();
    }

    this.day = day;
    this.start_time = start_time;
    this.end_time = end_time;
    this.room = room;
  }

  public DayOfWeek getDay() {
    return day;
  }

  public LocalTime getStartTime() {
    return start_time;
  }

  public LocalTime getEndTime() {
    return end_time;
  }

  public Room getRoom() {
    return room;
  }

  // Used for prettier instance's print
  // @Override
  // public String toString() {
  //   return "";
  // }
}
