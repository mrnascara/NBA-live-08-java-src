package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:y.class */
public final class y {
    private ab ad = new ab();
    private ab ae = new ab();
    private ab af = new ab();
    private ab ag = new ab();
    private ab ah = new ab();
    private ab ai;
    private ab aj;
    private ab ak;
    private ab al;
    private ab h;
    private ab am;
    private ab an;
    private ab E;
    private ab ao;
    public int[] T;
    public ak[] a;
    private ab ap;
    private static final ab aq;
    private ab ar;
    private ab as;
    private ab at;
    private ab au;
    private ab av;
    private int en;

    /* renamed from: a, reason: collision with other field name */
    private ab[] f194a;
    private ab[] b;
    private ab[] c;
    private ab aw;
    private ab ax;
    private ab ay;
    private ab az;
    private ab aA;
    private ab aB;

    /* renamed from: a, reason: collision with other field name */
    public f f195a;
    public s d;
    public s e;
    public ak g;

    /* renamed from: h, reason: collision with other field name */
    public ak f196h;
    public ak i;
    public ak j;
    public ak k;
    public ak l;
    public ak m;
    public ab aC;
    public ab aD;

    /* renamed from: d, reason: collision with other field name */
    public ab[] f197d;

    /* renamed from: a, reason: collision with other field name */
    public int f198a;
    public int eo;
    public int ep;
    public int eq;
    public int er;
    public int es;
    public int et;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public y() {
        new ab();
        this.ai = new ab();
        this.aj = new ab();
        this.ak = new ab();
        this.al = new ab();
        this.h = new ab();
        this.am = new ab();
        this.an = new ab();
        this.E = new ab();
        this.ao = new ab();
        this.T = new int[10];
        this.a = new ak[10];
        this.ap = new ab();
        this.ar = new ab();
        this.as = new ab();
        new ab();
        new ab();
        new ab();
        this.at = new ab();
        this.au = new ab();
        this.av = new ab();
        this.f194a = new ab[6];
        this.b = new ab[6];
        this.c = new ab[6];
        this.aw = new ab();
        this.ax = new ab();
        this.ay = new ab();
        this.az = new ab();
        this.aA = new ab();
        this.aB = new ab();
        this.aC = new ab();
        this.aD = new ab();
        this.f197d = new ab[3];
    }

    public final void a(f fVar, s sVar, s sVar2) {
        this.f195a = fVar;
        this.d = sVar;
        this.e = sVar2;
        this.g = null;
        this.f196h = null;
        this.f198a = 2;
        this.K = true;
        this.L = true;
        this.i = null;
        this.j = null;
        this.l = null;
        this.k = null;
        this.m = null;
        this.M = false;
        this.es = 0;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = false;
        for (int i = 0; i < 6; i++) {
            this.f194a[i] = new ab();
            this.b[i] = new ab();
            this.c[i] = new ab();
        }
        this.f194a[0].h(0, 79901, 119852);
        this.b[0].h(0, 0, 0);
        this.c[0].h(-65536, 0, 0);
        this.f194a[1].h(0, 79901, 119852);
        this.b[1].h(3278, 0, 0);
        this.c[1].h(65536, 0, 0);
        this.f194a[2].h(3278, 0, 119852);
        this.b[2].h(1639, 39950, 0);
        this.c[2].h(0, 65536, 0);
        this.f194a[3].h(3278, 0, 119852);
        this.b[3].h(1639, -39951, 0);
        this.c[3].h(0, -65536, 0);
        this.f194a[4].h(3278, 79901, 0);
        this.b[4].h(1639, 0, -59926);
        this.c[4].h(0, 0, -65536);
        this.f194a[5].h(3278, 79901, 0);
        this.b[5].h(1639, 0, 59926);
        this.c[5].h(0, 0, 65536);
        aK();
    }

