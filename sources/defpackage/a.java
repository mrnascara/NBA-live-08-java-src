package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:a.class */
public final class a {
    public static final ab a = new ab(256, 0, 256);
    private ab b = new ab();
    private ab c = new ab();
    private ab d = new ab();
    private ab e = new ab();
    private ab f = new ab();
    private ab g = new ab();
    private ab h = new ab();
    private ab i = new ab();
    private ab j = new ab();
    private ab k = new ab();
    private ab l = new ab();
    private ab m = new ab();
    private ab n = new ab();
    private ab o = new ab();
    private ab p = new ab();
    private ab q = new ab();
    private ab r = new ab();
    private ab s = new ab();
    private ab t = new ab();
    private ab u = new ab();
    private ab v = new ab();
    private ab w;
    private ab x;
    private ab y;
    private ab z;
    private ab A;
    private ab B;
    private ab C;
    private ab D;
    private ab E;
    private ab F;
    private ab G;
    private ab H;

    /* renamed from: a, reason: collision with other field name */
    public f f0a;

    /* renamed from: a, reason: collision with other field name */
    public ak f1a;

    /* renamed from: a, reason: collision with other field name */
    public int f2a;

    /* renamed from: b, reason: collision with other field name */
    public int f3b;

    /* renamed from: c, reason: collision with other field name */
    public int f4c;

    /* renamed from: d, reason: collision with other field name */
    public int f5d;

    /* renamed from: e, reason: collision with other field name */
    public int f6e;

    /* renamed from: b, reason: collision with other field name */
    public ak f7b;

    /* renamed from: c, reason: collision with other field name */
    public ak f8c;

    /* renamed from: d, reason: collision with other field name */
    public ak f9d;
    public ab I;
    public ab J;

    /* renamed from: f, reason: collision with other field name */
    public int f10f;

    /* renamed from: g, reason: collision with other field name */
    public int f11g;

    /* renamed from: h, reason: collision with other field name */
    public int f12h;

    /* renamed from: i, reason: collision with other field name */
    public int f13i;

    /* renamed from: j, reason: collision with other field name */
    public int f14j;

    /* renamed from: k, reason: collision with other field name */
    public int f15k;

    /* renamed from: l, reason: collision with other field name */
    public int f16l;

    public a() {
        new ab();
        new ab();
        new ab();
        new ab();
        new ab();
        new ab();
        new ab();
        new ab();
        new ab();
        this.w = new ab();
        this.x = new ab();
        this.y = new ab();
        this.z = new ab();
        this.A = new ab();
        this.B = new ab();
        this.C = new ab();
        this.D = new ab();
        this.E = new ab();
        this.F = new ab();
        this.G = new ab();
        this.H = new ab();
        this.I = new ab();
        this.J = new ab();
        this.f2a = 0;
        this.f4c = 0;
        this.f5d = 1;
    }

    public final void a(f fVar, ak akVar) {
        this.f0a = fVar;
        this.f1a = akVar;
    }

    public final void a(int i, int i2) {
        this.J.eF = i;
        this.J.eH = i2;
        this.I.c(this.J);
    }

    public final boolean a() {
        if (this.f2a != 5) {
            return true;
        }
        this.f0a.a(this.f1a, this.J);
        this.I.c(this.J);
        return false;
    }

    public final void a(ak akVar, int i, int i2) {
        m9b();
        if (akVar == this.f1a && this.f1a.ap) {
            switch (this.f2a) {
                case 0:
                    d(i);
                    break;
                case 1:
                    e(i);
                    break;
            }
        }
        if (this.f2a == 0) {
            b(akVar, i);
            return;
        }
        if (this.f2a == 1) {
            c(i);
            return;
        }
        y yVar = this.f1a.b;
        switch (this.f2a) {
            case 2:
            case 3:
                if ((this.f1a.gt & 32) == 0) {
                    this.f1a.g(a);
                    break;
                }
                break;
            case 4:
                if (this.f1a.gk <= 0) {
                    if (this.f1a.t != (yVar.aC.eF > 0)) {
                    }
                }
                b(akVar, i);
                break;
            case 5:
                if (!this.f0a.m27i()) {
                    if (yVar.g != null) {
                        int iM1a = m1a(this.I, i);
                        if (iM1a <= 0) {
                            if (iM1a < 0) {
                                this.f1a.k(false);
                            }
                            if (this.f1a.r == akVar.r) {
                                this.f0a.v(3);
                                break;
                            } else if (yVar.E(i) > 1500) {
                                ak akVarB = this.f1a.f45a.b(this.f1a);
                                if (f.m31k()) {
                                    this.f1a.n = akVarB;
                                    this.f1a.c(4, i, true);
                                    break;
                                }
                            }
                        }
                    } else {
                        a(yVar, i);
                        break;
                    }
                } else {
                    this.f1a.c(57341, i, false);
                    break;
                }
                break;
        }
    }

