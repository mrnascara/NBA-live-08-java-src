package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:s.class */
public final class s {
    public v a;

    /* renamed from: a, reason: collision with other field name */
    public f f162a;
    public s c;
    public int bs;
    public int cA;
    public int cB;
    public int cC;
    public int br;
    public int cD;
    public int cE;
    public int cF;
    public int cG;
    public int cH;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean v;
    private ab S = new ab();
    private ab T = new ab();
    private ab U = new ab();
    private ab V = new ab();
    private ab W = new ab();
    private ab X = new ab();
    private ab Y = new ab();
    public ak[] b = new ak[5];

    /* renamed from: a, reason: collision with other field name */
    public ad[] f163a = new ad[15];
    public int[][] d = new int[15][17];
    public int[] x = new int[5];
    public int[][] e = new int[5][5];
    public int[] y = new int[5];
    public int[] z = new int[5];
    public int[] A = new int[5];
    public int[] B = new int[5];
    public boolean u = true;

    public s() {
        for (int i = 0; i < 5; i++) {
            this.b[i] = new ak();
        }
    }

    public final void a(v vVar, f fVar, y yVar, int i, boolean z) throws IOException {
        this.a = vVar;
        if (i != -1) {
            this.b[i].a(fVar, yVar);
            return;
        }
        for (int i2 = 0; i2 < 15; i2++) {
            v vVar2 = this.a;
            vVar2.getClass();
            this.f163a[i2] = new ad(vVar2);
        }
        this.f162a = fVar;
    }

    public final void a(int i, boolean z, s sVar) throws IOException {
        int i2 = 65536;
        this.br = i;
        this.r = z;
        this.c = sVar;
        this.cD = 0;
        this.cE = 0;
        this.cF = 0;
        this.cG = 0;
        this.v = false;
        if (this.r != this.f162a.m25h()) {
            switch (((m) ((w) this.f162a).d).d(14)) {
                case 0:
                    i2 = 62259;
                    break;
                case 1:
                    i2 = 64880;
                    break;
            }
        }
        int[] iArr = new int[15];
        this.bs = this.a.m60a(i, iArr);
        for (int i3 = 0; i3 < this.bs; i3++) {
            v vVar = this.a;
            vVar.getClass();
            this.f163a[i3] = new ad(vVar);
            this.a.a(iArr[i3], this.f163a[i3]);
            this.f163a[i3].fq = t.e(this.f163a[i3].fq, i2);
            this.f163a[i3].fr = t.e(this.f163a[i3].fr, i2);
            v.d(iArr[i3], this.d[i3]);
        }
        X();
    }

    public final void a(ak akVar, y yVar, int i, int i2, int i3) throws IOException {
        if (this.s) {
            b(akVar, yVar, i, i3);
        } else {
            a(akVar, yVar, i, i3);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            this.b[i4].b(akVar, i, i2, i3);
        }
    }

    public final void T() throws IOException {
        int i = ((m) ((w) this.f162a).d).cc;
        if (i == 2 || i == 1) {
            this.a.a(this.bs, this.d, this.r);
        }
    }

    private void b(ak akVar) {
        int i = -1;
        int i2 = 0;
        int i3 = akVar.gk;
        if (this.f162a.a((short) akVar.f46a.eL, this.r, true) < 0) {
            return;
        }
        for (int i4 = 0; i4 < this.bs; i4++) {
            if (this.d[i4][13] < 6 && this.f162a.a((short) this.f163a[i4].eL, this.r, true) < 0) {
                int i5 = this.f163a[i4].fj;
                int iAbs = this.f163a[i4].eS == i3 ? i5 + 10 : i5 - (Math.abs(this.f163a[i4].bp - i3) * 15);
                if (h(this.d[i4][13])) {
                    iAbs -= 20;
                }
                if (iAbs > i2) {
                    i = i4;
                    i2 = iAbs;
                }
            }
        }
        this.f162a.a((int) ((short) i3), (int) this.f162a.b((short) this.f163a[i].eL, this.r, true), this.r, true);
    }

