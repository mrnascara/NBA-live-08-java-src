package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:v.class */
public final class v {

    /* renamed from: c, reason: collision with other field name */
    public t f187c;
    public int dC;
    public int dD;
    public int dE;
    public int dF;

    /* renamed from: a, reason: collision with other field name */
    public q[] f188a;

    /* renamed from: d, reason: collision with other field name */
    public byte[] f190d;
    public int dG;
    public int dH;

    /* renamed from: b, reason: collision with other field name */
    private DataInputStream f191b;
    private int[] O;
    private int dK;
    public static int dn = 0;

    /* renamed from: do, reason: not valid java name */
    public static int f183do = 1;
    public static int dp = 2;
    public static int dq = 3;
    public static int dr = 4;
    public static int ds = 5;
    public static int dt = 6;
    public static int du = 7;
    public static int dv = 8;
    public static int dw = 9;
    public static int dx = 10;
    public static int dy = 11;
    public static int dz = 12;
    public static int dA = 13;
    public static int dB = 14;
    private static final int[][] f = {new int[]{65536, 0}, new int[]{0, 65536}, new int[]{-58085, 30353}, new int[]{-58085, -30353}, new int[]{0, -65536}};
    private static final int[] G = {0, 30353, 37424, 30353, 0};
    private static final String[] c = {"exhibition.nba", "season.nba", "playoff.nba"};
    private static ab Z = new ab();
    private static ab aa = new ab();
    private static ab ab = new ab();
    private static ab ac = new ab();
    private int[] H = new int[2];
    private int[][] g = new int[2][15];
    private int[] I = new int[2];
    private int[][] h = new int[2][5];
    private int[][][] a = new int[2][15][17];

    /* renamed from: a, reason: collision with other field name */
    private ad[][] f184a = new ad[2][5];

    /* renamed from: a, reason: collision with other field name */
    private x[][] f185a = new x[2][5];
    private int[][] i = new int[2][5];
    private int[][] j = new int[2][10];
    private int[] J = new int[2];
    private int[][] k = new int[2][5];
    private int[] K = new int[2];
    private int[] L = new int[2];
    private int[] M = new int[22];
    private int[] N = new int[17];
    private short[][] e = {new short[]{0, 0, 0, 0, 0}, new short[]{0, 0, 0, 0, 0}};
    private short[] d = {0, 0};

    /* renamed from: e, reason: collision with other field name */
    private short[] f186e = null;
    private int[][] l = (int[][]) null;
    private int[][] m = (int[][]) null;

    /* renamed from: a, reason: collision with other field name */
    public i f189a = new i(this);
    public i b = new i(this);
    public int[] P = new int[22];
    public int[] Q = new int[22];
    private int[][] n = new int[10][dB];
    private int dI = 0;

    /* renamed from: f, reason: collision with other field name */
    private short[][] f192f = new short[32][18];
    private int dJ = 0;

    public static void a(ad adVar, ad adVar2) {
        adVar2.br = adVar.br;
        adVar2.eL = adVar.eL;
        adVar2.q = adVar.q;
        adVar2.r = adVar.r;
        adVar2.s = adVar.s;
        adVar2.bp = adVar.bp;
        adVar2.eM = adVar.eM;
        adVar2.eN = adVar.eN;
        adVar2.eO = adVar.eO;
        adVar2.eP = adVar.eP;
        adVar2.eQ = adVar.eQ;
        adVar2.eR = adVar.eR;
        adVar2.T = adVar.T;
        adVar2.eS = adVar.eS;
        adVar2.U = adVar.U;
        adVar2.eT = adVar.eT;
        adVar2.eU = adVar.eU;
        adVar2.eV = adVar.eV;
        adVar2.eW = adVar.eW;
        adVar2.eX = adVar.eX;
        adVar2.eY = adVar.eY;
        adVar2.eZ = adVar.eZ;
        adVar2.fa = adVar.fa;
        adVar2.fb = adVar.fb;
        adVar2.fc = adVar.fc;
        adVar2.fd = adVar.fd;
        adVar2.fe = adVar.fe;
        adVar2.ff = adVar.ff;
        adVar2.fg = adVar.fg;
        adVar2.fh = adVar.fh;
        adVar2.fi = adVar.fi;
        adVar2.fj = adVar.fj;
        adVar2.fk = adVar.fk;
        adVar2.fl = adVar.fl;
        adVar2.fm = adVar.fm;
        adVar2.fn = adVar.fn;
        adVar2.fo = adVar.fo;
        adVar2.fp = adVar.fp;
        adVar2.fq = adVar.fq;
        adVar2.fr = adVar.fr;
        adVar2.fs = adVar.fs;
        adVar2.ft = adVar.ft;
        adVar2.fu = adVar.fu;
        adVar2.fv = adVar.fv;
        adVar2.fw = adVar.fw;
        adVar2.fx = adVar.fx;
    }

