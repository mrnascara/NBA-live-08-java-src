package defpackage;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:af.class */
public final class af {
    private DirectGraphics a;
    private Graphics b;
    public int fC;
    public int fD;
    private int fE;
    public int fF;
    private int fG;
    private boolean V = true;
    private ai C = new ai();
    private ai D = new ai();
    private ai z = new ai();

    /* renamed from: a, reason: collision with other field name */
    private ai[] f17a = new ai[16];

    public af(Graphics graphics, int i, int i2) {
        this.b = graphics;
        this.a = DirectUtils.getDirectGraphics(graphics);
        this.fE = i;
        this.fF = i2;
        this.C.c(0, 0, i, i2);
        for (int i3 = 0; i3 < 16; i3++) {
            this.f17a[i3] = new ai();
        }
    }

    public final boolean a(short[] sArr, int i, int i2, int i3) {
        return a(sArr, i, i2, sArr[sArr.length - 2], sArr[sArr.length - 1], 0, 0, i3);
    }

    public final boolean a(short[] sArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + this.fC;
        int i9 = i2 + this.fD;
        this.z.c(i8, i9, i3, i4);
        if (!this.z.c(this.C)) {
            return false;
        }
        if (i5 < 0) {
            i3 -= -i5;
            i5 = 0;
        }
        if (i6 < 0) {
            i4 -= -i6;
            i6 = 0;
        }
        short s = sArr[sArr.length - 2];
        short s2 = sArr[sArr.length - 1];
        if (i5 + i3 > s) {
            i3 = s - i5;
        }
        if (i6 + i4 > s2) {
            i4 = s2 - i6;
        }
        if (i3 <= 0 || i4 <= 0) {
            return false;
        }
        int i10 = 0;
        if ((i7 & Integer.MIN_VALUE) != 0) {
            i10 = 8192;
        }
        if ((i7 & 1073741824) != 0) {
            i10 |= 16384;
        }
        this.a.drawPixels(sArr, true, (i6 * s) + i5, s, i8, i9, i3, i4, i10, 4444);
        d(this.z);
        return true;
    }

    public final boolean a(Image image, int i, int i2) {
        int i3 = i + this.fC;
        int i4 = i2 + this.fD;
        this.z.c(i3, i4, image.getWidth(), image.getHeight());
        if (!this.z.c(this.C)) {
            return false;
        }
        this.b.drawImage(image, i3, i4, 20);
        d(this.z);
        return true;
    }