    private boolean h(int i) {
        int i2 = this.f162a.t;
        int i3 = this.f162a.u;
        if (i >= 6) {
            return true;
        }
        if (i2 > 3) {
            return false;
        }
        if (i2 == 0 && i >= 2) {
            return true;
        }
        if (i2 == 1 && i >= 3) {
            return true;
        }
        if (i2 != 2 || i < 4) {
            return i2 == 3 && i > 4 && i3 > 120000;
        }
        return true;
    }

    public final void U() {
        short sB;
        if (this.r == this.f162a.f77e.r) {
            return;
        }
        for (int i = 0; i < this.bs; i++) {
            if (this.f163a[i].eS != -1 && !h(this.d[i][13]) && this.f163a[i].eL != this.f162a.a(this.f163a[i].eS, this.r) && (sB = this.f162a.b((short) this.f163a[i].eL, this.r, true)) >= 0) {
                this.f162a.a(this.f163a[i].eS, (int) sB, this.r, true);
            }
        }
    }

    public final void n(int i, int i2) throws IOException {
        ak akVar = null;
        ak akVar2 = null;
        for (int i3 = 0; i3 < 5; i3++) {
            if (this.b[i3].f46a.eL == i2) {
                akVar = this.b[i3];
            } else if (this.b[i3].f46a.eL == i) {
                akVar2 = this.b[i3];
            }
        }
        if (akVar2 != null) {
            int[] iArr = akVar2.aj;
            ad adVar = akVar2.f46a;
            akVar2.a(akVar2.gk, akVar.f46a, akVar.aj, this.r);
            akVar.a(akVar.gk, adVar, iArr, this.r);
            return;
        }
        int i4 = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= this.bs) {
                break;
            }
            if (this.f163a[i5].eL == i) {
                i4 = i5;
                break;
            }
            i5++;
        }
        akVar.a(akVar.gk, this.f163a[i4], this.d[i4], this.r);
    }

    public final void B(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            this.b[i2].G(8, i);
        }
    }

    public final ak a(int i, int i2) {
        s sVar;
        boolean z;
        if (i == 0) {
            this.cC = 3;
            this.cB = 0;
        } else if (i == 2) {
            this.cC = 3;
        }
        this.cA = 0;
        this.s = false;
        if (i < 2) {
            sVar = this;
            z = this.r;
        } else {
            sVar = this;
            z = !this.r;
        }
        sVar.t = z;
        for (int i3 = 0; i3 < 5; i3++) {
            this.b[i3].j(this.t);
            this.b[i3].G(1, i2);
            this.b[i3].a.f7b = this.c.a(i3);
        }
        ak akVarB = b(0);
        ak akVarB2 = b(1);
        ak akVarB3 = b(2);
        ak akVarB4 = b(3);
        ak akVarB5 = b(4);
        if (i != 0 && i < 4) {
            boolean zD = this.f162a.d();
            boolean z2 = !(this.r ^ ((i == 1 || i == 2) ? !zD : zD));
            boolean z3 = z2;
            if (z2) {
                if (this.t) {
                    akVarB.H(-807770, 131072);
                    akVarB2.H(559311, 196608);
                    akVarB4.H(559311, 196608);
                    akVarB5.H(559311, (-262144) + ((w) this.f162a).d.o(131072));
                } else {
                    akVarB.H(807770, 131072);
                    akVarB2.H(-559311, 196608);
                    akVarB4.H(-559311, 196608);
                    akVarB5.H(-559311, (-262144) + ((w) this.f162a).d.o(131072));
                }
                this.f162a.a(akVarB3, this.S);
                akVarB3.H(this.S.eF, this.S.eH);
            } else if (this.t) {
                akVarB.H(-131072, 196608);
                akVarB2.H(-131072, -196608);
                akVarB3.H(-559311, 196608);
                akVarB4.H(-559311, -196608);
                akVarB5.H(-690383, 0);
            } else {
                akVarB.H(131072, 196608);
                akVarB2.H(131072, -196608);
                akVarB3.H(559311, 196608);
                akVarB4.H(559311, -196608);
                akVarB5.H(690383, 0);
            }
            return a(z3, i2);
        }
        if (this.t) {
            akVarB.H(131072, -499384);
            akVarB2.H(196608, -499384);
            akVarB3.H(262144, -499384);
            akVarB4.H(327680, -499384);
            akVarB5.H(393216, -499384);
            akVarB.d(-239704, 65536, true);
            akVarB2.d(-131072, 131072, true);
            akVarB3.d(131072, 131072, true);
            akVarB4.d(131072, -131072, true);
            akVarB5.d(-39950, -65536, true);
        } else {
            akVarB.H(-131072, -499384);
            akVarB2.H(-196608, -499384);
            akVarB3.H(-262144, -499384);
            akVarB4.H(-327680, -499384);
            akVarB5.H(-393216, -499384);
            akVarB.d(239704, -65536, true);
            akVarB2.d(65536, 131072, true);
            akVarB3.d(-65536, -131072, true);
            akVarB4.d(-65536, 131072, true);
            akVarB5.d(39950, 65536, true);
        }
        akVarB.G(2, i2);
        akVarB2.G(2, i2);
        akVarB3.G(2, i2);
        akVarB4.G(2, i2);
        akVarB5.G(3, i2);
        akVarB.c(32, i2, true);
        akVarB2.c(32, i2, true);
        akVarB3.c(32, i2, true);
        akVarB4.c(32, i2, true);
        akVarB5.c(32, i2, true);
        return akVarB5;
    }

    public final ak a(boolean z, int i) {
        ak akVarB = b(0);
        ak akVarB2 = b(1);
        ak akVarB3 = b(2);
        ak akVarB4 = b(3);
        ak akVarB5 = b(4);
        if (!z) {
            akVarB.G(1, i);
            akVarB2.G(1, i);
            akVarB3.G(1, i);
            akVarB4.G(1, i);
            akVarB5.G(1, i);
            return null;
        }
        akVarB3.G(5, i);
        akVarB.G(4, i);
        akVarB2.G(4, i);
        akVarB4.G(4, i);
        akVarB5.G(4, i);
        D(i);
        D(i);
        D(i);
        D(i);
        return akVarB3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ak akVar, int i) {
        boolean z = !akVar.t;
        if (akVar.r != this.r) {
            int[] iArr = {new int[]{838860, -183500}, new int[]{838860, 183500}, new int[]{681574, -183500}, new int[]{412876, -249036}, new int[]{412876, 249036}};
            for (int i2 = 0; i2 < 5; i2++) {
                this.b[i2].af(i);
                this.b[i2].H(iArr[i2][0] * (z ? -1 : 1), iArr[i2][1] * (z ? -1 : 1));
                this.b[i2].c(57341, i, false);
                this.b[i2].k(true);
                this.b[i2].a.b(6, i);
            }
            return;
        }
        int[] iArr2 = {new int[]{760217, -183500}, new int[]{760217, 183500}, new int[]{393216, -196608}, new int[]{393216, 196608}};
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            if (this.b[i4] != akVar) {
                this.b[i4].af(i);
                this.b[i4].H(iArr2[i3][0] * (z ? -1 : 1), iArr2[i3][1] * (z ? -1 : 1));
                this.b[i4].c(57341, i, false);
                this.b[i4].k(true);
                this.b[i4].a.b(6, i);
                i3++;
            }
        }
        akVar.af(i);
        akVar.H(z ? -526543 : 526543, 0);
        akVar.c(57341, i, false);
        akVar.k(true);
        akVar.c(256, i, true);
        akVar.a.b(7, i);
    }

    public final void f(ak akVar, int i) {
        if (akVar.r == this.r) {
            for (int i2 = 0; i2 < 5; i2++) {
                this.b[i2].a.b(0, i);
            }
            return;
        }
        for (int i3 = 0; i3 < 5; i3++) {
            this.b[i3].a.b(1, i);
        }
    }

    public final int a(ak akVar, boolean z) {
        for (int i = 0; i < this.bs; i++) {
            int[] iArr = this.d[i];
            if (iArr[0] == akVar.f46a.eL) {
                iArr[13] = iArr[13] + 1;
                if (iArr[13] >= 6 || (this.r != this.f162a.f77e.r && h(iArr[13]))) {
                    b(akVar);
                }
                if (!z) {
                    return 0;
                }
                int i2 = this.cA + 1;
                this.cA = i2;
                return i2;
            }
        }
        return 0;
    }

    public final void g(ak akVar, int i) {
        int[] iArr = akVar.aj;
        if (i == 2) {
            iArr[5] = iArr[5] + 1;
        } else if (i == 3) {
            iArr[7] = iArr[7] + 1;
        } else {
            iArr[9] = iArr[9] + 1;
        }
        this.cB += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.y r6, defpackage.ak r7, int r8) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.a(y, ak, int):void");
    }

    public final void C(int i) {
        this.s = false;
        for (int i2 = 0; i2 < 5; i2++) {
            this.b[i2].G(1, i);
        }
    }

    public final ak a(int i) {
        return this.b[i];
    }

    public final ak b(int i) {
        return this.b[i];
    }

    public final void a(int[] iArr) {
        v.d(-1, iArr);
        for (int i = 0; i < this.bs; i++) {
            v.a(iArr, this.d[i]);
        }
    }

    public final void f(boolean z) {
        if (z) {
            this.cC--;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final ad m37a(int i) {
        return this.f163a[i];
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int[] m38a(int i) {
        return this.d[i];
    }

    /* renamed from: b, reason: collision with other method in class */
    public final ad m39b(int i) {
        for (int i2 = 0; i2 < this.bs; i2++) {
            if (this.f163a[i2].eL == i) {
                return this.f163a[i2];
            }
        }
        return null;
    }

    public final int j(int i) {
        if (this.u) {
            W();
        }
        return this.y[i];
    }

    public final int k(int i) {
        return this.z[i];
    }

    public final int l(int i) {
        return this.A[i];
    }

    public final void V() {
        this.T.h(this.t ? 833867 : -833867, 0, 0);
        for (int i = 0; i < 5; i++) {
            this.z[i] = a(i, this.b[i].f46a.fu, this.b[i].f46a.ft, this.T);
            ak akVar = this.b[i].b.g;
            if (akVar != null && akVar != this.b[i] && akVar.r == this.r) {
                this.A[i] = a(akVar.gk, akVar.f46a.fw, akVar.f46a.fv, this.b[i].aC);
            }
        }
        this.u = true;
    }

    public final void o(int i, int i2) {
        ak akVar = this.f162a.f77e;
        for (int i3 = 0; i3 < 5; i3++) {
            this.b[i3].a.a(akVar, i, i2);
        }
    }

    public final int m(int i) {
        return this.x[i];
    }

    private int a(int i, int i2, int i3, ab abVar) {
        int i4 = 0;
        int i5 = abVar.eF - this.b[i].aC.eF;
        int i6 = abVar.eH - this.b[i].aC.eH;
        int iM54a = (int) t.m54a(i5, i6);
        this.W.B(this.b[i].aC.eF, this.b[i].aC.eH);
        int iE = t.e(i5, i3);
        int iE2 = t.e(i5, i2);
        int iE3 = t.e(i6, i3);
        int iE4 = t.e(i6, i2);
        this.V.eF = iE - iE4;
        this.V.eG = iE2 + iE3;
        this.U.eF = iE + iE4;
        this.U.eG = iE3 - iE2;
        this.Y.eF = -this.V.eG;
        this.Y.eG = this.V.eF;
        int iM12b = ab.m12b(this.Y, this.U);
        this.Y.eF = -this.U.eG;
        this.Y.eG = this.U.eF;
        int iM12b2 = ab.m12b(this.Y, this.V);
        for (int i7 = 0; i7 < 5; i7++) {
            ak akVarA = this.c.a(i7);
            this.X.eF = akVarA.aC.eF - this.W.eF;
            this.X.eG = akVarA.aC.eH - this.W.eG;
            this.Y.eF = -this.V.eG;
            this.Y.eG = this.V.eF;
            int iM12b3 = ab.m12b(this.Y, this.X);
            if ((iM12b3 <= 0 || iM12b >= 0) && (iM12b3 >= 0 || iM12b <= 0)) {
                this.Y.eF = -this.U.eG;
                this.Y.eG = this.U.eF;
                int iM12b4 = ab.m12b(this.Y, this.X);
                if ((iM12b4 <= 0 || iM12b2 >= 0) && ((iM12b4 >= 0 || iM12b2 <= 0) && this.X.F() <= iM54a)) {
                    i4++;
                }
            }
        }
        return i4;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        for (int i = 0; i < 5; i++) {
            this.b[i].a(dataInputStream);
        }
        for (int i2 = 0; i2 < 15; i2++) {
            v.a(this.d[i2], dataInputStream);
        }
        this.bs = dataInputStream.readInt();
        this.cA = dataInputStream.readInt();
        this.cB = dataInputStream.readInt();
        this.cC = dataInputStream.readInt();
        this.br = dataInputStream.readShort();
        this.cD = dataInputStream.readInt();
        this.cE = dataInputStream.readInt();
        this.cF = dataInputStream.readInt();
        this.cG = dataInputStream.readInt();
        this.cH = dataInputStream.readInt();
        this.r = dataInputStream.readBoolean();
        this.s = dataInputStream.readBoolean();
        this.t = dataInputStream.readBoolean();
        this.v = dataInputStream.readBoolean();
        for (int i3 = 0; i3 < 5; i3++) {
            this.B[i3] = dataInputStream.readByte();
        }
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = dataInputStream.readInt();
            if (this.b[i4].f46a.eL != i5) {
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    if (i7 >= this.bs) {
                        break;
                    }
                    if (this.f163a[i7].eL == i5) {
                        i6 = i7;
                        break;
                    }
                    i7++;
                }
                this.b[i4].a(this.b[i4].gk, this.f163a[i6], this.d[i6], this.r);
            }
        }
        this.u = true;
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(-1430580684);
        dataOutputStream.writeInt(8);
        for (int i = 0; i < 5; i++) {
            this.b[i].a(dataOutputStream);
        }
        for (int i2 = 0; i2 < 15; i2++) {
            v.a(this.d[i2], dataOutputStream);
        }
        dataOutputStream.writeInt(this.bs);
        dataOutputStream.writeInt(this.cA);
        dataOutputStream.writeInt(this.cB);
        dataOutputStream.writeInt(this.cC);
        dataOutputStream.writeShort(this.br);
        dataOutputStream.writeInt(this.cD);
        dataOutputStream.writeInt(this.cE);
        dataOutputStream.writeInt(this.cF);
        dataOutputStream.writeInt(this.cG);
        dataOutputStream.writeInt(this.cH);
        dataOutputStream.writeBoolean(this.r);
        dataOutputStream.writeBoolean(this.s);
        dataOutputStream.writeBoolean(this.t);
        dataOutputStream.writeBoolean(this.v);
        for (int i3 = 0; i3 < 5; i3++) {
            dataOutputStream.writeByte(this.B[i3]);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            dataOutputStream.writeInt(this.b[i4].f46a.eL);
        }
    }

    private void a(ak akVar, y yVar, int i, int i2) {
        a(yVar);
    }

    private void a(ak akVar, y yVar, int i) {
        ak akVar2 = yVar.g;
        if (akVar2 == null || akVar2.gk == 0 || akVar2.f46a.fa >= 80) {
            return;
        }
        ak akVar3 = this.b[0];
        akVar3.a.a(akVar2.aC.eF, akVar2.aC.eH);
        if (((int) t.m54a(akVar3.aC.eF - akVar2.aC.eF, akVar3.aC.eH - akVar2.aC.eH)) <= 262144) {
            akVar3.a.c(7, i);
            akVar3.a.a(akVar3.aC.eF, akVar3.aC.eH);
            if (akVar2 != akVar) {
                akVar2.n = akVar3;
                akVar2.c(57341, i, false);
                akVar2.a.c(14, i);
            }
            this.cH = 0;
        }
    }

    private void b(ak akVar, y yVar, int i, int i2) {
        int i3 = this.cH + i2;
        if (this.cD == 1) {
            if (i3 < 393216) {
                this.cH = i3;
                return;
            }
            if (!p()) {
                this.cD = 0;
            }
            this.cH = 0;
            return;
        }
        if (!this.v || this.r == akVar.r) {
            if (this.t == (yVar.aC.eF < 0)) {
                a(akVar, yVar, i);
            } else if (i3 >= 65536) {
                ak akVar2 = this.b[((w) this.f162a).d.o(5)];
                int iL = this.f162a.f112a.L(this.cF);
                int i4 = iL - 5;
                if (akVar.r == this.r) {
                    i4++;
                }
                int iO = ((w) this.f162a).d.o(i4);
                int i5 = 0;
                while (i5 < iL) {
                    boolean z = false;
                    for (int i6 = 0; i6 < 5 && !z; i6++) {
                        if (this.b[i6] != akVar && this.b[i6].a.f11g == i5) {
                            z = true;
                        }
                    }
                    if (!z) {
                        iO--;
                        if (iO == 0) {
                            break;
                        }
                    }
                    i5++;
                }
                if (i5 < iL) {
                    akVar2.a.a(this.cF, i5, i);
                }
                i3 = -((w) this.f162a).d.o(65536);
            }
            this.cH = i3;
            return;
        }
        if (this.t == (yVar.aC.eF < 0)) {
            a(akVar, yVar, i);
            return;
        }
        if (this.cH == 0) {
            Y();
        }
        d dVarA = this.f162a.f112a.a(this.cF, this.cG);
        int iA = dVarA.a(this.cH, i3);
        this.cH = i3;
        for (int i7 = 0; i7 < iA; i7++) {
            h hVarA = dVarA.a(i7);
            switch (hVarA.bn) {
                case 0:
                    b(this.B[hVarA.bp]).a.a(this.cF, hVarA.bq, i);
                    break;
                case 1:
                    ak akVarB = b(this.B[hVarA.bp]);
                    akVarB.n = b(this.B[hVarA.bq]);
                    akVarB.c(57341, i, false);
                    akVarB.c(4, i, true);
                    break;
                case 2:
                    b(this.B[hVarA.bp]).a.a(i);
                    break;
                case 3:
                    b(this.B[hVarA.bp]).a.a(b(this.B[hVarA.bq]), (ab) null, i);
                    break;
                case 4:
                    b(this.B[hVarA.bp]).a.b(i);
                    break;
                case 5:
                    this.v = false;
                    this.cH = 0;
                    break;
            }
        }
    }

    private void D(int i) {
        aj ajVar = this.f162a.f112a;
        for (int i2 = 0; i2 < 5; i2++) {
            this.b[i2].a.a(this.cF, ajVar.i(0, i2), i);
        }
        this.cH = 0;
    }

    private void a(y yVar) {
        boolean z = false;
        int i = yVar.aC.eF;
        if (!this.c.t) {
            z = true;
            i = -i;
        }
        if (i < 0) {
            for (int i2 = 0; i2 < 5; i2++) {
                this.b[i2].a.f8c = null;
            }
            return;
        }
        for (int i3 = 0; i3 < 5; i3++) {
            this.x[i3] = 0;
            ak akVarA = this.c.a(i3);
            if (akVarA.aC.eF * (z ? -1 : 1) >= 0) {
                iE = 499418 - akVarA.I() > 0 ? 0 + 196608 + (7 * t.e(1310, ((akVarA.x() ? akVarA.f46a.eW : akVarA.w() ? akVarA.f46a.eU : akVarA.f46a.eV) - 50) << 16)) : 0;
                if (yVar.g == akVarA) {
                    iE = iE + 327680 + (this.c.j(i3) << 15);
                }
            }
            this.x[i3] = iE >> 16;
        }
    }

    private void W() {
        for (int i = 0; i < 5; i++) {
            this.y[i] = 10;
            ak akVarA = a(i);
            int[] iArr = this.y;
            int i2 = i;
            iArr[i2] = iArr[i2] - this.z[i];
            for (int i3 = 0; i3 < 5; i3++) {
                ak akVarA2 = this.c.a(i3);
                this.e[i][i3] = (int) t.m54a(akVarA.aC.eF - akVarA2.aC.eF, akVarA.aC.eH - akVarA2.aC.eH);
                if (this.e[i][i3] <= 219216) {
                    int[] iArr2 = this.y;
                    int i4 = i;
                    iArr2[i4] = iArr2[i4] - 1;
                }
            }
        }
        this.u = false;
    }

    private void X() throws IOException {
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int i = 0;
        for (int i2 = 0; i2 < this.bs && i < 5; i2++) {
            if (this.f163a[i2].eS != -1) {
                iArr[i] = i2;
                i++;
            }
        }
        for (int i3 = 0; i3 < 5; i3++) {
            iArr2[i3] = -1;
        }
        for (int i4 = 0; i4 < 5; i4++) {
            iArr2[this.f163a[iArr[i4]].eS] = iArr[i4];
        }
        for (int i5 = 0; i5 < 5; i5++) {
            int i6 = iArr2[i5];
            this.b[i5].a(i5, this.f163a[i6], this.d[i6], this.r);
        }
    }

    private void Y() {
        for (int i = 0; i < 5; i++) {
            this.B[i] = i;
        }
        y yVar = this.b[0].b;
        if (yVar.g != null) {
            ak akVar = yVar.g;
            if (akVar.r == this.r) {
                int i2 = akVar.gk;
                int i3 = 0;
                this.B[0] = i2;
                for (int i4 = 1; i4 < 5; i4++) {
                    while (i3 == i2) {
                        i3++;
                    }
                    this.B[i4] = i3;
                    i3++;
                }
            }
        }
    }

    private boolean f(ak akVar) {
        if (this.t == (akVar.aC.eF >= 0)) {
            return false;
        }
        return p();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean p() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.p():boolean");
    }

    public final void Z() throws IOException {
        for (int i = 0; i < this.bs; i++) {
            for (int i2 = 1; i2 < 17; i2++) {
                this.d[i][i2] = 0;
            }
        }
        for (int i3 = 0; i3 < 5; i3++) {
            this.b[i3].bn();
        }
        X();
    }

    public final void a(short[] sArr) {
        for (int i = 0; i < 5; i++) {
            sArr[i] = (short) this.b[i].f46a.eL;
        }
    }

    public final void b(short[] sArr) {
        int i = 0;
        for (int i2 = 0; i2 < this.bs; i2++) {
            boolean z = true;
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    break;
                }
                if (this.b[i3].f46a.eL == this.f163a[i2].eL) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                int i4 = i;
                i++;
                sArr[i4] = (short) this.f163a[i2].eL;
            }
        }
    }

    static {
        int[] iArr = {3, 2, 1, 0, -1, -2, -3};
        int[] iArr2 = {54804, 219216, 493236, 876864, 1370101, 1972945, 2685398};
    }
}
