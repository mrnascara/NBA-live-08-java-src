package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:u.class */
public class u extends w {
    public w a;
    public w b;
    public int dk;
    public boolean G;
    public int dl;
    public int dm;
    public ai s;
    public ai t;
    public ai u;
    public boolean H;
    private ai v;

    public u(t tVar, int i) {
        super(tVar);
        this.s = new ai();
        this.t = new ai();
        this.u = new ai();
        new ai();
        new ai();
        this.v = new ai();
        this.dk = i;
        this.dL = 0;
    }

    public void e() throws IOException {
        aH();
        ao();
    }

    @Override // defpackage.w
    public final void q(int i, int i2) {
        super.q(i, i2);
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                break;
            }
            wVar2.aI();
            wVar = wVar2.f193d;
        }
        ap();
        if (this.H) {
            ((w) this).d.d(this);
        }
    }

    @Override // defpackage.w
    public final void r(int i, int i2) {
        super.r(i, i2);
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                break;
            }
            wVar2.aI();
            wVar = wVar2.f193d;
        }
        ap();
        if (this.H) {
            ((w) this).d.d(this);
        }
    }

    public int a(int i) throws IOException {
        return 100;
    }

    public boolean a(int i, int i2) throws IOException {
        return false;
    }

    public boolean b(int i, int i2) throws IOException {
        return false;
    }

    public void h(int i) throws IOException {
    }

    @Override // defpackage.w
    public void b(af afVar) {
        super.b(afVar);
        afVar.translate(this.x.eF, this.x.eG);
        afVar.translate(this.w.eF, this.w.eG);
        if (this.dl > 0) {
            i(afVar);
        }
        afVar.translate(-this.w.eF, -this.w.eG);
        afVar.translate(-this.x.eF, -this.x.eG);
    }

    public boolean c(int i, int i2) throws IOException {
        return false;
    }

    public boolean d(int i) throws IOException {
        return false;
    }

    public final void a(w wVar) {
        if (wVar == null) {
            return;
        }
        wVar.f193d = this.a;
        wVar.c = null;
        if (this.a != null) {
            this.a.c = wVar;
        }
        this.a = wVar;
        if (this.b == null) {
            this.b = wVar;
        }
        wVar.i = this;
        this.dl++;
        ap();
    }

    public final void b(w wVar) {
        if (wVar == null) {
            return;
        }
        wVar.c = this.b;
        wVar.f193d = null;
        if (this.b != null) {
            this.b.f193d = wVar;
        }
        this.b = wVar;
        if (this.a == null) {
            this.a = wVar;
        }
        wVar.i = this;
        this.dl++;
        ap();
    }

    public final void c(w wVar) {
        if (wVar == null) {
            return;
        }
        if (this.a == wVar) {
            this.a = wVar.f193d;
            if (this.a != null) {
                this.a.c = null;
            }
        } else {
            if (wVar.c == null) {
                return;
            }
            wVar.c.f193d = wVar.f193d;
        }
        if (this.b == wVar) {
            this.b = wVar.c;
            if (this.b != null) {
                this.b.f193d = null;
            }
        } else {
            if (wVar.f193d == null) {
                return;
            }
            wVar.f193d.c = wVar.c;
        }
        wVar.i = null;
        this.dl--;
    }

    public final void ao() {
        while (this.a != null) {
            w wVar = this.a;
            this.a = wVar.f193d;
            wVar.i = null;
            wVar.f193d = null;
            wVar.c = null;
            if (wVar instanceof u) {
                ((u) wVar).ao();
            }
        }
        this.b = null;
        this.dl = 0;
    }

    public final void ap() {
        switch (this.dk) {
            case 1:
                int iY = 0;
                w wVar = this.a;
                while (true) {
                    w wVar2 = wVar;
                    if (wVar2 == null) {
                        break;
                    } else {
                        wVar2.setPosition(wVar2.v(), iY);
                        iY += wVar2.y() + this.dm;
                        wVar = wVar2.f193d;
                    }
                }
            case 2:
                int iX = 0;
                w wVar3 = this.a;
                while (true) {
                    w wVar4 = wVar3;
                    if (wVar4 == null) {
                        break;
                    } else {
                        wVar4.setPosition(iX, wVar4.w());
                        iX += wVar4.x() + this.dm;
                        wVar3 = wVar4.f193d;
                    }
                }
        }
    }

    public final void aq() {
        int iMin = 5000;
        int iMin2 = 5000;
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                break;
            }
            iMin = Math.min(iMin, wVar2.v());
            iMin2 = Math.min(iMin2, wVar2.w());
            wVar = wVar2.f193d;
        }
        if (iMin != 0 || iMin2 != 0) {
            w wVar3 = this.a;
            while (true) {
                w wVar4 = wVar3;
                if (wVar4 == null) {
                    break;
                }
                wVar4.move(-iMin, -iMin2);
                wVar3 = wVar4.f193d;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        w wVar5 = this.a;
        while (true) {
            w wVar6 = wVar5;
            if (wVar6 == null) {
                break;
            }
            int iV = wVar6.v() + wVar6.x();
            int iW = wVar6.w() + wVar6.y();
            iMax = Math.max(iMax, iV);
            iMax2 = Math.max(iMax2, iW);
            wVar5 = wVar6.f193d;
        }
        r(iMax, iMax2);
        aI();
        if (this.H) {
            ((w) this).d.d(this);
        } else {
            b((ai) null);
        }
    }

    public final w b(int i) {
        w wVarB;
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                w wVar3 = this.a;
                while (true) {
                    w wVar4 = wVar3;
                    if (wVar4 == null) {
                        return wVar4;
                    }
                    if (wVar4.dL == 0 && (wVarB = ((u) wVar4).b(i)) != null) {
                        return wVarB;
                    }
                    wVar3 = wVar4.f193d;
                }
            } else {
                if (i == wVar2.dR) {
                    return wVar2;
                }
                wVar = wVar2.f193d;
            }
        }
    }

    public final void a(ai aiVar, ai aiVar2) {
        aiVar.eF = aiVar2.eF + v();
        aiVar.eG = aiVar2.eG + w();
        aiVar.gh = aiVar2.gh;
        aiVar.gi = aiVar2.gi;
    }

    public final void b(ai aiVar, ai aiVar2) {
        aiVar.eF = aiVar2.eF - v();
        aiVar.eG = aiVar2.eG - w();
        aiVar.gh = aiVar2.gh;
        aiVar.gi = aiVar2.gi;
    }

    @Override // defpackage.w
    public final void repaint() {
        m56a((ai) null);
    }

    private u a(ai aiVar) {
        u uVar = this;
        if (aiVar != null) {
            this.v.h(aiVar);
        } else {
            this.v.c(0, 0, this.x.gh, this.x.gi);
        }
        while (uVar.i != null) {
            this.v.eF += uVar.v();
            this.v.eG += uVar.w();
            uVar = uVar.i;
        }
        return uVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final void m56a(ai aiVar) {
        u uVarA = a(aiVar);
        if (uVarA.H) {
            ((w) this).d.b(uVarA, this.v);
        }
    }

    public final void b(ai aiVar) {
        u uVarA = a(aiVar);
        if (uVarA.H) {
            ((w) this).d.a(uVarA, this.v);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private u m57b(ai aiVar) {
        u uVar = this;
        if (aiVar != null) {
            this.v.h(aiVar);
            this.v.eF += uVar.z();
            this.v.eG += uVar.A();
        } else {
            this.v.c(this.w.eF, this.w.eG, this.w.gh, this.w.gi);
        }
        while (uVar.i != null) {
            this.v.eF += uVar.v() + uVar.i.z();
            this.v.eG += uVar.w() + uVar.i.A();
            uVar = uVar.i;
        }
        return uVar;
    }

    public final void c(ai aiVar) {
        u uVarM57b = m57b(aiVar);
        if (uVarM57b.H) {
            ((w) this).d.b(uVarM57b, this.v);
        }
    }

    public final void d(w wVar) {
        c(wVar.x);
    }

    public final void g(DataInputStream dataInputStream) throws IOException {
        this.dk = dataInputStream.readShort();
        this.dm = dataInputStream.readShort();
        this.G = dataInputStream.readBoolean();
    }

    @Override // defpackage.w
    public void c(DataInputStream dataInputStream) throws IOException {
        g(dataInputStream);
        short s = dataInputStream.readShort();
        while (true) {
            short s2 = s;
            if (s2 == -1) {
                return;
            }
            w wVarA = ((w) this).d.a((int) s2);
            wVarA.a(dataInputStream);
            b(wVarA);
            s = dataInputStream.readShort();
        }
    }

    @Override // defpackage.w
    public void f() throws IOException {
        if (this.w.gh <= 0 || this.w.gi <= 0) {
            int iD = this.x.gh;
            int iE = this.x.gi;
            if (this.x.gh <= 0) {
                iD = (this.i == null || this.i.B() <= 0) ? iD + ((w) this).d.d() : iD + this.i.B();
            }
            if (this.x.gi <= 0) {
                iE = (this.i == null || this.i.C() <= 0) ? iE + ((w) this).d.e() : iE + this.i.C();
            }
            q(iD, iE);
        } else {
            r(this.w.gh, this.w.gi);
        }
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                break;
            }
            if (wVar2.J) {
                wVar2.aG();
                wVar2.aI();
            }
            wVar = wVar2.f193d;
        }
        if (this.G) {
            aq();
        }
    }

    @Override // defpackage.w
    public void g() throws IOException {
        w wVar = this.a;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                return;
            }
            wVar2.aH();
            wVar = wVar2.f193d;
        }
    }

    public final void i(af afVar) {
        int i = afVar.fC;
        int i2 = afVar.fD;
        w wVar = this.b;
        while (true) {
            w wVar2 = wVar;
            if (wVar2 == null) {
                return;
            }
            if (wVar2.I && wVar2.y) {
                this.u.eF = i + wVar2.v();
                this.u.eG = i2 + wVar2.w();
                this.u.gh = wVar2.x();
                this.u.gi = wVar2.y();
                afVar.aV();
                if (afVar.b(this.u)) {
                    wVar2.b(afVar);
                }
                afVar.aW();
            }
            wVar = wVar2.c;
        }
    }
}
