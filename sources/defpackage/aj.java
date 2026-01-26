package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:aj.class */
public final class aj {
    public int gj = 0;
    public o[] a = null;

    public final void b(t tVar) throws IOException {
        ab abVar = new ab();
        this.gj = 2;
        this.a = new o[this.gj];
        for (int i = 0; i < this.gj; i++) {
            this.a[i] = new o(this);
            DataInputStream dataInputStreamM48a = t.m48a(316, 7 + i);
            this.a[i].cl = dataInputStreamM48a.readShort();
            this.a[i].cm = dataInputStreamM48a.readShort();
            this.a[i].a = null;
            if (this.a[i].cl > 0) {
                this.a[i].a = new p[this.a[i].cl];
                for (int i2 = 0; i2 < this.a[i].cl; i2++) {
                    p pVar = new p(this);
                    pVar.R.eF = dataInputStreamM48a.readInt();
                    pVar.R.eG = dataInputStreamM48a.readInt();
                    pVar.cn = dataInputStreamM48a.readInt();
                    pVar.co = t.e(pVar.cn, pVar.cn);
                    abVar.eF = 833867 - pVar.R.eF;
                    abVar.eG = pVar.R.eG;
                    pVar.cp = abVar.length();
                    this.a[i].a[i2] = pVar;
                }
            }
            for (int i3 = 0; i3 < 5; i3++) {
                dataInputStreamM48a.readByte();
                this.a[i].v[i3] = dataInputStreamM48a.readShort();
            }
            this.a[i].f161a = new d[this.a[i].cm];
            for (int i4 = 0; i4 < this.a[i].cm; i4++) {
                this.a[i].f161a[i4] = new d();
                this.a[i].f161a[i4].a(tVar, dataInputStreamM48a.readShort());
            }
        }
    }

    public final void as() {
        for (int i = 0; i < this.gj; i++) {
            this.a[i] = null;
        }
        this.a = null;
    }

    public final int h(int i, int i2) {
        return this.a[i].a[i2].co;
    }

    public final void a(int i, int i2, ab abVar) {
        abVar.h(this.a[i].a[i2].R.eF, 0, this.a[i].a[i2].R.eG);
    }

    public final int L(int i) {
        if (i < this.gj) {
            return this.a[i].cl;
        }
        return 0;
    }

    public final int i(int i, int i2) {
        return this.a[i].v[i2];
    }

    public final d a(int i, int i2) {
        return this.a[i].f161a[i2];
    }

    public final int M(int i) {
        return this.a[i].cm;
    }
}
