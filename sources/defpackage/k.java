package defpackage;

import java.io.IOException;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:k.class */
public final class k extends w {
    public Image m;
    public Image n;
    public Image o;
    public Image p;
    public int[] q;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public int bz;
    public int bA;
    public int bB;
    public int bC;
    public int bD;
    public int bE;
    public int[] r;
    public ai i;
    public ai j;
    public ai k;
    public int bF;
    public int bG;
    public int bH;
    public int bI;
    public int bJ;

    /* renamed from: i, reason: collision with other field name */
    public boolean f155i;
    private r[] a;
    private int[] s;

    /* renamed from: a, reason: collision with other field name */
    private String[][] f156a;
    private int[][] c;
    private byte[][] b;
    private ai g;

    public k(t tVar) {
        super(tVar);
        this.q = new int[10];
        this.i = new ai();
        this.j = new ai();
        this.k = new ai();
        this.g = new ai();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int[], int[][]] */
    public final void a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        this.bv = i;
        this.bw = i2;
        this.bJ = 0;
        this.bx = i3;
        this.by = i4;
        this.f155i = z;
        int i5 = i2 + (z ? 1 : 0);
        this.a = new r[i5];
        this.s = new int[i5];
        this.f156a = new String[i5];
        this.c = new int[i5];
        this.r = new int[i];
        this.b = new byte[i2][i];
        for (int i6 = 0; i6 < i5; i6++) {
            c(i6, this.q[2], i);
        }
    }

    public final void H() {
        this.a = null;
        this.s = null;
        this.f156a = (String[][]) null;
        this.c = (int[][]) null;
        this.r = null;
        this.b = (byte[][]) null;
    }

    public static boolean m() {
        return true;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        int iStringWidth;
        int iStringWidth2;
        this.bz = 0;
        this.bA = 0;
        for (int i = 0; i < this.bv; i++) {
            this.r[i] = 0;
        }
        int i2 = 0;
        if (this.f155i) {
            r rVarA = a(this.bw);
            i2 = rVarA.cx + this.by;
            for (int i3 = 0; i3 < this.bv; i3++) {
                String str = this.f156a[this.bw][i3];
                if (str != null && (iStringWidth2 = rVarA.stringWidth(str)) > this.r[i3]) {
                    this.r[i3] = iStringWidth2;
                }
            }
        }
        for (int i4 = 0; i4 < this.bw; i4++) {
            r rVarA2 = a(i4);
            for (int i5 = 0; i5 < this.bv; i5++) {
                String str2 = this.f156a[i4][i5];
                if (str2 != null && (iStringWidth = rVarA2.stringWidth(str2)) > this.r[i5]) {
                    this.r[i5] = iStringWidth;
                }
            }
            this.bA += rVarA2.cx + this.by;
        }
        for (int i6 = 0; i6 < this.bv; i6++) {
            this.bz += this.r[i6] + this.bx;
        }
        this.bA += i2;
        this.i.c(0, 0, this.bz, this.bA);
        if (this.bz > B()) {
            this.i.gh = B();
            this.bu |= 8;
        }
        if (this.bA > C()) {
            this.i.gi = C();
            this.bu |= 16;
        }
        if ((this.bu & 8) != 0 && (this.bu & 32) == 0 && (this.bu & 16) != 0) {
            this.i.gh -= 9;
        }
        if ((this.bu & 16) != 0 && (this.bu & 32) == 0 && (this.bu & 8) != 0) {
            this.i.gi -= 9;
        }
        if ((this.bu & 8) != 0) {
            this.bF = (this.i.gh * (this.i.gh - 18)) / this.bz;
            this.bG = 0;
            this.j.c(0, this.i.gi, this.i.gh, 9);
        }
        if ((this.bu & 16) != 0) {
            this.bH = (this.i.gi * (this.i.gi - 18)) / this.bA;
            this.bI = 0;
            this.k.c(this.i.gh, 0, 9, this.i.gi);
        }
        if (z || z2) {
            this.g.h(this.i);
            if ((this.bu & 8) != 0 && (this.bu & 32) == 0) {
                this.g.gi += 9;
            }
            if ((this.bu & 16) != 0 && (this.bu & 32) == 0) {
                this.g.gh += 9;
            }
            int iB = B();
            int iC = C();
            if (!z || this.g.gh > iB) {
                this.g.gh = iB;
            }
            if (!z2 || this.g.gi > iC) {
                this.g.gi = iC;
            }
            r(this.g.gh, this.g.gi);
        }
        if (z3) {
            this.bB = 0;
            this.bC = 0;
            this.bD = 0;
            this.bE = 0;
        }
        l(0, 0);
    }

    public final int b() {
        if (this.f155i) {
            return this.bw;
        }
        return -1;
    }

    public final void j(int i, int i2) {
        this.q[i] = i2;
    }

    public final void w(int i) {
        this.bu |= i;
    }

    public final void x(int i) {
        this.bu &= i ^ (-1);
    }

    private void k(int i, int i2) {
        int i3 = !this.f155i ? 0 : a(this.bw).cx + this.by;
        this.bB = Math.max(t.d(i, 0, this.bv - 1), 0);
        this.bC = Math.max(t.d(i2, 0, this.bw - 1), 0);
        while (true) {
            this.bD = c(this.bB, this.i.gh);
            this.bE = d(this.bC, this.i.gi - i3);
            if (this.bB > 0) {
                int i4 = 0;
                for (int i5 = 0; i5 <= this.bD - this.bB; i5++) {
                    i4 += this.r[this.bB + i5] + this.bx;
                }
                if (i4 + this.r[this.bB - 1] + (this.bx >> 1) <= this.i.gh) {
                    this.bB--;
                }
            }
            if (this.bC <= 0) {
                break;
            }
            int i6 = 0;
            for (int i7 = 0; i7 <= this.bE - this.bC; i7++) {
                i6 += this.a[this.bC + i7].cx + this.by;
            }
            if (i6 + this.a[this.bC - 1].cx + this.by > this.i.gi - i3) {
                break;
            } else {
                this.bC--;
            }
        }
        if ((this.bu & 8) != 0) {
            int i8 = (this.i.gh - this.bF) - 18;
            int i9 = this.bv - ((this.bD - this.bB) + 1);
            if (i9 != 0) {
                this.bG = (this.bB * i8) / i9;
            } else {
                this.bG = 0;
            }
        }
        if ((this.bu & 16) != 0) {
            int i10 = (this.i.gi - this.bH) - 18;
            int i11 = this.bw - ((this.bE - this.bC) + 1);
            if (i11 != 0) {
                this.bI = (this.bC * i10) / i11;
            } else {
                this.bI = 0;
            }
        }
        for (int i12 = 0; i12 < this.bw; i12++) {
            for (int i13 = 0; i13 < this.bv; i13++) {
                if ((this.b[i12][i13] & 1) != 0 && (i12 < this.bC || i12 > this.bE || i13 < this.bB || i13 > this.bD)) {
                    this.f156a[i12][i13] = null;
                }
            }
        }
        repaint();
    }

    public final void l(int i, int i2) {
        k(this.bB + i, this.bC + i2);
    }

    public final int c(int i) {
        if (i >= 0 && i < this.bw) {
            this.bJ = i;
        }
        return this.bJ;
    }

    private int c(int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < this.bv; i4++) {
            i3 += this.r[i4] + this.bx;
            if (i2 < i3) {
                return i4;
            }
        }
        return this.bv - 1;
    }

    private int d(int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < this.bw; i4++) {
            i3 += this.a[i4].cx + this.by;
            if (i2 < i3) {
                return i4;
            }
        }
        return this.bw - 1;
    }

    @Override // defpackage.w
    public final void b(af afVar) {
        int i;
        int i2;
        afVar.translate(v(), w());
        afVar.aV();
        if (afVar.a(this.i)) {
            a(afVar, this.i, 0);
            if ((this.bu & 2) != 0) {
                this.g.eF = 0;
                this.g.eG = 0;
                this.g.gh = this.bz;
                if (this.f155i) {
                    this.g.eG += a(this.bw).cx + this.by;
                }
                for (int i3 = this.bC; i3 <= this.bE; i3++) {
                    this.g.gi = a(i3).cx + this.by;
                    if ((i3 & 1) != 0) {
                        a(afVar, this.g, 8);
                    }
                    this.g.eG += this.g.gi;
                }
            }
            if ((this.bu & 4) != 0) {
                this.g.eF = 0;
                this.g.eG = 0;
                this.g.gi = this.bA;
                for (int i4 = this.bB; i4 <= this.bD; i4++) {
                    this.g.gh = this.r[i4] + this.bx;
                    if ((i4 & 1) != 0) {
                        a(afVar, this.g, 9);
                    }
                    this.g.eF += this.g.gh;
                }
            }
            if (((this.bu & 1) != 0 || (this.bu & 64) != 0) && this.bJ >= this.bC && this.bJ <= this.bE) {
                this.g.eF = 1;
                this.g.eG = 0;
                this.g.gh = this.bz - 2;
                if (this.f155i) {
                    this.g.eG += a(this.bw).cx + this.by;
                }
                this.g.gi = a(this.bC).cx + this.by;
                this.g.eG += this.g.gi * (this.bJ - this.bC);
                if ((this.bu & 1) != 0) {
                    a(afVar, this.g, 6);
                }
                b(afVar, this.g, 7);
            }
            int i5 = 0;
            for (int i6 = this.bB; i6 <= this.bD; i6++) {
                int i7 = 0;
                if (this.f155i) {
                    r rVarA = a(this.bw);
                    String str = this.f156a[this.bw][i6];
                    if (str != null) {
                        int iStringWidth = rVarA.stringWidth(str);
                        int i8 = this.by >> 1;
                        switch (this.c[this.bw][i6]) {
                            case -1:
                                i2 = i5 + (this.bx >> 1);
                                break;
                            case 0:
                            default:
                                i2 = i5 + (((this.bx + this.r[i6]) - iStringWidth) >> 1);
                                break;
                            case 1:
                                i2 = ((i5 + (this.bx >> 1)) + this.r[i6]) - iStringWidth;
                                break;
                        }
                        rVarA.a(afVar, str, i2, i8);
                    }
                    i7 = 0 + rVarA.cx + this.by;
                }
                for (int i9 = this.bC; i9 <= this.bE; i9++) {
                    r rVar = this.a[i9];
                    String str2 = this.f156a[i9][i6];
                    if (str2 != null) {
                        int iStringWidth2 = rVar.stringWidth(str2);
                        int i10 = i7 + (this.by >> 1);
                        switch (this.c[i9][i6]) {
                            case -1:
                                i = i5 + (this.bx >> 1);
                                break;
                            case 0:
                            default:
                                i = i5 + (((this.bx + this.r[i6]) - iStringWidth2) >> 1);
                                break;
                            case 1:
                                i = ((i5 + (this.bx >> 1)) + this.r[i6]) - iStringWidth2;
                                break;
                        }
                        rVar.a(afVar, str2, i, i10);
                    }
                    i7 += rVar.cx + this.by;
                }
                i5 += this.r[i6] + this.bx;
            }
            b(afVar, this.i, 1);
        }
        afVar.aW();
        if ((this.bu & 8) != 0 && (this.bu & 32) == 0) {
            afVar.aV();
            if (afVar.a(this.j)) {
                a(afVar, this.j, 4);
                afVar.a(this.o, this.j.eF + 1, this.j.eG + 1);
                afVar.a(this.p, (this.j.eF + this.j.gh) - (this.p.getWidth() + 1), this.j.eG + 1);
                this.g.c(this.j.eF + 9 + this.bG, this.j.eG, this.bF, 9);
                a(afVar, this.g, 5);
                b(afVar, this.j, 3);
            }
            afVar.aW();
        }
        if ((this.bu & 16) != 0 && (this.bu & 32) == 0) {
            afVar.aV();
            if (afVar.a(this.k)) {
                a(afVar, this.k, 4);
                afVar.a(this.m, this.k.eF + 1, this.k.eG + 1);
                afVar.a(this.n, this.k.eF + 1, (this.k.eG + this.k.gi) - (this.n.getHeight() + 1));
                this.g.c(this.k.eF, this.k.eG + 9 + this.bI, 9, this.bH);
                a(afVar, this.g, 5);
                b(afVar, this.k, 3);
            }
            afVar.aW();
        }
        afVar.translate(-v(), -w());
    }

    @Override // defpackage.w
    public final void f() throws IOException {
        this.m = t.m44a(309, 16);
        this.n = t.m44a(309, 17);
        this.o = t.m44a(309, 18);
        this.p = t.m44a(309, 19);
    }

    @Override // defpackage.w
    public final void g() {
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        H();
    }

    private void a(af afVar, ai aiVar, int i) {
        afVar.b(aiVar, this.q[i]);
    }

    private void b(af afVar, ai aiVar, int i) {
        afVar.a(aiVar, this.q[i]);
    }

    private void c(int i, int i2, int i3) throws IOException {
        this.s[i] = i2;
        this.f156a[i] = new String[i3];
        this.c[i] = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.f156a[i][i4] = null;
            this.c[i][i4] = 0;
        }
    }

    public final void a(int i, int i2, String str) throws IOException {
        this.f156a[i][i2] = null;
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f156a[i][i2] = new String(str);
    }

    public final void d(int i, int i2, int i3) throws IOException {
        a(i, i2, t.getString(i3));
    }

    public final String a(int i, int i2) {
        return this.f156a[i][i2];
    }

    public final void e(int i, int i2, int i3) {
        this.c[i][i2] = i3;
    }

    private r a(int i) {
        return this.a[i];
    }

    public final void a(int i, r rVar) {
        this.a[i] = rVar;
    }

    public final void a(int i, int i2, byte b, boolean z) {
        if (z) {
            byte[] bArr = this.b[i];
            bArr[i2] = (byte) (bArr[i2] | b);
        } else {
            byte[] bArr2 = this.b[i];
            bArr2[i2] = (byte) (bArr2[i2] & (b ^ (-1)));
        }
    }
}
