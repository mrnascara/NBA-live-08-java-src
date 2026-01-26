package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:l.class */
public final class l extends u {
    private r j;
    private ai l;
    private ai m;
    private int bK;
    private int bL;
    private String g;
    private int[] t;
    private int bM;
    private int bN;
    private int bO;
    private int bP;
    private int bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bd;
    private int be;
    private int bf;
    private int bg;
    private int bh;
    private int bl;
    private int bY;
    private int bi;
    private int bm;

    public l(t tVar) {
        super(tVar, 0);
        this.l = new ai();
        this.m = new ai();
        this.t = new int[200];
        this.dL = 4;
    }

    @Override // defpackage.u, defpackage.w
    public final void c(DataInputStream dataInputStream) throws IOException {
        g(dataInputStream);
        this.dk = 0;
        this.bX = dataInputStream.readShort();
        this.bd = dataInputStream.readShort();
        this.be = dataInputStream.readShort();
        this.bf = dataInputStream.readShort();
        this.bg = dataInputStream.readShort();
        this.bh = dataInputStream.readShort();
        this.bK = dataInputStream.readInt();
        this.bL = dataInputStream.readInt();
        this.bi = dataInputStream.readShort();
        this.bM = dataInputStream.readInt();
        this.bP = dataInputStream.readInt();
        this.bN = dataInputStream.readInt();
        this.bO = dataInputStream.readInt();
        this.bl = dataInputStream.readShort();
        this.bY = dataInputStream.readShort();
        this.bm = this.bl;
    }

    @Override // defpackage.u, defpackage.w
    public final void f() throws IOException {
        int iA;
        int i;
        super.f();
        this.j = ((w) this).d.m52a(this.bd, this.bX, this.bf, this.be, this.bh, this.bg);
        this.bQ = 0;
        this.bR = 0;
        this.bU = B() - 6;
        if (this.bl != -1) {
            z(this.bl);
        }
        this.bT = this.j.cx + this.bY;
        this.bS = ((C() + this.bY) - 6) / this.bT;
        if (this.g == null) {
            return;
        }
        if (g(8)) {
            this.bU -= 5;
            iA = a(this.g);
        } else {
            iA = a(this.g);
            if (this.bR > this.bS && !g(4)) {
                this.bU -= 5;
                iA = a(this.g);
            }
        }
        if (g(2) && (i = ((this.bT * this.bR) + 6) - this.bY) < C()) {
            this.bS = this.bR;
            r(B(), i);
        }
        if (g(1)) {
            this.bU = iA;
            int i2 = iA + 6;
            if (n() && !g(4)) {
                i2 += 5;
            }
            if (i2 < B()) {
                r(i2, C());
            }
        }
        this.bW = this.bV;
    }

    @Override // defpackage.u, defpackage.w
    public final void g() throws IOException {
        this.g = null;
        this.j = null;
        this.bl = this.bm;
    }

    @Override // defpackage.u, defpackage.w
    public final void b(af afVar) {
        super.b(afVar);
        afVar.translate(this.x.eF, this.x.eG);
        afVar.translate(this.w.eF, this.w.eG);
        int i = 3;
        int i2 = this.bQ + this.bS;
        int i3 = i2;
        if (i2 > this.bR) {
            i3 = this.bR;
        }
        int i4 = 0;
        for (int i5 = this.bQ; i5 < i3 && this.g.length() != this.t[i5]; i5++) {
            if (this.g.charAt(this.t[i5]) != '$') {
                int i6 = this.t[i5];
                int i7 = this.t[i5 + 1];
                if (i7 == 0) {
                    break;
                }
                int i8 = i7 - i6;
                while (this.g.charAt((this.t[i5] + i8) - 1) == '$') {
                    i8--;
                }
                int i9 = i4 + i8;
                i4 = i9;
                if (i9 > this.bW) {
                    int i10 = i8 - (i4 - this.bW);
                    i8 = i10;
                    if (i10 <= 0) {
                        break;
                    }
                }
                a(afVar, 3, i, this.t[i5], i8);
            }
            i += this.bT;
        }
        if (!g(4) && n()) {
            int iC = C() - 6;
            this.l.c(B() - 5, 3, 3, iC);
            this.m.h(this.l);
            this.m.gi = (this.bS * iC) / this.bR;
            this.m.gi = Math.max(this.m.gi, 1);
            if (this.bQ + this.bS == this.bR) {
                this.m.eG = (this.l.eG + this.l.gi) - this.m.gi;
            } else {
                this.m.eG = ((iC * this.bQ) / this.bR) + 3;
            }
            afVar.b(this.l, this.bO);
            afVar.b(this.m, this.bN);
        }
        afVar.translate(-this.w.eF, -this.w.eG);
        afVar.translate(-this.x.eF, -this.x.eG);
    }

