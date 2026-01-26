package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ak.class */
public final class ak {
    private ab aE = new ab();
    private ab aF = new ab();
    private ab aG = new ab();
    private ab aH = new ab();
    private ab aI = new ab();
    private ab aJ = new ab();
    private ab aK = new ab();
    private ab x = new ab();
    private ab aL = new ab();
    private ab aM = new ab();
    private ab aN = new ab();
    private int[] ah = new int[1];
    private ab aO = new ab();
    private ab aP = new ab();
    private ab E = new ab();
    private ab aQ = new ab();
    private ab aR = new ab();
    private ab aS = new ab();
    private ab aT = new ab();
    private ab aU = new ab();
    private ab aV;
    private static final ab aW = new ab(256, 0, 256);
    private ab aX;
    private ab al;
    private ab aY;
    private ab aZ;
    public int[] ai;
    private ab ba;
    public a a;

    /* renamed from: a, reason: collision with other field name */
    public f f45a;
    public int[] aj;

    /* renamed from: a, reason: collision with other field name */
    public ad f46a;
    public y b;
    public boolean t;
    public boolean r;
    public ak n;
    public int gk;
    public int gl;
    public ab aC;
    public int gm;
    public ab bb;
    public ab bc;
    public ab aD;
    public int gn;
    public int go;
    public int gp;

    /* renamed from: ai, reason: collision with other field name */
    public boolean f47ai;

    /* renamed from: a, reason: collision with other field name */
    public int f48a;

    /* renamed from: b, reason: collision with other field name */
    public int f49b;
    public int gq;
    public int gr;
    public int gs;

    /* renamed from: aj, reason: collision with other field name */
    public boolean f50aj;
    public ak o;
    public ak p;
    public ab I;
    public ab bd;
    public int gt;
    public ab be;
    public ab bf;
    public int gu;
    public int gv;
    public int gw;
    public boolean ak;

    /* renamed from: al, reason: collision with other field name */
    public boolean f51al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public int gx;
    public ab bg;
    public int gy;
    public boolean ap;
    public boolean aq;
    public ab bh;
    public boolean ar;
    public int gz;

    public ak() {
        new ab();
        this.aV = new ab();
        this.aX = new ab();
        this.al = new ab();
        this.aY = new ab();
        this.aZ = new ab();
        this.ai = new int[3];
        this.ba = new ab();
        this.a = new a();
        this.f46a = null;
        this.b = null;
        this.aC = new ab();
        this.bb = new ab();
        this.bc = new ab();
        this.aD = new ab();
        this.I = new ab();
        this.bd = new ab();
        this.be = new ab();
        this.bf = new ab();
        this.bg = new ab();
        this.bh = new ab();
    }

    public final void a(f fVar, y yVar) throws IOException {
        this.f46a = null;
        this.f45a = fVar;
        this.b = yVar;
        this.gl = -1;
        this.f48a = -1;
        this.gn = 0;
        this.gp = 0;
        this.gz = -250;
        this.gt = 0;
        this.f50aj = false;
        this.o = null;
        this.n = null;
        this.p = null;
        this.go = 0;
        this.bb.h(65536, 0, 0);
        this.bc.c(this.bb);
        this.f51al = true;
        this.am = false;
        this.gx = 0;
        this.bg.h(0, 0, 0);
        this.an = true;
        this.ao = true;
        this.ap = false;
        this.aq = false;
        this.bh.h(0, 0, 0);
        this.gq = -1;
        this.gs = 0;
        this.a.a(fVar, this);
    }

    public final void a(int i, ad adVar, int[] iArr, boolean z) {
        this.f46a = adVar;
        this.aj = iArr;
        this.r = z;
        this.gk = i;
    }

