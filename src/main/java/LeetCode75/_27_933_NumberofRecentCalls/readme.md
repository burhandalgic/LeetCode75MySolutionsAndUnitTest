933. Number of Recent Calls
     Easy
     Topics
     Companies
     You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping
public String predictPartyVictory(String senate) {

        Queue<Character> queue = new LinkedList();
        int Rvote=0;
        int Dvote=0;
        int RDisable=0;
        int DDisable=0;
        for(int i = 0; i<senate.length();i++){
            if (senate.charAt(i)=='R'){
                if(RDisable>0){
                    RDisable--;
                }else{
                    Rvote++;
                    DDisable++;
                }

            }else {

                if(DDisable>0){
                    DDisable--;
                }else{
                    Dvote++;
                    RDisable++;
                }
            }


        }

        if (Rvote>Dvote)
            return "Radiant";
        else if (Dvote>Rvote)
            return "Dire";
        else{
            return senate.charAt(senate.length()-1)=='R' ? "Radiant" : "Dire";
        }

    }(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.



Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3


Constraints:

1 <= t <= 109
Each test case will call ping with strictly increasing values of t.
At most 104 calls will be made to ping.