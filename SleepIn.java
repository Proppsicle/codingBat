/*
 * The parameter weekday is true if it is a weekday, and the parameter vacation 
 * is true if we are on vacation. We sleep in if it is not a weekday or we're on 
 * vacation. Return true if we sleep in.
 *
 * @param weekday Stores if it is a weekday or not.
 * @param vacation Stores if it is a vacation or not.
 * @returns True if it is not a weeday or if on vacation, else returns false.
 * @version 0.0.1
 */
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }
  
  return false;
}
