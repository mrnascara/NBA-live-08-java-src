package defpackage;

import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:aa.class */
public final class aa {
    public Image u;
    public short[] f;
    public ah a;
    public int ew;
    public int p;
    public int ex;
    public int ey;
    public int ez;
    public int eA;
    public int eB;
    public int eD;
    public int eE;
    public ai z = new ai();
    public ai A = new ai();
    public ai B = new ai();
    public int eC = -1;

    public aa(Image image, ah ahVar) {
        this.u = image;
        this.a = ahVar;
        aP();
        aQ();
        aS();
    }

    public aa(short[] sArr, ah ahVar) {
        this.f = sArr;
        this.a = ahVar;
        aP();
        aQ();
        aS();
    }

    public final void aH() {
        this.u = null;
        this.f = null;
        this.a = null;
    }

    public final void setPosition(int i, int i2) {
        this.ez = i;
        this.eA = i2;
        aP();
        aQ();
    }

    private int H(int i) {
        return (this.a.e[i] * 1000) / (this.a.f[i] & 63);
    }

    public final int getWidth() {
        return this.A.gh;
    }

    public final int getHeight() {
        return this.A.gi;
    }

    private void a(ai aiVar, int i, int i2) {
        int i3;
        int i4;
        short s;
        short s2;
        if (this.a == null) {
            if (this.f != null) {
                aiVar.c(i, i2, this.f[this.f.length - 2], this.f[this.f.length - 1]);
                return;
            } else {
                aiVar.c(i, i2, this.u.getWidth(), this.u.getHeight());
                return;
            }
        }
        if (this.eC == -1) {
            i3 = this.a.p[this.eE];
            i4 = this.a.q[this.eE];
            s = this.a.n[this.eE];
            s2 = this.a.o[this.eE];
        } else {
            i3 = this.a.t[this.eC];
            i4 = this.a.u[this.eC];
            s = this.a.r[this.eC];
            s2 = this.a.s[this.eC];
        }
        if ((this.eB & 2) != 0) {
            i3 = (s - 1) - i3;
        }
        if ((this.eB & 1) != 0) {
            i4 = (s2 - 1) - i4;
        }
        aiVar.c(i - i3, i2 - i4, s, s2);
    }

    private void b(ai aiVar, int i, int i2) {
        if (this.a == null) {
            if (this.f != null) {
                aiVar.c(i, i2, this.f[this.f.length - 2], this.f[this.f.length - 1]);
                return;
            } else {
                aiVar.c(i, i2, this.u.getWidth(), this.u.getHeight());
                return;
            }
        }
        int i3 = this.a.p[this.eE] - this.a.l[this.eE];
        int i4 = this.a.q[this.eE] - this.a.m[this.eE];
        short s = this.a.j[this.eE];
        short s2 = this.a.k[this.eE];
        if (this.eC != -1) {
            if ((this.a.f43e[this.eC][this.eD] & 2) != 0) {
                i3 = (s - 1) - i3;
            }
            if ((this.a.f43e[this.eC][this.eD] & 1) != 0) {
                i4 = (s2 - 1) - i4;
            }
            i3 -= this.a.f44f[this.eC][this.eD];
            i4 -= this.a.g[this.eC][this.eD];
        }
        if ((this.eB & 2) != 0) {
            i3 = (s - 1) - i3;
        }
        if ((this.eB & 1) != 0) {
            i4 = (s2 - 1) - i4;
        }
        aiVar.c(i - i3, i2 - i4, s, s2);
    }

    public final boolean u() {
        if (this.a == null || this.eC == -1) {
            return true;
        }
        return (this.a.f[this.eC] & 64) == 0 && this.p > this.ey;
    }

    public final void setVisible(boolean z) {
        if (z) {
            this.eB &= -9;
        } else {
            this.eB |= 8;
        }
    }

    public final boolean isVisible() {
        return (this.eB & 8) == 0;
    }

    public final void A(int i, int i2) {
        if (i == -1) {
            this.eC = i;
            this.eD = this.eE;
            this.ex = i2;
            this.ey = i2;
            aP();
            aQ();
            aS();
            return;
        }
        this.eD = 0;
        this.ex = i2;
        this.ey = i2 + H(i);
        this.eC = i;
        l(this.p);
        aR();
        aP();
        aQ();
        aS();
    }

