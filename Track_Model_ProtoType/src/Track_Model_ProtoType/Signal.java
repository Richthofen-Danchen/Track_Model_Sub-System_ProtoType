/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Track_Model_ProtoType;

public class Signal
{   
    public int singalType; //0<--switch machine signal, 1<--railway signal, 2<--railway crossing bars signal
    public boolean switchPosition; // false<--default branch to 'NextBlock', true<--branch to 'OptionalNextBlock'
    public int railWaySignalLights; // 0<--Stop, 1<--Decelerate, 2<--Proceed, 3<--Accelerate
    public int railWayCrossingBars; // 0<--Closed, 1<--Open


    public Signal()
    {
	switchPosition = false; //set to default switch position
	railWaySignalLights = 2; //set to default 'proceed' state
	railWayCrossingBars = 1; //set to default 'open' position
    }


    public void changeSwitchMachineSignal()
    {
        if(switchPosition)
        {
            switchPosition = false;
        }

        else
        {
            switchPosition = true;
        }
    }

    public void changeRailWayLightSignal(int SignalLightsStatus)
    {
        railWaySignalLights = SignalLightsStatus;
    }

    public void changeRailWayCrossingBarSignal()
    {
        if(railWayCrossingBars == 0)
        {
            railWayCrossingBars = 1;
        }

        else
        {
            railWayCrossingBars = 0;
        }
    }

    public boolean getSwitchMachineStatus()
    {
        return switchPosition;
    }

    public int getRailWayLightSignal()
    {
        return railWaySignalLights;
    }
    
    public int getRailWayCrossingBars()
    {
        return railWayCrossingBars;
    }


}