    public static void a(int[] iArr, DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < 17; i++) {
            iArr[i] = dataInputStream.readShort();
        }
    }

    public static void a(int[] iArr, DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < 17; i++) {
            dataOutputStream.writeShort(iArr[i]);
        }
    }

    private static void b(int[] iArr, DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < 14; i++) {
            iArr[i] = dataInputStream.readShort();
        }
        for (int i2 = 14; i2 < 22; i2++) {
            iArr[i2] = dataInputStream.readByte();
        }
    }

    private static void b(int[] iArr, DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < 14; i++) {
            dataOutputStream.writeShort(iArr[i]);
        }
        for (int i2 = 14; i2 < 22; i2++) {
            dataOutputStream.writeByte(iArr[i2]);
        }
    }

    private static void c(int[] iArr, DataInputStream dataInputStream) throws IOException {
        iArr[dn] = dataInputStream.readInt();
        iArr[f183do] = dataInputStream.readInt();
        for (int i = dp; i < dv; i++) {
            iArr[i] = dataInputStream.readShort();
        }
        iArr[dv] = dataInputStream.readByte();
        for (int i2 = dw; i2 < dB; i2++) {
            iArr[i2] = dataInputStream.readBoolean() ? 1 : 0;
        }
    }

    private static void c(int[] iArr, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(iArr[dn]);
        dataOutputStream.writeInt(iArr[f183do]);
        for (int i = dp; i < dv; i++) {
            dataOutputStream.writeShort(iArr[i]);
        }
        dataOutputStream.writeByte(iArr[dv]);
        for (int i2 = dw; i2 < dB; i2++) {
            dataOutputStream.writeBoolean(iArr[i2] != 0);
        }
    }

    private static void a(short[] sArr, int i, DataInputStream dataInputStream) throws IOException {
        sArr[i + 0] = dataInputStream.readByte();
        sArr[i + 1] = dataInputStream.readByte();
        sArr[i + 2] = dataInputStream.readShort();
        sArr[i + 3] = dataInputStream.readShort();
        for (int i2 = 4; i2 < 18; i2++) {
            sArr[i + i2] = dataInputStream.readByte();
        }
    }

    private static void a(short[] sArr, int i, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(sArr[i + 0]);
        dataOutputStream.writeByte(sArr[i + 1]);
        dataOutputStream.writeShort(sArr[i + 2]);
        dataOutputStream.writeShort(sArr[i + 3]);
        for (int i2 = 4; i2 < 18; i2++) {
            dataOutputStream.writeByte(sArr[i + i2]);
        }
    }

    private static void a(short[] sArr, short[] sArr2) {
        for (int i = 0; i < 18; i++) {
            sArr[i] = sArr2[i];
        }
    }

    private void a(int[] iArr, int i, int[] iArr2) throws IOException {
        int[] iArr3 = new int[5];
        int[] iArr4 = new int[5];
        int i2 = 0;
        ad adVar = new ad(this);
        for (int i3 = 0; i3 < i && i2 < 5; i3++) {
            a(iArr[i3], adVar);
            if (adVar.eS != -1) {
                iArr3[i2] = i3;
                iArr4[i2] = adVar.eS;
                iArr2[i2] = -1;
                i2++;
            }
        }
        for (int i4 = 0; i4 < 5; i4++) {
            iArr2[iArr4[i4]] = iArr3[i4];
        }
    }

    private static void a(int i, int[] iArr) {
        iArr[0] = i;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
        iArr[10] = 0;
        iArr[11] = 0;
        iArr[12] = 0;
        iArr[13] = 0;
        iArr[14] = 0;
        iArr[15] = 0;
        iArr[16] = 0;
        iArr[17] = 0;
        iArr[18] = 0;
        iArr[19] = 0;
        iArr[20] = 0;
        iArr[21] = 0;
    }

    public final void a(int i, i iVar) throws IOException {
        b(i, iVar);
        m65q();
        for (int i2 = 0; i2 < iVar.bs; i2++) {
            b(iVar.b[i2][0], iVar.b[i2]);
            a(iVar.p, iVar.b[i2]);
        }
        int[] iArr = new int[22];
        e(i, iArr);
        iVar.p[1] = iArr[1];
        m66r();
    }

    private void ar() throws IOException {
        m65q();
        int[] iArr = new int[17];
        for (int i = 0; i < this.dD; i++) {
            b(i, iArr);
            d(i, iArr);
            c(i, iArr);
        }
        int[] iArr2 = new int[22];
        for (int i2 = 0; i2 < this.dC; i2++) {
            e(i2, iArr2);
            int i3 = iArr2[14];
            int i4 = iArr2[15];
            a(i2, iArr2);
            iArr2[14] = i3;
            iArr2[15] = i4;
            d(iArr2);
        }
        m66r();
    }

    private static void a(ad adVar, x xVar) {
        int[] iArr = {5243, 2884, 1049, 8520, 8520};
        int[] iArr2 = {2621, 1632, 334, 3932, 3932};
        xVar.ea = t.e((adVar.eW - 50) << 16, 1337);
        xVar.eb = t.e((adVar.eV - 50) << 16, 1337);
        xVar.ec = t.e((adVar.eU - 50) << 16, 1337);
        int i = xVar.ea + xVar.eb + xVar.ec;
        xVar.R[0] = t.f(xVar.ea, i);
        xVar.R[1] = t.f(xVar.eb, i);
        xVar.R[2] = t.f(xVar.ec, i);
        xVar.ed = t.e((adVar.fg - 50) << 16, 1337);
        xVar.ee = t.e((adVar.ff - 50) << 16, 1337);
        xVar.ef = t.e((adVar.fa - 50) << 16, 1337);
        xVar.eg = t.e((adVar.fb - 50) << 16, 1337);
        xVar.eh = t.e((adVar.eY - 50) << 16, 1337);
        xVar.ei = t.e((adVar.fd - 50) << 16, 1337);
        xVar.ej = t.e((adVar.fc - 50) << 16, 1337);
        xVar.ek = t.e((adVar.eZ - 50) << 16, 1337);
        xVar.el = 4588 + t.e(((65536 - t.f((xVar.ef + xVar.eg) + xVar.ee, 196608)) - 32768) << 1, 2294);
        xVar.S[0] = t.e(xVar.ek - 32768, iArr2[0]) + iArr[0];
        xVar.S[1] = t.e(xVar.eh - 32768, iArr2[1]) + iArr[1];
        xVar.S[2] = t.e(xVar.eh - 32768, iArr2[2]) + iArr[2];
        xVar.S[3] = t.e(((65536 - ((xVar.ek + xVar.ed) >> 1)) - 32768) << 1, iArr2[3]) + iArr[3];
        xVar.S[4] = t.e(((65536 - ((xVar.eh + xVar.ed) >> 1)) - 32768) << 1, iArr2[4]) + iArr[4];
        for (int i2 = 1; i2 < 5; i2++) {
            int[] iArr3 = xVar.S;
            int i3 = i2;
            iArr3[i3] = iArr3[i3] + xVar.S[i2 - 1];
        }
        xVar.em = t.f(adVar.eX, 100);
    }

    private void a(int[] iArr, int[][] iArr2, int i, int[] iArr3, int i2) throws IOException {
        ad adVar = new ad(this);
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            boolean z = false;
            if (iArr2[i5][13] < 6) {
                int i6 = 0;
                while (true) {
                    if (i6 >= 5) {
                        break;
                    }
                    if (i5 == iArr3[i6]) {
                        z = true;
                        break;
                    }
                    i6++;
                }
                if (!z) {
                    a(iArr[i5], adVar);
                    int iAbs = adVar.fj - (Math.abs(i2 - adVar.bp) * 10);
                    if (i3 == -1 || iAbs > i4) {
                        i4 = iAbs;
                        i3 = i5;
                    }
                }
            }
        }
        iArr3[i2] = i3;
    }

    public final void a(t tVar) throws IOException {
        this.f187c = tVar;
        DataInputStream dataInputStreamM48a = t.m48a(316, 0);
        this.f191b = dataInputStreamM48a;
        this.f191b.mark(Integer.MAX_VALUE);
        b(dataInputStreamM48a);
        b(dataInputStreamM48a);
        this.dC = b(dataInputStreamM48a);
        this.dD = b(dataInputStreamM48a);
        this.dE = b(dataInputStreamM48a);
        this.dF = b(dataInputStreamM48a);
        this.f188a = new q[this.dC];
        for (int i = 0; i < this.dC; i++) {
            this.f188a[i] = new q(this);
            q qVar = this.f188a[i];
            qVar.cq = c(dataInputStreamM48a);
            int iA = a(dataInputStreamM48a);
            int iA2 = a(dataInputStreamM48a);
            int iA3 = a(dataInputStreamM48a);
            int iA4 = a(dataInputStreamM48a);
            qVar.p = a(dataInputStreamM48a, 4);
            dataInputStreamM48a.readBoolean();
            dataInputStreamM48a.readByte();
            dataInputStreamM48a.readByte();
            qVar.cr = dataInputStreamM48a.readByte();
            qVar.cs = dataInputStreamM48a.readByte();
            qVar.ct = dataInputStreamM48a.readByte();
            qVar.cu = dataInputStreamM48a.readByte();
            qVar.cv = dataInputStreamM48a.readByte();
            qVar.cw = dataInputStreamM48a.readByte();
            this.f191b.reset();
            this.f191b.skip(this.dF + iA);
            a(dataInputStreamM48a, -1);
            this.f191b.reset();
            this.f191b.skip(this.dF + iA2);
            qVar.m = a(dataInputStreamM48a, -1);
            this.f191b.reset();
            this.f191b.skip(this.dF + iA3);
            qVar.n = a(dataInputStreamM48a, -1);
            this.f191b.reset();
            this.f191b.skip(this.dF + iA4);
            qVar.o = a(dataInputStreamM48a, -1);
            this.f191b.reset();
            this.f191b.skip(24 + (22 * (i + 1)));
        }
        aA();
        this.dG = 0;
        this.f190d = null;
        this.dH = 0;
    }

    public final void as() {
        for (int i = 0; i < this.dC; i++) {
            this.f188a[i] = null;
        }
        this.f188a = null;
        t.a(this.f191b);
        this.f191b = null;
    }

    public final q a(int i) {
        return this.f188a[i];
    }

    /* renamed from: a, reason: collision with other method in class */
    public final String m59a(int i) throws IOException {
        int i2 = this.dE + (i * 34) + 5;
        this.f191b.reset();
        this.f191b.skip(i2);
        int iA = a(this.f191b);
        this.f191b.reset();
        this.f191b.skip(this.dF + iA);
        return a(this.f191b, -1);
    }

    public final int v(int i) throws IOException {
        int i2 = this.dE + (i * 34);
        this.f191b.reset();
        this.f191b.skip(i2);
        return c(this.f191b);
    }

    public final void a(int i, ad adVar) throws IOException {
        int i2 = this.dE + (i * 34);
        this.f191b.reset();
        this.f191b.skip(i2);
        adVar.br = c(this.f191b);
        adVar.eL = a(this.f191b);
        int iA = a(this.f191b);
        int iA2 = a(this.f191b);
        adVar.bp = c(this.f191b);
        adVar.eM = c(this.f191b);
        adVar.eN = c(this.f191b);
        adVar.eP = c(this.f191b);
        adVar.eQ = a(this.f191b);
        int iC = c(this.f191b);
        adVar.eR = c(this.f191b);
        adVar.eS = c(this.f191b);
        adVar.eT = c(this.f191b);
        adVar.eU = c(this.f191b);
        adVar.eV = c(this.f191b);
        adVar.eW = c(this.f191b);
        adVar.eX = c(this.f191b);
        adVar.eY = c(this.f191b);
        adVar.eZ = c(this.f191b);
        adVar.fa = c(this.f191b);
        adVar.fb = c(this.f191b);
        adVar.fc = c(this.f191b);
        adVar.fd = c(this.f191b);
        adVar.fe = c(this.f191b);
        adVar.ff = c(this.f191b);
        adVar.fg = c(this.f191b);
        adVar.fh = c(this.f191b);
        adVar.fi = c(this.f191b);
        adVar.fj = c(this.f191b);
        adVar.eO = c(this.f191b);
        this.f191b.reset();
        this.f191b.skip(this.dF + iA);
        adVar.q = a(this.f191b, -1);
        this.f191b.reset();
        this.f191b.skip(this.dF + iA2);
        adVar.r = a(this.f191b, -1);
        adVar.s = new StringBuffer().append(adVar.q.charAt(0)).append(". ").append(adVar.r).toString();
        adVar.fq = 196608 + t.e((iC - 50) << 16, 2006);
        adVar.fr = adVar.fq >> 1;
        adVar.fr += t.e(adVar.fq >> 2, 1337 * (adVar.fg - 50));
        adVar.fs = 24971 + t.e(t.e(adVar.fe - 50, 1337), 24971);
        int iE = t.e((adVar.ff - 50) << 16, 1337);
        int iE2 = t.e((adVar.fa - 50) << 16, 1337);
        int iE3 = t.e(iE2, 26214) + t.e(t.e((adVar.fi - 50) << 16, 1337), 26214);
        int i3 = (iE + iE2) >> 1;
        int i4 = i3;
        if (i3 < iE) {
            i4 -= (iE - iE2) >> 1;
        }
        int iE4 = 102943 + t.e(65536 - (iE3 + t.e(i4, 13107)), t.e(205887, 58982) - 102943);
        adVar.ft = t.t(iE4);
        adVar.fu = t.s(iE4);
        int iE5 = 102943 + t.e(65536 - (t.e(t.e((adVar.fb - 50) << 16, 1337), 45875) + t.e(iE, 19661)), t.e(205887, 58982) - 102943);
        adVar.fv = t.t(iE5);
        adVar.fw = t.s(iE5);
        int iE6 = t.e(1664, t.q(adVar.eP)) >> 1;
        int iE7 = t.e(85000, iE6);
        int iE8 = t.e(16384, iE6);
        adVar.fl = iE7;
        adVar.fm = t.e(iE7, iE7);
        adVar.fn = iE8;
        adVar.fo = t.e(iE8, iE8);
        adVar.fp = iE6;
        adVar.fx = (1000 * (((adVar.ff + adVar.fb) >> 1) - 50)) / 49;
        adVar.fx += 1000;
        adVar.fx /= 4;
    }

    /* renamed from: a, reason: collision with other method in class */
    public final int m60a(int i, int[] iArr) throws IOException {
        c cVar = new c(this);
        DataInputStream dataInputStreamA = cVar.a("nba2008_roster.db");
        dataInputStreamA.skip(12 + (i * 36));
        dataInputStreamA.readShort();
        int i2 = dataInputStreamA.readInt();
        for (int i3 = 0; i3 < 15; i3++) {
            iArr[i3] = dataInputStreamA.readShort();
        }
        cVar.c();
        return i2;
    }

    private void b(int i, int[] iArr) throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i2 = 34 + (iArrB[du] * 20) + iArrB[dt] + (this.dC * 36) + (i * 34);
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            DataInputStream dataInputStream = cVarM61a.a;
            dataInputStream.skip(i2);
            a(iArr, dataInputStream);
            cVarM61a.c();
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f190d);
            DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
            dataInputStream2.skip(i2);
            a(iArr, dataInputStream2);
            t.a(dataInputStream2);
            t.a(byteArrayInputStream);
        }
        e(iArrB);
    }

    private void c(int i, int[] iArr) throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i2 = 34 + (iArrB[du] * 20) + iArrB[dt] + (this.dC * 36) + (i * 34);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        a(iArr, dataOutputStream);
        if (this.f190d == null) {
            b bVarM62a = m62a(((m) this.f187c).cc);
            bVarM62a.write(byteArrayOutputStream.toByteArray(), i2, 34);
            bVarM62a.c();
        } else {
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, this.f190d, i2, 34);
        }
        t.a(dataOutputStream);
        t.a(byteArrayOutputStream);
        e(iArrB);
    }

    private static int a(int[] iArr) {
        return (iArr[7] * 3) + (iArr[5] << 1) + iArr[9];
    }

    public static void d(int i, int[] iArr) {
        iArr[0] = i;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
        iArr[10] = 0;
        iArr[11] = 0;
        iArr[12] = 0;
        iArr[13] = 0;
        iArr[14] = 0;
        iArr[15] = 0;
        iArr[16] = 0;
    }

    public final void b(int i, i iVar) throws IOException {
        int[] iArr = new int[15];
        iVar.br = i;
        iVar.bs = m60a(i, iArr);
        d(i, iVar.p);
        for (int i2 = 0; i2 < iVar.bs; i2++) {
            d(iArr[i2], iVar.b[i2]);
        }
    }

    public static void a(int[] iArr, int[] iArr2) {
        iArr[1] = iArr[1] + iArr2[1];
        iArr[2] = iArr[2] + iArr2[2];
        iArr[3] = iArr[3] + iArr2[3];
        iArr[4] = iArr[4] + iArr2[4];
        iArr[5] = iArr[5] + iArr2[5];
        iArr[6] = iArr[6] + iArr2[6];
        iArr[7] = iArr[7] + iArr2[7];
        iArr[8] = iArr[8] + iArr2[8];
        iArr[9] = iArr[9] + iArr2[9];
        iArr[10] = iArr[10] + iArr2[10];
        iArr[11] = iArr[11] + iArr2[11];
        iArr[12] = iArr[12] + iArr2[12];
        iArr[13] = iArr[13] + iArr2[13];
        iArr[14] = iArr[14] + iArr2[14];
        iArr[15] = iArr[15] + iArr2[15];
        iArr[16] = iArr[16] + iArr2[16];
    }

    public static String b(int i) {
        if (i == -1) {
            return null;
        }
        return c[i];
    }

    public final boolean q() {
        return j(0) || j(1) || j(2);
    }

    public final boolean j(int i) {
        if (i == -1) {
            return false;
        }
        return t.a(c[i], false);
    }

    public final void a(int i, int i2, int i3, int i4, int i5) throws IOException {
        String str = i2 == 1 ? "nba2008_season.db" : "nba2008_playoff.db";
        String str2 = str;
        c(str);
        b bVar = new b(this);
        DataOutputStream dataOutputStreamA = bVar.a(str2, true);
        dataOutputStreamA.writeInt(1349480304);
        dataOutputStreamA.writeInt(268435463);
        int[] iArr = new int[1];
        short[] sArrM64a = m64a(i3, i5, iArr);
        int i6 = sArrM64a[((iArr[0] - 1) * 18) + 3] + 1;
        byte[] bArr = new byte[i6];
        int[] iArrB = b();
        iArrB[dn] = i2;
        iArrB[dr] = 0;
        iArrB[dq] = 0;
        iArrB[dv] = i5;
        iArrB[f183do] = i4;
        iArrB[dp] = i3;
        iArrB[ds] = i;
        iArrB[dt] = i6;
        iArrB[du] = iArr[0];
        iArrB[dw] = 0;
        iArrB[dx] = 0;
        iArrB[dz] = 0;
        iArrB[dy] = 0;
        iArrB[dA] = 0;
        c(iArrB, dataOutputStreamA);
        e(iArrB);
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= i6) {
                break;
            }
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < iArr[0] && sArrM64a[i8 + 3] <= s2; i9++) {
                if (sArrM64a[i8 + 3] == s2) {
                    i7++;
                }
                i8 += 18;
            }
            bArr[s2] = (byte) i7;
            s = (short) (s2 + 1);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < iArr[0]; i11++) {
            a(sArrM64a, i10, dataOutputStreamA);
            i10 += 18;
        }
        dataOutputStreamA.write(bArr, 0, i6);
        int[] iArr2 = new int[22];
        for (int i12 = 0; i12 < this.dC; i12++) {
            iArr2[0] = i12;
            b(iArr2, dataOutputStreamA);
        }
        int[] iArr3 = new int[17];
        for (int i13 = 0; i13 < this.dD; i13++) {
            iArr3[0] = i13;
            a(iArr3, dataOutputStreamA);
        }
        bVar.c();
        if (i2 == 2) {
            m65q();
            int[] iArrB2 = b();
            b(iArrB2);
            int iL = l();
            iArrB2[dx] = 1;
            iArrB2[dy] = 1;
            c(iArrB2);
            s(iArrB2[dr], iL);
            b(iArrB2);
            m66r();
            e(iArrB2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    public final boolean k(int i) throws IOException {
        c cVarM61a = m61a(i);
        DataInputStream dataInputStream = cVarM61a.a;
        boolean z = dataInputStream != null;
        boolean z2 = z;
        if (z) {
            boolean z3 = false;
            ?? r0 = 0;
            int i2 = 0;
            try {
                i2 = dataInputStream.readInt();
                r0 = dataInputStream.readInt();
                z3 = r0;
            } catch (IOException e) {
                r0.printStackTrace();
            }
            if (i2 != 1349480304 || z3 != 268435463) {
                z2 = false;
            }
        }
        cVarM61a.c();
        return z2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private c m61a(int i) {
        String str = i == 1 ? "nba2008_season.db" : "nba2008_playoff.db";
        c cVar = new c(this);
        cVar.a(str);
        return cVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private b m62a(int i) {
        String str = i == 1 ? "nba2008_season.db" : "nba2008_playoff.db";
        b bVar = new b(this);
        bVar.a(str, false);
        return bVar;
    }

    public static int w(int i) {
        switch (i) {
            case 60000:
                return 120000;
            case 120000:
                return 180000;
            case 180000:
                return 300000;
            case 300000:
                return 60000;
            default:
                return 60000;
        }
    }

    public static int x(int i) {
        switch (i) {
            case 60000:
                return 300000;
            case 120000:
                return 60000;
            case 180000:
                return 120000;
            case 300000:
                return 180000;
            default:
                return 60000;
        }
    }

    public static int y(int i) {
        switch (i) {
            case 10:
                return 20;
            case 20:
                return 40;
            case 40:
                return 10;
            default:
                return 10;
        }
    }

    public static int z(int i) {
        switch (i) {
            case 10:
                return 40;
            case 20:
                return 10;
            case 40:
                return 20;
            default:
                return 10;
        }
    }

    public static int A(int i) {
        switch (i) {
            case 10:
                return 3;
            case 20:
                return 5;
            case 40:
                return 7;
            default:
                return 5;
        }
    }

    private void at() throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i = iArrB[dr];
        if (iArrB[dr] >= iArrB[dt]) {
            e(iArrB);
            return;
        }
        b(iArrB);
        iArrB[dr] = i + 1;
        c(iArrB);
        if (iArrB[dr] == iArrB[dt]) {
            e(iArrB);
            return;
        }
        int iL = l();
        if (iArrB[dx] != 0 && iArrB[dr] >= iL) {
            int i2 = (iArrB[dr] - iL) / iArrB[dv];
            int i3 = (iArrB[dr] - (i2 * iArrB[dv])) - iL;
            if (i3 == 0) {
                M(i2);
            } else if (i3 >= (iArrB[dv] >> 1) + 1) {
                O(iArrB[dr]);
            }
        }
        e(iArrB);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static int m63a(ad adVar, x xVar) {
        int i = xVar.ea;
        int i2 = xVar.eb;
        int i3 = xVar.ec;
        return ((i > i2 ? i > i3 ? i : i3 : i2 > i3 ? i2 : i3) + ((adVar.fi - 50) << 16)) >> 1;
    }

    private static int a(int i, int[] iArr, int i2, int i3) {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 < 5) {
                if (i6 != i3 && i < i5 + iArr[i6 + i2]) {
                    i4 = i6;
                    break;
                }
                i5 += iArr[i6 + i2];
                i6++;
            } else {
                break;
            }
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4, types: [int] */
    /* JADX WARN: Type inference failed for: r21v5, types: [int] */
    /* JADX WARN: Type inference failed for: r21v6 */
    private void L(int i) throws IOException {
        short s;
        int i2;
        int i3;
        boolean z;
        short[] sArrA = a();
        int[] iArrB = b();
        a(i, sArrA);
        if (sArrA[7] != 0) {
            e(iArrB);
            f(sArrA);
            return;
        }
        b(iArrB);
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < 5; i6++) {
                if (this.f184a[i5][i6] == null) {
                    this.f184a[i5][i6] = new ad(this);
                }
                if (this.f185a[i5][i6] == null) {
                    this.f185a[i5][i6] = new x(this);
                }
            }
        }
        int i7 = 0;
        boolean z2 = true;
        this.H[0] = sArrA[0];
        this.H[1] = sArrA[1];
        for (int i8 = 0; i8 < 2; i8++) {
            this.I[i8] = m60a(this.H[i8], this.g[i8]);
            for (int i9 = 0; i9 < this.I[i8]; i9++) {
                d(this.g[i8][i9], this.a[i8][i9]);
            }
        }
        a(this.g[0], this.I[0], this.h[0]);
        a(this.g[1], this.I[1], this.h[1]);
        int[] iArr = {0, 0};
        this.d[0] = 0;
        this.d[1] = 0;
        while (true) {
            int i10 = iArrB[f183do];
            if (i4 < 4) {
                this.e[0][i4] = 0;
                this.e[1][i4] = 0;
            } else {
                this.e[0][4] = 0;
                this.e[1][4] = 0;
            }
            if ((i4 & 1) == 0 && i4 <= 4) {
                this.L[0] = 0;
                this.L[1] = 0;
            }
            while (i10 > 0) {
                int iO = this.f187c.o(65536);
                int i11 = (i7 + 1) & 1;
                x[] xVarArr = this.f185a[i7];
                x[] xVarArr2 = this.f185a[i11];
                int[][] iArr2 = this.a[i7];
                int[][] iArr3 = this.a[i11];
                int[][] iArr4 = this.a[0];
                int[][] iArr5 = this.a[1];
                int[] iArr6 = this.h[i7];
                int[] iArr7 = this.h[i11];
                int[] iArr8 = this.h[0];
                int[] iArr9 = this.h[1];
                ad[] adVarArr = this.f184a[0];
                ad[] adVarArr2 = this.f184a[1];
                if (z2) {
                    z2 = false;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    for (int i12 = 0; i12 < 5; i12++) {
                        a(this.g[0][iArr8[i12]], adVarArr[i12]);
                        a(this.g[1][iArr9[i12]], adVarArr2[i12]);
                        a(adVarArr[i12], this.f185a[0][i12]);
                        a(adVarArr2[i12], this.f185a[1][i12]);
                        this.i[0][i12] = m63a(adVarArr[i12], this.f185a[0][i12]);
                        iArr[0] = iArr[0] + this.i[0][i12];
                        this.i[1][i12] = m63a(adVarArr2[i12], this.f185a[1][i12]);
                        iArr[1] = iArr[1] + this.i[1][i12];
                    }
                    this.J[0] = 0;
                    this.J[1] = 0;
                    for (int i13 = 0; i13 < 5; i13++) {
                        this.i[0][i13] = t.f(this.i[0][i13], iArr[0]);
                        this.i[1][i13] = t.f(this.i[1][i13], iArr[1]);
                        this.j[0][i13] = t.e(17695, this.f185a[1][i13].ei);
                        this.j[0][i13 + 5] = t.e(47841, this.f185a[0][i13].ej);
                        int[] iArr10 = this.J;
                        iArr10[0] = iArr10[0] + this.j[0][i13] + this.j[0][i13 + 5];
                        this.j[1][i13] = t.e(17695, this.f185a[0][i13].ei);
                        this.j[1][i13 + 5] = t.e(47841, this.f185a[1][i13].ej);
                        int[] iArr11 = this.J;
                        iArr11[1] = iArr11[1] + this.j[1][i13] + this.j[1][i13 + 5];
                    }
                    for (int i14 = 0; i14 < 2; i14++) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < 5; i16++) {
                            i15 += this.f185a[i14][i16].eg;
                        }
                        for (int i17 = 0; i17 < 5; i17++) {
                            this.k[i14][i17] = t.f(this.f185a[i14][i17].eg, i15);
                        }
                        this.K[i14] = t.e(((i15 / 5) - 32768) << 1, 16384) + 39322;
                    }
                }
                boolean z3 = true;
                boolean z4 = false;
                boolean z5 = true;
                boolean z6 = false;
                boolean z7 = false;
                int iA = a(iO, this.i[i7], 0, -1);
                int i18 = iA;
                if (iA == -1) {
                    i18 = 4;
                }
                boolean z8 = false;
                if (this.f187c.o(65536) < xVarArr[i18].el) {
                    z5 = false;
                    int[] iArr12 = iArr2[i18];
                    iArr12[15] = iArr12[15] + 1;
                    s = z7;
                } else {
                    int i19 = 49152;
                    int iO2 = this.f187c.o(65536);
                    if (iO2 < xVarArr[i18].R[0]) {
                        i3 = xVarArr[i18].ea;
                    } else if (iO2 < xVarArr[i18].R[0] + xVarArr[i18].R[1]) {
                        i3 = xVarArr[i18].eb;
                    } else {
                        i3 = xVarArr[i18].ec;
                        i19 = 32768;
                        z8 = true;
                    }
                    int iE = t.e(i3, i19);
                    if (z8) {
                        int[] iArr13 = iArr2[iArr6[i18]];
                        iArr13[6] = iArr13[6] + 1;
                    } else {
                        int[] iArr14 = iArr2[iArr6[i18]];
                        iArr14[4] = iArr14[4] + 1;
                    }
                    int iO3 = this.f187c.o(65536);
                    int i20 = -1;
                    int i21 = 0;
                    while (true) {
                        if (i21 < 5) {
                            if (iO3 < xVarArr2[i18].S[i21]) {
                                i20 = i21;
                            } else {
                                i21++;
                            }
                        }
                    }
                    switch (i20) {
                        case 0:
                            int[] iArr15 = iArr2[iArr6[i18]];
                            iArr15[15] = iArr15[15] + 1;
                            int[] iArr16 = iArr3[iArr7[i18]];
                            iArr16[14] = iArr16[14] + 1;
                            z5 = false;
                            break;
                        case 1:
                            int[] iArr17 = iArr3[iArr7[i18]];
                            iArr17[16] = iArr17[16] + 1;
                            int[] iArr18 = iArr2[iArr6[i18]];
                            iArr18[15] = iArr18[15] + 1;
                            z5 = false;
                            break;
                        case 2:
                            int[] iArr19 = iArr3[iArr7[i18]];
                            iArr19[16] = iArr19[16] + 1;
                            z3 = false;
                            z5 = false;
                            break;
                        case 3:
                            int[] iArr20 = iArr3[iArr7[i18]];
                            iArr20[13] = iArr20[13] + 1;
                            z5 = false;
                            z6 = true;
                            z4 = false;
                            z3 = false;
                            int[] iArr21 = this.L;
                            iArr21[i11] = iArr21[i11] + 1;
                            if (this.L[i11] >= 5) {
                                z4 = true;
                                break;
                            }
                            break;
                        case 4:
                            int[] iArr22 = iArr3[iArr7[i18]];
                            iArr22[13] = iArr22[13] + 1;
                            z5 = true;
                            z6 = true;
                            z4 = true;
                            int[] iArr23 = this.L;
                            iArr23[i11] = iArr23[i11] + 1;
                            break;
                    }
                    s = z7;
                    if (z5) {
                        if (this.f187c.o(65536) < iE) {
                            if (z8) {
                                int[] iArr24 = iArr2[iArr6[i18]];
                                iArr24[7] = iArr24[7] + 1;
                                z = 3;
                            } else {
                                int[] iArr25 = iArr2[iArr6[i18]];
                                iArr25[5] = iArr25[5] + 1;
                                z = 2;
                            }
                            s = z;
                            if (this.f187c.o(65536) < this.K[i7]) {
                                int iA2 = a(this.f187c.o(65536), this.k[i7], 0, i18);
                                int i22 = iA2;
                                if (iA2 == -1) {
                                    i22 = i18 - 1;
                                }
                                int[] iArr26 = iArr2[iArr6[i22]];
                                iArr26[12] = iArr26[12] + 1;
                                s = z;
                            }
                        } else {
                            s = z7;
                            if (!z4) {
                                int iO4 = this.f187c.o(this.J[i11]);
                                int iA3 = a(iO4, this.j[i7], 0, -1);
                                int iA4 = iA3;
                                boolean z9 = iA3 >= 0;
                                boolean z10 = z9;
                                if (!z9) {
                                    iA4 = a(iO4, this.j[i7], 5, -1);
                                }
                                if (iA4 == -1) {
                                    iA4 = 4;
                                }
                                if (z10) {
                                    int[] iArr27 = iArr2[iArr6[iA4]];
                                    iArr27[10] = iArr27[10] + 1;
                                    z3 = false;
                                    s = z7;
                                } else {
                                    int[] iArr28 = iArr3[iArr7[iA4]];
                                    iArr28[11] = iArr28[11] + 1;
                                    s = z7;
                                }
                            }
                        }
                    }
                }
                if (z4) {
                    if (!z5) {
                        i2 = 2;
                    } else if (s) {
                        i2 = 1;
                    } else {
                        i2 = z8 ? 3 : 2;
                    }
                    while (i2 > 0) {
                        i2--;
                        int[] iArr29 = iArr2[iArr6[i18]];
                        iArr29[8] = iArr29[8] + 1;
                        if (this.f187c.o(65536) < xVarArr[i18].em) {
                            s++;
                            int[] iArr30 = iArr2[iArr6[i18]];
                            iArr30[9] = iArr30[9] + 1;
                        } else if (i2 == 0) {
                            i2 = 0;
                            int iO5 = this.f187c.o(this.J[i11]);
                            int iA5 = a(iO5, this.j[i7], 0, -1);
                            int iA6 = iA5;
                            boolean z11 = iA5 >= 0;
                            boolean z12 = z11;
                            if (!z11) {
                                iA6 = a(iO5, this.j[i7], 5, -1);
                            }
                            if (iA6 == -1) {
                                iA6 = 4;
                            }
                            if (z12) {
                                int[] iArr31 = iArr2[iArr6[iA6]];
                                iArr31[10] = iArr31[10] + 1;
                                z3 = false;
                            } else {
                                int[] iArr32 = iArr3[iArr7[iA6]];
                                iArr32[11] = iArr32[11] + 1;
                            }
                        }
                    }
                }
                if (i4 < 4) {
                    short[] sArr = this.e[i7];
                    int i23 = i4;
                    sArr[i23] = (short) (sArr[i23] + s);
                } else {
                    short[] sArr2 = this.e[i7];
                    sArr2[4] = (short) (sArr2[4] + s);
                }
                int iMin = Math.min(4000 + (this.f187c.o(36) * 250), i10);
                i10 -= iMin;
                for (int i24 = 0; i24 < 5; i24++) {
                    int[] iArr33 = iArr4[iArr8[i24]];
                    iArr33[3] = iArr33[3] + iMin;
                    int[] iArr34 = iArr5[iArr9[i24]];
                    iArr34[3] = iArr34[3] + iMin;
                    while (iArr4[iArr8[i24]][3] > 1000) {
                        int[] iArr35 = iArr4[iArr8[i24]];
                        iArr35[2] = iArr35[2] + 1;
                        int[] iArr36 = iArr4[iArr8[i24]];
                        iArr36[3] = iArr36[3] - 1000;
                    }
                    while (iArr5[iArr9[i24]][3] > 1000) {
                        int[] iArr37 = iArr5[iArr9[i24]];
                        iArr37[2] = iArr37[2] + 1;
                        int[] iArr38 = iArr5[iArr9[i24]];
                        iArr38[3] = iArr38[3] - 1000;
                    }
                }
                if (z6 && iArr3[iArr7[i18]][13] >= 6) {
                    a(this.g[i11], iArr3, this.I[i11], iArr7, i18);
                    z2 = true;
                }
                if (z3) {
                    i7 = (i7 + 1) & 1;
                }
            }
            if (i4 < 4) {
                short[] sArr3 = this.d;
                sArr3[0] = (short) (sArr3[0] + this.e[0][i4]);
                short[] sArr4 = this.d;
                sArr4[1] = (short) (sArr4[1] + this.e[1][i4]);
            } else {
                short[] sArr5 = this.d;
                sArr5[0] = (short) (sArr5[0] + this.e[0][4]);
                short[] sArr6 = this.d;
                sArr6[1] = (short) (sArr6[1] + this.e[1][4]);
            }
            i4++;
            if (i4 >= 4 && this.d[0] != this.d[1]) {
                sArrA[4] = this.d[0];
                sArrA[5] = this.d[1];
                sArrA[8] = this.e[0][0];
                sArrA[9] = this.e[0][1];
                sArrA[10] = this.e[0][2];
                sArrA[11] = this.e[0][3];
                sArrA[13] = this.e[1][0];
                sArrA[14] = this.e[1][1];
                sArrA[15] = this.e[1][2];
                sArrA[16] = this.e[1][3];
                sArrA[12] = (short) (sArrA[4] - (((sArrA[8] + sArrA[9]) + sArrA[10]) + sArrA[11]));
                sArrA[17] = (short) (sArrA[5] - (((sArrA[13] + sArrA[14]) + sArrA[15]) + sArrA[16]));
                for (int i25 = 0; i25 < 2; i25++) {
                    e(this.H[i25], this.M);
                    for (int i26 = 0; i26 < this.I[i25]; i26++) {
                        b(this.a[i25][i26][0], this.N);
                        if (this.a[i25][i26][3] > 0 || this.a[i25][i26][2] > 0) {
                            int[] iArr39 = this.a[i25][i26];
                            iArr39[1] = iArr39[1] + 1;
                        }
                        a(this.N, this.a[i25][i26]);
                        b(this.M, this.a[i25][i26]);
                        c(this.N[0], this.N);
                    }
                    int[] iArr40 = this.M;
                    iArr40[1] = iArr40[1] + 1;
                    d(this.M);
                }
                if (sArrA[4] > sArrA[5]) {
                    sArrA[7] = 1;
                } else {
                    sArrA[7] = 2;
                }
                c(sArrA);
                if (sArrA[6] == 0) {
                    f(sArrA[0], sArrA[7] == 1);
                    f(sArrA[1], sArrA[7] == 2);
                }
                f(sArrA);
                e(iArrB);
                return;
            }
        }
    }

    public final void M(int i) throws IOException {
        m65q();
        switch (i) {
            case 0:
                aB();
                ar();
                break;
            case 1:
                aC();
                break;
            case 2:
                aD();
                break;
            case 3:
                aE();
                break;
        }
        m66r();
    }

    public final void au() throws IOException {
        m65q();
        int[] iArrB = b();
        b(iArrB);
        av();
        if (this.O == null) {
            this.O = new int[1];
            this.O[0] = iArrB[dq];
        } else {
            int[] iArr = new int[this.O.length + 1];
            System.arraycopy(this.O, 0, iArr, 0, this.O.length);
            iArr[this.O.length] = iArrB[dq];
            this.O = iArr;
        }
        e(iArrB);
        m66r();
    }

    public final void av() throws IOException {
        m65q();
        int[] iArrB = b();
        short[] sArrA = a();
        b(iArrB);
        a(iArrB[dq], sArrA);
        s(iArrB[dr], sArrA[3]);
        e(iArrB);
        f(sArrA);
        m66r();
    }

    public final void s(int i, int i2) throws IOException {
        int[] iArr = null;
        for (int i3 = i; i3 < i2; i3++) {
            N(i3);
            if (iArr == null) {
                iArr = this.O;
                this.O = null;
            } else if (this.O != null) {
                int[] iArr2 = iArr;
                iArr = new int[iArr2.length + this.O.length];
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                System.arraycopy(this.O, 0, iArr, iArr2.length, this.O.length);
                this.O = null;
            }
        }
        this.O = iArr;
    }

    private void N(int i) throws IOException {
        short[][] sArr = new short[15][0];
        a(sArr);
        int iA = a(i, sArr);
        this.O = new int[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            this.O[i2] = sArr[i2][2];
        }
        b(sArr);
    }

    public final void aw() {
        this.dK = 0;
    }

    public final int k() throws IOException {
        if (this.O == null || this.O.length <= 0) {
            this.O = null;
            this.dK = 0;
            return 100;
        }
        this.dK = a(this.O, this.dK);
        int iMin = Math.min(100, (this.dK * 100) / this.O.length);
        if (iMin == 100) {
            this.dK = 0;
            this.O = null;
        }
        return iMin;
    }

    private int a(int[] iArr, int i) throws IOException {
        int iG = t.g();
        m65q();
        int[] iArrB = b();
        short[] sArrA = a();
        short[] sArrA2 = a();
        do {
            b(iArrB);
            if (i >= iArr.length || iArr[i] >= iArrB[du]) {
                break;
            }
            b(iArrB);
            a(iArr[i], sArrA);
            if (iArrB[dr] == sArrA[3]) {
                L(iArr[i]);
                boolean z = true;
                int iB = 0;
                int i2 = iArrB[dr];
                int iB2 = B(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    iB += B(i3);
                }
                for (int i4 = iB; z && i4 < iB + iB2; i4++) {
                    a(i4, sArrA2);
                    if (sArrA2[7] == 0) {
                        z = false;
                    }
                }
                if (z) {
                    at();
                }
            }
            i++;
        } while (t.g() - iG < 300);
        m66r();
        e(iArrB);
        f(sArrA);
        f(sArrA2);
        return i;
    }

    public final void a(int i, short[] sArr) throws IOException {
        int i2 = 34 + (i * 20);
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            DataInputStream dataInputStream = cVarM61a.a;
            dataInputStream.skip(i2);
            a(sArr, 0, dataInputStream);
            cVarM61a.c();
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f190d);
        DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
        dataInputStream2.skip(i2);
        a(sArr, 0, dataInputStream2);
        t.a(dataInputStream2);
        t.a(byteArrayInputStream);
    }

    private void c(short[] sArr) throws IOException {
        int i = 34 + (sArr[2] * 20);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        a(sArr, 0, dataOutputStream);
        if (this.f190d == null) {
            b bVarM62a = m62a(((m) this.f187c).cc);
            bVarM62a.write(byteArrayOutputStream.toByteArray(), i, 20);
            bVarM62a.c();
        } else {
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, this.f190d, i, 20);
        }
        t.a(dataOutputStream);
        t.a(byteArrayOutputStream);
    }

    public final void b(int[] iArr) throws IOException {
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            DataInputStream dataInputStream = cVarM61a.a;
            dataInputStream.skip(8);
            c(iArr, dataInputStream);
            cVarM61a.c();
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f190d);
        DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
        dataInputStream2.skip(8);
        c(iArr, dataInputStream2);
        t.a(dataInputStream2);
        t.a(byteArrayInputStream);
    }

    public final void c(int[] iArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        c(iArr, dataOutputStream);
        if (this.f190d == null) {
            b bVarM62a = m62a(((m) this.f187c).cc);
            bVarM62a.write(byteArrayOutputStream.toByteArray(), 8, 26);
            bVarM62a.c();
        } else {
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, this.f190d, 8, 26);
        }
        t.a(dataOutputStream);
        t.a(byteArrayOutputStream);
    }

    public final void e(int i, int[] iArr) throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i2 = 34 + (iArrB[du] * 20) + iArrB[dt] + (i * 36);
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            DataInputStream dataInputStream = cVarM61a.a;
            dataInputStream.skip(i2);
            b(iArr, dataInputStream);
            cVarM61a.c();
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f190d);
            DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
            dataInputStream2.skip(i2);
            b(iArr, dataInputStream2);
            t.a(dataInputStream2);
            t.a(byteArrayInputStream);
        }
        e(iArrB);
    }

    private void d(int[] iArr) throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i = 34 + (iArrB[du] * 20) + iArrB[dt] + (iArr[0] * 36);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        b(iArr, dataOutputStream);
        if (this.f190d == null) {
            b bVarM62a = m62a(((m) this.f187c).cc);
            bVarM62a.write(byteArrayOutputStream.toByteArray(), i, 36);
            bVarM62a.c();
        } else {
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, this.f190d, i, 36);
        }
        t.a(dataOutputStream);
        t.a(byteArrayOutputStream);
        e(iArrB);
    }

    private static void b(int[] iArr, int[] iArr2) {
        iArr[2] = iArr[2] + iArr2[4];
        iArr[3] = iArr[3] + iArr2[5];
        iArr[4] = iArr[4] + iArr2[6];
        iArr[5] = iArr[5] + iArr2[7];
        iArr[6] = iArr[6] + iArr2[8];
        iArr[7] = iArr[7] + iArr2[9];
        iArr[8] = iArr[8] + iArr2[10];
        iArr[9] = iArr[9] + iArr2[11];
        iArr[10] = iArr[10] + iArr2[12];
        iArr[11] = iArr[11] + iArr2[14];
        iArr[12] = iArr[12] + iArr2[15];
        iArr[13] = iArr[13] + iArr2[16];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.DataInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v21, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v36, types: [v] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [v] */
    private int B(int i) throws IOException {
        int i2 = 0;
        ?? B = b();
        try {
            B = this;
            B.b(B);
        } catch (IOException e) {
            B.printStackTrace();
        }
        if (i >= B[dt] || i < 0) {
            return 0;
        }
        int i3 = 34 + (B[du] * 20) + i;
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            ?? r0 = cVarM61a.a;
            try {
                r0.skip(i3);
                r0 = r0.readByte();
                i2 = r0;
            } catch (IOException e2) {
                r0.printStackTrace();
            }
            cVarM61a.c();
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f190d);
            ?? dataInputStream = new DataInputStream(byteArrayInputStream);
            try {
                dataInputStream.skip(i3);
                dataInputStream = dataInputStream.readByte();
                i2 = dataInputStream;
            } catch (IOException e3) {
                dataInputStream.printStackTrace();
            }
            t.a((InputStream) dataInputStream);
            t.a(byteArrayInputStream);
        }
        e(B);
        return i2;
    }

    private int a(int i, short[][] sArr) throws IOException {
        int iB = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iB += B(i2);
        }
        int iB2 = B(i);
        for (int i3 = iB; i3 < iB + iB2; i3++) {
            a(i3, sArr[i3 - iB]);
        }
        return iB2;
    }

    private void b(int i, short[] sArr) throws IOException {
        int[] iArrB = b();
        b(iArrB);
        short[][] sArr2 = new short[15][0];
        a(sArr2);
        int iA = a(i, sArr2);
        sArr[0] = -1;
        sArr[1] = -1;
        for (int i2 = 0; i2 < iA; i2++) {
            if (sArr2[i2][1] == iArrB[ds] || sArr2[i2][0] == iArrB[ds]) {
                a(sArr, sArr2[i2]);
                break;
            }
        }
        b(sArr2);
        e(iArrB);
    }

    public final void d(short[] sArr) throws IOException {
        int[] iArrB = b();
        short[] sArrA = a();
        boolean z = false;
        b(iArrB);
        a(iArrB[dq], sArrA);
        if ((sArrA[1] == iArrB[ds] || sArrA[0] == iArrB[ds]) && sArrA[7] == 0) {
            a(sArr, sArrA);
            e(iArrB);
            f(sArrA);
            return;
        }
        int i = sArrA[3];
        while (true) {
            if (i >= iArrB[dt]) {
                break;
            }
            b(i, sArr);
            if (sArr[7] == 0 && sArr[1] != -1 && sArr[0] != -1) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            sArr[1] = -1;
            sArr[0] = -1;
            sArr[7] = 3;
        }
        e(iArrB);
        f(sArrA);
    }

    public final void e(short[] sArr) throws IOException {
        int[] iArrB = b();
        m65q();
        d(sArr);
        if (sArr[1] != -1 && sArr[0] != -1) {
            b(iArrB);
            iArrB[dq] = sArr[2];
            c(iArrB);
        }
        m66r();
        e(iArrB);
    }

    public final int l() throws IOException {
        int[] iArrB = b();
        b(iArrB);
        int i = iArrB[dt] - (4 * iArrB[dv]);
        e(iArrB);
        return i;
    }

    public final void t(int i, int i2) throws IOException {
        int[] iArrB = b();
        this.f186e = a();
        b(iArrB);
        a(iArrB[dq], this.f186e);
        this.f186e[5] = (short) i2;
        this.f186e[4] = (short) i;
        this.f186e[7] = (short) (i > i2 ? 1 : 2);
        iArrB[dw] = 1;
        c(iArrB);
        e(iArrB);
    }

    public final void a(int i, int[][] iArr, boolean z) {
        int[][] iArr2 = new int[i][17];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < 17; i3++) {
                iArr2[i2][i3] = iArr[i2][i3];
            }
        }
        if (z) {
            this.l = iArr2;
        } else {
            this.m = iArr2;
        }
    }

    private void ax() throws IOException {
        int[] iArrB = b();
        b(iArrB);
        if (this.f186e != null) {
            c(this.f186e);
            int i = 0;
            while (i < 2) {
                int[] iArr = new int[17];
                int[][] iArr2 = i == 0 ? this.l : this.m;
                short s = i == 0 ? this.f186e[0] : this.f186e[1];
                d(-1, iArr);
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2][0];
                    int[] iArr3 = new int[17];
                    b(i3, iArr3);
                    a(iArr, iArr2[i2]);
                    a(iArr3, iArr2[i2]);
                    if (iArr2[i2][3] > 0 || iArr2[i2][2] > 0) {
                        iArr3[1] = iArr3[1] + 1;
                    }
                    c(i3, iArr3);
                }
                int[] iArr4 = new int[22];
                iArr[1] = 1;
                e(s, iArr4);
                b(iArr4, iArr);
                iArr4[1] = iArr4[1] + 1;
                d(iArr4);
                i++;
            }
            if (this.f186e[6] == 0) {
                f(this.f186e[0], this.f186e[7] == 1);
                f(this.f186e[1], this.f186e[7] == 2);
            }
        }
        e(iArrB);
        f(this.f186e);
        this.f186e = null;
        this.l = (int[][]) null;
        this.m = (int[][]) null;
    }

    public final void ay() throws IOException {
        int[] iArrB = b();
        short[] sArrA = a();
        m65q();
        b(iArrB);
        if (this.f186e != null) {
            ax();
        }
        a(iArrB[dq], sArrA);
        if (sArrA[3] == iArrB[dr]) {
            N(iArrB[dr]);
        }
        b(iArrB);
        iArrB[dw] = 0;
        c(iArrB);
        m66r();
        e(iArrB);
        f(sArrA);
    }

    public final int m() throws IOException {
        m65q();
        int[] iArrB = b();
        short[] sArrA = a();
        b(iArrB);
        int i = iArrB[dx] == 0 ? 23 : 24;
        e(sArrA);
        b(iArrB);
        if (sArrA[1] == -1 || sArrA[0] == -1) {
            int iL = l();
            b(iArrB);
            if (iArrB[dr] < iL) {
                s(iArrB[dr], iL);
                i = 38;
            } else if (iArrB[dx] != 0) {
                if (iArrB[dr] != iL) {
                    if (iArrB[dr] == iArrB[dt]) {
                        az();
                        m66r();
                        e(iArrB);
                        f(sArrA);
                        return i;
                    }
                    if ((iArrB[dr] - iL) % iArrB[dv] == 0) {
                        az();
                        b(iArrB);
                    }
                }
                int iP = iL + ((p() + 1) * iArrB[dv]);
                if (iArrB[dv] > 1) {
                    s(iArrB[dr], iP);
                } else {
                    N(iArrB[dr]);
                }
                i = 40;
            }
        }
        m66r();
        e(iArrB);
        f(sArrA);
        return i;
    }

    public final int n() throws IOException {
        m65q();
        int iO = 24;
        int[] iArrB = b();
        short[] sArrA = a();
        b(iArrB);
        int i = iArrB[ds];
        int i2 = iArrB[dv];
        int i3 = iArrB[dn];
        e(sArrA);
        b(iArrB);
        if (sArrA[1] == -1 || sArrA[0] == -1) {
            if (i3 == 2) {
                int i4 = a(i).cu / 3 == 0 ? 1 : 8;
                int iL = l();
                short[][] sArr = new short[15][0];
                a(sArr);
                a(iL, i4, sArr);
                short s = sArr[0][1];
                for (int i5 = iL; i5 < iL + i2; i5++) {
                    a(i, s, sArr, a(i5, i4, sArr));
                    c(sArr[0]);
                }
                e(sArrA);
                b(sArr);
            } else {
                iO = o();
            }
        }
        m66r();
        e(iArrB);
        f(sArrA);
        return iO;
    }

    public final int o() throws IOException {
        return m();
    }

    private int a(int i, int i2, short[][] sArr) throws IOException {
        short[][] sArr2 = new short[15][0];
        a(sArr2);
        int i3 = 0;
        int iA = a(i, sArr2);
        for (int i4 = 0; i4 < iA; i4++) {
            if (sArr2[i4][6] == i2) {
                a(sArr[i3], sArr2[i4]);
                i3++;
            }
        }
        b(sArr2);
        return i3;
    }

    public final void f(int i, int[] iArr) throws IOException {
        q qVarA = a(i);
        int[] iArr2 = new int[22];
        int i2 = 0;
        int i3 = 0;
        e(i, iArr2);
        for (int i4 = 0; i4 < this.dC; i4++) {
            if (i4 != i) {
                if (qVarA.cu == a(i4).cu) {
                    int[] iArr3 = new int[22];
                    e(i4, iArr3);
                    int i5 = iArr3[14] - iArr2[14];
                    int i6 = iArr2[15] - iArr3[15];
                    if (i6 >= 0 && i5 >= 0 && i5 + i6 > i2 + i3) {
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final void a(int i, ae[] aeVarArr) throws IOException {
        c(i, aeVarArr);
        a(aeVarArr, 5);
    }

    private void b(int i, ae[] aeVarArr) throws IOException {
        d(i, aeVarArr);
        a(aeVarArr, 15);
    }

    public final int p() throws IOException {
        int[] iArrB = b();
        int iL = l();
        b(iArrB);
        int i = (iArrB[dr] - iL) / iArrB[dv];
        e(iArrB);
        return i;
    }

    public final void a(int i, int i2, int[] iArr) throws IOException {
        int[] iArrB = b();
        int iL = l();
        b(iArrB);
        int i3 = iL + (i * iArrB[dv]);
        short[][] sArr = new short[15][0];
        a(sArr);
        int i4 = (iArrB[dv] >> 1) + 1;
        iArr[1] = 0;
        iArr[0] = 0;
        for (int i5 = i3; i5 < i3 + iArrB[dv] && iArr[0] < i4 && iArr[1] < i4; i5++) {
            int iA = a(i5, sArr);
            for (int i6 = 0; i6 < iA; i6++) {
                if ((sArr[i6][0] == i2 || sArr[i6][1] == i2) && sArr[i6][7] < 3 && sArr[i6][7] > 0) {
                    if ((sArr[i6][7] == 1 ? sArr[i6][0] : sArr[i6][1]) == i2) {
                        iArr[0] = iArr[0] + 1;
                    } else {
                        iArr[1] = iArr[1] + 1;
                    }
                }
            }
        }
        b(sArr);
        e(iArrB);
    }

    public final int a(int i, int i2, int[] iArr, int i3) throws IOException {
        int i4 = 0;
        int i5 = 1;
        switch (i) {
            case 0:
                short[][] sArr = new short[15][0];
                a(sArr);
                int i6 = 1 + (i2 * 7);
                int iA = a(l(), sArr);
                for (int i7 = 0; i7 < iA; i7++) {
                    if (sArr[i7][6] >= i6 && sArr[i7][6] < i6 + 4) {
                        int i8 = (sArr[i7][6] - i6) << 1;
                        iArr[i8] = sArr[i7][0];
                        iArr[i8 + 1] = sArr[i7][1];
                    }
                }
                b(sArr);
                return 8;
            case 1:
                i5 = 1 + (i2 * 7);
                i4 = 4;
                i3 = 4;
                break;
            case 2:
                i5 = 5 + (i2 * 7);
                i4 = 2;
                i3 = 2;
                break;
            case 3:
                iArr[0] = D(14);
                iArr[1] = D(7);
                return 2;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            iArr[i9] = D(i9 + i5);
        }
        return i3;
    }

    public final int C(int i) throws IOException {
        short[][] sArr = new short[15][0];
        int i2 = -1;
        if (i < 0 || i >= this.dC) {
            return -1;
        }
        a(sArr);
        int iA = a(l(), sArr);
        int i3 = 0;
        while (i3 < iA && sArr[i3][1] != i && sArr[i3][0] != i) {
            i3++;
        }
        if (i3 < iA) {
            switch (sArr[i3][6]) {
                case 1:
                case 8:
                    i2 = sArr[i3][1] == i ? 8 : 1;
                    break;
                case 2:
                case 9:
                    i2 = sArr[i3][1] == i ? 5 : 4;
                    break;
                case 3:
                case 10:
                    i2 = sArr[i3][1] == i ? 7 : 2;
                    break;
                case 4:
                case 11:
                    i2 = sArr[i3][1] == i ? 6 : 3;
                    break;
            }
        }
        b(sArr);
        return i2;
    }

    public final boolean r() throws IOException {
        int[] iArrB = b();
        b(iArrB);
        e(iArrB);
        return iArrB[dx] != 0;
    }

    private void az() throws IOException {
        int[] iArrB = b();
        b(iArrB);
        iArrB[dz] = 1;
        if (iArrB[dr] == iArrB[dt] && D(15) == iArrB[ds]) {
            iArrB[dz] = 0;
        }
        c(iArrB);
        e(iArrB);
    }

    public final int a(int i, int[][] iArr, int i2) throws IOException {
        int iA = 0;
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[22];
        int iF = 0;
        m65q();
        int[] iArrB = b();
        b(iArrB);
        iArr3[0] = -1;
        for (int i3 = 0; i3 < this.dD; i3++) {
            b(i3, iArr2);
            int iV = v(i3);
            if (iV != iArr3[0]) {
                e(iV, iArr3);
            }
            if (i <= 4 && iArr2[1] >= (iArr3[1] >> 2) && iArr2[1] > 0) {
                switch (i) {
                    case 0:
                        iF = t.f(a(iArr2), iArr2[1]);
                        break;
                    case 1:
                        iF = t.f(iArr2[12], iArr2[1]);
                        break;
                    case 2:
                        iF = t.f(iArr2[11] + iArr2[10], iArr2[1]);
                        break;
                    case 3:
                        iF = t.f(iArr2[16], iArr2[1]);
                        break;
                    case 4:
                        iF = t.f(iArr2[14], iArr2[1]);
                        break;
                }
            } else {
                if (iArr2[1] >= iArr3[1] && iArr2[1] > 0) {
                    int iF2 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    switch (i) {
                        case 5:
                            iF2 = t.f((iArrB[f183do] / 60000) * 7, 5);
                            i4 = iArr2[4] + iArr2[6];
                            i5 = iArr2[5] + iArr2[7];
                            break;
                        case 6:
                            iF2 = t.f(t.e(iArrB[f183do], 98304), 300000);
                            i4 = iArr2[6];
                            i5 = iArr2[7];
                            break;
                        case 7:
                            iF2 = t.f(t.e(iArrB[f183do], 131072), 300000);
                            i4 = iArr2[8];
                            i5 = iArr2[9];
                            break;
                    }
                    if (i4 > 0 && t.f(i4, iArr2[1]) >= iF2) {
                        iF = t.f(i5, i4);
                    }
                }
            }
            iA = a(i3, iF, 1, iArr, i2, iA);
        }
        int i6 = iA;
        s();
        e(iArrB);
        return i6;
    }

    public final int b(int i, int[][] iArr, int i2) throws IOException {
        int iA = 0;
        int[] iArr2 = new int[22];
        int iF = 0;
        m65q();
        for (int i3 = 0; i3 < this.dC; i3++) {
            e(i3, iArr2);
            if (i > 4) {
                int i4 = 0;
                int i5 = 0;
                switch (i) {
                    case 5:
                        i4 = iArr2[2] + iArr2[4];
                        i5 = iArr2[3] + iArr2[5];
                        break;
                    case 6:
                        i4 = iArr2[4];
                        i5 = iArr2[5];
                        break;
                    case 7:
                        i4 = iArr2[6];
                        i5 = iArr2[7];
                        break;
                }
                if (i4 > 0) {
                    iF = t.f(i5, i4);
                }
            } else if (iArr2[1] > 0) {
                switch (i) {
                    case 0:
                        iF = t.f((iArr2[5] * 3) + (iArr2[3] << 1) + iArr2[7], iArr2[1]);
                        break;
                    case 1:
                        iF = t.f(iArr2[10], iArr2[1]);
                        break;
                    case 2:
                        iF = t.f(iArr2[9] + iArr2[8], iArr2[1]);
                        break;
                    case 3:
                        iF = t.f(iArr2[13], iArr2[1]);
                        break;
                    case 4:
                        iF = t.f(iArr2[11], iArr2[1]);
                        break;
                }
            } else {
                iF = 0;
            }
            iA = a(i3, iF, 1, iArr, i2, iA);
        }
        int i6 = iA;
        s();
        return i6;
    }

    public static int a(ab abVar, ab abVar2, ab abVar3, ab abVar4) {
        Z.b(abVar, abVar2);
        int iM11a = ab.m11a(Z, abVar3);
        abVar4.c(abVar3);
        abVar4.R(iM11a);
        abVar4.d(abVar2);
        return iM11a;
    }

    public static boolean a(ab abVar, ab abVar2, ab abVar3, int i, int[] iArr) {
        int i2;
        int iF;
        int iF2 = 0;
        aa.b(abVar, abVar3);
        int iM11a = ab.m11a(aa, abVar2);
        int iM11a2 = ab.m11a(aa, aa);
        int iM11a3 = ab.m11a(abVar2, abVar2);
        int iE = t.e(i, i);
        int iE2 = t.e(131072, iM11a3 - iE);
        if (iE2 != 0) {
            int iE3 = t.e(iM11a, iM11a) + t.e(iE - iM11a3, iM11a2);
            if (iE3 < 0) {
                return false;
            }
            if (iE3 <= 2621) {
                i2 = 1;
                int iF3 = t.f(-iM11a, iE2);
                iF = iF3;
                if (iF3 < 0) {
                    return false;
                }
            } else {
                i2 = 2;
                int iE4 = t.e(131072, t.r(iE3));
                iF = t.f((-iM11a) - iE4, iE2);
                iF2 = t.f((-iM11a) + iE4, iE2);
                if (iF < 0 && iF2 < 0) {
                    return false;
                }
                if (iF > iF2) {
                    iF2 = iF;
                    iF = iF2;
                }
            }
        } else {
            if (iM11a == 0) {
                return false;
            }
            i2 = 1;
            int iF4 = t.f(-iM11a2, t.e(131072, iM11a));
            iF = iF4;
            if (iF4 < 0) {
                return false;
            }
        }
        iArr[0] = i2;
        if (i2 <= 1) {
            iArr[1] = iF;
            return true;
        }
        iArr[1] = iF;
        iArr[2] = iF2;
        return true;
    }

    public static int a(ab abVar, boolean z) {
        ac.c(abVar);
        if (!z) {
            ac.eF = -ac.eF;
            ac.eG = -ac.eG;
        }
        for (int i = 0; i < 5; i++) {
            ab.eF = f[i][0];
            ab.eG = f[i][1];
            if (ab.m12b(ab, ac) >= G[i]) {
                return i;
            }
        }
        return 0;
    }

    private void aA() throws IOException {
        c cVar = new c(this);
        DataInputStream dataInputStreamA = cVar.a("nba2008_roster.db");
        boolean z = dataInputStreamA != null ? (dataInputStreamA.readInt() == -1492318433 && dataInputStreamA.readInt() == 268435460 && dataInputStreamA.readInt() == this.dC) ? false : true : true;
        cVar.c();
        if (z) {
            c("nba2008_roster.db");
            b bVar = new b(this);
            DataOutputStream dataOutputStreamA = bVar.a("nba2008_roster.db", true);
            dataOutputStreamA.writeInt(-1492318433);
            dataOutputStreamA.writeInt(268435460);
            dataOutputStreamA.writeInt(this.dC);
            int[] iArr = new int[15 * this.dC];
            int[] iArr2 = new int[this.dC];
            for (int i = 0; i < this.dD; i++) {
                int i2 = this.dE + (i * 34);
                this.f191b.reset();
                this.f191b.skip(i2);
                int iC = c(this.f191b);
                int iA = a(this.f191b);
                int i3 = 0;
                while (true) {
                    if (i3 >= this.dC) {
                        break;
                    }
                    if (iC == this.f188a[i3].cq) {
                        iArr[(i3 * 15) + iArr2[i3]] = iA;
                        int i4 = i3;
                        iArr2[i4] = iArr2[i4] + 1;
                        break;
                    }
                    i3++;
                }
            }
            for (int i5 = 0; i5 < this.dC; i5++) {
                for (int i6 = iArr2[i5]; i6 < 15; i6++) {
                    iArr[(i5 * 15) + i6] = -1;
                }
                dataOutputStreamA.writeShort(this.f188a[i5].cq);
                dataOutputStreamA.writeInt(iArr2[i5]);
                for (int i7 = 0; i7 < 15; i7++) {
                    dataOutputStreamA.writeShort(iArr[(i5 * 15) + i7]);
                }
            }
            bVar.c();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private short[] m64a(int i, int i2, int[] iArr) {
        int i3 = 0;
        byte[][] bArr = new byte[6][5];
        int i4 = i * (this.dC >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            i3 += i2 << i5;
        }
        int i6 = i4 + i3;
        short[] sArr = new short[i6 * 18];
        iArr[0] = i6;
        int[] iArr2 = new int[6];
        for (int i7 = 0; i7 < this.dC; i7++) {
            q qVarA = a(i7);
            bArr[qVarA.cu][iArr2[qVarA.cu]] = (byte) i7;
            int i8 = qVarA.cu;
            iArr2[i8] = iArr2[i8] + 1;
        }
        int[] iArr3 = new int[30];
        int[] iArr4 = new int[30];
        int i9 = 12;
        int i10 = 20;
        int i11 = i - 32;
        int i12 = 30 * (i >> 1);
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr2[i13] = -1;
        }
        if (i < 6) {
            i9 = 4;
            i10 = 0;
            i11 = 0;
        } else if (i < 10) {
            i9 = 4;
            i10 = 2;
            i11 = 0;
        } else if (i < 20) {
            i9 = 8;
            i10 = i - 8;
            i11 = 0;
        } else if (i < 40) {
            i9 = 8;
            i10 = 10;
            i11 = i - 18;
        }
        int i14 = i9 >> 1;
        for (int i15 = 0; i15 < 6; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                for (int i17 = 0; i17 < i9 / 4; i17++) {
                    for (int i18 = i16 + 1; i18 < 5; i18++) {
                        byte b = bArr[i15][i16];
                        byte b2 = bArr[i15][i18];
                        if (iArr4[b] >= i14) {
                            bArr2[(b2 * (i >> 1)) + iArr4[b2]] = b;
                            iArr4[b2] = iArr4[b2] + 1;
                        } else {
                            bArr2[(b * (i >> 1)) + iArr4[b]] = b2;
                            iArr4[b] = iArr4[b] + 1;
                        }
                        iArr3[b] = iArr3[b] + 1;
                        iArr3[b2] = iArr3[b2] + 1;
                    }
                }
            }
        }
        for (int i19 = 0; i19 < 2; i19++) {
            for (int i20 = 0; i20 < (i10 >> 1); i20++) {
                for (int i21 = 0; i21 < 3; i21++) {
                    int i22 = i21 + (i19 * 3);
                    int i23 = ((i21 + 1) % 3) + (i19 * 3);
                    for (int i24 = 0; i24 < 5; i24++) {
                        byte b3 = bArr[i22][i24];
                        byte b4 = bArr[i23][(i24 + i20) % 5];
                        bArr2[(b3 * (i >> 1)) + iArr4[b3]] = b4;
                        iArr4[b3] = iArr4[b3] + 1;
                        iArr3[b3] = iArr3[b3] + 1;
                        iArr3[b4] = iArr3[b4] + 1;
                    }
                }
            }
        }
        int i25 = i >> 1;
        int iO = this.f187c.o(15);
        for (int i26 = 0; i26 < i11; i26++) {
            for (int i27 = 0; i27 < 15; i27++) {
                byte b5 = bArr[i27 / 5][i27 % 5];
                int i28 = ((i27 + i26) + iO) % 15;
                byte b6 = bArr[(i28 / 5) + 3][i28 % 5];
                if (iArr4[b5] < i25) {
                    bArr2[(b5 * (i >> 1)) + iArr4[b5]] = b6;
                    iArr4[b5] = iArr4[b5] + 1;
                } else {
                    bArr2[(b6 * (i >> 1)) + iArr4[b6]] = b5;
                    iArr4[b6] = iArr4[b6] + 1;
                }
                iArr3[b5] = iArr3[b5] + 1;
                iArr3[b6] = iArr3[b6] + 1;
            }
        }
        int i29 = 0;
        int i30 = i << 1;
        byte[] bArr3 = new byte[i30 * 15 * 2];
        for (int i31 = 0; i31 < i30 * 15 * 2; i31++) {
            bArr3[i31] = -1;
        }
        for (int i32 = 0; i32 < i25; i32++) {
            for (int i33 = 0; i33 < 30; i33++) {
                int i34 = (i33 * i25) + i32;
                byte b7 = (byte) i33;
                byte b8 = bArr2[i34];
                boolean z = false;
                for (int i35 = 0; i35 < i30 && !z; i35++) {
                    int i36 = 0;
                    while (true) {
                        if (i36 < 15) {
                            int i37 = (i36 + (i35 * 15)) * 2;
                            if (bArr3[i37] < 0) {
                                z = true;
                                bArr3[i37] = b7;
                                bArr3[i37 + 1] = b8;
                                bArr2[i34] = -1;
                                break;
                            }
                            if (bArr3[i37] == b7 || bArr3[i37 + 1] == b7 || bArr3[i37] == b8 || bArr3[i37 + 1] == b8) {
                                break;
                            }
                            i36++;
                        }
                    }
                }
            }
        }
        int i38 = 0;
        for (int i39 = 0; i39 < i30; i39++) {
            for (int i40 = 0; i40 < 15; i40++) {
                if (bArr3[((i39 * 15) + i40) * 2] == -1) {
                    break;
                }
                sArr[i29 + 0] = bArr3[r0];
                sArr[i29 + 1] = bArr3[r0 + 1];
                sArr[i29 + 2] = (short) i38;
                sArr[i29 + 3] = (short) i39;
                sArr[i29 + 6] = 0;
                i38++;
                i29 += 18;
            }
        }
        int i41 = sArr[((i4 - 1) * 18) + 3] + 1;
        int i42 = i4;
        int i43 = i4 * 18;
        for (int i44 = 0; i44 < 4; i44++) {
            int i45 = 1 << ((4 - i44) - 1);
            int i46 = 1;
            switch (i44) {
                case 1:
                    i46 = 5;
                    break;
                case 2:
                    i46 = 7;
                    break;
                case 3:
                    i46 = 15;
                    break;
            }
            for (int i47 = 0; i47 < i2; i47++) {
                int i48 = i47;
                boolean z2 = true;
                switch (i2) {
                    case 5:
                    case 7:
                        if (i48 < 4) {
                            z2 = (i48 >> 1) == 0;
                            break;
                        } else {
                            i48 -= 4;
                        }
                    case 3:
                        z2 = (i48 & 1) == 0;
                        break;
                }
                for (int i49 = 0; i49 < i45; i49++) {
                    int i50 = i46 + i49;
                    if (i49 >= (i45 >> 1) && i46 != 15) {
                        i50 = (i50 - (i45 >> 1)) + 7;
                    }
                    int i51 = 0;
                    int i52 = 0;
                    switch (i50) {
                        case 1:
                            i51 = 50;
                            i52 = 57;
                            break;
                        case 2:
                            i51 = 53;
                            i52 = 54;
                            break;
                        case 3:
                            i51 = 51;
                            i52 = 56;
                            break;
                        case 4:
                            i51 = 52;
                            i52 = 55;
                            break;
                        case 5:
                            i51 = 58;
                            i52 = 59;
                            break;
                        case 6:
                            i51 = 60;
                            i52 = 61;
                            break;
                        case 7:
                            i51 = 62;
                            i52 = 63;
                            break;
                        case 8:
                            i51 = 65;
                            i52 = 72;
                            break;
                        case 9:
                            i51 = 68;
                            i52 = 69;
                            break;
                        case 10:
                            i51 = 66;
                            i52 = 71;
                            break;
                        case 11:
                            i51 = 67;
                            i52 = 70;
                            break;
                        case 12:
                            i51 = 73;
                            i52 = 74;
                            break;
                        case 13:
                            i51 = 75;
                            i52 = 76;
                            break;
                        case 14:
                            i51 = 77;
                            i52 = 78;
                            break;
                        case 15:
                            i51 = 64;
                            i52 = 79;
                            break;
                    }
                    if (z2) {
                        sArr[i43 + 1] = (short) i52;
                        sArr[i43 + 0] = (short) i51;
                    } else {
                        sArr[i43 + 1] = (short) i51;
                        sArr[i43 + 0] = (short) i52;
                    }
                    sArr[i43 + 6] = (short) i50;
                    sArr[i43 + 3] = (short) i41;
                    sArr[i43 + 2] = (short) i42;
                    i42++;
                    i43 += 18;
                }
                i41++;
            }
        }
        return sArr;
    }

    private void f(int i, boolean z) throws IOException {
        int[] iArr = new int[22];
        e(i, iArr);
        q qVarA = a(i);
        q qVarA2 = a(i);
        if (z) {
            iArr[14] = iArr[14] + 1;
            if (qVarA.cu == qVarA2.cu) {
                iArr[16] = iArr[16] + 1;
            }
            if (qVarA.cu / 3 == qVarA2.cu / 3) {
                iArr[18] = iArr[18] + 1;
            } else {
                iArr[20] = iArr[20] + 1;
            }
        } else {
            iArr[15] = iArr[15] + 1;
            if (qVarA.cu == qVarA2.cu) {
                iArr[17] = iArr[17] + 1;
            }
            if (qVarA.cu / 3 == qVarA2.cu / 3) {
                iArr[19] = iArr[19] + 1;
            } else {
                iArr[21] = iArr[21] + 1;
            }
        }
        d(iArr);
    }

    private void a(int i, ae aeVar) throws IOException {
        int[] iArr = new int[22];
        e(i, iArr);
        aeVar.br = iArr[0];
        aeVar.fz = iArr[15];
        aeVar.cv = iArr[14];
    }

    private void c(int i, ae[] aeVarArr) throws IOException {
        int i2 = 0;
        for (int i3 = 0; i3 < this.dC; i3++) {
            if (a(i3).cu == i) {
                int[] iArr = new int[22];
                e(i3, iArr);
                aeVarArr[i2].br = iArr[0];
                aeVarArr[i2].fz = iArr[15];
                aeVarArr[i2].cv = iArr[14];
                i2++;
            }
        }
    }

    private void d(int i, ae[] aeVarArr) throws IOException {
        int i2 = 0;
        for (int i3 = 0; i3 < this.dC; i3++) {
            if (a(i3).cu / 3 == i) {
                int[] iArr = new int[22];
                e(i3, iArr);
                aeVarArr[i2].br = iArr[0];
                aeVarArr[i2].fz = iArr[15];
                aeVarArr[i2].cv = iArr[14];
                i2++;
            }
        }
    }

    private static void a(ae[] aeVarArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (aeVarArr[i2].fz + aeVarArr[i2].cv == 0) {
                aeVarArr[i2].fy = 0;
            } else {
                aeVarArr[i2].fy = t.f(aeVarArr[i2].cv, aeVarArr[i2].fz + aeVarArr[i2].cv);
            }
        }
        for (int i3 = 0; i3 < i - 1; i3++) {
            for (int i4 = i3 + 1; i4 < i; i4++) {
                if (aeVarArr[i3].fy < aeVarArr[i4].fy) {
                    ae aeVar = aeVarArr[i3];
                    aeVarArr[i3] = aeVarArr[i4];
                    aeVarArr[i4] = aeVar;
                }
            }
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            for (int i6 = i5 + 1; i6 < i && aeVarArr[i5].fy == aeVarArr[i6].fy; i6++) {
                if (aeVarArr[i5].cv < aeVarArr[i6].cv) {
                    ae aeVar2 = aeVarArr[i5];
                    aeVarArr[i5] = aeVarArr[i6];
                    aeVarArr[i6] = aeVar2;
                }
            }
        }
        for (int i7 = 0; i7 < i - 1; i7++) {
            for (int i8 = i7 + 1; i8 < i && aeVarArr[i7].cv == aeVarArr[i8].cv; i8++) {
                if (aeVarArr[i7].fz > aeVarArr[i8].fz) {
                    ae aeVar3 = aeVarArr[i7];
                    aeVarArr[i7] = aeVarArr[i8];
                    aeVarArr[i8] = aeVar3;
                }
            }
        }
        aeVarArr[0].fB = 0;
        aeVarArr[0].fA = 0;
        int i9 = aeVarArr[0].cv;
        int i10 = aeVarArr[0].fz;
        for (int i11 = 1; i11 < i; i11++) {
            aeVarArr[i11].fB = aeVarArr[i11].fz - i10;
            aeVarArr[i11].fA = i9 - aeVarArr[i11].cv;
        }
    }

    private static void a(int i, int i2, short[][] sArr, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (sArr[i4][1] == i2) {
                sArr[i4][1] = (short) i;
            }
            if (sArr[i4][0] == i2) {
                sArr[i4][0] = (short) i;
            }
        }
    }

    private void aB() throws IOException {
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int i = 0;
        while (i < 2) {
            ae[] aeVarArr = new ae[15];
            ae[] aeVarArr2 = new ae[3];
            for (int i2 = 0; i2 < 15; i2++) {
                aeVarArr[i2] = new ae(this);
            }
            for (int i3 = 0; i3 < 3; i3++) {
                aeVarArr2[i3] = new ae(this);
            }
            int[] iArr3 = i == 0 ? iArr : iArr2;
            b(i, aeVarArr);
            for (int i4 = i * 3; i4 < (i * 3) + 3; i4++) {
                ae[] aeVarArr3 = new ae[5];
                for (int i5 = 0; i5 < 5; i5++) {
                    aeVarArr3[i5] = new ae(this);
                }
                a(i4, aeVarArr3);
                aeVarArr2[i4 - (i * 3)] = aeVarArr3[0];
            }
            a(aeVarArr2, 3);
            for (int i6 = 0; i6 < 3; i6++) {
                iArr3[i6] = aeVarArr2[i6].br;
            }
            int i7 = 3;
            for (int i8 = 0; i8 < 15 && i7 < 8; i8++) {
                boolean z = true;
                for (int i9 = 0; i9 < 5 && z; i9++) {
                    if (iArr3[i9] == aeVarArr[i8].br) {
                        z = false;
                    }
                }
                if (z) {
                    iArr3[i7] = aeVarArr[i8].br;
                    i7++;
                }
            }
            i++;
        }
        int[] iArrB = b();
        short[][] sArr = new short[15][0];
        a(sArr);
        b(iArrB);
        int iL = l();
        for (int i10 = iL; i10 < iL + iArrB[dv]; i10++) {
            int iA = a(i10, sArr);
            for (int i11 = 0; i11 < 8; i11++) {
                a(iArr[i11], 50 + i11, sArr, iA);
                a(iArr2[i11], 65 + i11, sArr, iA);
                if (iArr[i11] == iArrB[ds] || iArr2[i11] == iArrB[ds]) {
                    iArrB[dy] = 1;
                }
            }
            for (int i12 = 0; i12 < iA; i12++) {
                c(sArr[i12]);
            }
        }
        c(iArrB);
        b(sArr);
        e(iArrB);
    }

    private void aC() throws IOException {
        int[] iArrB = b();
        int[] iArr = new int[4];
        short[][] sArr = new short[15][0];
        a(sArr);
        int iL = l();
        b(iArrB);
        int i = iL + iArrB[dv];
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                iArr[i3] = D(i3 + 1 + (i2 * 7));
            }
            for (int i4 = 0; i4 < 4; i4 += 2) {
                ae[] aeVarArr = {new ae(this), new ae(this)};
                int i5 = (i4 >> 1) + 5 + (i2 * 7);
                a(iArr[i4], aeVarArr[0]);
                a(iArr[i4 + 1], aeVarArr[1]);
                a(aeVarArr, 2);
                for (int i6 = i; i6 < i + iArrB[dv]; i6++) {
                    int iA = a(i6, i5, sArr);
                    a(aeVarArr[0].br, i4 + 58 + (i2 * 15), sArr, iA);
                    a(aeVarArr[1].br, i4 + 1 + 58 + (i2 * 15), sArr, iA);
                    for (int i7 = 0; i7 < iA; i7++) {
                        c(sArr[i7]);
                    }
                }
            }
        }
        b(sArr);
        e(iArrB);
    }

    private void aD() throws IOException {
        short[][] sArr = new short[15][0];
        a(sArr);
        int[] iArrB = b();
        int[] iArr = new int[2];
        ae[] aeVarArr = new ae[2];
        for (int i = 0; i < 2; i++) {
            aeVarArr[i] = new ae(this);
        }
        int iL = l();
        b(iArrB);
        int i2 = iL + (2 * iArrB[dv]);
        iArr[0] = D(5);
        iArr[1] = D(6);
        a(iArr[0], aeVarArr[0]);
        a(iArr[1], aeVarArr[1]);
        a(aeVarArr, 2);
        for (int i3 = i2; i3 < i2 + iArrB[dv]; i3++) {
            int iA = a(i3, 7, sArr);
            a(aeVarArr[0].br, 62, sArr, iA);
            a(aeVarArr[1].br, 63, sArr, iA);
            for (int i4 = 0; i4 < iA; i4++) {
                c(sArr[i4]);
            }
        }
        iArr[0] = D(12);
        iArr[1] = D(13);
        a(iArr[0], aeVarArr[0]);
        a(iArr[1], aeVarArr[1]);
        a(aeVarArr, 2);
        for (int i5 = i2; i5 < i2 + iArrB[dv]; i5++) {
            int iA2 = a(i5, 14, sArr);
            a(aeVarArr[0].br, 77, sArr, iA2);
            a(aeVarArr[1].br, 78, sArr, iA2);
            for (int i6 = 0; i6 < iA2; i6++) {
                c(sArr[i6]);
            }
        }
        b(sArr);
        e(iArrB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [short[], short[][]] */
    private void aE() throws IOException {
        ?? r0 = new short[15];
        a((short[][]) r0);
        int[] iArrB = b();
        int[] iArr = new int[2];
        ae[] aeVarArr = new ae[2];
        for (int i = 0; i < 2; i++) {
            aeVarArr[i] = new ae(this);
        }
        int iL = l();
        b(iArrB);
        int i2 = iL + (3 * iArrB[dv]);
        iArr[0] = D(7);
        iArr[1] = D(14);
        a(iArr[0], aeVarArr[0]);
        a(iArr[1], aeVarArr[1]);
        a(aeVarArr, 2);
        for (int i3 = i2; i3 < i2 + iArrB[dv]; i3++) {
            int iA = a(i3, 15, (short[][]) r0);
            a(aeVarArr[0].br, 64, (short[][]) r0, iA);
            a(aeVarArr[1].br, 79, (short[][]) r0, iA);
            for (int i4 = 0; i4 < iA; i4++) {
                c(r0[i4]);
            }
        }
        b((short[][]) r0);
        e(iArrB);
    }

    private int D(int i) throws IOException {
        int i2;
        int[] iArrB = b();
        short s = -1;
        int iL = l();
        b(iArrB);
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 0;
                break;
            case 5:
            case 6:
            case 12:
            case 13:
                i2 = 1;
                break;
            case 7:
            case 14:
                i2 = 2;
                break;
            case 15:
                i2 = 3;
                break;
            default:
                return -1;
        }
        int i3 = iL + (i2 * iArrB[dv]);
        int[] iArr = new int[2];
        short[][] sArr = new short[1][0];
        a(sArr);
        int i4 = (iArrB[dv] >> 1) + 1;
        a(i3, i, sArr);
        short s2 = sArr[0][0];
        short s3 = sArr[0][1];
        a(i2, (int) s2, iArr);
        if (iArr[0] == i4) {
            s = s2;
        } else if (iArr[1] == i4) {
            s = s3;
        }
        b(sArr);
        e(iArrB);
        return s;
    }

    private void O(int i) throws IOException {
        short[][] sArr = new short[15][0];
        short[][] sArr2 = new short[1][0];
        a(sArr2);
        int[] iArrB = b();
        b(iArrB);
        int i2 = iArrB[dt] - (4 * iArrB[dv]);
        if (i < i2) {
            e(iArrB);
            return;
        }
        a(sArr);
        int i3 = (i - i2) / iArrB[dv];
        int iA = a(i, sArr);
        for (int i4 = 0; i4 < iA; i4++) {
            short s = sArr[i4][6];
            if (D(s) != -1) {
                for (int i5 = i; i5 < i2 + (i3 * iArrB[dv]) + iArrB[dv]; i5++) {
                    a(i5, s, sArr2);
                    if (sArr2[0][7] == 0) {
                        sArr2[0][7] = 3;
                        c(sArr2[0]);
                    }
                }
            }
        }
        b(sArr);
        e(iArrB);
    }

    private static int a(int i, int i2, int i3, int[][] iArr, int i4, int i5) {
        int i6 = -1;
        if (i5 == i4) {
            if (i3 == 1) {
                if (iArr[i5 - 1][1] >= i2) {
                    return i5;
                }
            } else if (i3 == 0 && iArr[i5 - 1][1] <= i2) {
                return i5;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= i5) {
                break;
            }
            if (i3 != 1) {
                if (i3 == 0 && iArr[i7][1] > i2) {
                    i6 = i7;
                    break;
                }
                i7++;
            } else {
                if (iArr[i7][1] < i2) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
        }
        if (i6 >= 0) {
            for (int iMin = Math.min(i5, i4 - 1); iMin > i6; iMin--) {
                iArr[iMin][1] = iArr[iMin - 1][1];
                iArr[iMin][0] = iArr[iMin - 1][0];
            }
            iArr[i6][1] = i2;
            iArr[i6][0] = i;
            if (i5 < i4) {
                i5++;
            }
        } else if (i5 < i4) {
            iArr[i5][1] = i2;
            iArr[i5][0] = i;
            i5++;
        }
        return i5;
    }

    /* renamed from: q, reason: collision with other method in class */
    public final int m65q() throws IOException {
        if (this.f190d == null) {
            c cVarM61a = m61a(((m) this.f187c).cc);
            this.f190d = cVarM61a.a();
            this.dH = this.f190d.length;
            cVarM61a.c();
        }
        if (this.f190d != null) {
            this.dG++;
        }
        return this.dG;
    }

    /* renamed from: r, reason: collision with other method in class */
    public final int m66r() throws IOException {
        if (this.dG > 0) {
            this.dG--;
            if (this.dG == 0) {
                b bVarM62a = m62a(((m) this.f187c).cc);
                bVarM62a.write(this.f190d, 0, this.dH);
                this.f190d = null;
                this.dH = 0;
                bVarM62a.c();
            }
        }
        return this.dG;
    }

    public final int s() throws IOException {
        if (this.dG > 0) {
            this.dG--;
            if (this.dG == 0) {
                this.f190d = null;
                this.dG = 0;
                this.dH = 0;
            }
        }
        return this.dG;
    }

    private int[] b() {
        int[] iArr = null;
        if (this.n == null) {
            this.n = new int[10][dB];
        }
        if (this.dI == 10) {
            return new int[dB];
        }
        int i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            if (this.n[i] != null) {
                iArr = this.n[i];
                this.n[i] = null;
                this.dI++;
                break;
            }
            i++;
        }
        return iArr;
    }

    private void e(int[] iArr) {
        if (iArr == null) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (this.n[i] == null) {
                this.n[i] = iArr;
                if (this.dI > 0) {
                    this.dI--;
                    return;
                }
                return;
            }
        }
    }

    private short[] a() {
        short[] sArr = null;
        if (this.f192f == null) {
            this.f192f = new short[32][18];
        }
        if (this.dJ == 32) {
            return new short[18];
        }
        int i = 0;
        while (true) {
            if (i >= 32) {
                break;
            }
            if (this.f192f[i] != null) {
                sArr = this.f192f[i];
                this.f192f[i] = null;
                this.dJ++;
                break;
            }
            i++;
        }
        return sArr;
    }

    private void f(short[] sArr) {
        if (sArr == null) {
            return;
        }
        for (int i = 0; i < 32; i++) {
            if (this.f192f[i] == null) {
                this.f192f[i] = sArr;
                if (this.dJ > 0) {
                    this.dJ--;
                    return;
                }
                return;
            }
        }
    }

    private void a(short[][] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = a();
        }
    }

    private void b(short[][] sArr) {
        for (short[] sArr2 : sArr) {
            f(sArr2);
        }
    }

    public final void aF() {
        this.n = (int[][]) null;
        this.dI = 0;
        this.f192f = (short[][]) null;
        this.dJ = 0;
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                this.f184a[i][i2] = null;
                this.f185a[i][i2] = null;
            }
        }
    }

    private static int a(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        int i = (s & 255) >> 0;
        int i2 = (s & 65280) >> 8;
        if (i < 0) {
            i += 256;
        }
        if (i2 < 0) {
            i2 += 256;
        }
        return (i << 8) | (i2 << 0);
    }

    private static int b(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        int i2 = (i & 255) >> 0;
        int i3 = (i & 65280) >> 8;
        int i4 = (i & 16711680) >> 16;
        int i5 = (i & (-16777216)) >> 24;
        if (i2 < 0) {
            i2 += 256;
        }
        if (i3 < 0) {
            i3 += 256;
        }
        if (i4 < 0) {
            i4 += 256;
        }
        if (i5 < 0) {
            i5 += 256;
        }
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | (i5 << 0);
    }

    private static int c(DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readByte();
    }

    private static String a(DataInputStream dataInputStream, int i) throws IOException {
        String string = "";
        boolean z = false;
        if (i >= 0) {
            while (true) {
                int i2 = i;
                i = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                char c2 = (char) dataInputStream.readByte();
                if (c2 == 0) {
                    z = true;
                } else if (!z) {
                    string = new StringBuffer().append(string).append(c2).toString();
                }
            }
        } else {
            while (true) {
                char c3 = (char) dataInputStream.readByte();
                if (c3 == 0) {
                    break;
                }
                string = new StringBuffer().append(string).append(c3).toString();
            }
        }
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(String str) {
        try {
            RecordStore.deleteRecordStore(str);
        } catch (RecordStoreException e) {
            str.printStackTrace();
        } catch (RecordStoreNotFoundException unused) {
        }
    }
}
