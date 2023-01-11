// Visnu Muthuraman

// Climbing Club B

public void addClimb(String peakName, int climbTime)
   {
        int index = 0;
       while(index < climbList.size() && climbList.get(index).getName().compareTo(peakName) < 0) {
           }
       climbList.add(index, new ClibInfo(peakName, climbTime));
   }
