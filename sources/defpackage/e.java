package defpackage;

import java.io.IOException;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:e.class */
public class e extends MIDlet {
    public Display a;

    /* renamed from: a, reason: collision with other field name */
    public t f56a;
    public int o = 0;

    public t a() {
        return null;
    }

    public void startApp() {
        if (this.a == null) {
            this.a = Display.getDisplay(this);
            this.f56a = a();
            this.a.setCurrent(this.f56a);
            try {
                this.f56a.ae();
            } catch (OutOfMemoryError unused) {
                this.o = 2;
                d();
            } catch (Throwable unused2) {
                this.o = 1;
                d();
            }
        }
        if (this.f56a != null) {
            this.f56a.ab();
        }
    }

    public void pauseApp() {
        if (this.f56a != null) {
            this.f56a.pause();
        }
    }

    public void destroyApp(boolean z) {
        if (this.f56a != null) {
            this.f56a.af();
            try {
                this.f56a.ad();
                if (this.o != 0) {
                    this.f56a.a(AlertType.ERROR, new StringBuffer().append("Error ").append(this.o).toString(), "You must recycle the power on your phone before continuing to play this game.  Please turn the power off, then on, then restart the game.", 5000);
                }
                this.f56a = null;
            } catch (IOException unused) {
                this.f56a = null;
            } catch (Throwable th) {
                this.f56a = null;
                throw th;
            }
        }
        notifyDestroyed();
    }

    public final void d() {
        destroyApp(false);
        if (this.f56a != null) {
            this.f56a.af();
        }
    }
}