    public final void w(int i, int i2) throws IOException {
        int i3 = this.f198a;
        if (this.g != null) {
            this.g.a(this, this.aC, i, i2);
        } else {
            int i4 = 1310;
            int i5 = 20;
            int iAbs = 833867 - Math.abs(this.aC.eF);
            if ((iAbs * iAbs) + (this.aC.eH * this.aC.eH) > 389663) {
                i4 = 655;
                i5 = 10;
            }
            if (i2 > i4) {
                int i6 = i2 / i4;
                int i7 = i6 * i5;
                int i8 = (i7 << 16) / i6;
                int i9 = 0;
                int i10 = i - i7;
                while (i2 > i4) {
                    i9 += i8;
                    y(i10 + (i9 >> 16), i4);
                    i2 -= i4;
                }
                i = i10 + i7;
            }
            if (i2 > 0) {
                y(i, i2);
            }
            if (i3 == 0 && i3 != this.f198a) {
                this.f195a.e(false);
            }
            if (this.g != null) {
                this.g.a(this, this.aC, i, i2);
            }
        }
        if (this.f198a == 0) {
            aN();
        } else {
            aM();
        }
    }

    public final void a(ak akVar, boolean z, int i, int i2) throws IOException {
        if (this.l != null && this.l.r != akVar.r) {
            this.f195a.p();
            this.f195a.B = i;
        }
        this.m = null;
        this.g = akVar;
        this.f198a = -1;
        this.l = akVar;
        this.N = true;
        this.O = false;
        akVar.ad(i);
        this.g.a(this, this.aC, i, i2);
        this.M = z;
        this.er = i;
        if (z) {
            this.f195a.a(this, akVar, i);
        }
    }

    public final void h(ak akVar, int i) {
        if (this.g != akVar) {
            return;
        }
        this.g.ad(i);
        this.g = null;
        this.M = false;
        this.f196h = null;
        this.f198a = 2;
    }

    public final int E(int i) {
        return i - this.er;
    }

    private boolean s() {
        return this.f198a >= 2;
    }

    public final ab a() {
        return this.g == null ? this.aD : this.g.aD;
    }

    public final void aJ() {
        this.aD.aT();
    }

    public final ab a(int i) {
        return this.f197d[i];
    }

    private void aK() {
        this.R = false;
        for (int i = 0; i < 3; i++) {
            this.f197d[i] = new ab();
        }
    }

    public final void aL() {
        this.R = true;
        for (int i = 0; i < 3; i++) {
            this.f197d[i].c(this.aC);
        }
    }

    private void aM() {
        this.R = false;
    }

    private void aN() {
        if (this.R) {
            ab abVar = new ab(this.aC);
            ab abVar2 = new ab(this.aD);
            abVar2.R(5000);
            int iE = t.e(240844, t.e(5000, 5000));
            for (int i = 0; i < 3; i++) {
                abVar.e(abVar2);
                abVar2.eG += iE;
                this.f197d[i].c(abVar);
            }
        }
    }

    public final void a(boolean z, boolean z2, ak akVar, ak akVar2) {
        this.K = z;
        this.L = z2;
        this.i = akVar;
        this.j = akVar2;
    }

    public final boolean b(boolean z) {
        return z ? this.K || this.i != null : this.L || this.j != null;
    }

    public final void h(boolean z) {
        if (this.g != null) {
            h(this.g, 0);
        }
        this.f198a = 2;
        this.f196h = null;
        this.k = null;
        this.l = null;
        if (z) {
            this.aC.h(0, 32768, 0);
            this.aD.h(0, 425983, 0);
        } else {
            this.aC.h(0, 7990, 0);
            this.aD.aT();
        }
    }

    public final void c(ak akVar) {
        if (this.g != null) {
            h(this.g, 0);
        }
        this.f198a = 2;
        this.f196h = null;
        this.k = null;
        this.l = null;
        this.f195a.a(akVar, this.ad);
        b(this.ad);
        this.aC.eF = t.d(this.aC.eF, -938842, 938842);
        this.aC.eH = t.d(this.aC.eH, -499384, 499384);
        this.f195a.m();
        this.aD.h(0, 131072, 0);
    }