    public final void b(int i, int i2) {
        this.f1a.c(36929, i2, false);
        this.f2a = i;
        this.f3b = i2;
        switch (this.f2a) {
            case 0:
                c(0, i2);
                break;
            case 1:
                d(0, i2);
                break;
            case 2:
                f(i2);
                break;
            case 4:
                f(i2);
                c(0, i2);
                break;
            case 5:
                c(0, i2);
                break;
            case 8:
                f(i2);
                break;
        }
    }

    public final void c(int i, int i2) {
        this.f4c = i;
        this.f6e = i2;
        switch (i) {
            case 1:
                f(i2);
                break;
            case 4:
                this.f1a.c(57341, i2, false);
                this.f1a.c(64, i2, true);
                break;
            case 8:
                this.f1a.a(true, this.b);
                this.f13i = 200;
                this.f13i += (200 * (99 - this.f1a.f46a.ff)) / 49;
                if (this.f1a.r != this.f0a.f77e.r) {
                    switch (this.f0a.H) {
                        case 0:
                            this.f13i <<= 1;
                            break;
                        case 1:
                            this.f13i = t.e(this.f13i << 16, 98304) >> 16;
                            break;
                    }
                }
                int iMin = Math.min(this.f0a.u, this.f0a.v);
                if (this.f0a.e(this.f1a)) {
                    this.f13i = t.e(this.f13i, 32768);
                }
                this.f14j = i2;
                s sVarM21b = this.f0a.m21b(this.f1a);
                if (sVarM21b.cD == 1 && this.f1a != this.f0a.f77e) {
                    ak akVar = null;
                    for (int i3 = 0; i3 < 5; i3++) {
                        ak akVarA = sVarM21b.a(i3);
                        if (akVar == null || akVarA.I() < akVar.I()) {
                            akVar = akVarA;
                        }
                    }
                    if (akVar == this.f1a) {
                        c(9, i2);
                        break;
                    }
                }
                if (m3b(iMin)) {
                    c(9, i2);
                    break;
                } else if (m2a(iMin)) {
                    c(10, i2);
                    break;
                } else {
                    this.f0a.f112a.a(this.f12h, this.f11g, this.c);
                    if (this.f1a.t) {
                        a(this.c.eF, this.c.eH);
                        break;
                    } else {
                        a(-this.c.eF, this.c.eH);
                        break;
                    }
                }
                break;
            case 9:
                s sVarM21b2 = this.f0a.m21b(this.f1a);
                a(this.f1a.t ? 753960 : -753960, 0);
                if (sVarM21b2.cD == 1 || ((w) this.f0a).d.o(65536) >= 49152) {
                    this.f16l = -1;
                    break;
                } else {
                    this.f16l = 1000 + (((w) this.f0a).d.o(11) * 100);
                    break;
                }
                break;
            case 10:
                this.f15k = t.e(t.e(this.f1a.gp, 8916), 65536000) >> 16;
                this.f1a.c(57341, i2, false);
                this.f1a.c(1, i2, true);
                break;
            case 12:
                this.f1a.c(32, i2, false);
                break;
            case 13:
                this.f1a.c(32768, i2, true);
                a(this.f1a.t ? 753960 : -753960, 0);
                break;
            case 14:
                this.f1a.c(4, i2, true);
                break;
        }
    }

    public final void d(int i, int i2) {
        this.f5d = i;
        this.f6e = i2;
        if (i == 0) {
            this.f5d = 1;
            i = 1;
        }
        switch (i) {
            case 1:
                this.f14j = i2;
                this.f13i = 500 + ((500 * (99 - this.f1a.f46a.fg)) / 49);
                break;
            case 2:
                this.f1a.c(8, i2, true);
                break;
            case 3:
                this.f1a.c(16, i2, true);
                break;
            case 4:
                this.f1a.c(4096, i2, false);
                break;
            case 6:
                f(i2);
                break;
        }
    }

    public final boolean a(ak akVar) {
        if (this.f2a != 1) {
            return false;
        }
        if (this.f8c == akVar) {
            return true;
        }
        return this.f7b == akVar && this.f8c == null;
    }

