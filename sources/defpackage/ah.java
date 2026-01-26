package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ah.class */
public final class ah {
    public short[] h;
    public short[] i;
    public short[] j;
    public short[] k;
    public short[] l;
    public short[] m;
    public short[] n;
    public short[] o;
    public short[] p;
    public short[] q;
    public short[] r;
    public short[] s;
    public short[] t;
    public short[] u;
    public byte[] e;
    public byte[] f;
    public byte[][] d;

    /* renamed from: e, reason: collision with other field name */
    public byte[][] f43e;

    /* renamed from: f, reason: collision with other field name */
    public byte[][] f44f;
    public byte[][] g;
    public int gf;
    public int gg;

    /* JADX WARN: Type inference failed for: r1v88, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v91, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v94, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v97, types: [byte[], byte[][]] */
    public ah(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readByte();
        dataInputStream.readByte();
        dataInputStream.readByte();
        boolean z = dataInputStream.readByte() == 0;
        this.gf = dataInputStream.readByte();
        this.gg = dataInputStream.readByte();
        if (this.gf < 0) {
            this.gf += 256;
        }
        if (this.gg < 0) {
            this.gg += 256;
        }
        this.h = new short[this.gf];
        this.i = new short[this.gf];
        this.j = new short[this.gf];
        this.k = new short[this.gf];
        this.l = new short[this.gf];
        this.m = new short[this.gf];
        this.n = new short[this.gf];
        this.o = new short[this.gf];
        this.p = new short[this.gf];
        this.q = new short[this.gf];
        for (int i = 0; i < this.gf; i++) {
            this.h[i] = dataInputStream.readShort();
        }
        for (int i2 = 0; i2 < this.gf; i2++) {
            this.i[i2] = dataInputStream.readShort();
        }
        for (int i3 = 0; i3 < this.gf; i3++) {
            this.j[i3] = dataInputStream.readShort();
        }
        for (int i4 = 0; i4 < this.gf; i4++) {
            this.k[i4] = dataInputStream.readShort();
        }
        for (int i5 = 0; i5 < this.gf; i5++) {
            this.l[i5] = dataInputStream.readShort();
        }
        for (int i6 = 0; i6 < this.gf; i6++) {
            this.m[i6] = dataInputStream.readShort();
        }
        for (int i7 = 0; i7 < this.gf; i7++) {
            this.n[i7] = dataInputStream.readShort();
        }
        for (int i8 = 0; i8 < this.gf; i8++) {
            this.o[i8] = dataInputStream.readShort();
        }
        for (int i9 = 0; i9 < this.gf; i9++) {
            this.p[i9] = dataInputStream.readShort();
        }
        for (int i10 = 0; i10 < this.gf; i10++) {
            this.q[i10] = dataInputStream.readShort();
        }
        if (z) {
            for (int i11 = 0; i11 < this.gf; i11++) {
                this.h[i11] = t.a(this.h[i11]);
                this.i[i11] = t.a(this.i[i11]);
                this.j[i11] = t.a(this.j[i11]);
                this.k[i11] = t.a(this.k[i11]);
                this.l[i11] = t.a(this.l[i11]);
                this.m[i11] = t.a(this.m[i11]);
                this.n[i11] = t.a(this.n[i11]);
                this.o[i11] = t.a(this.o[i11]);
                this.p[i11] = t.a(this.p[i11]);
                this.q[i11] = t.a(this.q[i11]);
            }
        }
        if (this.gg > 0) {
            this.r = new short[this.gg];
            this.s = new short[this.gg];
            this.t = new short[this.gg];
            this.u = new short[this.gg];
            this.e = new byte[this.gg];
            this.f = new byte[this.gg];
            for (int i12 = 0; i12 < this.gg; i12++) {
                this.r[i12] = dataInputStream.readShort();
            }
            for (int i13 = 0; i13 < this.gg; i13++) {
                this.s[i13] = dataInputStream.readShort();
            }
            for (int i14 = 0; i14 < this.gg; i14++) {
                this.t[i14] = dataInputStream.readShort();
            }
            for (int i15 = 0; i15 < this.gg; i15++) {
                this.u[i15] = dataInputStream.readShort();
            }
            for (int i16 = 0; i16 < this.gg; i16++) {
                this.e[i16] = dataInputStream.readByte();
            }
            for (int i17 = 0; i17 < this.gg; i17++) {
                this.f[i17] = dataInputStream.readByte();
            }
            if (z) {
                for (int i18 = 0; i18 < this.gg; i18++) {
                    this.r[i18] = t.a(this.r[i18]);
                    this.s[i18] = t.a(this.s[i18]);
                    this.t[i18] = t.a(this.t[i18]);
                    this.u[i18] = t.a(this.u[i18]);
                }
            }
            this.d = new byte[this.gg];
            this.f43e = new byte[this.gg];
            this.f44f = new byte[this.gg];
            this.g = new byte[this.gg];
            for (int i19 = 0; i19 < this.gg; i19++) {
                int i20 = this.e[i19];
                this.d[i19] = new byte[i20];
                this.f43e[i19] = new byte[i20];
                this.f44f[i19] = new byte[i20];
                this.g[i19] = new byte[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    this.d[i19][i21] = dataInputStream.readByte();
                }
                for (int i22 = 0; i22 < i20; i22++) {
                    this.f43e[i19][i22] = dataInputStream.readByte();
                }
                for (int i23 = 0; i23 < i20; i23++) {
                    this.f44f[i19][i23] = dataInputStream.readByte();
                }
                for (int i24 = 0; i24 < i20; i24++) {
                    this.g[i19][i24] = dataInputStream.readByte();
                }
            }
        }
    }
}