    public final void i(ak akVar, int i) throws IOException {
        if (this.g != null) {
            h(this.g, i);
        }
        akVar.c(57341, i, false);
        akVar.a(this, i, 0, true);
        this.f196h = null;
        this.k = null;
        this.l = null;
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        this.m = this.g;
        this.ae.eF = this.g.t ? 833867 : -833867;
        this.ae.eG = 199753;
        this.ae.eH = 0;
        if (i4 == 0) {
            int iF = t.f(14981, 12288);
            if (this.g.t) {
                i3 = -i3;
            } else {
                i2 = -i2;
            }
            int iE = t.e(iF, i2);
            this.ae.eF += t.e(iF, i3);
            this.ae.eH += iE;
        } else {
            int i9 = 65536 - i2;
            if (i9 <= 0) {
                i7 = 1;
                i8 = 0;
            } else if (i9 <= 13107) {
                i7 = 8192;
                i8 = 4352;
            } else if (i9 <= 32768) {
                i7 = 8192;
                i8 = 6656;
            } else if (i9 <= 52429) {
                i7 = 8192;
                i8 = 9216;
            } else {
                i7 = 8192;
                i8 = 14981;
            }
            int iO = ((w) this.f195a).d.o(i7) + i8;
            int iO2 = ((w) this.f195a).d.o(411775);
            int iE2 = t.e(t.s(iO2), iO);
            int iE3 = t.e(t.t(iO2), iO);
            this.ae.eF += iE2;
            this.ae.eH += iE3;
        }
        a(this.ae, i, i3, i4, i5, i6);
    }

    public final void x(int i, int i2) {
        ak akVar = this.g;
        this.eq = i;
        this.et = 5;
        h(akVar, i);
        this.f196h = akVar;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        int[] iArr = akVar.aj;
        iArr[4] = iArr[4] + 1;
        this.f195a.i();
        this.ae.eF = akVar.t ? 833867 : -833867;
        this.ae.eG = 199753;
        this.ae.eH = 0;
        this.aC.c(this.ae);
        this.aC.eG += 7990;
        this.aD.h(0, -262144, 0);
        this.f198a = 0;
    }

    public final void a(ak akVar, ab abVar, int i, int i2, int i3) {
        ak akVar2 = this.g;
        h(this.g, i2);
        a(true, true, (ak) null, (ak) null);
        this.f196h = akVar2;
        this.k = akVar2;
        this.m = akVar2;
        this.l = akVar2;
        this.eo = i2;
        this.ep = (i * 1000) >> 16;
        this.ag.c(abVar);
        this.ag.eG = 98304;
        this.af.b(this.ag, this.aC);
        int i4 = this.af.eG;
        this.af.eG = 0;
        int length = this.af.length();
        int iF = i;
        int i5 = 131072;
        if (length < 393216 && ((w) this.f195a).d.o(100) < 50) {
            i5 = 262144;
        }
        int i6 = length >= 655360 ? 655360 : 524288;
        if (akVar2.a.f2a == 3) {
            i5 = 262144;
        }
        if (iF <= 0) {
            iF = t.f(length, i6);
        }
        int iF2 = t.f(65536, iF);
        this.aD.eF = t.e(this.af.eF, iF2);
        this.aD.eG = t.f(t.e(481689, iF), i5) + t.e(i4, iF2);
        this.aD.eH = t.e(this.af.eH, iF2);
        this.f198a = 1;
        if (length >= 655360) {
            s sVarA = this.f195a.a(akVar);
            for (int i7 = 0; i7 < 5; i7++) {
                ak akVarA = sVarA.a(i7);
                if (akVarA.a.a(akVar)) {
                    if (((w) this.f195a).d.o(262144) < t.e((akVarA.f46a.fg - 50) << 16, 1337)) {
                        akVarA.a.d(7, i2);
                        return;
                    }
                }
            }
        }
    }

