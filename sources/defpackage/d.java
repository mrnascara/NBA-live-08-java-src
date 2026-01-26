package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:d.class */
public final class d {
    public int m;
    public h[] a;
    public int n;

    public final void a(t tVar, int i) throws IOException {
        DataInputStream dataInputStreamM48a = t.m48a(316, i);
        this.m = dataInputStreamM48a.readInt();
        this.a = new h[this.m];
        for (int i2 = 0; i2 < this.m; i2++) {
            h hVar = new h(this);
            hVar.bn = dataInputStreamM48a.readByte();
            hVar.bo = dataInputStreamM48a.readInt();
            hVar.bp = dataInputStreamM48a.readByte();
            hVar.bq = dataInputStreamM48a.readInt();
            this.a[i2] = hVar;
        }
    }

    public final int a(int i, int i2) {
        this.n = 0;
        int i3 = -1;
        if (i >= i2) {
            for (int i4 = 0; i4 < this.m; i4++) {
                if (this.a[i4].bo == i) {
                    if (i3 == -1) {
                        this.n = i4;
                    }
                    i3 = i4;
                }
            }
            return (i3 - this.n) + 1;
        }
        for (int i5 = 0; i5 < this.m; i5++) {
            if (this.a[i5].bo >= i && this.a[i5].bo < i2) {
                if (i3 == -1) {
                    this.n = i5;
                }
                i3 = i5;
            }
        }
        return (i3 - this.n) + 1;
    }

    public final h a(int i) {
        return this.a[this.n + i];
    }
}