    private void y(int i) {
        int iMax = Math.max(0, this.bR - this.bS);
        int i2 = this.bQ;
        this.bQ = t.d(i, 0, iMax);
        if (i2 != this.bQ) {
            repaint();
        }
    }

    public final void I() {
        y(this.bQ + 1);
    }

    public final void J() {
        y(this.bQ - 1);
    }

    public final void setText(String str) {
        this.bl = -1;
        int iIndexOf = str.indexOf("%version");
        if (iIndexOf >= 0) {
            this.g = new StringBuffer().append(str.substring(0, iIndexOf)).append(((w) this).d.f164a.getAppProperty("MIDlet-Version")).append(str.substring(iIndexOf + 8)).toString();
        } else {
            this.g = str;
        }
        if (this.g != null) {
            this.bV = this.g.length();
        } else {
            this.bV = 0;
        }
    }

    public final void z(int i) {
        this.bl = i;
        setText(t.getString(this.bl));
    }

    private boolean g(int i) {
        return (this.bL & i) > 0;
    }

    private boolean n() {
        return this.bR > this.bS;
    }

    private int a(String str) {
        int i;
        for (int i2 = 0; i2 < 200; i2++) {
            this.t[i2] = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        int i7 = (this.bK & 1) != 0 ? 0 + 1 : 0;
        if ((this.bK & 2) != 0) {
            i7 += 2;
        }
        int i8 = 1;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) == '$') {
                this.t[i8] = i9 + 1;
                i8++;
                i5++;
            }
        }
        int[] iArr = new int[i5 + 1];
        for (int i10 = 0; i10 < i5; i10++) {
            iArr[i10] = this.t[i10];
        }
        int i11 = i5 + 1;
        iArr[i11 - 1] = str.length();
        this.bR = 0;
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            this.t[this.bR] = iArr[i12];
            this.bR++;
            int i13 = iArr[i12];
            int i14 = i13;
            int iA = a(i14, Math.min(i13 + i4, iArr[i12 + 1] - 1), str, i7);
            while (true) {
                int i15 = iA;
                if (i14 < iArr[i12 + 1]) {
                    int iStringWidth = 0;
                    int i16 = 0;
                    int i17 = i14;
                    while (i15 < iArr[i12 + 1] && iStringWidth < this.bU) {
                        i15++;
                        if ((i15 < str.length() && str.charAt(i15) == ' ') || i15 == iArr[i12 + 1] - 1) {
                            iStringWidth += this.j.stringWidth(str.substring(i17, i15)) + i7;
                            i17 = i15;
                            if (iStringWidth < this.bU) {
                                i6 = iStringWidth;
                                i16 = i15;
                            }
                        }
                    }
                    if (i16 == 0 || i15 >= iArr[i12 + 1]) {
                        int i18 = i15;
                        if (i15 != str.length()) {
                            i18--;
                        }
                        int iStringWidth2 = this.j.stringWidth(str.substring(this.t[this.bR - 1], i18)) + i7;
                        i6 = iStringWidth2;
                        if (iStringWidth2 > i3) {
                            i3 = i6;
                        }
                        i = i15;
                    } else {
                        this.t[this.bR] = i16 + 1;
                        if (i6 > i3) {
                            i3 = i6;
                            i4 = this.t[this.bR] - this.t[this.bR - 1];
                        }
                        this.bR++;
                        i = i16;
                    }
                    i14 = i + 1;
                    iA = a(i14, Math.min(i14 + i4, iArr[i12 + 1] - 1), str, i7);
                }
            }
        }
        this.t[this.bR] = str.length();
        return i3;
    }

    private int a(int i, int i2, String str, int i3) {
        int iStringWidth = 0;
        int i4 = -1;
        while (true) {
            if (i2 <= i) {
                break;
            }
            if (str.charAt(i2) == ' ') {
                iStringWidth = i4 == -1 ? this.j.stringWidth(str.substring(i, i2)) + i3 : iStringWidth - (this.j.stringWidth(str.substring(i2, i4)) + i3);
                i4 = i2;
                if (iStringWidth < this.bU) {
                    i2--;
                    break;
                }
            }
            i2--;
        }
        return i2;
    }

    private void a(af afVar, int i, int i2, int i3, int i4) {
        int iStringWidth = this.j.stringWidth(this.g.substring(i3, i4 + i3));
        if (this.g != null) {
            int i5 = i;
            switch (this.bi) {
                case 1:
                    i5 += ((this.bU - iStringWidth) + 1) >> 1;
                    break;
                case 2:
                    i5 += this.bU - iStringWidth;
                    break;
            }
            this.j.a(afVar, this.g.substring(i3, i4 + i3), i5 - 1, i2 + 2);
        }
    }
}