    public final void setFrame(int i) {
        if (this.a == null) {
            return;
        }
        this.eD = i;
        aR();
        aP();
        aQ();
        aS();
    }

    public final boolean l(int i) {
        if (this.eC == -1) {
            return false;
        }
        int i2 = this.eD;
        this.p = i;
        int i3 = ((this.p - this.ex) * (this.a.f[this.eC] & 63)) / 1000;
        if ((this.eB & 4) != 0) {
            i3 = (this.a.e[this.eC] - i3) - 1;
        }
        if ((this.a.f[this.eC] & 64) != 0) {
            byte b = this.a.e[this.eC];
            if (i3 < 0) {
                this.eD = (((i3 + 1) % b) + b) - 1;
            } else {
                this.eD = i3 % b;
            }
        } else if (i3 < 0) {
            this.eD = 0;
        } else if (i3 >= this.a.e[this.eC]) {
            this.eD = this.a.e[this.eC] - 1;
        } else {
            this.eD = i3;
        }
        if (i2 == this.eD) {
            return false;
        }
        aR();
        aP();
        aQ();
        aS();
        return true;
    }

    public final boolean a(af afVar) {
        return a(afVar, this.ez, this.eA);
    }

    public final boolean a(af afVar, int i, int i2) {
        if ((this.eB & 8) != 0) {
            return false;
        }
        this.z.h(this.B);
        if (i != this.ez || i2 != this.eA) {
            b(this.z, i, i2);
        }
        return this.a == null ? this.f != null ? afVar.a(this.f, this.z.eF, this.z.eG, this.ew) : this.ew == 0 ? afVar.a(this.u, this.z.eF, this.z.eG) : afVar.a(this.u, this.z.eF, this.z.eG, this.ew) : this.f != null ? afVar.a(this.f, this.z.eF, this.z.eG, this.z.gh, this.z.gi, this.a.h[this.eE], this.a.i[this.eE], this.ew) : this.ew == 0 ? afVar.a(this.u, this.z.eF, this.z.eG, this.z.gh, this.z.gi, this.a.h[this.eE], this.a.i[this.eE]) : afVar.a(this.u, this.z.eF, this.z.eG, this.z.gh, this.z.gi, this.a.h[this.eE], this.a.i[this.eE], this.ew);
    }

    public final boolean a(af afVar, int i, int i2, int i3) {
        return this.f != null ? afVar.a(this.f, i - (this.a.p[i3] - this.a.l[i3]), i2 - (this.a.q[i3] - this.a.m[i3]), this.a.j[i3], this.a.k[i3], this.a.h[i3], this.a.i[i3], 0) : afVar.a(this.u, i - (this.a.p[i3] - this.a.l[i3]), i2 - (this.a.q[i3] - this.a.m[i3]), this.a.j[i3], this.a.k[i3], this.a.h[i3], this.a.i[i3]);
    }

    private void aP() {
        a(this.A, this.ez, this.eA);
    }

    private void aQ() {
        b(this.B, this.ez, this.eA);
    }

    private void aR() {
        if (this.eC == -1) {
            this.eE = this.eD;
        } else {
            this.eE = this.a.d[this.eC][this.eD];
        }
    }

    private void aS() {
        this.ew = 0;
        if (this.a == null || this.eC == -1) {
            if ((this.eB & 2) != 0) {
                this.ew |= Integer.MIN_VALUE;
            }
            if ((this.eB & 1) != 0) {
                this.ew |= 1073741824;
                return;
            }
            return;
        }
        byte b = this.a.f43e[this.eC][this.eD];
        if (((this.eB & 2) != 0) ^ ((b & 2) != 0)) {
            this.ew |= Integer.MIN_VALUE;
        }
        if (((this.eB & 1) != 0) ^ ((b & 1) != 0)) {
            this.ew |= 1073741824;
        }
    }

    public final int I(int i) {
        return this.a.n[i];
    }

    public final int J(int i) {
        return this.a.o[i];
    }
}