    public final boolean a(ak akVar, ak akVar2, int i, int i2) throws IOException {
        if (this.g == null) {
            return false;
        }
        switch (akVar.f48a) {
            case 5:
            case 7:
            case 17:
            case 18:
                break;
            default:
                if (akVar2.r != akVar.r) {
                    if (akVar2.r) {
                        if (!this.K) {
                        }
                    } else if (!this.L) {
                    }
                    boolean z = false;
                    if (akVar2.a(this.aC)) {
                        if (akVar2.f46a.eZ < 95 && ((w) this.f195a).d.o(6554) > t.f(akVar2.f46a.eZ, 950)) {
                            z = true;
                        }
                        if (!z) {
                            int i3 = 200;
                            if (akVar2.r != this.f195a.f77e.r) {
                                switch (this.f195a.H) {
                                    case 0:
                                        i3 = 400;
                                        break;
                                    case 1:
                                        i3 = 200 + 100;
                                        break;
                                }
                            }
                            if (((w) this.f195a).d.o(i3) >= akVar2.f46a.eZ || ((w) this.f195a).d.o(200) < this.g.f46a.fa) {
                            }
                        } else if (((w) this.f195a).d.o(200) < akVar2.f46a.fg) {
                        }
                        ak akVar3 = this.g;
                        if (!z) {
                            if (((w) this.f195a).d.o(100) >= 40) {
                                this.ah.b(this.aC, akVar2.aC);
                                this.ah.G();
                                this.ah.R(131072);
                                this.ah.eG = 32768;
                                a(this.g, akVar2, this.ah, i, i2);
                                a(this.ah, this.aC, i);
                                akVar.ae(i);
                                break;
                            } else {
                                h(akVar, i);
                                akVar2.a(this, i, i2, false);
                                int[] iArr = akVar2.aj;
                                iArr[14] = iArr[14] + 1;
                                int[] iArr2 = akVar3.aj;
                                iArr2[15] = iArr2[15] + 1;
                                this.f195a.f(4, i);
                                break;
                            }
                        } else {
                            this.f195a.a(10, akVar2, akVar, i);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public final void a(ak akVar, ak akVar2, ab abVar, int i, int i2) {
        if (akVar == this.g || (akVar == this.m && this.g == null)) {
            this.m = akVar;
            this.l = akVar2;
            this.f196h = null;
            if (akVar != null) {
                h(akVar, i);
            }
            this.f198a = 3;
            this.es = i;
            this.aD.c(abVar);
        }
    }

    public final void b(ak akVar, ak akVar2, ab abVar, int i, int i2) {
        h(akVar, i);
        this.f198a = 2;
        this.N = true;
        this.O = false;
        this.l = akVar2;
        this.aD.c(abVar);
        this.f196h = null;
        a(this.aD, this.aC, i);
        this.f195a.f(3, i);
        this.f195a.g(1);
    }

    public final void b(ab abVar) {
        this.aC.c(abVar);
    }

    public final void f(int i, int i2, int i3) {
        this.aC.h(i, i2, i3);
    }

    public final void P(int i) {
        a(this.aD, this.aC, i);
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.g = this.f195a.a(dataInputStream);
        this.f196h = this.f195a.a(dataInputStream);
        this.i = this.f195a.a(dataInputStream);
        this.j = this.f195a.a(dataInputStream);
        this.l = this.f195a.a(dataInputStream);
        this.aC.a(dataInputStream);
        this.aD.a(dataInputStream);
        this.f198a = dataInputStream.readInt();
        this.eo = dataInputStream.readInt();
        this.eq = dataInputStream.readInt();
        this.ep = dataInputStream.readInt();
        this.er = dataInputStream.readInt();
        this.es = dataInputStream.readInt();
        this.et = dataInputStream.readInt();
        this.K = dataInputStream.readBoolean();
        this.L = dataInputStream.readBoolean();
        this.M = dataInputStream.readBoolean();
        this.N = dataInputStream.readBoolean();
        this.O = dataInputStream.readBoolean();
        this.P = dataInputStream.readBoolean();
        this.Q = dataInputStream.readBoolean();
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(-290844108);
        dataOutputStream.writeInt(9);
        f.a(this.g, dataOutputStream);
        f.a(this.f196h, dataOutputStream);
        f.a(this.i, dataOutputStream);
        f.a(this.j, dataOutputStream);
        f.a(this.l, dataOutputStream);
        this.aC.a(dataOutputStream);
        this.aD.a(dataOutputStream);
        dataOutputStream.writeInt(this.f198a);
        dataOutputStream.writeInt(this.eo);
        dataOutputStream.writeInt(this.ep);
        dataOutputStream.writeInt(this.eq);
        dataOutputStream.writeInt(this.er);
        dataOutputStream.writeInt(this.es);
        dataOutputStream.writeInt(this.et);
        dataOutputStream.writeBoolean(this.K);
        dataOutputStream.writeBoolean(this.L);
        dataOutputStream.writeBoolean(this.M);
        dataOutputStream.writeBoolean(this.N);
        dataOutputStream.writeBoolean(this.O);
        dataOutputStream.writeBoolean(this.P);
        dataOutputStream.writeBoolean(this.Q);
    }

    private void a(ab abVar, int i, int i2, int i3, int i4, int i5) {
        int iF;
        ak akVar = this.g;
        this.eq = i4;
        this.et = i3;
        h(akVar, i4);
        this.f196h = akVar;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.l = akVar;
        int[] iArr = akVar.aj;
        if (i3 == 2) {
            iArr[6] = iArr[6] + 1;
        } else if (i3 == 1 || i3 == 5 || i3 == 6) {
            iArr[4] = iArr[4] + 1;
        } else {
            iArr[8] = iArr[8] + 1;
        }
        this.f195a.i();
        this.ai.b(abVar, this.aC);
        int iMax = Math.max(this.ai.length(), 196608);
        if (i == 0) {
            int iF2 = F(t.r(t.e(this.ai.eF, this.ai.eF) + t.e(this.ai.eH, this.ai.eH)));
            iF = t.e(t.r(t.e(iF2 - this.aC.eG, 963378)), 8916) + t.r(t.e(-(abVar.eG - iF2), 4458));
        } else {
            iF = t.f(iMax, i);
        }
        int iE = t.e(iF, iF);
        int iF3 = t.f(65536, iF);
        boolean z = false;
        if (i3 == 1) {
            if (((w) this.f195a).d.o(4) == 0) {
                z = true;
            }
        } else if (i3 == 6 && ((w) this.f195a).d.o(4) != 0) {
            z = true;
        }
        if (z) {
            int iF4 = 17084 + t.f(17084, 32768);
            if (abVar.eF > 0) {
                this.ai.eF += iF4;
            } else {
                this.ai.eF -= iF4;
            }
        }
        this.aD.eF = t.e(this.ai.eF, iF3);
        this.aD.eG = t.e(this.ai.eG + t.e(240844, iE), iF3);
        this.aD.eH = t.e(this.ai.eH, iF3);
        this.f198a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y(int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.y(int, int):void");
    }

    private void a(ab abVar, ab abVar2, int i) {
        int i2 = 0;
        int iR = t.r(t.e(abVar.eG, abVar.eG) + t.e(481689, t.e(131072, abVar2.eG)));
        int iE = t.e((-abVar.eG) + iR, -8916);
        int iE2 = t.e((-abVar.eG) - iR, -8916);
        int i3 = iE > iE2 ? iE : iE2;
        this.ao.eF = abVar2.eF + t.e(i3, abVar.eF);
        this.ao.eH = abVar2.eH + t.e(i3, abVar.eH);
        this.ao.eG = 0;
        int i4 = 0;
        while (i4 < 10) {
            ak akVarA = i4 < 5 ? this.d.a(i4) : this.e.a(i4 - 5);
            this.E.b(akVarA.aC, this.ao);
            this.T[i4] = this.E.F();
            this.a[i4] = akVarA;
            i4++;
        }
        for (int i5 = 0; i5 < 9; i5++) {
            for (int i6 = i5 + 1; i6 < 10; i6++) {
                if (this.T[i5] > this.T[i6]) {
                    int i7 = this.T[i5];
                    ak akVar = this.a[i5];
                    this.T[i5] = this.T[i6];
                    this.a[i5] = this.a[i6];
                    this.T[i6] = i7;
                    this.a[i6] = akVar;
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 10 && i8 < 4; i9++) {
            ak akVar2 = this.a[i9];
            if (akVar2.a.f2a == 1) {
                i2 = akVar2.f46a.fc;
            } else if (akVar2.a.f2a == 0) {
                i2 = akVar2.f46a.fd;
            }
            if (((w) this.f195a).d.o(100) < i2) {
                akVar2.a.b(this.ao, i);
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03cc, code lost:
    
        b(r7, r5.av, 32768);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03db, code lost:
    
        if (r5.N != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03de, code lost:
    
        r5.f198a = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03e3, code lost:
    
        r5.P = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03e9, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(defpackage.ab r6, defpackage.ab r7, boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.a(ab, ab, boolean, int):boolean");
    }

    private void b(ab abVar, ab abVar2, int i) {
        int iF = t.f(t.e(-(65536 + i), ab.m11a(abVar, abVar2)), abVar2.F());
        this.aA.c(abVar2);
        this.aA.R(iF);
        abVar.d(this.aA);
    }

    private boolean t() {
        if (this.aD.eF <= 0 && this.aC.eF < -938842) {
            return true;
        }
        if (this.aD.eF >= 0 && this.aC.eF > 938842) {
            return true;
        }
        if (this.aD.eH > 0 || this.aC.eH >= -499384) {
            return this.aD.eH >= 0 && this.aC.eH > 499384;
        }
        return true;
    }

    private void c(ak akVar, ab abVar, int i) throws IOException {
        if (this.f198a == 0 || this.f198a == 4) {
            if (this.f195a.m24g() && this.aD.eG < 0 && this.aC.eG >= 191763) {
                this.f195a.a(8, akVar, this.l, i);
            } else if (!this.f195a.m23f()) {
                int[] iArr = akVar.aj;
                iArr[16] = iArr[16] + 1;
                this.f195a.f(3, i);
                this.f195a.g(1);
            }
            this.f196h = null;
            this.f198a = 2;
            this.N = true;
            this.O = false;
            int iM11a = ab.m11a(abVar, this.aD);
            this.aB.c(abVar);
            this.aB.R(-(iM11a << 1));
            this.aD.d(this.aB);
            this.aD.R(16384);
            this.aD.eG = 0;
            this.l = akVar;
            a(this.aD, this.aC, i);
        }
    }

    private static int F(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i < 99877) {
            i2 = 259679;
            i3 = 259679;
            i4 = 0;
            i5 = 99877;
        } else if (i < 199754) {
            i3 = 259679;
            i2 = 319628;
            i4 = 99877;
            i5 = 199754;
        } else if (i < 296681) {
            i2 = 399506 - 19977;
            i3 = 319628;
            i4 = 199754;
            i5 = 296681;
        } else if (i < 499384) {
            i2 = 465042 - 39954;
            i3 = 379529;
            i4 = 296681;
            i5 = 499384;
        } else {
            i2 = 519351;
            i3 = 425088;
            i4 = 499384;
            i5 = 1772709;
        }
        int iF = t.f(i - i4, i5 - i4);
        return t.e(i2, iF) + t.e(i3, 65536 - iF);
    }

    static {
        new ab(0, 65536, 0);
        new ab(0, 65536, 0);
        aq = new ab(0, 65536, 0);
    }
}