    private void F(int i, int i2) {
        int iE = t.e((i2 - this.gw) << 16, 66);
        int iE2 = t.e(iE, iE);
        int iE3 = i + t.e(-481689, iE);
        int iE4 = t.e(i, iE) + t.e(-240845, iE2);
        if (7 != this.f48a && iE3 < 0 && iE4 < 5000 && this.b.g == this) {
            this.f50aj = true;
            this.f45a.D();
            if (iE4 < 0) {
                iE4 = 0;
            }
        } else if (iE4 < 0) {
            iE4 = 0;
            if (5 == this.f48a || i2 - this.f49b >= this.f45a.b(this.gq)) {
                b(0, i2);
            }
        }
        this.gm = iE4;
        this.f45a.u(iE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ak r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.b(ak, int, int, int):void");
    }

    private void e(int i, int i2, int i3, int i4) {
        int iE;
        int iD = this.aC.get(i);
        int i5 = this.I.get(i);
        int i6 = this.bd.get(i);
        boolean z = false;
        if (iD != i5) {
            iE = t.e(i6, this.gn);
            int iE2 = t.e(i6, i3);
            int i7 = iE2;
            if (iE2 == 0) {
                i7 = i6 > 0 ? 1 : -1;
            }
            iD += i7;
            if (i4 < 256) {
                if (i6 > 0) {
                    if (iD > i5) {
                        i5 = iD;
                        i6 = 0;
                        z = true;
                    }
                } else if (iD < i5) {
                    i5 = iD;
                    i6 = 0;
                    z = true;
                }
            }
            if (this.a.f2a != 5) {
                iD = t.d(iD, -i2, i2);
            }
        } else {
            iE = 0;
        }
        this.aC.C(i, iD);
        this.I.C(i, i5);
        this.bd.C(i, i6);
        this.aD.C(i, iE);
        if (z) {
            this.bd.G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r6, int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak.c(int, int, boolean):void");
    }

    public final boolean v() {
        return Math.abs(this.aG.eF) <= 196608 && a(true, this.aG) <= 1048576;
    }

    public final void d(int i, int i2, boolean z) {
        this.aH.h(i, 0, i2);
        f(this.aH);
    }

    private void c(ab abVar, ab abVar2) {
        if (this.an) {
            O();
        }
        this.aJ.eF = -this.bg.eH;
        this.aJ.eG = 0;
        this.aJ.eH = this.bg.eF;
        this.aI.b(abVar, this.aC);
        if (ab.m11a(this.bg, this.aI) <= 46341) {
            abVar2.c(abVar);
            return;
        }
        if (ab.m11a(this.aJ, this.aI) > 0) {
            abVar2.eF = t.e(this.aJ.eF, 46341) + t.e(this.aI.eF, 46341);
            abVar2.eH = t.e(this.aJ.eH, 46341) + t.e(this.aI.eH, 46341);
            abVar2.eG = 0;
        } else {
            abVar2.eF = t.e(-this.aJ.eF, 46341) + t.e(this.aI.eF, 46341);
            abVar2.eH = t.e(-this.aJ.eH, 46341) + t.e(this.aI.eH, 46341);
            abVar2.eG = 0;
        }
        abVar2.d(this.aC);
    }

    private void ac(int i) throws IOException {
        s sVarA = this.f45a.a(this);
        for (int i2 = 0; i2 < 5; i2++) {
            ak akVarA = sVarA.a(i2);
            if (akVarA.f48a == 8) {
                this.aK.b(this.aC, akVarA.aC);
                if (this.aK.F() <= 97429) {
                    if (((w) this.f45a).d.o(65536) < t.e(65536 - t.e((akVarA.f46a.fg - 50) << 16, 1337), 9830) + 3276) {
                        this.f45a.a(13, akVarA, this, i);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void f(ab abVar) {
        switch (this.f48a) {
            case 5:
            case 7:
            case 8:
            case 12:
            case 13:
            case 18:
            case 19:
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                this.I.h(abVar.eF, 0, abVar.eH);
                if (this.f48a == 3) {
                    c(abVar, this.aL);
                    this.I.h(this.aL.eF, 0, this.aL.eH);
                } else {
                    this.I.h(abVar.eF, 0, abVar.eH);
                }
                this.x.b(this.I, this.aC);
                if (this.x.eF > 0) {
                    this.x.eF = Math.max(this.x.eF, 1024);
                } else if (this.x.eF < 0) {
                    this.x.eF = Math.min(this.x.eF, -1024);
                }
                if (this.x.eH > 0) {
                    this.x.eH = Math.max(this.x.eH, 1024);
                } else if (this.x.eH < 0) {
                    this.x.eH = Math.min(this.x.eH, -1024);
                }
                this.x.eF <<= 2;
                this.x.eH <<= 2;
                this.bd.c(this.x);
                this.bd.G();
                break;
        }
    }

    public final void G(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void a(y yVar, int i, int i2, boolean z) throws IOException {
        boolean zA = true;
        if (z) {
            zA = false;
        } else {
            if (this != this.f45a.f77e) {
                zA = this.a.a();
            }
            if (zA) {
                if (yVar.f198a == 4) {
                    if (this.f45a.u > 0) {
                        if (yVar.m == null || yVar.m.r != this.r) {
                            int[] iArr = this.aj;
                            iArr[11] = iArr[11] + 1;
                        } else {
                            int[] iArr2 = this.aj;
                            iArr2[10] = iArr2[10] + 1;
                        }
                    }
                } else if (yVar.f198a == 3 && yVar.m != null && yVar.m.r != this.r) {
                    int[] iArr3 = this.aj;
                    iArr3[14] = iArr3[14] + 1;
                    int[] iArr4 = yVar.m.aj;
                    iArr4[15] = iArr4[15] + 1;
                    this.f45a.f(4, i);
                }
            }
        }
        this.f45a.B();
        this.f50aj = false;
        this.o = null;
        yVar.a(this, zA, i, i2);
    }

    public final void H(int i, int i2) {
        this.aC.h(i, 0, i2);
        this.an = true;
        this.ao = true;
    }

    private void b(ab abVar) {
        H(abVar.eF, abVar.eH);
    }

    public final ab b() {
        if (this.an) {
            O();
        }
        return this.bg;
    }

    public final int I() {
        return this.an ? O() : this.gx;
    }

    public final int J() {
        if (this.ao) {
            this.aM.c(b());
            this.aN.eF = -this.aM.eF;
            this.aN.eG = -this.aM.eH;
            this.gy = v.a(this.aN, this.t);
            this.ao = false;
        }
        return this.gy;
    }

    public final void j(boolean z) {
        this.gm = 0;
        this.t = z;
        b(0, 0);
        b(0, 0);
    }

    public final boolean w() {
        if (this.aC.eF >= 0) {
            if (!this.t) {
                return true;
            }
        } else if (this.t) {
            return true;
        }
        int iAbs = Math.abs(this.aC.eF);
        if (iAbs >= 655192) {
            return Math.abs(this.aC.eH) >= 439458;
        }
        if (iAbs < 359452 || Math.abs(this.aC.eH) >= 439458) {
            return true;
        }
        return ((int) t.m54a(this.aC.eF - (this.aC.eF >= 0 ? 833867 : -833867), this.aC.eH)) >= 3434289;
    }

    public final boolean x() {
        if (this.t != (this.aC.eF > 0)) {
            return false;
        }
        int iAbs = 833867 - Math.abs(this.aC.eF);
        return t.e(iAbs, iAbs) + t.e(this.aC.eH, this.aC.eH) <= 298378;
    }

    public final boolean a(ab abVar, int i, int i2) {
        if (i2 - this.gz < 250) {
            return false;
        }
        int iE = this.f48a == 8 ? t.e(163840, this.f46a.fp) : t.e(131072, this.f46a.fp);
        int iM54a = (int) t.m54a(abVar.eF - this.aC.eF, abVar.eH - this.aC.eH);
        int i3 = i + this.f46a.fn;
        return iM54a <= t.e(i3, i3) && this.gm - i <= abVar.eG && (this.gm + iE) + i >= abVar.eG;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final int m19b(ab abVar) {
        return (int) t.a(abVar.eF - this.aC.eF, abVar.eG - this.aC.eG, abVar.eH - this.aC.eH);
    }

    public final int a(boolean z, ab abVar) {
        int i;
        if (this.t) {
            i = z ? 833867 : -833867;
        } else {
            i = !z ? 833867 : -833867;
        }
        int i2 = i - this.aC.eF;
        int i3 = -this.aC.eH;
        if (abVar != null) {
            abVar.eF = i2;
            abVar.eG = 0;
            abVar.eH = i3;
        }
        return t.e(i2, i2) + t.e(i3, i3);
    }

    public final void ad(int i) {
        this.f51al = true;
        this.am = false;
        if (this.f48a == 0 || this.f48a == 2) {
            b(this.f48a, i);
            return;
        }
        if (this.f48a == 1 || this.f48a == 11) {
            b(0, i);
        } else if (this.f48a == 4) {
            b(2, i);
        } else if (this.f48a == 3) {
            b(2, i);
        }
    }

    public final void a(y yVar, ab abVar, int i, int i2) throws IOException {
        if (this == this.f45a.f77e && (!this.t ? this.aC.eF <= -359452 : this.aC.eF >= 359452)) {
            this.f45a.v(2);
        }
        if (this.p != null) {
            ak akVar = this.p;
            this.p = null;
            if (yVar.a(this, akVar, i, i2)) {
                this.f50aj = false;
                this.o = null;
                return;
            }
        }
        this.f45a.b(this, abVar, i);
        if (!this.f50aj) {
            if (this.o != null) {
                a(yVar, i, i2);
                this.gz = i;
                return;
            }
            if (this.aq) {
                this.aq = false;
                this.gz = i;
                yVar.a(this, this, this.bh, i, i2);
                yVar.P(i);
                return;
            }
            if (yVar.M) {
                return;
            }
            if (this.a.f2a == 5) {
                if ((this.gt & 32) != 0) {
                    yVar.er = i;
                    return;
                }
                return;
            } else {
                if (this.f48a == 12) {
                    yVar.er = i;
                    return;
                }
                return;
            }
        }
        this.f50aj = false;
        if (this.f48a == 5 || this.f48a == 18) {
            yVar.a(0, a(this.ah, false), this.ah[0], this.ar ? 2 : 1, i, i2);
            this.gz = i;
            ac(i);
            return;
        }
        if (this.f48a == 7) {
            boolean z = false;
            int iK = K();
            if (this.b.g == this) {
                s sVarA = this.f45a.a(this);
                int i3 = 0;
                while (true) {
                    if (i3 >= 5) {
                        break;
                    }
                    ak akVarA = sVarA.a(i3);
                    if (akVarA.f48a == 8 && akVarA.a(this.b, i)) {
                        this.aO.c(akVarA.bb);
                        this.aO.R(196608);
                        int[] iArr = akVarA.aj;
                        iArr[16] = iArr[16] + 1;
                        this.b.b(this, akVarA, this.aO, i, i2);
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (this.gq == 20) {
                    yVar.a(262144, iK, 65536, 6, i, i2);
                } else {
                    yVar.x(i, i2);
                }
            }
            this.gz = i;
        }
    }

    public final void k(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.aC.eF >= 0;
        } else {
            z2 = this.t;
        }
        this.bc.h((z2 ? 833867 : -833867) - this.aC.eF, 0, -this.aC.eH);
    }

    public final void b(y yVar) {
        this.bc.b(yVar.aC, this.aC);
    }

    public final void d(ak akVar) {
        this.bc.b(akVar.aC, this.aC);
    }

    public final void g(ab abVar) {
        this.bc.b(abVar, this.aC);
        h(this.bc);
    }

    public final boolean a(ab abVar) {
        this.aP.b(abVar, this.aC);
        this.aP.eG = 0;
        if (this.aP.F() > this.f46a.fm) {
            return false;
        }
        this.aP.G();
        return ab.m11a(this.aP, this.bb) >= 32768;
    }

    public final boolean g(ak akVar) {
        this.E.b(akVar.aC, this.aC);
        if (ab.m11a(this.E, this.bb) > 0) {
            return true;
        }
        int iE = 59930 + t.e(539372, (this.f46a.ff - 50) * 1310);
        return this.E.F() <= t.e(iE, iE);
    }

    public final boolean a(ak akVar, int i) throws IOException {
        int iM = akVar.M() + M();
        int iE = t.e(iM, iM);
        if (!akVar.y()) {
            return false;
        }
        this.E.b(akVar.aC, this.aC);
        this.E.eG = 0;
        int iF = this.E.F();
        if (iF > iE || iF <= 0) {
            return false;
        }
        int iM11a = ab.m11a(this.bd, this.E);
        int iM11a2 = ab.m11a(akVar.bd, this.E);
        int iM11a3 = ab.m11a(akVar.bd, this.bd);
        int iR = t.r(iF);
        if (iR <= 0) {
            return false;
        }
        this.E.R(t.f(65536, iR));
        this.E.R((iM - iR) >> 1);
        if (akVar.y()) {
            this.aQ.a(akVar.aC, this.E);
            if (!y()) {
                this.aQ.d(this.E);
            }
            akVar.b(this.aQ);
        }
        if (y()) {
            this.aQ.b(this.aC, this.E);
            if (!akVar.y()) {
                this.aQ.e(this.E);
            }
            b(this.aQ);
        }
        if (akVar.r == this.r) {
            return true;
        }
        ak akVar2 = this.b.g;
        boolean z = false;
        if (iM11a3 >= -56756) {
            if (iM11a >= 32768) {
                if (akVar.f48a == 11) {
                    b(10, i);
                } else {
                    this.gn = t.e(this.gn, 49152);
                }
            }
            if (iM11a2 > -32768) {
                return true;
            }
            if (this.f48a == 11) {
                akVar.b(10, i);
                return true;
            }
            akVar.gn = t.e(akVar.gn, 49152);
            return true;
        }
        int iO = ((w) this.f45a).d.o(1000);
        if (this.gx > 219744) {
            iO += 250;
        }
        if (akVar == akVar2 && akVar.f48a == 2 && akVar.gn == akVar.f46a.fq && iO < 500) {
            if (this.gn < 65536 && this.f48a <= 4) {
                z = true;
            }
            akVar.gn = t.e(akVar.gn, 49152);
            if (!this.b.M) {
                return true;
            }
            if (z) {
                this.f45a.a(12, akVar, this, i);
                return true;
            }
            this.f45a.a(11, this, akVar, i);
            return true;
        }
        if (this != akVar2 || this.f48a != 2 || this.gn != this.f46a.fq || iO >= 500) {
            akVar.gn = t.e(akVar.gn, 49152);
            this.gn = t.e(this.gn, 49152);
            return true;
        }
        if (akVar.gn < 65536 && akVar.f48a <= 4) {
            z = true;
        }
        this.gn = t.e(this.gn, 49152);
        if (!this.b.M) {
            return true;
        }
        if (z) {
            this.f45a.a(12, this, akVar, i);
            return true;
        }
        this.f45a.a(11, akVar, this, i);
        return true;
    }

    public final boolean y() {
        if (this.f48a == 5 || this.f48a == 7 || this.f48a == 18 || this.f48a == 19) {
            return false;
        }
        return ((this == this.b.g && !this.f51al) || this.a.f2a == 5 || this.a.f2a == 2 || this.a.f2a == 3) ? false : true;
    }

    public final boolean a(y yVar, int i) {
        if (i - this.gz < 250) {
            return false;
        }
        if (yVar.g != null) {
            int iM = M() + 7990;
            this.aT.b(yVar.aC, this.aC);
            this.aT.eG = 0;
            if (this.aT.F() > t.e(iM, iM) || this.gm + t.e(163840, this.f46a.fp) < 191763) {
                return false;
            }
            this.gz = i + 750;
            int i2 = 400;
            if (this.r != this.f45a.f77e.r) {
                switch (this.f45a.H) {
                    case 0:
                        i2 = 700;
                        break;
                    case 1:
                        i2 = 550;
                        break;
                }
            }
            return ((w) this.f45a).d.o(i2) < this.f46a.eY;
        }
        this.aR.c(this.bb);
        this.aR.R(26214);
        this.aR.d(this.aC);
        this.aS.b(yVar.aC, this.aR);
        int iM11a = ab.m11a(this.bb, this.aS);
        if (Math.abs(iM11a) > 7990) {
            return false;
        }
        this.aS.c(this.bb);
        this.aS.R(-iM11a);
        this.aS.d(yVar.aC);
        this.aR.eG = this.gm;
        this.aS.e(this.aR);
        if (this.aS.eG < -7990 || this.aS.eG > t.e(this.f46a.fp, 163840) + 7990) {
            return false;
        }
        int i3 = this.aS.eG;
        this.aS.eG = 0;
        int i4 = 7990 + this.f46a.fn;
        if (this.aS.F() > t.e(i4, i4)) {
            return false;
        }
        this.aS.eG = i3;
        this.gz = i;
        int i5 = 200;
        if (this.r != this.f45a.f77e.r) {
            switch (this.f45a.H) {
                case 0:
                    i5 = 400;
                    break;
                case 1:
                    i5 = 200 + 100;
                    break;
            }
        }
        return ((w) this.f45a).d.o(i5) < this.f46a.eY;
    }

    public final boolean a(ab abVar, ab abVar2, ak akVar, int i) {
        if (!a(abVar, 7990, i)) {
            return false;
        }
        this.gz = i;
        this.aU.b(abVar, akVar.aC);
        boolean z = this.aU.F() >= 2435735;
        if (ab.m11a(abVar2, this.bb) >= 0 && !z) {
            return false;
        }
        int iE = t.e(((this.f46a.eZ - 50) + (this.f46a.fg - 50)) << 16, 668);
        if (z) {
            iE = t.e(iE, 98304);
        }
        if (((w) this.f45a).d.o(98304) >= iE) {
            return false;
        }
        int iE2 = t.e((akVar.f46a.fb - 50) << 16, 1337);
        if (z) {
            iE2 = t.e(iE2, 49152);
        }
        return ((w) this.f45a).d.o(65536) >= iE2;
    }

    public final boolean a(ab abVar, ab abVar2, ak akVar, y yVar, int i) {
        this.aU.b(akVar.aC, this.aC);
        if (this.aU.F() > 589824) {
            return false;
        }
        this.aU.b(abVar, this.aC);
        if (((w) this.f45a).d.o(2) == 0) {
            this.aU.eF += this.bb.eH;
            this.aU.eH -= this.bb.eF;
        } else {
            this.aU.eF -= this.bb.eH;
            this.aU.eH += this.bb.eF;
        }
        this.aU.G();
        this.aU.R(t.e(abVar2.length(), 32768));
        yVar.a(yVar.m, this, this.aU, i, 0);
        return true;
    }

    private static int K() {
        return 65536;
    }

    public final int L() {
        int iE;
        int iR = t.r(a(true, (ab) null));
        int iE2 = 45875 + t.e(19660, t.e((this.f46a.eW - 50) << 16, 1337));
        int iE3 = 19660 + t.e(39321, t.e((this.f46a.eV - 50) << 16, 1337));
        int iE4 = 13107 + t.e(32768, t.e((this.f46a.eU - 50) << 16, 1337));
        if (iR <= 139837) {
            iE = iE2;
        } else if (iR <= 319628) {
            int iE5 = t.e(319628 - iR, 23889);
            iE = t.e(iE2, iE5) + t.e(iE3, 65536 - iE5);
        } else if (iR <= 439458) {
            int iE6 = t.e(439458 - iR, 35842);
            iE = t.e(iE3, iE6) + t.e(iE4, 65536 - iE6);
        } else {
            int iE7 = t.e(58982, 65536 - t.e(iR - 439458, 7167)) + 6554;
            iE = t.e(iE7, iE4);
            if (iR > 599261) {
                iE = t.e(iE7, 16384);
            }
        }
        return iE;
    }

    public final int a(int[] iArr, boolean z) {
        int iE;
        int iE2 = 65536;
        if (this != this.f45a.f77e || ((m) ((w) this.f45a).d).d(22) == 0) {
            iE = 65536;
        } else {
            int iF = 65536 - t.f(Math.abs(this.gm - this.f46a.fs), this.f46a.fs);
            if (iArr != null) {
                iArr[0] = iF;
            }
            iE = 32768 + t.e(iF, 65536);
        }
        int iL = L();
        if (this.f45a.f77e == this && ((m) ((w) this.f45a).d).d(22) == 0) {
            iL = t.e(iL, 81920);
        }
        if (z) {
            s sVarA = this.f45a.a(this);
            ak akVar = null;
            int i = Integer.MAX_VALUE;
            int i2 = -ab.m11a(this.aC, this.bb);
            for (int i3 = 0; i3 < 5; i3++) {
                ak akVarA = sVarA.a(i3);
                int iM11a = ab.m11a(akVarA.aC, this.bb) + i2;
                if (iM11a >= 0 && (akVar == null || iM11a < i)) {
                    akVar = akVarA;
                    i = iM11a;
                }
            }
            iE2 = akVar != null ? 65536 - t.e(t.d(131072 - i, 0, 65536), (9830 + t.e(29491, t.e((this.f46a.fg - 50) << 16, 1337))) + t.e(t.d(t.e((akVar.f46a.eP - this.f46a.eP) << 16, 5461), -65536, 65536), 9830)) : 65536;
        }
        int iE3 = t.e(t.e(iE, iL), iE2);
        if (this.r != this.f45a.f77e.r) {
            switch (this.f45a.H) {
                case 0:
                    iE3 = t.e(iE3, 39321);
                    break;
                case 1:
                    iE3 = t.e(iE3, 49152);
                    break;
            }
        }
        return iE3;
    }

    public final int M() {
        switch (this.gq) {
            case 0:
            case 15:
            case 25:
                return t.e(this.f46a.fn, 114688);
            case 1:
            case 2:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                return this.f46a.fn;
            case 3:
                return t.e(this.f46a.fn, 131072);
            case 4:
            case 5:
            case 8:
            case 9:
            case 11:
                return t.e(this.f46a.fn, 98304);
        }
    }

    public final int N() {
        ak akVar = this.b.g;
        if (akVar == null) {
            return this.b.f198a == 1 ? 0 : 1;
        }
        int iM19b = m19b(akVar.aC);
        if (iM19b > 152233) {
            return iM19b >= 262144 ? 2 : 1;
        }
        int i = akVar.f48a;
        return (i == 5 || i == 7 || i == 17 || i == 18) ? 1 : 0;
    }

    public final void ae(int i) {
        if (this.f48a == 2 || this.f48a == 0) {
            b(10, i);
        }
    }

    public final void af(int i) {
        b(0, i);
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.a.a(dataInputStream);
        this.t = dataInputStream.readBoolean();
        this.r = dataInputStream.readBoolean();
        this.n = this.f45a.a(dataInputStream);
        this.gk = dataInputStream.readInt();
        this.gl = dataInputStream.readInt();
        this.gm = dataInputStream.readInt();
        this.aC.a(dataInputStream);
        this.bb.a(dataInputStream);
        this.bc.a(dataInputStream);
        this.aD.a(dataInputStream);
        this.f47ai = dataInputStream.readBoolean();
        this.gn = dataInputStream.readInt();
        this.go = dataInputStream.readInt();
        this.gp = dataInputStream.readInt();
        this.gz = dataInputStream.readInt();
        this.f48a = dataInputStream.readInt();
        this.f49b = dataInputStream.readInt();
        this.gq = dataInputStream.readInt();
        this.gr = dataInputStream.readInt();
        this.gs = dataInputStream.readInt();
        this.f50aj = dataInputStream.readBoolean();
        this.o = this.f45a.a(dataInputStream);
        this.p = this.f45a.a(dataInputStream);
        this.I.a(dataInputStream);
        this.bd.a(dataInputStream);
        this.gt = dataInputStream.readInt();
        this.be.a(dataInputStream);
        this.bf.a(dataInputStream);
        this.gu = dataInputStream.readInt();
        this.gv = dataInputStream.readInt();
        this.gw = dataInputStream.readInt();
        this.ak = dataInputStream.readBoolean();
        this.f51al = dataInputStream.readBoolean();
        this.am = dataInputStream.readBoolean();
        this.gx = dataInputStream.readInt();
        this.bg.a(dataInputStream);
        this.gy = dataInputStream.readInt();
        this.ap = dataInputStream.readBoolean();
        this.aq = dataInputStream.readBoolean();
        this.bh.a(dataInputStream);
        this.an = true;
        this.ao = true;
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(296358452);
        dataOutputStream.writeInt(14);
        this.a.a(dataOutputStream);
        dataOutputStream.writeBoolean(this.t);
        dataOutputStream.writeBoolean(this.r);
        f.a(this.n, dataOutputStream);
        dataOutputStream.writeInt(this.gk);
        dataOutputStream.writeInt(this.gl);
        dataOutputStream.writeInt(this.gm);
        this.aC.a(dataOutputStream);
        this.bb.a(dataOutputStream);
        this.bc.a(dataOutputStream);
        this.aD.a(dataOutputStream);
        dataOutputStream.writeBoolean(this.f47ai);
        dataOutputStream.writeInt(this.gn);
        dataOutputStream.writeInt(this.go);
        dataOutputStream.writeInt(this.gp);
        dataOutputStream.writeInt(this.gz);
        dataOutputStream.writeInt(this.f48a);
        dataOutputStream.writeInt(this.f49b);
        dataOutputStream.writeInt(this.gq);
        dataOutputStream.writeInt(this.gr);
        dataOutputStream.writeInt(this.gs);
        dataOutputStream.writeBoolean(this.f50aj);
        f.a(this.o, dataOutputStream);
        f.a(this.p, dataOutputStream);
        this.I.a(dataOutputStream);
        this.bd.a(dataOutputStream);
        dataOutputStream.writeInt(this.gt);
        this.be.a(dataOutputStream);
        this.bf.a(dataOutputStream);
        dataOutputStream.writeInt(this.gu);
        dataOutputStream.writeInt(this.gv);
        dataOutputStream.writeInt(this.gw);
        dataOutputStream.writeBoolean(this.ak);
        dataOutputStream.writeBoolean(this.f51al);
        dataOutputStream.writeBoolean(this.am);
        dataOutputStream.writeInt(this.gx);
        this.bg.a(dataOutputStream);
        dataOutputStream.writeInt(this.gy);
        dataOutputStream.writeBoolean(this.ap);
        dataOutputStream.writeBoolean(this.aq);
        this.bh.a(dataOutputStream);
    }

    private void h(ab abVar) {
        int i = abVar.eF;
        int i2 = abVar.eH;
        int iG = Math.abs(i2) < 256 ? i >= 0 ? 0 : 205887 : Math.abs(i) < 256 ? i2 >= 0 ? 102944 : 308831 : t.g(i2, i);
        this.go = iG;
        int iT = t.t(-iG);
        int iS = t.s(-iG);
        this.bb.eF = iT;
        this.bb.eG = 0;
        this.bb.eH = -iS;
    }

    private void A(int i, int i2) {
        this.gs = i2;
        this.gq = i;
        if (this.gq != -1) {
            this.gr = 0;
        }
    }

    private void b(int i, int i2) {
        int iP = -1;
        this.aD.aT();
        this.f48a = i;
        this.f49b = i2;
        this.f47ai = false;
        this.gm = 0;
        switch (this.f48a) {
            case 0:
            case 10:
                this.gn = 0;
                if (this.b.g == this) {
                    if (!this.f51al || !this.am || this.a.f2a == 5) {
                        iP = 16;
                        break;
                    } else {
                        iP = 14;
                        break;
                    }
                } else if ((this.gt & 32768) != 0) {
                    iP = (this.aC.eH > 0) == this.t ? 13 : 12;
                    break;
                } else {
                    iP = 1;
                    break;
                }
                break;
            case 1:
                this.gn = 0;
                iP = 9;
                break;
            case 2:
                this.f47ai = true;
                this.gm = 0;
                if (this.b.g != this) {
                    iP = 0;
                    break;
                } else {
                    this.am = true;
                    if ((this.gt & 32768) != 0) {
                        b(3, i2);
                        return;
                    } else {
                        iP = 15;
                        break;
                    }
                }
            case 3:
                this.f47ai = false;
                if (this.b.g == this) {
                    iP = 25;
                    break;
                } else {
                    b(0, i2);
                    return;
                }
            case 4:
                iP = P();
                break;
            case 5:
                int iM11a = ab.m11a(this.bb, this.bg);
                this.gp = t.r(t.e(963378, this.f46a.fs));
                if (iM11a >= 0) {
                    iP = 17;
                } else if (this.gx >= 139837 || this.f46a.eP < 81) {
                    iP = (this != this.f45a.f77e || this.gx <= 319628) ? 22 : 17;
                } else {
                    iP = ((w) this.f45a).d.o(2) == 0 ? 24 : 22;
                }
                this.gw = 0;
                this.f51al = !this.am;
                k(false);
                break;
            case 6:
                iP = 21;
                break;
            case 7:
            case 17:
            case 18:
                iP = this.f48a == 17 ? 20 : this.f48a == 18 ? 23 : 19;
                if (this.f48a != 18) {
                    this.f48a = 7;
                }
                this.gw = 0;
                this.ak = false;
                this.f51al = false;
                switch (iP) {
                    case 19:
                        this.gu = 67994;
                        this.gv = 72090;
                        break;
                    case 20:
                        this.gu = 42597;
                        this.gv = 43909;
                        break;
                    case 23:
                        this.gu = this.f46a.fs;
                        this.gv = 43909;
                        break;
                }
                if (iP >= 18 || iP <= 19) {
                    this.gu = 199753 - t.e(199753 - this.gu, this.f46a.fp);
                }
                this.be.c(this.aC);
                if (iP == 23) {
                    this.bf.c(this.bd);
                    this.bf.R(t.e((this.gv * 3) >> 2, this.gn));
                    this.bf.d(this.aC);
                } else {
                    this.bf.h(this.t ? 833867 : -833867, 0, 0);
                }
                int i3 = this.f46a.fn + 14981;
                if (iP == 20) {
                    i3 *= 3;
                }
                this.aV.b(this.be, this.bf);
                this.aV.G();
                this.bf.d(this.aV, i3);
                k(false);
                break;
            case 8:
                int iE = this.f46a.fs;
                this.gw = 0;
                if (this.gn > 0) {
                    if (ab.m11a(this.bd, this.bb) <= 0) {
                        this.gn = 0;
                    } else {
                        iE += t.e(t.e(21845, this.f46a.fs), t.f(this.gn, this.f46a.fq));
                    }
                }
                this.gp = t.r(t.e(963378, iE));
                this.gn = t.e(46341, this.gn);
                iP = 2;
                break;
            case 9:
                iP = 3;
                break;
            case 11:
                this.gn = 0;
                iP = 6;
                break;
            case 12:
                iP = 27;
                break;
            case 13:
                iP = 28;
                break;
            case 14:
                iP = 29;
                g(aW);
                break;
            case 15:
                iP = 30;
                g(aW);
                break;
            case 19:
                iP = 26;
                this.bd.h(this.bd.eF + this.bd.eH, 0, this.bd.eH - this.bd.eF);
                this.bd.G();
                this.I.c(this.bd);
                this.I.R(655360);
                this.I.d(this.aC);
                int iE2 = t.e(65536 - t.e((this.f46a.fa - 50) << 16, 1337), 32768);
                int iO = ((w) this.f45a).d.o(65536);
                if (iO > 32768) {
                    s sVarA = this.f45a.a(this);
                    for (int i4 = 0; i4 < 5; i4++) {
                        ak akVarA = sVarA.a(i4);
                        if (akVarA.a.a(this)) {
                            akVarA.a.a(this, i2);
                        }
                    }
                } else if (iO < iE2) {
                    this.bh.c(this.bd);
                    this.bh.R(-((((w) this.f45a).d.o(16384) + 65536) - 16384));
                    this.aq = true;
                }
                this.bc.c(this.bd);
                this.bc.R(-65536);
                break;
        }
        A(iP, i2);
    }

    private int O() {
        if (this.t) {
            this.bg.h(833867, 0, 0);
        } else {
            this.bg.h(-833867, 0, 0);
        }
        this.bg.e(this.aC);
        this.bg.eG = 0;
        this.gx = this.bg.G();
        this.an = false;
        return this.gx;
    }

    private void ag(int i) {
        ak akVar = null;
        int i2 = 0;
        s sVarM21b = this.f45a.m21b(this);
        for (int i3 = 0; i3 < 5; i3++) {
            ak akVarA = sVarM21b.a(i3);
            if (akVarA != this) {
                int iM54a = (int) t.m54a(this.aC.eF - akVarA.aC.eF, this.aC.eH - akVarA.aC.eH);
                if (akVar == null || iM54a < i2) {
                    i2 = iM54a;
                    akVar = akVarA;
                }
            }
        }
        akVar.a.a(this, (ab) null, i);
    }

    private void a(y yVar, int i, int i2) {
        int i3;
        ak akVar = this.o;
        if (yVar.g != this) {
            this.o = null;
            return;
        }
        boolean z = this.a.f2a == 5;
        this.f45a.a(yVar, this, i);
        if (z && this.f45a.u <= 120000 && this.f45a.t >= 3) {
            this.f45a.p();
        }
        this.al.c(yVar.aC);
        this.al.eG = 0;
        this.aY.c(akVar.aC);
        this.aY.eG = 0;
        this.o = null;
        if (v.a(this.aY, akVar.aD, this.al, 786432, this.ai)) {
            int i4 = this.ai[0];
            i3 = this.ai[1];
            int i5 = this.ai[2];
            if (i4 > 1 && i3 < 0) {
                i3 = i5;
            }
            this.aX.c(akVar.aD);
            this.aX.R(i3);
            this.aX.d(akVar.aC);
            this.aX.eG = 0;
        } else {
            i3 = 131072;
            this.aX.c(akVar.aC);
        }
        if (this.aX.eF <= -938842 && this.aY.eF > -938842) {
            ah(-906074);
        } else if (this.aX.eF >= 938842 && this.aY.eF < 938842) {
            ah(906074);
        }
        if (this.aX.eH <= -499384 && this.aY.eH > -499384) {
            ai(-466616);
        } else if (this.aX.eH >= 499384 && this.aY.eH < 499384) {
            ai(466616);
        }
        akVar.a.a(this.aX, i);
        if (this.f46a.fb < 75 && ((w) this.f45a).d.o(65536) > t.f(this.f46a.fb, 75)) {
            int iO = ((w) this.f45a).d.o(65536) - 32768;
            this.aX.eF += iO;
            this.aX.eH += (i & 1) == 0 ? iO : -iO;
        }
        yVar.a(akVar, this.aX, i3, i, i2);
    }

    private void ah(int i) {
        this.aZ.b(this.aX, this.aY);
        this.aZ.eH = t.e(t.f(i - this.aY.eF, this.aZ.eF), this.aZ.eH);
        this.aZ.eF = i - this.aY.eF;
        this.aX.a(this.aZ, this.aY);
    }

    private void ai(int i) {
        this.aZ.b(this.aX, this.aY);
        this.aZ.eF = t.e(t.f(i - this.aY.eH, this.aZ.eH), this.aZ.eF);
        this.aZ.eH = i - this.aY.eH;
        this.aX.a(this.aZ, this.aY);
    }

    private int P() {
        int iM11a = ab.m11a(this.bb, this.bd);
        if ((this.gt & 32768) != 0) {
            return 11;
        }
        if (iM11a >= 46341) {
            return 8;
        }
        return (iM11a > -46341 && (this.bb.eH * this.bd.eF) + ((-this.bb.eF) * this.bd.eH) >= 0) ? 5 : 4;
    }

    public final int Q() {
        int i = 5;
        int iA = a(true, (ab) null);
        int iE = t.e((this.f46a.eT - 50) << 16, 1337);
        if (this.gn != 0 || iA > 97429) {
            if (this.gn == 0) {
                return 5;
            }
            int I = I();
            int iE2 = 216268;
            if (this.r != this.f45a.f77e.r) {
                switch (this.f45a.H) {
                    case 0:
                        iE2 = t.e(216268, 49152);
                        break;
                    case 1:
                        iE2 = t.e(216268, 58982);
                        break;
                }
            }
            if (ab.m11a(this.bg, this.bd) > (this == this.f45a.f77e ? -46341 : 0)) {
                int iMax = Math.max(0, t.f(iE2 - I, iE2));
                if (65536 - iMax <= iE) {
                    i = 7;
                } else if (iMax > 0) {
                    i = 17;
                } else if (this.gn > 65536) {
                    return 18;
                }
                if (i == 7) {
                    s sVarA = this.f45a.a(this);
                    int i2 = 0;
                    for (int i3 = 0; i3 < 5; i3++) {
                        ak akVarA = sVarA.a(i3);
                        int iA2 = v.a(akVarA.aC, this.aC, this.bg, this.ba);
                        if (iA2 >= 0 && iA2 < I && Math.abs(t.e(akVarA.aC.eF - this.aC.eF, -this.bg.eH) + t.e(akVarA.aC.eH - this.aC.eH, this.bg.eF)) <= M() + akVarA.M()) {
                            i2++;
                        }
                    }
                    if (i2 > 2) {
                        i = 18;
                    } else if (i2 > 1 || ((i2 > 0 && this.f46a.eT < 90) || Math.abs(this.aC.eF) > 833867)) {
                        i = 17;
                    }
                }
            }
        } else if (this.f46a.fs + t.e(this.f46a.fp, 163840) + t.e(iE, 13107) + ((w) this.f45a).d.o(7990) >= 215733 && iE > 0) {
            i = 7;
        }
        return i;
    }

    private void aj(int i) {
        if (this.f47ai && this.gn > 0 && this.bd.F() > 0) {
            this.bc.c(this.bd);
        }
        this.bc.G();
        int iM11a = ab.m11a(this.bb, this.bc);
        if (Math.abs(t.e(-this.bb.eH, this.bc.eF) + t.e(this.bb.eF, this.bc.eH)) < 256 && iM11a > 0) {
            this.bc.c(this.bb);
            return;
        }
        int iMin = Math.min(65536, i << 2);
        int iG = (Math.abs(this.bc.eH) < 256 ? this.bc.eF >= 0 ? 0 : 205887 : Math.abs(this.bc.eF) < 256 ? this.bc.eH >= 0 ? 102944 : 308831 : t.g(this.bc.eH, this.bc.eF)) - this.go;
        int i2 = iG;
        if (iG > 205887) {
            i2 -= 411775;
        } else if (i2 < -205887) {
            i2 += 411775;
        }
        this.go += t.e(i2, iMin);
        if (this.go > 411775) {
            this.go -= 411775;
        } else if (this.go < 0) {
            this.go += 411775;
        }
        int i3 = this.go;
        int iT = t.t(-i3);
        int iS = t.s(-i3);
        this.bb.eF = iT;
        this.bb.eG = 0;
        this.bb.eH = -iS;
    }

    public final void bn() {
        this.f48a = -1;
        this.gn = 0;
        this.gp = 0;
        this.gz = -250;
        this.gt = 0;
        this.f50aj = false;
        this.o = null;
        this.n = null;
        this.p = null;
        this.go = 0;
        this.bb.h(65536, 0, 0);
        this.bc.c(this.bb);
        this.f51al = true;
        this.am = false;
        this.gx = 0;
        this.bg.h(0, 0, 0);
        this.an = true;
        this.ao = true;
        this.ap = false;
        this.aq = false;
        this.bh.h(0, 0, 0);
        this.gq = -1;
    }

    public final boolean z() {
        return this.f48a == 0 || this.f48a == 2 || this.f48a == 3;
    }

    public final void bo() {
        if (this.f48a == 5 || this.f48a == 18) {
            this.f50aj = true;
        }
    }
}
