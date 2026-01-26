package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:w.class */
public class w {
    public t d;
    public w c;

    /* renamed from: d, reason: collision with other field name */
    public w f193d;
    public u i;
    public int dN;
    public int dO;
    public int dP;
    public int dQ;
    public int dR;
    public int dS;
    public int dT;
    public int dU;
    public int dV;
    public boolean y;
    public int dW;
    public int dX;
    public int dY;
    public int dZ;
    public ai w = new ai();
    public ai x = new ai();
    public int dL = -1;
    public int dM = -1;
    public boolean J = true;
    public boolean I = true;

    public w(t tVar) {
        this.d = tVar;
        this.w.aT();
        this.x.aT();
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.dR = dataInputStream.readInt();
        this.x.eF = dataInputStream.readShort();
        this.x.eG = dataInputStream.readShort();
        this.x.gh = dataInputStream.readShort();
        this.x.gi = dataInputStream.readShort();
        this.w.gh = dataInputStream.readShort();
        this.w.gi = dataInputStream.readShort();
        this.dN = dataInputStream.readShort();
        this.dO = dataInputStream.readShort();
        this.dS = dataInputStream.readInt();
        this.dP = dataInputStream.readInt();
        this.dQ = dataInputStream.readInt();
        this.dV = dataInputStream.readInt();
        this.I = dataInputStream.readBoolean();
        this.dW = dataInputStream.readShort();
        this.dX = dataInputStream.readShort();
        this.dY = dataInputStream.readShort();
        this.dZ = dataInputStream.readShort();
        this.dT = dataInputStream.readShort();
        this.dU = dataInputStream.readShort();
        this.J = dataInputStream.readBoolean();
        c(dataInputStream);
    }

    public void b(af afVar) {
        if ((this.dS & 1) != 0) {
            afVar.b(this.x, this.dP);
        }
        if ((this.dS & 2) != 0) {
            afVar.a(this.x, this.dQ);
        }
    }

    public final void aG() throws IOException {
        f();
        this.y = true;
    }

    public final void aH() throws IOException {
        g();
        this.y = false;
    }

    public void q(int i, int i2) {
        this.x.gh = i;
        this.x.gi = i2;
        if ((this.dS & 2) != 0) {
            this.w.eF = 1 + this.dN;
            this.w.eG = 1 + this.dO;
            this.w.gh = (this.x.gh - (this.dN << 1)) - 2;
            this.w.gi = (this.x.gi - (this.dO << 1)) - 2;
        } else {
            this.w.eF = this.dN;
            this.w.eG = this.dO;
            this.w.gh = this.x.gh - (this.dN << 1);
            this.w.gi = this.x.gi - (this.dO << 1);
        }
        aI();
    }

    public void r(int i, int i2) {
        this.w.gh = i;
        this.w.gi = i2;
        if ((this.dS & 2) != 0) {
            this.w.eF = 1 + this.dN;
            this.w.eG = 1 + this.dO;
            this.x.gh = this.w.gh + (this.dN << 1) + 2;
            this.x.gi = this.w.gi + (this.dO << 1) + 2;
        } else {
            this.w.eF = this.dN;
            this.w.eG = this.dO;
            this.x.gh = this.w.gh + (this.dN << 1);
            this.x.gi = this.w.gi + (this.dO << 1);
        }
        aI();
    }

    public final void u(int i, int i2) {
        this.dT = i;
        this.dU = i2;
        aI();
    }

    public final void v(int i, int i2) {
        this.dW = i;
        this.dX = i2;
        aI();
    }

    public final int t() {
        int i = this.x.eF;
        u uVar = this.i;
        while (true) {
            u uVar2 = uVar;
            if (uVar2 == null) {
                return i;
            }
            i += uVar2.x.eF + uVar2.w.eF;
            uVar = uVar2.i;
        }
    }