    public final boolean a(Image image, int i, int i2, int i3) {
        int i4 = i + this.fC;
        int i5 = i2 + this.fD;
        this.z.c(i4, i5, image.getWidth(), image.getHeight());
        if (!this.z.c(this.C)) {
            return false;
        }
        if (this.V) {
            int i6 = 0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i6 = 8192;
            }
            if ((i3 & 1073741824) != 0) {
                i6 |= 16384;
            }
            this.a.drawImage(image, i4, i5, 20, i6);
        } else {
            this.b.drawImage(image, i4, i5, 20);
        }
        d(this.z);
        return true;
    }

    public final boolean a(Image image, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + this.fC;
        int i8 = i2 + this.fD;
        this.z.c(i7, i8, i3, i4);
        aV();
        if (b(this.z)) {
            d(this.z);
            this.b.drawImage(image, i7 - i5, i8 - i6, 20);
        }
        aW();
        return true;
    }

    public final boolean a(Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int width;
        int height;
        int i8 = i + this.fC;
        int i9 = i2 + this.fD;
        this.z.c(i8, i9, i3, i4);
        aV();
        if (b(this.z)) {
            d(this.z);
            if (this.V) {
                int i10 = 0;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    i10 = 8192;
                    width = i8 - ((image.getWidth() - i5) - i3);
                } else {
                    width = i8 - i5;
                }
                if ((i7 & 1073741824) != 0) {
                    i10 |= 16384;
                    height = i9 - ((image.getHeight() - i6) - i4);
                } else {
                    height = i9 - i6;
                }
                this.a.drawImage(image, width, height, 20, i10);
            } else {
                this.b.drawImage(image, i8, i9, 20);
            }
        }
        aW();
        return true;
    }

    public final boolean a(ai aiVar, int i) {
        if (aiVar != null) {
            this.z.c(aiVar.eF + this.fC, aiVar.eG + this.fD, aiVar.gh, aiVar.gi);
        } else {
            this.z.c(0, 0, this.fE, this.fF);
            this.z.c(this.C);
            this.z.gi--;
        }
        int color = this.b.getColor();
        this.b.setColor(i);
        this.b.drawRect(this.z.eF, this.z.eG, this.z.gh - 1, this.z.gi - 1);
        this.b.setColor(color);
        if (!this.z.c(this.C)) {
            return false;
        }
        d(this.z);
        return true;
    }

    public final boolean b(ai aiVar, int i) {
        if (aiVar != null) {
            this.z.c(aiVar.eF + this.fC, aiVar.eG + this.fD, aiVar.gh, aiVar.gi);
        } else {
            this.z.c(0, 0, this.fE, this.fF);
        }
        if (!this.z.c(this.C)) {
            return false;
        }
        d(this.z);
        int color = this.b.getColor();
        this.b.setColor(i);
        this.b.fillRect(this.z.eF, this.z.eG, this.z.gh, this.z.gi);
        this.b.setColor(color);
        return true;
    }

    public final boolean a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + this.fC;
        int i7 = i2 + this.fD;
        int i8 = i3 + this.fC;
        int i9 = i4 + this.fD;
        int color = this.b.getColor();
        this.b.setColor(i5);
        this.b.drawLine(i6, i7, i8, i9);
        this.b.setColor(color);
        a(Math.min(i6, i8), Math.min(i7, i9), Math.abs(i8 - i6) + 1, Math.abs(i9 - i7) + 1);
        return true;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = i + this.fC;
        int i5 = i2 + this.fD;
        int color = this.b.getColor();
        this.b.setColor(i3);
        this.b.drawLine(i4, i5, i4, i5);
        this.b.setColor(color);
        a(i4, i5, 1, 1);
        return true;
    }

    public final void aU() {
        this.D.gh = 0;
    }

    private void a(int i, int i2, int i3, int i4) {
        this.z.c(i, i2, i3, i4);
        if (this.z.c(this.C)) {
            d(this.z);
        }
    }

    private void d(ai aiVar) {
        if (this.D.gh != 0) {
            this.D.i(aiVar);
        } else {
            this.D.h(aiVar);
        }
    }

    public final void e(ai aiVar) {
        this.C.h(aiVar);
        this.b.setClip(this.C.eF, this.C.eG, this.C.gh, this.C.gi);
    }

    public final void aV() {
        ai[] aiVarArr = this.f17a;
        int i = this.fG;
        this.fG = i + 1;
        aiVarArr[i].h(this.C);
    }

    public final void aW() {
        ai aiVar = this.C;
        ai[] aiVarArr = this.f17a;
        int i = this.fG - 1;
        this.fG = i;
        aiVar.h(aiVarArr[i]);
        this.b.setClip(this.C.eF, this.C.eG, this.C.gh, this.C.gi);
    }

    public final void f(ai aiVar) {
        aiVar.h(this.C);
    }

    public final boolean a(ai aiVar) {
        this.z.c(aiVar.eF + this.fC, aiVar.eG + this.fD, aiVar.gh, aiVar.gi);
        return b(this.z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.z.c(i, i2, i3, i4);
        g(this.z);
    }

    public final void g(ai aiVar) {
        this.C.c(0, 0, this.fE, this.fF);
        if (aiVar != null) {
            this.C.c(aiVar);
        }
        this.b.setClip(this.C.eF, this.C.eG, this.C.gh, this.C.gi);
    }

    public final boolean b(ai aiVar) {
        boolean zC = this.C.c(aiVar);
        this.b.setClip(this.C.eF, this.C.eG, this.C.gh, this.C.gi);
        return zC;
    }

    public final void translate(int i, int i2) {
        this.fC += i;
        this.fD += i2;
    }

    public final void D(int i, int i2) {
        this.fC = i;
        this.fD = i2;
    }
}
