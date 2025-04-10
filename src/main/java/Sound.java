import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int counter = 0;
    for(int i = 0; i < limitAmplitude.length; i++_{
      if(samples[i] > limit){
        samples[i] = limit;
        counter++;
      }
      else if (samples[i] < -limit) {
        samples[i] = -limit;
        counter++;
      }
    }
    return counter;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    int looper = 0;
    while(samples[i] == 0){
      looper++;
    }
    public int[] trimmedSample = new int[samples.length - looper];
    for(int i = 0; i < trimmedSample.length(); i++){
      trimmedSamples[i] = samples[i+n];
    }
    samples = trimmedSample;
  }
}