    public final int u() {
        int i = this.x.eG;
        u uVar = this.i;
        while (true) {
            u uVar2 = uVar;
            if (uVar2 == null) {
                return i;
            }
            i += uVar2.x.eG + uVar2.w.eG;
            uVar = uVar2.i;
        }
    }

    public final void aI() {
        if (this.dW != 0) {
            int i = 0;
            switch (this.dY) {
                case 0:
                    switch (this.dW) {
                        case 2:
                        case 5:
                            i = this.x.gh >> 1;
                            break;
                        case 3:
                        case 4:
                            i = this.x.gh;
                            break;
                    }
                case 2:
                    i = this.x.gh >> 1;
                    break;
                case 3:
                    i = this.x.gh;
                    break;
            }
            this.x.eF = (-i) + this.dT;
            switch (this.dW) {
                case 2:
                    if (this.i == null) {
                        this.x.eF += this.d.d() >> 1;
                        break;
                    } else {
                        this.x.eF += this.i.B() >> 1;
                        break;
                    }
                case 3:
                    if (this.i == null) {
                        this.x.eF += this.d.d();
                        break;
                    } else {
                        this.x.eF += this.i.B();
                        break;
                    }
                case 4:
                    if (this.c != null) {
                        this.x.eF += this.c.v();
                        break;
                    }
                    break;
                case 5:
                    if (this.c != null) {
                        this.x.eF += this.c.v() + (this.c.x() >> 1);
                        break;
                    }
                    break;
                case 6:
                    if (this.c != null) {
                        this.x.eF += this.c.v() + this.c.x();
                        break;
                    }
                    break;
            }
        }
        if (this.dX != 0) {
            int i2 = 0;
            switch (this.dZ) {
                case 0:
                    switch (this.dX) {
                        case 2:
                        case 5:
                            i2 = this.x.gi >> 1;
                            break;
                        case 3:
                        case 4:
                            i2 = this.x.gi;
                            break;
                    }
                case 2:
                    i2 = this.x.gi >> 1;
                    break;
                case 3:
                    i2 = this.x.gi;
                    break;
            }
            this.x.eG = (-i2) + this.dU;
            switch (this.dX) {
                case 2:
                    if (this.i == null) {
                        this.x.eG += this.d.e() >> 1;
                        break;
                    } else {
                        this.x.eG += this.i.C() >> 1;
                        break;
                    }
                case 3:
                    if (this.i == null) {
                        this.x.eG += this.d.e();
                        break;
                    } else {
                        this.x.eG += this.i.C();
                        break;
                    }
                case 4:
                    if (this.c != null) {
                        this.x.eG += this.c.w();
                        break;
                    }
                    break;
                case 5:
                    if (this.c != null) {
                        this.x.eG += this.c.w() + (this.c.y() >> 1);
                        break;
                    }
                    break;
                case 6:
                    if (this.c != null) {
                        this.x.eG += this.c.w() + this.c.y();
                        break;
                    }
                    break;
            }
        }
        if (this.i != null) {
            this.i.ap();
        }
    }

    public void repaint() {
        if (this.i != null) {
            this.i.d(this);
        } else {
            ((u) this).repaint();
        }
    }

    public void c(DataInputStream dataInputStream) throws IOException {
    }

    public void f() throws IOException {
    }

    public void g() throws IOException {
    }

    public final int v() {
        return this.x.eF;
    }

    public final int w() {
        return this.x.eG;
    }

    public final int x() {
        return this.x.gh;
    }

    public final int y() {
        return this.x.gi;
    }

    public final int z() {
        return this.w.eF;
    }

    public final int A() {
        return this.w.eG;
    }

    public final int B() {
        return this.w.gh;
    }

    public final int C() {
        return this.w.gi;
    }

    public final void move(int i, int i2) {
        this.x.eF += i;
        this.x.eG += i2;
    }

    public final void setPosition(int i, int i2) {
        this.x.eF = i;
        this.x.eG = i2;
    }

    public final int D() {
        return this.x.eF;
    }

    public final int E() {
        return this.x.eG;
    }
}
