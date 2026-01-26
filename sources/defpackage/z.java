package defpackage;

import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:z.class */
public final class z extends u {
    private u d;
    private String h;
    private String i;

    /* renamed from: d, reason: collision with other field name */
    private String[] f199d;
    private int[] U;
    private int bJ;
    private int eu;
    private boolean S;
    private r k;
    private r l;
    private int ev;
    private ai y;
    private ai g;

    public z(t tVar) {
        super(tVar, 0);
        this.f199d = new String[5];
        this.U = new int[5];
        this.y = new ai();
        this.g = new ai();
        new ai();
        this.dM = 1003;
        this.f199d[0] = t.getString(142);
        this.f199d[1] = t.getString(143);
        String[] strArr = this.f199d;
        this.f199d[3] = null;
        strArr[2] = null;
        this.eu = 2;
        this.bJ = 0;
        this.S = false;
    }

    @Override // defpackage.u, defpackage.w
    public final void f() throws IOException {
        super.f();
        int i = this.eu * 17;
        if (this.h != null) {
            i += 17;
        }
        if (this.i != null) {
            i += 17;
        }
        q(160, i + 24);
        m mVar = (m) ((w) this).d;
        this.k = mVar.a(8, 12, 9);
        this.l = mVar.a(8, 14, 9);
        this.ev = 96;
        for (int i2 = 0; i2 < this.eu; i2++) {
            if (this.k.stringWidth(this.f199d[i2]) + 4 > this.ev) {
                this.ev = this.k.stringWidth(this.f199d[i2]) + 4;
            }
        }
        this.y.c((B() - this.ev) >> 1, G(this.bJ), this.ev, 15);
    }

    @Override // defpackage.u, defpackage.w
    public final void g() throws IOException {
        super.g();
    }

    @Override // defpackage.u
    public final boolean a(int i, int i2) throws IOException {
        switch (i2) {
            case 131072:
                this.bJ--;
                if (this.bJ < 0) {
                    this.bJ = this.eu - 1;
                }
                int iB = (B() - this.ev) >> 1;
                int iG = G(this.bJ);
                aO();
                this.y.c(iB, iG, this.ev, 15);
                aO();
                repaint();
                break;
            case 262144:
                this.bJ++;
                if (this.bJ >= this.eu) {
                    this.bJ = 0;
                }
                int iB2 = (B() - this.ev) >> 1;
                int iG2 = G(this.bJ);
                aO();
                this.y.c(iB2, iG2, this.ev, 15);
                aO();
                repaint();
                break;
            case 524288:
            case 134217728:
                this.S = true;
                repaint();
                break;
        }
        return true;
    }

    @Override // defpackage.u
    public final boolean b(int i, int i2) throws IOException {
        switch (i2) {
            case 524288:
            case 134217728:
                if (this.S) {
                    this.d.c(0 + this.bJ, this.U[this.bJ]);
                    this.S = false;
                    close();
                    break;
                }
                break;
            case 268435456:
                this.d.c(5, 0);
                close();
                break;
        }
        return true;
    }

    @Override // defpackage.u, defpackage.w
    public final void b(af afVar) {
        super.b(afVar);
        int iV = v() + z();
        int iW = w() + A();
        afVar.translate(iV, iW);
        int i = 12;
        if (this.h != null) {
            this.l.a(afVar, this.h, (B() - this.k.stringWidth(this.h)) >> 1, 12);
        }
        if (this.i != null) {
            i = 12 + 17;
            this.l.a(afVar, this.i, (B() - this.k.stringWidth(this.i)) >> 1, 29);
        }
        int i2 = ((15 - this.k.cx) + 1) >> 1;
        int i3 = i + 17;
        for (int i4 = 0; i4 < this.eu; i4++) {
            this.g.c((B() - this.ev) >> 1, i3, this.ev, 15);
            if (this.bJ == i4) {
                afVar.b(this.g, -11240008);
            }
            String str = this.f199d[i4];
            if (str != null) {
                this.k.a(afVar, str, (B() - this.k.stringWidth(str)) >> 1, i3 + i2);
            }
            i3 += 17;
        }
        afVar.translate(-iV, -iW);
        ((m) ((w) this).d).a(afVar, true, true);
    }

    @Override // defpackage.u
    public final void h(int i) throws IOException {
    }

    private void close() {
        ((w) this).d.c(this);
    }

    public final void z(int i, int i2) {
        a(i > -1 ? t.getString(i) : null, i2 > -1 ? t.getString(i2) : null);
    }

    public final void a(String str, String str2) {
        if (str != null) {
            this.h = new String(str);
        } else {
            this.h = null;
        }
        if (str2 != null) {
            this.i = new String(str2);
        } else {
            this.i = null;
        }
    }

    public final void e(u uVar) {
        this.d = uVar;
        setPosition((this.d.B() - x()) >> 1, (this.d.C() - y()) >> 1);
    }

    public final void Q(int i) {
        this.bJ = i;
        this.y.c((B() - this.ev) >> 1, 55 + (this.bJ * 17), this.ev, 15);
    }

    private void aO() {
        c(this.y);
    }

    public final void g(int i, int i2, int i3) {
        a(t.getString(i), i2, i3);
    }

    private void a(String str, int i, int i2) {
        this.f199d[i] = str;
        this.U[i] = i2;
        this.eu = Math.max(this.eu, i + 1);
    }

    private int G(int i) {
        return 12 + (17 * (this.i != null ? 2 : 1)) + (17 * i);
    }
}
