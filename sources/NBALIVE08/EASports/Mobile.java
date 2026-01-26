package NBALIVE08.EASports;

import defpackage.e;
import defpackage.m;
import defpackage.t;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:NBALIVE08/EASports/Mobile.class */
public class Mobile extends e {
    @Override // defpackage.e
    public final t a() {
        return new m(this, ((e) this).a);
    }

    @Override // defpackage.e
    public void startApp() {
        super.startApp();
    }

    @Override // defpackage.e
    public void destroyApp(boolean z) {
        super.destroyApp(z);
    }

    @Override // defpackage.e
    public void pauseApp() {
        super.pauseApp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str) {
        try {
            if (platformRequest(str)) {
                destroyApp(true);
            }
        } catch (Exception e) {
            printStackTrace();
        }
    }
}