    public final void a(int i, int i2, int i3) {
        if (this.f2a == 0 || this.f2a == 4) {
            aj ajVar = this.f0a.f112a;
            if (ajVar.L(i) > i2) {
                this.f11g = i2;
                this.f12h = i;
                if (this.f4c == 0 || this.f4c == 8) {
                    if (i2 != this.f11g) {
                        this.f1a.c(32768, i3, false);
                    }
                    ajVar.a(i, i2, this.c);
                    if (this.f1a.t) {
                        a(this.c.eF, this.c.eH);
                    } else {
                        a(-this.c.eF, this.c.eH);
                    }
                }
            }
        }
    }

    public final void a(int i) {
        if (this.f2a == 0 && this.f4c == 8 && this.f1a.b.g == this.f1a) {
            e(i, Math.min(this.f0a.v, this.f0a.u));
        }
    }

    public final void a(ab abVar, int i) {
        a(abVar.eF, abVar.eH);
        c(2, i);
    }

    public final void a(ak akVar, ab abVar, int i) {
        s sVarA = this.f0a.a(this.f1a);
        this.f9d = null;
        if (this.f1a.b.g == this.f1a) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 5) {
                break;
            }
            ak akVarA = sVarA.a(i2);
            if (akVarA.a.a(akVar)) {
                this.f9d = akVarA;
                break;
            }
            i2++;
        }
        if (abVar != null) {
            a(abVar.eF, abVar.eH);
        } else {
            boolean z = this.f1a.t;
            this.d.c(akVar.b());
            this.e.h(-this.d.eH, 0, this.d.eF);
            this.d.R(99884);
            this.e.R(39954);
            if (z == (akVar.aC.eH > 0)) {
                this.e.eF = -this.e.eF;
                this.e.eH = -this.e.eH;
            }
            this.d.d(this.e);
            a(akVar.aC.eF + this.d.eF, akVar.aC.eH + this.d.eH);
        }
        c(3, i);
    }

    public final void b(int i) {
        if (this.f2a == 0 && this.f1a.b.g == this.f1a) {
            c(9, i);
        }
    }

    public final void b(ab abVar, int i) {
        if (this.f2a == 0) {
            c(5, i);
            a(abVar.eF, abVar.eH);
        } else if (this.f2a == 1) {
            d(4, i);
            a(abVar.eF, abVar.eH);
        }
    }

    public final void a(ak akVar, int i) {
        if (this.f2a == 1 && a(akVar)) {
            this.f.b(this.f1a.aC, akVar.aC);
            if (this.f.F() <= 152233) {
                if (((w) this.f0a).d.o(65536) >= t.e((this.f1a.f46a.fg - 50) << 16, 1337)) {
                    d(6, i);
                }
            }
        }
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.f2a = dataInputStream.readInt();
        this.f3b = dataInputStream.readInt();
        this.f4c = dataInputStream.readInt();
        this.f5d = dataInputStream.readInt();
        this.f6e = dataInputStream.readInt();
        this.f7b = this.f0a.a(dataInputStream);
        this.f8c = this.f0a.a(dataInputStream);
        this.f9d = this.f0a.a(dataInputStream);
        this.J.a(dataInputStream);
        this.I.a(dataInputStream);
        this.f10f = dataInputStream.readInt();
        this.f11g = dataInputStream.readInt();
        this.f12h = dataInputStream.readInt();
        this.f13i = dataInputStream.readInt();
        this.f14j = dataInputStream.readInt();
        this.f15k = dataInputStream.readInt();
        this.f16l = dataInputStream.readInt();
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(-16772556);
        dataOutputStream.writeInt(2);
        dataOutputStream.writeInt(this.f2a);
        dataOutputStream.writeInt(this.f3b);
        dataOutputStream.writeInt(this.f4c);
        dataOutputStream.writeInt(this.f5d);
        dataOutputStream.writeInt(this.f6e);
        f.a(this.f7b, dataOutputStream);
        f.a(this.f8c, dataOutputStream);
        f.a(this.f9d, dataOutputStream);
        this.J.a(dataOutputStream);
        this.I.a(dataOutputStream);
        dataOutputStream.writeInt(this.f10f);
        dataOutputStream.writeInt(this.f11g);
        dataOutputStream.writeInt(this.f12h);
        dataOutputStream.writeInt(this.f13i);
        dataOutputStream.writeInt(this.f14j);
        dataOutputStream.writeInt(this.f15k);
        dataOutputStream.writeInt(this.f16l);
    }

    private void b(ak akVar, int i) {
        y yVar = this.f1a.b;
        f fVar = this.f1a.f45a;
        int i2 = i - this.f6e;
        int iMin = Math.min(fVar.v, fVar.u);
        if (yVar.g == this.f1a) {
            if (this.f4c < 8) {
                c(8, i);
            }
        } else if (this.f4c >= 8) {
            c(0, i);
        }
        switch (this.f4c) {
            case 1:
                if (yVar.g != null) {
                    c(0, i);
                    break;
                } else {
                    this.f1a.b(this.f1a.b);
                    break;
                }
            case 2:
                if (m1a(this.I, i) < 0) {
                    c(1, i);
                    break;
                }
                break;
            case 3:
                if (m1a(this.I, i) < 0) {
                    c(4, i);
                    break;
                }
                break;
            case 4:
                if (this.f9d != null) {
                    this.f1a.d(this.f9d);
                }
                if (i2 >= 2000) {
                    c(0, i);
                    this.f1a.c(64, i, false);
                    break;
                }
                break;
            case 5:
                a(this.f1a.b, i);
                if (this.f1a.b.g != null) {
                    c(0, i);
                    a(this.f1a.aC);
                    break;
                }
                break;
            case 6:
            default:
                if ((this.f1a.gt & 32768) == 0) {
                    m6a();
                    if (m1a(this.I, i) < 0) {
                        f(i);
                    }
                    if (this.f1a.f48a == 0) {
                        if ((this.f1a.b.f198a == -1 || this.f1a.b.f198a == 1) && this.f1a.v()) {
                            this.f1a.c(32768, i, true);
                            break;
                        }
                    }
                } else if (!this.f1a.v() || (this.f1a.b.f198a != -1 && this.f1a.b.f198a != 1)) {
                    this.f1a.c(32768, i, false);
                    break;
                } else {
                    this.f1a.b(this.f1a.b);
                    break;
                }
                break;
            case 7:
                if (this.f1a.t == (this.f1a.b.aC.eF > 0)) {
                    c(0, i);
                    break;
                } else if (m1a(this.I, i) < 0) {
                    f(i);
                    break;
                }
                break;
            case 8:
                if (this.f1a.f48a == 0) {
                    m6a();
                }
                if (m1a(this.I, i) < 0) {
                    f(i);
                }
                if (iMin <= 2000) {
                    e(i, iMin);
                    break;
                } else if (i - this.f14j >= this.f13i) {
                    s sVarM21b = this.f0a.m21b(this.f1a);
                    if (this.f1a == akVar || sVarM21b.cD != 1) {
                        if (m4c(iMin)) {
                            if (m2a(iMin)) {
                                e(i, iMin);
                            } else if (m3b(iMin)) {
                                c(9, i);
                            } else {
                                ak akVarM5a = m5a();
                                if (akVarM5a != null) {
                                    this.f1a.n = akVarM5a;
                                    c(14, i);
                                    break;
                                } else {
                                    this.f1a.k(false);
                                }
                            }
                        }
                        this.f14j = i;
                        break;
                    } else {
                        ak akVar2 = null;
                        for (int i3 = 0; i3 < 5; i3++) {
                            ak akVarA = sVarM21b.a(i3);
                            if (akVar2 == null || akVarA.I() < akVar2.I()) {
                                akVar2 = akVarA;
                            }
                        }
                        if (akVar2 == this.f1a) {
                            c(9, i);
                            break;
                        } else {
                            this.f1a.n = akVar2;
                            c(14, i);
                            break;
                        }
                    }
                }
                break;
            case 9:
                int iK = this.f0a.m21b(this.f1a).k(this.f1a.gk);
                boolean z = this.f1a.t ? this.f1a.aC.eF > 833867 : this.f1a.aC.eF < -833867;
                if (m1a(this.I, i) > 131072 || z) {
                    if (z) {
                        ak akVarM5a2 = m5a();
                        if (akVarM5a2 != null) {
                            this.f1a.n = akVarM5a2;
                            c(14, i);
                            break;
                        } else {
                            c(0, i);
                            break;
                        }
                    } else if (this.f16l < 0) {
                        if (iK > 2) {
                            ak akVarM5a3 = m5a();
                            if (akVarM5a3 != null) {
                                this.f1a.n = akVarM5a3;
                                c(14, i);
                                break;
                            } else {
                                c(0, i);
                                c(8, i);
                                break;
                            }
                        }
                    } else if (this.f16l <= i2) {
                        if (iK == 0) {
                            this.f16l = 0;
                            break;
                        } else {
                            e(i, iMin);
                            break;
                        }
                    }
                } else {
                    e(i, iMin);
                    break;
                }
                break;
            case 10:
                if (this.f1a.b.g != this.f1a || this.f1a.f48a != 5) {
                    c(0, i);
                    break;
                }
                break;
            case 11:
                if (this.f1a.f48a == 0) {
                    c(0, i);
                    break;
                }
                break;
            case 12:
                if (this.f1a.gn == 0) {
                    c(10, i);
                    break;
                }
                break;
            case 13:
                int iM1a = m1a(this.I, i);
                if (i2 >= 3000 || iM1a < 0) {
                    e(i, iMin);
                    break;
                }
                break;
            case 14:
                if (this.f1a.f48a == 0) {
                    c(0, i);
                    break;
                }
                break;
        }
    }

    private void c(int i) {
        ak akVarM8a;
        y yVar = this.f1a.b;
        int i2 = i - this.f6e;
        switch (this.f5d) {
            case 1:
                ak akVar = yVar.g;
                boolean z = true;
                ak akVar2 = this.f8c;
                if (this.f1a.b.g != this.f8c) {
                    this.f8c = null;
                    akVar2 = null;
                } else if (akVar2 != null && akVar2.I() > 139837 && (akVarM8a = m8a(akVar2)) != null) {
                    this.i.b(akVarM8a.aC, akVar2.aC);
                    if (this.i.F() <= 97429 && ab.m11a(this.i, akVar2.b()) > 0) {
                        this.f8c = null;
                        akVar2 = null;
                    }
                }
                if (akVar2 == null) {
                    akVar2 = this.f7b;
                }
                if (akVar2 != null) {
                    if (c(akVar2)) {
                        m7a(akVar2);
                    }
                    c(akVar2, i);
                    this.g.c(akVar2.aC);
                    this.g.eG = 0;
                    if ((!akVar2.t || this.g.eF >= 0) && (akVar2.t || this.g.eF <= 0)) {
                        int iE = 79907 + t.e(32768, 65536 - ((this.f1a.f46a.fg - 50) * 1337));
                        if (akVar2.a.f2a == 5) {
                            iE = 159814;
                        } else if ((this.f1a.gt & 32768) != 0) {
                            iE = this.f1a.M() + akVar2.M();
                        } else if ((akVar2.t && this.g.eF < 196608) || (!akVar2.t && this.g.eF > -196608)) {
                            iE <<= 1;
                        } else if (akVar2.f48a == 5 || akVar2.f48a == 18) {
                            iE = this.f1a.M() + akVar2.M() + 6553;
                        }
                        this.h.c(akVar2.b());
                        if (akVar == akVar2 || (akVar2.gt & 32768) != 0) {
                            this.g.d(this.h, iE);
                            this.j.b(akVar2.aC, this.f1a.aC);
                            if (this.j.F() <= 97429 && this.f1a.a(false, this.k) > 0 && ab.m11a(this.k, this.j) <= 0) {
                                this.k.G();
                                if (ab.m11a(this.k, this.f1a.bb) <= -46341) {
                                    v.a(akVar2.aC, this.f1a.aC, this.k, this.l);
                                    this.l.e(akVar2.aC);
                                    this.g.b(this.f1a.aC, this.l);
                                    this.g.eG = 0;
                                }
                            }
                        } else {
                            int iAbs = 0;
                            if (akVar != null) {
                                iAbs = Math.abs(akVar.J() - akVar2.J());
                            }
                            if (iAbs < 2) {
                                this.g.d(this.h, iE);
                            } else if (iAbs >= 2) {
                                this.g.d(this.h, akVar2.I() >> 1);
                            }
                        }
                        if (akVar == akVar2) {
                            switch (akVar2.f48a) {
                                case 5:
                                    if (akVar2.gw > 0) {
                                        int iM = this.f1a.M() + akVar2.M() + 32768;
                                        this.j.b(this.g, this.f1a.aC);
                                        if (this.j.F() <= t.e(iM, iM)) {
                                            d(2, i);
                                            break;
                                        }
                                    }
                                    break;
                                case 7:
                                    this.g.eF = akVar2.t ? 833867 : -833867;
                                    this.g.eG = 0;
                                    this.g.eH = 0;
                                    if (akVar2.gw > 0) {
                                        int iM2 = this.f1a.M() + akVar2.M() + 32768;
                                        this.j.b(this.g, this.f1a.aC);
                                        if (this.j.F() <= t.e(iM2, iM2)) {
                                            this.f1a.c(32, i, false);
                                            d(2, i);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    if (i - this.f14j >= this.f13i) {
                                        if (b(akVar2)) {
                                            z = false;
                                            d(3, i);
                                        }
                                        this.f14j = i;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else if (this.f1a.gk > 3) {
                        this.g.eF = akVar2.t ? 559311 : -559311;
                    } else if (this.f1a.gk > 1) {
                        this.g.eF = akVar2.t ? 709126 : -709126;
                    } else {
                        this.g.eF = akVar2.t ? 359452 : -359452;
                    }
                } else {
                    this.g.h(0, 0, 0);
                }
                if (akVar2 == akVar) {
                    a(this.g.eF, this.g.eH);
                } else {
                    a(this.g);
                }
                if (z) {
                    m1a(this.I, i);
                }
                int i3 = this.f1a.f48a;
                if (i3 != 0 && i3 != 1) {
                    if (i3 == 4 && akVar2 != null) {
                        this.f1a.d(akVar2);
                        break;
                    }
                } else {
                    this.f1a.b(this.f1a.b);
                    break;
                }
                break;
            case 2:
                if (this.f1a.f48a >= 0 && this.f1a.f48a <= 4) {
                    d(1, i);
                    break;
                }
                break;
            case 3:
                if (this.f1a.f48a != 9) {
                    d(1, i);
                    break;
                }
                break;
            case 4:
                a(this.f1a.b, i);
                if (this.f1a.b.g != null) {
                    d(0, i);
                    a(this.f1a.aC);
                    break;
                }
                break;
            case 6:
                if (i2 >= 500) {
                    d(0, i);
                    break;
                }
                break;
            case 7:
                if (yVar.g == null) {
                    ak akVar3 = yVar.k.n;
                    if (akVar3 != null) {
                        this.m.b(yVar.aC, akVar3.aC);
                        this.m.eG = 0;
                        this.m.G();
                        this.m.R(79907);
                        this.m.d(akVar3.aC);
                        a(this.m.eF, this.m.eH);
                        if (m1a(this.I, i) < 0) {
                            f(i);
                        }
                        this.f1a.b(yVar);
                        break;
                    } else {
                        d(1, i);
                        break;
                    }
                } else {
                    d(1, i);
                    break;
                }
        }
    }

    private void d(int i) {
        if (this.f1a.f48a == 0 && this.f1a == this.f1a.b.g) {
            if (this.f1a.v()) {
                this.f1a.c(32768, i, true);
            }
        } else {
            if ((this.f1a.gt & 32768) == 0 || this.f1a.v()) {
                return;
            }
            this.f1a.c(32768, i, false);
        }
    }

    private void e(int i) {
        ak akVar = this.f1a.b.g;
        if (akVar == null) {
            this.f1a.c(4096, i, false);
            return;
        }
        this.n.b(akVar.aC, this.f1a.aC);
        if (this.n.F() <= 262144) {
            c(akVar, i);
        } else {
            this.f1a.c(4096, i, false);
        }
        if (this.f1a.f48a == 1 || this.f1a.f48a == 4) {
            this.f1a.d(akVar);
        }
        if (this.f7b == null || !c(this.f7b)) {
            return;
        }
        m7a(this.f7b);
    }

    private void a(y yVar, int i) {
        int iE = yVar.aC.eG + t.e(yVar.a().eG, 6554) + (t.e(t.e(-481689, 6554), 6554) >> 1);
        if (m1a(yVar.aC, i) > (this.f1a.f46a.fo << 1) || iE >= 242483 || iE <= 150733) {
            return;
        }
        this.f1a.c(8, i, true);
    }

    private void f(int i) {
        this.f1a.c(32, i, false);
    }

    /* renamed from: a, reason: collision with other method in class */
    private int m1a(ab abVar, int i) {
        this.o.b(abVar, this.f1a.aC);
        this.o.eG = 0;
        if (c()) {
            if ((this.f1a.gt & 32) == 0) {
                return 0;
            }
            this.f1a.c(32, i, false);
            return -1;
        }
        if (this.o.F() <= 6089) {
            if ((this.f1a.gt & 32) == 0) {
                return 0;
            }
            this.f1a.c(32, i, false);
            return -1;
        }
        if (!this.f1a.y() || !b()) {
            this.f1a.f(abVar);
        }
        this.f1a.c(32, i, true);
        int iE = t.e(this.o.eF, this.o.eF) + t.e(this.o.eH, this.o.eH);
        if (iE == 0) {
            return 256;
        }
        return iE;
    }

    private boolean b(ak akVar) {
        int i = akVar.f48a;
        if (i != 0 && i != 2) {
            return false;
        }
        int i2 = (this.f1a.f46a.eZ + this.f1a.f46a.fg) >> 1;
        this.u.eF = this.f1a.aC.eF;
        this.u.eG = this.f1a.aC.eH;
        this.s.eF = akVar.aC.eF;
        this.s.eG = akVar.aC.eH;
        this.q.b(this.s, this.u);
        if (this.q.F() > 97429) {
            return false;
        }
        this.t.eF = this.f1a.bb.eF;
        this.t.eG = this.f1a.bb.eH;
        int iM12b = ab.m12b(this.t, this.q);
        if (iM12b <= 0) {
            return false;
        }
        this.v.eF = this.t.eG;
        this.v.eG = -this.t.eF;
        if (ab.m12b(this.v, this.q) > iM12b) {
            return false;
        }
        this.v.eF = -this.t.eG;
        this.v.eG = this.t.eF;
        if (ab.m12b(this.v, this.q) > iM12b) {
            return false;
        }
        this.q.eF = -this.q.eF;
        this.q.eG = -this.q.eG;
        this.r.eF = akVar.bb.eF;
        this.r.eG = akVar.bb.eH;
        if (ab.m12b(this.q, this.r) < 0) {
            i2 -= 50;
        }
        if (!akVar.f51al) {
            i2 -= 10;
        }
        if (this.f1a.aD.F() > 0) {
            i2 -= 10;
        }
        int i3 = i2 >> 2;
        return i3 >= 0 && ((w) this.f1a.f45a).d.o(100) <= i3;
    }

    private static boolean b() {
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m2a(int i) {
        f fVar = this.f1a.f45a;
        if (fVar.f77e == this.f1a) {
            return false;
        }
        this.f0a.m21b(this.f1a).j(this.f1a.gk);
        boolean z = this.f1a.t ? this.f1a.aC.eF > 833867 : this.f1a.aC.eF < -833867;
        this.f1a.a(true, this.w);
        if (z) {
            return false;
        }
        if (this.f1a.t && this.w.eF < -3995) {
            return false;
        }
        if (!this.f1a.t && this.w.eF > 3995) {
            return false;
        }
        if (i <= 2000) {
            return true;
        }
        int iA = ((this.f1a.a((int[]) null, true) * 100) >> 16) - 20;
        return iA > 0 && ((w) fVar).d.o(100) < iA;
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m3b(int i) {
        int iE;
        if (this.f0a.f77e == this.f1a) {
            return false;
        }
        int iK = this.f0a.m21b(this.f1a).k(this.f1a.gk);
        int I = this.f1a.I();
        int iE2 = t.e(t.e(I, 7611), 6553600);
        ad adVar = this.f1a.f46a;
        if (iK != 0 || I > 139837) {
            return (iE2 >> 16) <= adVar.fi && (iE = t.e(t.e((t.e(t.e((adVar.fa - 50) << 16, 1337), 19661) + t.e(t.e((adVar.fi - 50) << 16, 1337), 39321)) + t.e(t.e((adVar.ff - 50) << 16, 1337), 6553), t.f(i - 2000, 22000)), t.e((5 - iK) << 16, 13107))) > 0 && iE >= ((w) this.f0a).d.o(65536);
        }
        return true;
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m4c(int i) {
        if (this.f0a.f77e == this.f1a) {
            return false;
        }
        if (i <= 2000) {
            return true;
        }
        if (this.f0a.m21b(this.f1a).v) {
            return false;
        }
        int i2 = 25;
        if (i < 15000) {
            i2 = 25 + 25;
        }
        if (i < 10000) {
            i2 += 25;
        }
        if (this.f1a.t == (this.f1a.aC.eF < 0)) {
            i2 -= 50;
        }
        return ((w) this.f0a).d.o(100) < i2;
    }

    private void a(ab abVar) {
        this.x.b(abVar, this.J);
        if (this.x.F() >= 6089) {
            a(abVar.eF, abVar.eH);
        }
    }

    private void e(int i, int i2) {
        if (this.f0a.f77e == this.f1a) {
            return;
        }
        if (i2 <= 1500) {
            c(10, i);
        } else if (this.f1a.a(true, this.y) > 1558871) {
            c(12, i);
        } else {
            c(10, i);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private ak m5a() {
        int iM;
        if (this.f0a.f77e == this.f1a) {
            return null;
        }
        f fVar = this.f1a.f45a;
        s sVarM21b = fVar.m21b(this.f1a);
        s sVarA = fVar.a(this.f1a);
        int i = 0;
        ak akVar = null;
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 != this.f1a.gk && (iM = sVarA.m(i2)) > i) {
                if (((w) this.f0a).d.o(65536) < t.e((5 - sVarM21b.l(i2)) << 16, 13107)) {
                    ak akVarA = sVarM21b.a(i2);
                    if (this.f1a.g(akVarA) && ((!this.f1a.t || akVarA.aC.eF > 0) && (this.f1a.t || akVarA.aC.eF < 0))) {
                        i = iM;
                        akVar = akVarA;
                    }
                }
            }
        }
        return akVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m6a() {
        if (this.f1a.f48a == 0) {
            aj ajVar = this.f0a.f112a;
            ajVar.a(this.f12h, this.f11g, this.A);
            if (!this.f1a.t) {
                this.A.eF = -this.A.eF;
            }
            this.z.b(this.A, this.f1a.aC);
            if (this.z.F() > ajVar.h(this.f12h, this.f11g)) {
                a(this.A.eF, this.A.eH);
            } else if (this.f1a != this.f1a.b.g) {
                this.f1a.b(this.f1a.b);
            }
        }
    }

    private boolean c(ak akVar) {
        if (akVar != this.f7b || akVar != this.f1a.b.g) {
            return false;
        }
        this.B.b(this.f1a.aC, akVar.aC);
        if (ab.m11a(akVar.b(), this.B) <= 0) {
            return akVar.a.f4c == 9 || this.B.F() > 97429 || akVar.a(true, this.C) <= 1370101;
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m7a(ak akVar) {
        s sVarM21b = this.f0a.m21b(this.f1a);
        for (int i = 0; i < 5; i++) {
            ak akVarA = sVarM21b.a(i);
            if (akVarA != this.f1a && akVarA != this.f0a.f77e && akVarA.a.f8c == akVar) {
                return;
            }
        }
        int i2 = 0;
        ak akVar2 = null;
        for (int i3 = 0; i3 < 5; i3++) {
            ak akVarA2 = sVarM21b.a(i3);
            if (akVarA2 != this.f1a && akVarA2 != this.f0a.f77e) {
                this.D.b(akVarA2.aC, akVar.aC);
                int iF = ab.m11a(this.D, akVar.b()) > 0 ? this.D.F() : this.D.F() << 1;
                if (akVar2 == null || iF < i2) {
                    i2 = iF;
                    akVar2 = akVarA2;
                }
            }
        }
        if (akVar2 != null) {
            akVar2.a.f8c = akVar;
        }
    }

    private void c(ak akVar, int i) {
        boolean z = false;
        this.E.b(akVar.aC, this.f1a.aC);
        if ((akVar == this.f1a.b.g || (akVar.gt & 32768) != 0) && this.E.F() <= 262144) {
            this.E.G();
            if (ab.m11a(this.E, akVar.b()) < -46341) {
                z = true;
            }
        }
        this.f1a.c(4096, i, z);
        if ((akVar.gt & 32768) == 0) {
            z = false;
        }
        this.f1a.c(32768, i, z);
    }

    private boolean c() {
        int i;
        if (this.f1a != this.f1a.b.g || this.f2a == 5 || (i = this.f1a.gn) == 0) {
            return false;
        }
        this.F.b(this.I, this.f1a.aC);
        int iM11a = ab.m11a(this.F, this.f1a.bd);
        if (t.e(iM11a, iM11a) < this.F.F()) {
            return false;
        }
        int iE = t.e(i, 9362);
        int iE2 = t.e(i, iE) + t.e(-229376, t.e(iE, iE));
        return t.e(iE2, iE2) >= this.F.F();
    }

    /* renamed from: a, reason: collision with other method in class */
    private ak m8a(ak akVar) {
        s sVarM21b = this.f0a.m21b(this.f1a);
        for (int i = 0; i < 5; i++) {
            ak akVarA = sVarM21b.a(i);
            if (akVarA != this.f1a && akVarA.a.f7b == akVar) {
                return akVarA;
            }
        }
        return null;
    }

    /* renamed from: b, reason: collision with other method in class */
    private void m9b() {
        s sVarM21b = this.f0a.m21b(this.f1a);
        s sVarA = this.f0a.a(this.f1a);
        if (this.f1a.y()) {
            int i = 0;
            while (i < 10) {
                ak akVarA = i < 5 ? sVarM21b.a(i) : sVarA.a(i - 5);
                if (d(akVarA)) {
                    this.G.b(this.J, akVarA.aC);
                    if (this.G.F() < 65536) {
                        this.G.b(this.J, this.f1a.aC);
                        this.G.G();
                        v.a(akVarA.aC, this.f1a.aC, this.G, this.H);
                        this.I.b(this.H, akVarA.aC);
                        this.G.R(t.r(this.I.F() + 65536));
                        this.I.b(this.H, this.G);
                        return;
                    }
                }
                i++;
            }
        }
        this.I.c(this.J);
    }

    private boolean d(ak akVar) {
        if (akVar == this.f1a || !akVar.y() || akVar.gn > 65536) {
            return false;
        }
        if (this.f2a == 1) {
            return (akVar == this.f7b || akVar == this.f8c) ? false : true;
        }
        if (this.f2a == 0) {
            return (this.f4c == 2 || this.f4c == 3) ? false : true;
        }
        return true;
    }

    static {
        int[] iArr = {0, 45945, -45945, 65536, -65536, 45945, -45945};
        int[] iArr2 = {0, -19195, -19195, -65536, -65536, -111877, -111877};
        new ab();
        new ab();
        new ab();
    }
}
