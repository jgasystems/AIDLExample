package com.japp.aidlexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by JORGE on 15/06/2017.
 */

public class RemoteService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

        private final IRemoteService.Stub binder = new IRemoteService.Stub(){

        public int add( int parm1,  int parm2) throws RemoteException {
            return parm1 + parm2;
        }

        public int sub(int parm1, int parm2) throws RemoteException{
            return parm1 - parm2;
        }

        public int mult(int parm1,int parm2) throws RemoteException{
            return parm1 * parm2;
        }
    };

}
