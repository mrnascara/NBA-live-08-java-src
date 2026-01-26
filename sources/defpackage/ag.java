package defpackage;

import NBALIVE08.EASports.Mobile;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ag.class */
public final class ag extends u {
    private static final int[] W = {349, 349, 349, 349};
    private static final int[] X = {359, 361, 361, 363};
    public static final int[] Y = {1462670852, 539600530, -1189021912, -836253762, 1346589213, 658793099, -1102236879, -917896281, 1509236278, 787623584, 1312139077};
    private static final int[] Z = {129, 130, 126, 127, 131, 133, 132, 135, 112, 109, 113, 110, 114, 111, 128, 134};
    public static final String[] e = {"TET", "HPO", "NPS", "LOG"};
    private m a;

    /* renamed from: a, reason: collision with other field name */
    private v f18a;
    private Image v;
    private Image w;
    private Image[] c;
    private Image x;
    private Image y;

    /* renamed from: W, reason: collision with other field name */
    private boolean f19W;
    private Image o;
    private Image p;
    private Image z;
    private r k;
    private r l;
    private r m;
    private r n;

    /* renamed from: o, reason: collision with other field name */
    private r f20o;

    /* renamed from: p, reason: collision with other field name */
    private r f21p;
    private r q;
    private r r;
    private int[] aa;
    private u j;
    private int fH;
    private boolean S;

    /* renamed from: X, reason: collision with other field name */
    private boolean f22X;
    private int[] ab;
    private int fI;

    /* renamed from: Y, reason: collision with other field name */
    private boolean f23Y;

    /* renamed from: a, reason: collision with other field name */
    private int f24a;
    private int fJ;
    private int fK;
    private int fL;
    private int fM;

    /* renamed from: c, reason: collision with other field name */
    private i f25c;
    private i d;

    /* renamed from: e, reason: collision with other field name */
    private i f26e;

    /* renamed from: a, reason: collision with other field name */
    private f f27a;

    /* renamed from: Z, reason: collision with other field name */
    private boolean f28Z;

    /* renamed from: aa, reason: collision with other field name */
    private boolean f29aa;

    /* renamed from: a, reason: collision with other field name */
    private k f30a;
    private k b;

    /* renamed from: a, reason: collision with other field name */
    private l f31a;

    /* renamed from: k, reason: collision with other field name */
    private u f32k;
    private String[] f;
    private int fN;
    private int fO;
    private int[] ac;
    private int[] ad;

    /* renamed from: ab, reason: collision with other field name */
    private boolean f33ab;
    private ai E;
    private int fP;
    private int[] ae;
    private int fQ;
    private int fR;
    private int fS;
    private int fT;
    private int fU;

    /* renamed from: ac, reason: collision with other field name */
    private boolean f34ac;

    /* renamed from: ad, reason: collision with other field name */
    private boolean f35ad;

    /* renamed from: ae, reason: collision with other field name */
    private boolean f36ae;
    private int fV;
    private int fW;
    private boolean af;

    /* renamed from: o, reason: collision with other field name */
    private int[][] f37o;
    private int fX;

    /* renamed from: b, reason: collision with other field name */
    private boolean f38b;
    private int fY;
    private int fZ;
    private boolean ag;
    private int ga;
    private int gb;
    private int gc;
    private int gd;
    private ai g;

    /* renamed from: af, reason: collision with other field name */
    private int[] f39af;

    /* renamed from: g, reason: collision with other field name */
    private short[] f40g;
    private String t;
    private String u;

    /* renamed from: ag, reason: collision with other field name */
    private int[] f41ag;

    /* renamed from: d, reason: collision with other field name */
    private int[][] f42d;
    private int ge;
    private boolean ah;

    public ag(t tVar, v vVar) {
        super(tVar, 0);
        this.c = new Image[30];
        this.aa = new int[10];
        this.j = null;
        this.ab = new int[32];
        this.f = new String[2];
        this.ac = new int[4];
        this.ad = new int[2];
        this.f33ab = false;
        this.E = new ai();
        this.ae = new int[15];
        this.f37o = new int[8][3];
        this.g = new ai();
        new ai();
        this.f41ag = new int[8];
        this.ge = 0;
        new ai();
        this.dM = 1001;
        this.a = (m) tVar;
        this.fP = 0;
        this.f34ac = true;
        this.f38b = true;
        this.fM = 0;
        this.f19W = false;
        this.f18a = vVar;
        vVar.getClass();
        this.f25c = new i(vVar);
        vVar.getClass();
        this.d = new i(vVar);
        this.f39af = new int[v.dB];
    }

    @Override // defpackage.u, defpackage.w
    public final void f() throws IOException {
        super.f();
        q(((w) this).d.d(), ((w) this).d.e());
        setPosition(0, 0);
        this.f24a = -1;
    }

    @Override // defpackage.u
    public final int a(int i) throws IOException {
        switch (i) {
            case 0:
                t.m46a(310);
                break;
            case 1:
                t.m46a(312);
                break;
            case 2:
                t.m46a(314);
                break;
            case 3:
                t.m46a(313);
                break;
            case 4:
                t.m46a(318);
                break;
            case 5:
                t.m46a(319);
                break;
            case 6:
                t.m46a(326);
                break;
            case 7:
                t.m46a(327);
                break;
            case 8:
                t.m46a(328);
                break;
            case 9:
                t.m46a(329);
                break;
            case 10:
                t.m46a(330);
                break;
            case 11:
            case 19:
            case 23:
            case 47:
            case 48:
            case 49:
            case 50:
                break;
            case 12:
                t.m46a(332);
                break;
            case 13:
                t.m46a(333);
                break;
            case 14:
                t.m46a(334);
                break;
            case 15:
                t.m46a(335);
                break;
            case 16:
                t.m46a(336);
                break;
            case 17:
                t.m46a(337);
                break;
            case 18:
                t.m46a(338);
                break;
            case 20:
                t.m46a(340);
                break;
            case 21:
                t.m46a(341);
                break;
            case 22:
                t.m46a(317);
                break;
            case 24:
                t.m46a(325);
                break;
            case 25:
                t.m46a(342);
                break;
            case 26:
                t.m46a(343);
                break;
            case 27:
                t.m46a(344);
                break;
            case 28:
                t.m46a(345);
                break;
            case 29:
                t.m46a(346);
                break;
            case 30:
                t.m46a(320);
                break;
            case 31:
                t.m46a(321);
                break;
            case 32:
                t.m46a(322);
                break;
            case 33:
                t.m46a(323);
                break;
            case 34:
                t.m46a(324);
                break;
            case 35:
                t.m46a(311);
                break;
            case 36:
                t.m46a(347);
                t.f177b = null;
                break;
            case 37:
                this.k = this.a.a(8, 12, 9);
                break;
            case 38:
                this.m = this.a.a(8, 15, 9);
                break;
            case 39:
                this.l = this.a.a(8, 14, 9);
                break;
            case 40:
                this.f20o = this.a.a(8, 16, 9);
                break;
            case 41:
                this.n = this.a.a(8, 13, 9);
                break;
            case 42:
                this.f21p = this.a.a(10, 12, 11);
                break;
            case 43:
                this.q = this.a.a(10, 13, 11);
                break;
            case 44:
                this.r = this.a.a(10, 14, 11);
                break;
            case 45:
                this.a.a(10, 16, 11);
                break;
            case 46:
                this.x = t.m44a(310, 0);
                this.y = null;
                this.f19W = false;
                break;
            case 51:
                this.fV = 1;
                this.fW = 0;
                this.o = t.m44a(309, 18);
                this.p = t.m44a(309, 19);
                break;
            case 52:
                if (!this.f28Z) {
                    ((w) this).d.a(325, 8, 8, "audio/midi");
                    ((w) this).d.a(325, 7, 7, "audio/amr");
                    break;
                }
                break;
            case 53:
                this.f30a = new k(((w) this).d);
                a(this.f30a);
                this.f30a.aG();
                this.f30a.j(0, 5658198);
                this.f30a.j(1, 13027014);
                this.f30a.j(2, 16777215);
                this.f30a.j(3, 16449534);
                this.f30a.j(4, 5658198);
                this.f30a.j(5, 16777215);
                this.f30a.j(6, 189939753);
                this.f30a.j(7, 15799837);
                this.f30a.j(8, 4013373);
                this.f30a.j(9, 4013373);
                break;
            case 54:
                this.b = new k(((w) this).d);
                a(this.b);
                this.b.aG();
                this.b.j(0, 5658198);
                this.b.j(1, 13027014);
                this.b.j(2, 16777215);
                this.b.j(3, 16449534);
                this.b.j(4, 5658198);
                this.b.j(5, 16777215);
                this.b.j(6, 189939753);
                this.b.j(7, 15799837);
                this.b.j(8, 4013373);
                this.b.j(9, 4013373);
                break;
            case 55:
                v vVar = this.f18a;
                vVar.getClass();
                new ad(vVar);
                this.f40g = new short[18];
                this.f42d = new int[Math.max(30, 25)][2];
                break;
            case 56:
                DataInputStream dataInputStreamM48a = t.m48a(314, 3);
                dataInputStreamM48a.readShort();
                this.f31a = new l(((w) this).d);
                this.f31a.a(dataInputStreamM48a);
                this.f31a.q(B() - 10, ((C() - 46) - this.a.c()) - 2);
                this.f31a.setPosition(5, 46);
                this.f31a.aG();
                a(this.f31a);
                this.j = null;
                break;
            default:
                if (!this.f28Z && this.a.p) {
                    int i2 = (i - 37) - 20;
                    this.c[i2] = t.m45b(312, 12 + i2);
                    break;
                }
                break;
        }
        return ((i + 1) * 100) / 87;
    }

    @Override // defpackage.u, defpackage.w
    public final void g() throws IOException {
        this.j = null;
        if (!this.f28Z) {
            ((w) this).d.an();
        }
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.o = null;
        this.p = null;
        this.z = null;
        this.fH = 0;
        this.f30a.H();
        this.f30a = null;
        this.b.H();
        this.b = null;
        for (int i = 0; i < 30; i++) {
            this.c[i] = null;
        }
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.f20o = null;
        this.f21p = null;
        this.q = null;
        this.r = null;
        this.f31a = null;
        this.f27a = null;
        super.g();
        if (this.f28Z) {
            t.I(t.db & (t.de ^ (-1)));
        } else {
            t.I(t.db);
        }
    }

    @Override // defpackage.u
    public final void h(int i) throws IOException {
        if (this.f23Y) {
            ((w) this).d.c(this);
            aH();
            return;
        }
        if (((w) this).d.df != 1 && this.f24a >= 4 && i > this.ge && this.ge != -1) {
            bh();
        }
        ((m) ((w) this).d).S();
        int i2 = i - this.fJ;
        if (this.fK > 0 && i2 > this.fK && ((w) this).d.g == this) {
            m14b(this.f24a + 1, i);
        } else if (this.fM == 0) {
            switch (this.f24a) {
                case 2:
                    if (this.fU >= 0) {
                        this.fU++;
                        break;
                    }
                    break;
                case 3:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    if (this.gb != 0 && i > this.ga) {
                        switch (this.gb) {
                            case 131072:
                                this.f31a.J();
                                break;
                            case 262144:
                                this.f31a.I();
                                break;
                        }
                        this.ga = i + 128;
                        break;
                    }
                    break;
                case 4:
                case 5:
                    repaint();
                    break;
                case 11:
                    if (this.gb != 0 && i > this.ga) {
                        switch (this.fT) {
                            case 1:
                                if (!this.f28Z) {
                                    switch (this.gb) {
                                        case 32768:
                                            aZ();
                                            this.g.c(0, 46 + ((this.fT + 1) * 17), B(), 17);
                                            c(this.g);
                                            break;
                                        case 65536:
                                            aY();
                                            this.g.c(0, 46 + ((this.fT + 1) * 17), B(), 17);
                                            c(this.g);
                                            break;
                                    }
                                }
                                this.ga = i + 1000;
                                break;
                        }
                    }
                    break;
                case 21:
                case 22:
                    if (this.gb != 0 && i > this.ga) {
                        switch (this.fT) {
                            case 0:
                                switch (this.gb) {
                                    case 32768:
                                        int i3 = this.fY - 1;
                                        this.fY = i3;
                                        if (i3 < 0) {
                                            this.fY = this.f18a.dC - 1;
                                        }
                                        if (this.c[this.fY] == null) {
                                            this.c[this.fY] = t.m44a(313, 0 + this.fY);
                                        }
                                        repaint();
                                        break;
                                    case 65536:
                                        int i4 = this.fY + 1;
                                        this.fY = i4;
                                        if (i4 >= this.f18a.dC) {
                                            this.fY = 0;
                                        }
                                        if (this.c[this.fY] == null) {
                                            this.c[this.fY] = t.m44a(313, 0 + this.fY);
                                        }
                                        repaint();
                                        break;
                                }
                                this.ga = i + 1000;
                                break;
                            case 1:
                                switch (this.gb) {
                                    case 32768:
                                        if (21 == this.f24a) {
                                            this.a.m(17, v.z(this.a.d(17)));
                                        } else {
                                            int iD = this.a.d(18) - 2;
                                            if (iD < 3) {
                                                iD = 7;
                                            }
                                            this.a.m(18, iD);
                                        }
                                        repaint();
                                        break;
                                    case 65536:
                                        if (21 == this.f24a) {
                                            this.a.m(17, v.y(this.a.d(17)));
                                        } else {
                                            int iD2 = this.a.d(18) + 2;
                                            if (iD2 > 7) {
                                                iD2 = 3;
                                            }
                                            this.a.m(18, iD2);
                                        }
                                        repaint();
                                        break;
                                }
                                this.ga = i + 1000;
                                break;
                            case 2:
                                switch (this.gb) {
                                    case 32768:
                                        aZ();
                                        repaint();
                                        break;
                                    case 65536:
                                        aY();
                                        repaint();
                                        break;
                                }
                                this.ga = i + 1000;
                                break;
                        }
                    }
                    break;
                case 28:
                case 29:
                case 30:
                case 32:
                    if (this.gb != 0 && i > this.ga) {
                        switch (this.gb) {
                            case 32768:
                                this.f30a.l(-1, 0);
                                break;
                            case 65536:
                                this.f30a.l(1, 0);
                                break;
                            case 131072:
                                this.f30a.l(0, -1);
                                break;
                            case 262144:
                                this.f30a.l(0, 1);
                                break;
                        }
                        this.ga = i + 200;
                        break;
                    }
                    break;
                case 33:
                case 34:
                    if (this.gb != 0 && i > this.ga) {
                        boolean z = false;
                        switch (this.gb) {
                            case 32768:
                                this.b.l(-1, 0);
                                z = true;
                                break;
                            case 65536:
                                this.b.l(1, 0);
                                z = true;
                                break;
                            case 131072:
                                this.f30a.l(0, -1);
                                this.b.l(0, -1);
                                z = true;
                                break;
                            case 262144:
                                this.f30a.l(0, 1);
                                this.b.l(0, 1);
                                z = true;
                                break;
                        }
                        if (z) {
                            b(this.f26e);
                        }
                        this.ga = i + 200;
                        break;
                    }
                    break;
                case 35:
                    if (this.gb != 0 && i > this.ga) {
                        switch (this.gb) {
                            case 32768:
                                this.f30a.l(-1, 0);
                                this.b.l(-1, 0);
                                break;
                            case 65536:
                                this.f30a.l(1, 0);
                                this.b.l(1, 0);
                                break;
                            case 131072:
                                if (!this.f29aa) {
                                    this.f30a.l(0, -1);
                                    this.f30a.c(this.f30a.bJ - 1);
                                    break;
                                } else {
                                    this.b.l(0, -1);
                                    this.b.c(this.b.bJ - 1);
                                    break;
                                }
                            case 262144:
                                if (!this.f29aa) {
                                    this.f30a.l(0, 1);
                                    this.f30a.c(this.f30a.bJ + 1);
                                    break;
                                } else {
                                    this.b.l(0, 1);
                                    this.b.c(this.b.bJ + 1);
                                    break;
                                }
                        }
                        this.ga = i + 200;
                        break;
                    }
                    break;
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    this.gd = this.f18a.k();
                    repaint();
                    if (this.gd == 100) {
                        switch (this.f24a) {
                            case 37:
                                a(36, i, false);
                                break;
                            case 38:
                                a(this.f18a.m(), i, false);
                                return;
                            case 39:
                                a(this.f18a.n(), i, false);
                                break;
                            case 40:
                                a(this.f18a.o(), i, false);
                                break;
                            case 41:
                                this.f18a.e(this.f40g[0], this.f18a.P);
                                this.f18a.e(this.f40g[1], this.f18a.Q);
                                this.a.a(this.f40g[0], this.f40g[1], this.f39af[v.f183do], this.f40g[0] == this.f39af[v.ds]);
                                return;
                        }
                    }
                    break;
            }
        }
        if (1 == this.fM) {
            this.fM = 0;
            if (this.fL == -1) {
                g(i, true);
            } else if (this.fL == 43) {
                bj();
            } else {
                a(this.fL, i, this.f22X);
            }
        }
    }

    private void a(af afVar, int i, boolean z) {
        int i2 = 51;
        int i3 = 0;
        while (i3 < this.fS) {
            if (this.f24a != 11 || i3 != 3) {
                this.l.a(afVar, t.getString(this.fQ + i3), 15, i2);
                if (z) {
                    a(afVar, t.getString(this.a.d(i + i3) != 0 ? 205 : 206), i2, this.fT == i3, true, true, true);
                }
                i2 += 17;
            }
            i3++;
        }
    }

    private static String c(int i) {
        int i2 = i / 1000;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        String string = new StringBuffer().append("").append(i3).append(":").toString();
        return i4 < 10 ? new StringBuffer().append(string).append("0").append(i4).toString() : new StringBuffer().append(string).append(i4).toString();
    }

    @Override // defpackage.u, defpackage.w
    public final void b(af afVar) {
        if (!this.ah) {
            ((w) this).d.ag();
            this.ah = true;
        }
        switch (this.f24a) {
            case 0:
            case 1:
                afVar.b(null, 0);
                this.a.a(afVar, true, true);
                break;
            case 2:
                afVar.b(null, 16777215);
                afVar.a(this.v, (B() - this.v.getWidth()) >> 1, (C() - this.v.getHeight()) >> 1);
                break;
            case 3:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                a(afVar, this.f19W);
                if (3 == this.f24a) {
                    this.a.a(afVar, true, false);
                } else {
                    this.a.a(afVar, false, true);
                }
                j(afVar);
                this.f31a.b(afVar);
                break;
            case 4:
                int iG = t.g();
                if (iG - this.fP >= 700) {
                    this.f34ac = !this.f34ac;
                    this.fP = iG;
                }
                afVar.b(null, 16777215);
                k(afVar);
                if (!this.f34ac || !this.f38b) {
                    if (!this.f38b) {
                        this.a.a(afVar, true, true);
                        break;
                    }
                } else {
                    a(afVar, t.getString(this.fQ), (C() - this.k.cx) - 1, this.f20o);
                    break;
                }
                break;
            case 5:
                int iG2 = t.g();
                if (iG2 - this.fP >= 700) {
                    this.f34ac = !this.f34ac;
                    this.fP = iG2;
                }
                afVar.a(this.w, (B() - this.w.getWidth()) >> 1, (C() - this.w.getHeight()) >> 1);
                if (!this.f34ac || !this.f38b) {
                    if (!this.f38b) {
                        this.a.a(afVar, true, true);
                        break;
                    }
                } else {
                    a(afVar, t.getString(this.fQ), (C() - this.k.cx) - 1, this.f20o);
                    break;
                }
                break;
            case 6:
            case 7:
            case 9:
            case 13:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                a(afVar, this.f19W);
                this.j.b(afVar);
                int i = 17 * this.fH;
                int i2 = 6 == this.f24a ? i + 57 : i + 46;
                if (this.f24a == 25) {
                    a(afVar, i2 + 10, false, false);
                } else if (this.f24a == 23) {
                    if (this.fZ > -1) {
                        a(afVar, new StringBuffer().append(t.getString(90)).append(": ").append(this.f18a.a(this.fZ).p).toString(), this.f30a.w() + this.f30a.y() + 3, this.m);
                    }
                } else if (this.f24a == 24) {
                    a(afVar, this.u, (this.f30a.w() - this.m.cx) - 2, this.m);
                }
                this.a.a(afVar, true, true);
                break;
            case 8:
                a(afVar, this.f19W);
                j(afVar);
                int i3 = 50;
                int i4 = ((15 - this.k.cx) + 1) >> 1;
                int i5 = 0;
                while (i5 < this.fS) {
                    a(afVar, t.getString(this.fQ + i5), i3, this.l);
                    int i6 = i3 + 15;
                    q qVarA = this.f18a.a(i5 == 0 ? this.fY : this.fZ);
                    String string = this.fT == i5 ? new StringBuffer().append(qVarA.o).append(" - ").append(t.getString(207)).toString() : new StringBuffer().append(qVarA.o).append(" - ").append(t.getString(208)).toString();
                    a(afVar, 0, i6, this.k.stringWidth(string), true, true, this.fT == i5);
                    a(afVar, string, i6 + i4, this.k);
                    int i7 = i6 + 18;
                    a(afVar, i5 == 0 ? this.fY : this.fZ, i7, this.fT == i5);
                    i3 = i7 + 40;
                    i5++;
                }
                this.a.a(afVar, true, true);
                break;
            case 10:
                a(afVar, this.f19W);
                j(afVar);
                if (10 == this.f24a) {
                    a(afVar, 23, true);
                }
                this.a.a(afVar, false, true);
                break;
            case 11:
                a(afVar, this.f19W);
                j(afVar);
                a(afVar, 14, false);
                a(afVar, t.getString(44 + (this.f28Z ? this.f27a.H : this.a.d(14))), 51, this.fT == 0, !this.f28Z, true, true);
                a(afVar, c(this.f28Z ? this.f27a.s : this.a.d(15)), 68, this.fT == 1, !this.f28Z, true, true);
                a(afVar, t.getString(217 + this.a.d(16)), 85, this.fT == 2, true, true, true);
                a(afVar, t.getString(this.a.d(20) != 0 ? 205 : 206), 102, this.fT == 4, true, true, true);
                a(afVar, t.getString(this.a.d(21) != 0 ? 205 : 206), 119, this.fT == 5, true, true, true);
                boolean z = true;
                if (this.f28Z && (this.f27a.f77e.f48a == 5 || this.f27a.f77e.f48a == 18)) {
                    z = false;
                }
                a(afVar, t.getString(this.a.d(22) != 0 ? 205 : 206), 136, this.fT == 6, z, true, true);
                this.a.a(afVar, false, true);
                break;
            case 12:
                afVar.b(null, 0);
                if (!this.f33ab) {
                    afVar.b(this.E, -11240008);
                }
                this.a.a(afVar, !this.f33ab, true);
                break;
            case 21:
            case 22:
                a(afVar, this.f19W);
                j(afVar);
                int i8 = ((15 - this.k.cx) + 1) >> 1;
                a(afVar, t.getString(243), 50 + i8, this.l);
                q qVarA2 = this.f18a.a(this.fY);
                a(afVar, 0, 65, this.k.stringWidth(qVarA2.o), true, true, this.fT == 0);
                a(afVar, qVarA2.o, 65 + i8, this.k);
                a(afVar, this.fY, 82, this.fT == 0);
                if (21 == this.f24a) {
                    a(afVar, t.getString(244), 125 + i8, this.l);
                    String string2 = new StringBuffer().append("").append(this.a.d(17)).append(" ").append(t.getString(93)).toString();
                    a(afVar, 0, 140, this.k.stringWidth(string2), true, true, this.fT == 1);
                    a(afVar, string2, 140 + i8, this.k);
                } else {
                    a(afVar, t.getString(245), 125 + i8, this.l);
                    int iD = this.a.d(18);
                    String string3 = new StringBuffer().append("").append(iD).append("-").append(iD).append("-").append(iD).append("-").append(iD).toString();
                    a(afVar, 0, 140, this.k.stringWidth(string3), true, true, this.fT == 1);
                    a(afVar, string3, 140 + i8, this.k);
                }
                a(afVar, t.getString(246), 155 + i8, this.l);
                String strC = c(this.a.d(15));
                a(afVar, 0, 170, this.k.stringWidth(strC), true, true, this.fT == 2);
                a(afVar, strC, 170 + i8, this.k);
                this.a.a(afVar, true, true);
                break;
            case 28:
            case 29:
            case 30:
                a(afVar, this.f19W);
                j(afVar);
                int i9 = ((15 - this.k.cx) + 1) >> 1;
                String string4 = t.getString(this.fQ + this.fT);
                a(afVar, 0, 46, this.k.stringWidth(string4), true, true, true);
                a(afVar, string4, 46 + i9, this.k);
                this.a.a(afVar, false, true);
                break;
            case 31:
                a(afVar, this.f19W);
                j(afVar);
                String string5 = t.getString(this.fQ + this.fT);
                a(afVar, 0, 46, this.k.stringWidth(string5), this.fT > 0, this.fT < 6, true);
                a(afVar, string5, 46 + ((15 - this.k.cx) >> 1), this.k);
                l(afVar);
                this.a.a(afVar, false, true);
                break;
            case 32:
                a(afVar, this.f19W);
                j(afVar);
                this.a.a(afVar, false, true);
                break;
            case 33:
            case 34:
                a(afVar, this.f19W);
                int i10 = ((15 - this.k.cx) + 1) >> 1;
                this.g.c((B() - 176) >> 1, 46, 176, 15);
                afVar.b(this.g, 13317427);
                if (33 == this.f24a) {
                    a(afVar, this.f18a.a(this.fY).o, 46 + i10, this.k);
                } else {
                    a(afVar, this.f18a.a(this.fZ).o, 46 + i10, this.k);
                }
                this.a.a(afVar, false, true);
                break;
            case 35:
                a(afVar, this.f19W);
                j(afVar);
                String string6 = t.getString(98);
                this.g.c(this.b.v(), this.b.w() - this.f21p.cx, this.f21p.stringWidth(string6) + 6, this.f21p.cx + 1);
                afVar.b(this.g, 37104);
                afVar.a(this.g, 0);
                this.q.a(afVar, string6, this.g.eF + 3, this.g.eG + 1);
                this.a.a(afVar, true, true);
                break;
            case 36:
                a(afVar, this.f19W);
                j(afVar);
                a(afVar, 76, false, false);
                this.a.a(afVar, true, false);
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                int iB = (B() * 3) >> 2;
                a(afVar, this.f19W);
                j(afVar);
                this.g.eF = (B() - iB) >> 1;
                this.g.eG = (C() - 17) >> 1;
                this.g.gi = 17;
                this.g.gh = iB;
                afVar.a(this.g, 0);
                this.g.eF++;
                this.g.eG++;
                this.g.gh -= 2;
                this.g.gi -= 2;
                afVar.b(this.g, -3881788);
                this.g.gh = (this.g.gh * this.gd) / 100;
                afVar.b(this.g, -6029312);
                break;
            case 42:
                afVar.b(null, -16777216);
                afVar.a(this.z, (B() - this.z.getWidth()) >> 1, (C() - this.z.getHeight()) >> 1);
                this.a.a(afVar, false, true);
                break;
            case 44:
                a(afVar, false);
                this.a.a(afVar, true, true);
                break;
        }
        super.b(afVar);
    }

    private void S(int i) {
        int i2 = this.fT;
        if (this.f24a == 11 && this.fT > 3) {
            i2--;
        }
        this.g.c(0, 46 + (i2 * 17) + 5, B(), 17);
        c(this.g);
        if (i < 0) {
            if (this.fT == 0) {
                this.fT = this.fS - 1;
            } else {
                this.fT--;
            }
        } else if (this.fT == this.fS - 1) {
            this.fT = 0;
        } else {
            this.fT++;
        }
        if (this.f24a == 11 && this.f28Z) {
            if (this.fT == 0 || this.fT == 1) {
                S(i);
            }
            if (this.fT == 6 && (this.f27a.f77e.f48a == 5 || this.f27a.f77e.f48a == 18)) {
                S(i);
            }
        }
        int i3 = this.fT;
        if (this.f24a == 11) {
            if (this.fT == 3) {
                S(i);
                return;
            } else if (this.fT > 3) {
                i3--;
            }
        }
        this.g.c(0, 46 + (i3 * 17) + 5, B(), 17);
        c(this.g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0966  */
    @Override // defpackage.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag.a(int, int):boolean");
    }

    @Override // defpackage.u
    public final boolean b(int i, int i2) throws IOException {
        if (!this.ah || this.fM != 0) {
            return true;
        }
        int iG = t.g();
        switch (this.f24a) {
            case 6:
                if (this.f36ae) {
                    this.f36ae = false;
                    this.S = false;
                    this.af = true;
                    repaint();
                    this.a.a(this, 138, 139, 1);
                    return true;
                }
                break;
            case 8:
                if (this.f35ad) {
                    this.f35ad = false;
                    this.a.a(this.fY, this.fZ, this.a.d(15), this.ag);
                    return true;
                }
                break;
            case 21:
                if (this.f35ad) {
                    boolean z = true;
                    int iD = this.a.d(17);
                    this.f35ad = false;
                    this.a.cc = 1;
                    try {
                        this.f18a.a(this.fY, 1, iD, this.a.d(15), v.A(iD));
                    } catch (Exception unused) {
                        z = false;
                        this.a.b(t.getString(20), t.getString(21), t.getString(22));
                    }
                    if (z) {
                        a(23, iG, false);
                        break;
                    }
                }
                break;
            case 22:
                if (this.f35ad) {
                    boolean z2 = true;
                    int iD2 = this.a.d(18);
                    this.f35ad = false;
                    this.a.cc = 2;
                    try {
                        this.f18a.a(this.fY, 2, 4, this.a.d(15), iD2);
                    } catch (Exception unused2) {
                        z2 = false;
                        this.a.b(t.getString(20), t.getString(21), t.getString(22));
                    }
                    if (z2) {
                        a(39, iG, false);
                        break;
                    }
                }
                break;
            case 35:
                if (!this.f35ad) {
                    if (this.f36ae && this.f29aa) {
                        this.f36ae = false;
                        this.f29aa = false;
                        this.b.x(1);
                        this.f30a.w(1);
                        this.b.repaint();
                        this.f30a.repaint();
                        break;
                    }
                } else {
                    this.f35ad = false;
                    if (!this.f29aa) {
                        this.f29aa = true;
                        this.f30a.x(1);
                        this.b.w(1);
                        this.b.repaint();
                        this.f30a.repaint();
                        break;
                    } else {
                        short s = (short) this.b.bJ;
                        short s2 = (short) this.f30a.bJ;
                        if (this.f27a.m25h() ? this.f27a.a((int) s2, (int) s, true, true) : this.f27a.a((int) s2, (int) s, false, true)) {
                            a(s2, s);
                            this.f29aa = false;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.fH > 0) {
            switch (i2) {
                case 131072:
                case 262144:
                    break;
                case 524288:
                case 134217728:
                    if (this.S) {
                        W(iG);
                        break;
                    }
                    break;
            }
            return true;
        }
        this.gb = 0;
        if (!this.f36ae) {
            return true;
        }
        this.f36ae = false;
        this.S = false;
        repaint();
        if (this.fH == 0) {
            g(iG, true);
            return true;
        }
        U(-1);
        return true;
    }

    @Override // defpackage.u
    public final boolean d(int i) throws IOException {
        u uVar;
        u uVar2;
        switch (i) {
            case 0:
                this.f38b = true;
                repaint();
                if (this.j != null && (uVar2 = (u) this.j.b(492251263)) != null) {
                    uVar2.I = true;
                    break;
                }
                break;
            case 1:
                this.f38b = false;
                this.gb = 0;
                repaint();
                if (this.j != null && (uVar = (u) this.j.b(492251263)) != null) {
                    uVar.I = false;
                    break;
                }
                break;
            case 3:
                this.gb = 0;
                this.ge = -1;
                break;
            case 4:
                this.ge = t.g() + 100;
                break;
        }
        return true;
    }

    @Override // defpackage.u
    public final boolean c(int i, int i2) throws IOException {
        int iG = t.g();
        switch (this.f24a) {
            case 0:
            case 44:
                if (i >= 5) {
                    if (this.f24a == 0) {
                        ((w) this).d.af();
                        break;
                    }
                } else {
                    int i3 = i2 - 20480;
                    if (this.a.d(27) != i3) {
                        t.b(t.getString(342 + i3));
                        this.a.m(27, i3);
                    }
                }
                if (this.f24a != 44) {
                    m14b(1, t.g());
                    break;
                } else {
                    g(iG, true);
                    break;
                }
            case 1:
                switch (i) {
                    case 0:
                        this.a.m(23, 1);
                        this.a.m(24, 1);
                        break;
                    case 1:
                        this.a.m(23, 0);
                        this.a.m(24, 0);
                        break;
                    case 5:
                        ((w) this).d.af();
                        break;
                }
                m14b(2, t.g());
                break;
            case 3:
            case 4:
            case 5:
                if (i < 5) {
                    this.fK = -1;
                    switch (i2) {
                        case 4096:
                            m14b(6, t.g());
                            break;
                        case 4097:
                            bj();
                            break;
                        case 8192:
                            this.a.cc = 0;
                            this.a.N();
                            break;
                        case 8193:
                            this.a.cc = 1;
                            this.a.N();
                            break;
                        case 8194:
                            this.a.cc = 2;
                            this.a.N();
                            break;
                    }
                }
                break;
            case 6:
                if (this.fT != 8 && !this.af) {
                    if (i < 5) {
                        switch (i2) {
                            case 8192:
                                this.a.cc = 0;
                                this.a.N();
                                break;
                            case 12288:
                            case 12289:
                                v.c(v.b(((m) ((w) this).d).cc));
                                U(i2 == 12289 ? 43 : 8);
                                break;
                        }
                    }
                } else {
                    this.af = false;
                    if (i == 0) {
                        ((w) this).d.af();
                        break;
                    }
                }
                break;
            case 7:
                if (i < 5) {
                    switch (i2) {
                        case 8192:
                            this.a.cc = 0;
                            this.a.N();
                            break;
                        case 12288:
                            v.c(v.b(((m) ((w) this).d).cc));
                            U(8);
                            break;
                    }
                }
                break;
            case 12:
                if (i < 5) {
                    if (i2 != 16384) {
                        if (i2 == 16385) {
                            ((Mobile) ((w) this).d.f164a).d(this.f[1]);
                            break;
                        }
                    } else {
                        ((Mobile) ((w) this).d.f164a).d(this.f[0]);
                        break;
                    }
                }
                break;
            case 19:
            case 20:
                if (this.fT != 1) {
                    if (this.fT == 0 && i == 0) {
                        if (this.f24a != 19) {
                            if (this.f24a == 20) {
                                U(22);
                                break;
                            }
                        } else {
                            U(21);
                            break;
                        }
                    }
                } else {
                    switch (i) {
                        case 0:
                            this.a.N();
                            break;
                        case 1:
                            int i4 = ((m) ((w) this).d).cc;
                            v.c(v.b(i4));
                            switch (i4) {
                                case 1:
                                    U(23);
                                    break;
                                case 2:
                                    U(24);
                                    break;
                            }
                    }
                }
                break;
        }
        return true;
    }

    private void a(int i, int i2, boolean z) throws IOException {
        if (z) {
            int[] iArr = this.ab;
            int i3 = this.fI;
            this.fI = i3 + 1;
            iArr[i3] = this.f24a;
        }
        m14b(i, i2);
    }

    private void g(int i, boolean z) throws IOException {
        int i2 = this.fI;
        this.fI = i2 - 1;
        if (i2 <= 0) {
            this.f23Y = true;
        } else if (z) {
            a(this.ab[this.fI], i, false);
        }
    }

    public final void T(int i) {
        int[] iArr = this.ab;
        int i2 = this.fI;
        this.fI = i2 + 1;
        iArr[i2] = i;
    }

    private void a(s sVar, s sVar2) {
        this.f25c.p = new int[17];
        sVar.a(this.f25c.p);
        this.f25c.p[0] = sVar.br;
        this.f25c.br = sVar.br;
        this.f25c.bs = sVar.bs;
        this.d.p = new int[17];
        sVar2.a(this.d.p);
        this.d.p[0] = sVar2.br;
        this.d.br = sVar2.br;
        this.d.bs = sVar2.bs;
        for (int i = 0; i < 15; i++) {
            this.f25c.b[i] = sVar.m38a(i);
            this.d.b[i] = sVar2.m38a(i);
        }
    }

    public final void b(f fVar) {
        this.f27a = fVar;
        this.f28Z = true;
        this.ag = fVar.m25h();
        this.fY = fVar.f78a.br;
        this.fZ = fVar.f79b.br;
        a(fVar.f78a, fVar.f79b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* renamed from: b, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14b(int r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag.m14b(int, int):void");
    }

    private void U(int i) {
        u uVar;
        this.fL = i;
        this.fM = 1;
        if (this.j == null || (uVar = (u) this.j.b(492251263)) == null) {
            return;
        }
        uVar.I = false;
    }

    private void aX() throws IOException {
        int iK;
        this.fM = 2;
        this.j = ((w) this).d.m51a(314, 8);
        boolean z = false;
        int iA = 98;
        switch (this.f24a) {
            case 6:
                int i = 57;
                int i2 = 0;
                boolean z2 = this.a.d(26) != 0;
                boolean z3 = this.a.ce != 0;
                for (int i3 = 0; i3 < 9; i3++) {
                    if ((i3 != 3 || z2) && ((i3 != 6 || z3) && i3 != 7)) {
                        int iA2 = a(186 + i3, i3, false, false, i, 57, i2);
                        i += 17;
                        i2++;
                        if (iA2 > iA) {
                            iA = iA2;
                        }
                    }
                }
                this.fH = i2;
                break;
            case 7:
                iA = a(187, 195, 3, 46, true);
                z = true;
                break;
            case 9:
                iA = a(188, 201, 3, 46, true);
                z = true;
                break;
            case 13:
                iA = a(190, 230, 4, 46, true);
                z = true;
                break;
            case 19:
                iA = a(237, 239, 2, 46, true);
                z = true;
                break;
            case 20:
                iA = a(238, 239, 2, 46, true);
                z = true;
                break;
            case 23:
                iA = H();
                z = true;
                break;
            case 24:
                iA = a(197, 252, 4, 46, true);
                z = true;
                this.f18a.b(this.f39af);
                if (this.f39af[v.dr] >= this.f39af[v.dt] && (iK = K(0)) >= 0) {
                    b(iK, 65536, false);
                    this.fT = 1;
                    break;
                }
                break;
            case 25:
                iA = a(247, 257, 2, 46, true);
                z = true;
                break;
            case 26:
                iA = a(249, 259, 2, 46, true);
                z = true;
                break;
            case 27:
                iA = !this.f28Z ? a(180, 272, 3, 46, true) : a(180, 269, 3, 46, true);
                z = true;
                break;
        }
        if (z) {
            this.j.v(2, 1);
        }
        u uVar = (u) this.j.b(492251263);
        uVar.q(iA, 15);
        if (z) {
            uVar.v(2, 0);
        }
        this.j.q(x(), y());
        this.j.aG();
        this.fM = 0;
        V(this.fT);
    }

    private int a(int i, int i2, int i3, int i4, boolean z) throws IOException {
        int i5 = i4;
        int i6 = 0;
        this.fH = i != -1 ? i3 + 1 : i3;
        if (i != -1) {
            a(i, 65535, true, z, i5, i4, 0);
            i6 = 0 + 1;
            if (!z) {
                i5 += 17;
            }
        }
        int i7 = 98;
        for (int i8 = 0; i8 < i3; i8++) {
            int iA = a(i2 + i8, i8, false, z, i5, i4, i6);
            i6++;
            i5 += 17;
            if (iA > i7) {
                i7 = iA;
            }
        }
        return i7;
    }

    private int a(String str, int i, boolean z, boolean z2, int i2, int i3) throws IOException {
        this.aa[i3] = i;
        int[] iArr = this.aa;
        iArr[i3] = iArr[i3] | 196608;
        u uVar = (u) this.j.b(z ? -232839129 : Y[i3]);
        if (uVar != null) {
            g gVar = (g) uVar.b(-1282424399);
            gVar.a(str, false);
            if (!z2) {
                uVar.v(0, 0);
                uVar.setPosition(10, i2);
            } else if (z) {
                gVar.v(3, 2);
                gVar.u(0, 0);
                uVar.v(3, 0);
                uVar.setPosition(B() - this.k.stringWidth(str), 29);
            } else {
                gVar.v(2, 2);
                gVar.u(0, 0);
                uVar.setPosition(0, i2);
                uVar.v(2, 0);
            }
            uVar.I = true;
            uVar.q(Math.max(z2 ? 176 : 96, this.k.stringWidth(str) + 24), 15);
        }
        if (z) {
            return 98;
        }
        return this.k.stringWidth(str) + 24;
    }

    private int a(int i, int i2, boolean z, boolean z2, int i3, int i4, int i5) throws IOException {
        return a(t.getString(i), i2, z, z2, i3, i5);
    }

    private int H() throws IOException {
        int iA;
        int iL = this.f18a.l();
        this.f18a.b(this.f39af);
        if (this.f39af[v.dr] >= iL) {
            this.fH = 5;
            int iA2 = a(196, -1, true, true, 46, 46, 0);
            iA = iA2 > 98 ? iA2 : 98;
            int iA3 = a(251, 0, false, true, 46, 46, 0);
            int i = 46 + 17;
            int i2 = 0 + 1;
            if (iA3 > iA) {
                iA = iA3;
            }
            for (int i3 = 1; i3 < 4; i3++) {
                int iA4 = a(247 + i3, i3, false, true, i, 46, i2);
                i += 17;
                i2++;
                if (iA4 > iA) {
                    iA = iA4;
                }
            }
        } else {
            iA = a(196, 247, 4, 46, true);
        }
        return iA;
    }

    private void V(int i) {
        u uVar = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.fH) {
                break;
            }
            if ((this.aa[i2] & 65535) == i) {
                uVar = (u) this.j.b(Y[i2]);
                break;
            }
            i2++;
        }
        if (uVar != null) {
            u uVar2 = (u) this.j.b(492251263);
            uVar2.setPosition(this.fW == 1 ? uVar2.D() : uVar.D(), uVar.E());
            uVar2.I = true;
            repaint();
        }
    }

    private void b(int i, int i2, boolean z) {
        if ((i2 & 131072) != 0) {
            ((u) this.j.b(Y[i])).I = z;
        }
        if ((i2 & 65536) != 0) {
            g gVar = (g) ((u) this.j.b(Y[i])).b(-1282424399);
            if (z) {
                gVar.be = 12;
                gVar.bf = 315;
            } else {
                gVar.be = 15;
                gVar.bf = 315;
            }
        }
        if (z) {
            int[] iArr = this.aa;
            iArr[i] = iArr[i] | i2;
        } else {
            int[] iArr2 = this.aa;
            iArr2[i] = iArr2[i] & (i2 ^ (-1));
        }
    }

    private void W(int i) throws IOException {
        this.S = false;
        switch (this.f24a) {
            case 6:
                switch (this.fT) {
                    case 0:
                        this.a.cc = 0;
                        if (!this.f18a.j(0)) {
                            U(this.fT == 0 ? 43 : 8);
                            return;
                        }
                        z zVar = (z) this.a.m51a(314, 2);
                        zVar.e(this);
                        zVar.g(29, 0, 8192);
                        zVar.g(30, 1, this.fT == 0 ? 12289 : 12288);
                        zVar.g(31, 2, 32767);
                        zVar.z(136, 137);
                        zVar.aG();
                        repaint();
                        this.a.b((u) zVar);
                        return;
                    case 1:
                        U(7);
                        return;
                    case 2:
                        U(9);
                        return;
                    case 4:
                        U(13);
                        return;
                    case 5:
                        U(14);
                        return;
                    case 6:
                        U(12);
                        return;
                    case 7:
                        this.a.a(this, 27, 28, 1);
                        break;
                    case 8:
                        this.a.a(this, 138, 139, 1);
                        return;
                }
            case 7:
                switch (this.fT) {
                    case 0:
                        this.a.cc = 0;
                        if (!this.f18a.j(0)) {
                            U(8);
                            break;
                        } else {
                            z zVar2 = (z) this.a.m51a(314, 2);
                            zVar2.e(this);
                            zVar2.g(29, 0, 8192);
                            zVar2.g(30, 1, 12288);
                            zVar2.g(31, 2, 32767);
                            zVar2.z(136, 137);
                            zVar2.aG();
                            repaint();
                            this.a.b((u) zVar2);
                            break;
                        }
                    case 1:
                        this.a.cc = 1;
                        if (!this.f18a.k(1)) {
                            U(21);
                            break;
                        } else {
                            U(19);
                            break;
                        }
                    case 2:
                        this.a.cc = 2;
                        if (!this.f18a.k(2)) {
                            U(22);
                            break;
                        } else {
                            U(20);
                            break;
                        }
                }
                return;
            case 9:
                switch (this.fT) {
                    case 0:
                        U(10);
                        break;
                    case 1:
                        U(11);
                        break;
                    case 2:
                        U(44);
                        break;
                }
                return;
            case 13:
                switch (this.fT) {
                    case 0:
                        U(15);
                        break;
                    case 1:
                        U(16);
                        break;
                    case 2:
                        U(17);
                        break;
                    case 3:
                        U(18);
                        break;
                }
                return;
            case 19:
                switch (this.fT) {
                    case 0:
                        this.a.a(this, 32, 33, 1);
                        break;
                    case 1:
                        if (!this.f18a.j(1)) {
                            U(23);
                            break;
                        } else {
                            this.a.a(this, 136, 137, 0);
                            break;
                        }
                }
                return;
            case 20:
                switch (this.fT) {
                    case 0:
                        this.a.a(this, 32, 34, 1);
                        break;
                    case 1:
                        this.f18a.b(this.f39af);
                        if (!this.f18a.j(2)) {
                            if (this.f39af[v.dr] >= this.f18a.l()) {
                                U(24);
                                break;
                            } else {
                                this.f18a.s(this.f39af[v.dr], this.f18a.l());
                                U(39);
                                break;
                            }
                        } else {
                            this.a.a(this, 136, 137, 0);
                            break;
                        }
                }
                return;
            case 23:
                switch (this.fT) {
                    case 0:
                        int iN = 24;
                        int iL = this.f18a.l();
                        this.f18a.b(this.f39af);
                        if (this.f39af[v.dr] < iL) {
                            U(25);
                            break;
                        } else {
                            if (this.f39af[v.dx] == 0) {
                                this.f39af[v.dx] = 1;
                                this.f18a.c(this.f39af);
                                this.f18a.M(0);
                                iN = this.f18a.n();
                            }
                            U(iN);
                            break;
                        }
                    case 1:
                        U(28);
                        break;
                    case 2:
                        U(26);
                        break;
                    case 3:
                        U(6);
                        break;
                }
                return;
            case 24:
                switch (this.fT) {
                    case 0:
                        U(25);
                        break;
                    case 1:
                        U(31);
                        break;
                    case 2:
                        U(27);
                        break;
                    case 3:
                        U(6);
                        break;
                }
                return;
            case 25:
                switch (this.fT) {
                    case 0:
                        this.f18a.b(this.f39af);
                        this.f18a.a(this.f39af[v.dq], this.f40g);
                        this.f18a.av();
                        U(41);
                        break;
                    case 1:
                        this.f18a.au();
                        U(37);
                        break;
                }
                return;
            case 26:
                switch (this.fT) {
                    case 0:
                        U(29);
                        break;
                    case 1:
                        U(30);
                        break;
                }
                return;
            case 27:
                switch (this.fT) {
                    case 0:
                        U(32);
                        break;
                    case 1:
                        U(33);
                        break;
                    case 2:
                        U(34);
                        break;
                }
                return;
        }
        repaint();
    }

    private void i(boolean z) {
        int i = this.aa[this.fH - 1] & 65535;
        while (true) {
            if (z) {
                int i2 = this.fT - 1;
                this.fT = i2;
                if (i2 < 0) {
                    this.fT = i;
                }
            } else {
                int i3 = this.fT + 1;
                this.fT = i3;
                if (i3 > i) {
                    this.fT = 0;
                }
            }
            int iK = K(this.fT);
            if (iK >= 0 && (this.aa[iK] & 65536) != 0) {
                V(this.fT);
                return;
            }
        }
    }

    private int K(int i) {
        for (int i2 = 0; i2 < this.fH; i2++) {
            if ((this.aa[i2] & 65535) == i) {
                return i2;
            }
        }
        return -1;
    }

    private void aY() {
        this.a.m(15, v.w(this.a.d(15)));
    }

    private void aZ() {
        this.a.m(15, v.x(this.a.d(15)));
    }

    private void ba() throws IOException {
        this.f30a.q(130, 60);
        this.f30a.bu = 4;
        this.f30a.a(4, 1, 10, 0, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.d(iB, 1, 86);
            this.f30a.d(iB, 2, 87);
            this.f30a.d(iB, 3, 88);
            this.f30a.a(0, this.k);
            this.f30a.a(0, 0, this.f18a.a(this.fY).p);
            int[] iArr = new int[22];
            this.f18a.e(this.fY, iArr);
            this.f30a.a(0, 1, new StringBuffer().append("").append(iArr[14]).toString());
            this.f30a.a(0, 2, new StringBuffer().append("").append(iArr[15]).toString());
            int[] iArr2 = new int[2];
            this.f18a.f(this.fY, iArr2);
            int i = iArr2[0];
            int i2 = iArr2[1];
            this.f30a.a(0, 3, new StringBuffer().append("").append((i + i2) >> 1).append(".").append(((i + i2) & 1) != 0 ? 5 : 0).toString());
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 156);
            this.f30a.repaint();
        }
    }

    private void bb() throws IOException {
        this.f18a.m65q();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        this.f30a.q(130, 60);
        this.f30a.bu = 4;
        int iMin = Math.min(this.f18a.p(), 3);
        this.f18a.b(this.f39af);
        this.fY = this.f39af[v.ds];
        this.f18a.a(this.f39af[v.dq], this.f40g);
        if (this.fZ != -1) {
            int[] iArr = new int[2];
            this.f18a.a(iMin, this.fY, iArr);
            i = iArr[0];
            i2 = iArr[1];
        }
        if (this.f40g[3] < this.f39af[v.dr]) {
            z = true;
        }
        int i3 = this.fZ;
        this.f30a.a(3, 1, 10, 0, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.a(iB, 0, this.f18a.a(this.fY).p);
            this.f30a.a(iB, 2, this.f18a.a(i3).p);
            this.f30a.a(0, this.k);
            this.f30a.d(0, 1, 89);
            this.f30a.a(0, 0, new StringBuffer().append("").append(i).toString());
            this.f30a.a(0, 2, new StringBuffer().append("").append(i2).toString());
            this.f30a.a(true, true, true);
            int iB2 = (B() - this.f30a.x()) >> 1;
            if (z) {
                this.f30a.setPosition(-1000, -1000);
            } else {
                this.f30a.setPosition(iB2, 166);
            }
            this.f30a.repaint();
        }
        this.f18a.s();
    }

    private void bc() throws IOException {
        this.f30a.q(170, 80);
        this.f30a.bu = 4;
        this.f30a.a(6, 2, 6, 0, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.d(iB, 1, 37);
            this.f30a.d(iB, 2, 38);
            this.f30a.d(iB, 3, 39);
            this.f30a.d(iB, 4, 40);
            this.f30a.d(iB, 5, 85);
            this.f18a.b(this.f39af);
            this.f18a.a(this.f39af[v.dq], this.f40g);
            this.f30a.a(0, this.k);
            this.f30a.a(0, 0, this.f18a.a(this.fY).p);
            for (int i = 0; i < 4; i++) {
                this.f30a.a(0, i + 1, new StringBuffer().append("").append((int) this.f40g[8 + i]).toString());
            }
            this.f30a.a(0, 5, new StringBuffer().append("").append((int) this.f40g[4]).toString());
            this.f30a.a(1, this.k);
            this.f30a.a(1, 0, this.f18a.a(this.fZ).p);
            for (int i2 = 0; i2 < 4; i2++) {
                this.f30a.a(1, i2 + 1, new StringBuffer().append("").append((int) this.f40g[13 + i2]).toString());
            }
            this.f30a.a(1, 5, new StringBuffer().append("").append((int) this.f40g[5]).toString());
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 146);
            this.f30a.repaint();
        }
    }

    private void bd() throws IOException {
        this.f30a.H();
        ae[] aeVarArr = new ae[5];
        for (int i = 0; i < 5; i++) {
            v vVar = this.f18a;
            vVar.getClass();
            aeVarArr[i] = new ae(vVar);
        }
        this.f18a.a(this.fT, aeVarArr);
        this.f30a.q(130, 100);
        this.f30a.bu = 4;
        this.f30a.a(4, 5, 10, 0, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.d(iB, 1, 86);
            this.f30a.d(iB, 2, 87);
            this.f30a.d(iB, 3, 88);
            for (int i2 = 0; i2 < 5; i2++) {
                q qVarA = this.f18a.a(aeVarArr[i2].br);
                this.f30a.a(i2, this.k);
                this.f30a.a(i2, 0, qVarA.p);
                this.f30a.a(i2, 1, new StringBuffer().append("").append(aeVarArr[i2].cv).toString());
                this.f30a.a(i2, 2, new StringBuffer().append("").append(aeVarArr[i2].fz).toString());
                int i3 = (aeVarArr[i2].fB + aeVarArr[i2].fA) >> 1;
                int i4 = ((aeVarArr[i2].fB + aeVarArr[i2].fA) & 1) != 0 ? 5 : 0;
                this.f30a.a(i2, 3, (i3 == 0 && i4 == 0) ? "-.-" : new StringBuffer().append("").append(i3).append(".").append(i4).toString());
            }
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 81);
            this.f30a.repaint();
        }
    }

    private void be() throws IOException {
        String string;
        int iA = (this.fT < 0 || this.fT > 7) ? 0 : this.f18a.a(this.fT, this.f42d, 25);
        this.f30a.H();
        this.f30a.q(B() - 8, 110);
        this.f30a.bu = 4;
        this.f30a.a(3, iA, 10, 0, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.d(iB, 0, 92);
            this.f30a.d(iB, 1, 91);
            this.f30a.d(iB, 2, 104 + this.fT);
            for (int i = 0; i < iA; i++) {
                this.f30a.a(i, this.k);
                this.f30a.a(i, 1, this.f18a.m59a(this.f42d[i][0]));
                this.f30a.a(i, 0, this.f18a.a(this.f18a.v(this.f42d[i][0])).p);
                switch (this.fT) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        string = new StringBuffer().append("").append(t.p(this.f42d[i][1])).append(".").append(t.p(this.f42d[i][1] * 10) % 10).toString();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        string = new StringBuffer().append("").append(t.p(this.f42d[i][1] * 100)).toString();
                        break;
                    default:
                        string = null;
                        break;
                }
                this.f30a.a(i, 2, string);
            }
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 81);
            this.f30a.repaint();
        }
    }

    private void bf() throws IOException {
        String string;
        int iB = (this.fT < 0 || this.fT >= 8) ? 0 : this.f18a.b(this.fT, this.f42d, 30);
        this.f30a.H();
        this.f30a.q(B() - 8, 110);
        this.f30a.bu = 4;
        this.f30a.a(2, iB, 10, 0, true);
        if (k.m()) {
            int iB2 = this.f30a.b();
            this.f30a.a(iB2, this.l);
            this.f30a.d(iB2, 0, 260);
            this.f30a.d(iB2, 1, 104 + this.fT);
            for (int i = 0; i < iB; i++) {
                this.f30a.a(i, this.k);
                this.f30a.a(i, 0, this.f18a.a(this.f42d[i][0]).o);
                switch (this.fT) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        string = new StringBuffer().append("").append(t.p(this.f42d[i][1])).append(".").append(t.p(this.f42d[i][1] * 10) % 10).toString();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        string = new StringBuffer().append("").append(t.p(this.f42d[i][1] * 100)).toString();
                        break;
                    default:
                        string = null;
                        break;
                }
                this.f30a.a(i, 1, string);
            }
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 81);
            this.f30a.repaint();
        }
    }

    private void a(int i, r rVar, int i2, boolean z, int i3, int i4) throws IOException {
        this.f30a.a(i, rVar);
        String string = new StringBuffer().append("").append(i3).toString();
        if (z) {
            string = new StringBuffer().append(string).append("%").toString();
        }
        this.f30a.a(i, 2, string);
        String string2 = new StringBuffer().append("").append(i4).toString();
        if (z) {
            string2 = new StringBuffer().append(string2).append("%").toString();
        }
        this.f30a.a(i, 0, string2);
        this.f30a.a(i, 1, t.getString(i2));
    }

    private void a(int i, r rVar, int i2, int i3, int i4, int i5, int i6) throws IOException {
        this.f30a.a(i, rVar);
        this.f30a.a(i, 2, new StringBuffer().append("").append(i3).append(" / ").append(i4).toString());
        this.f30a.a(i, 0, new StringBuffer().append("").append(i5).append(" / ").append(i6).toString());
        this.f30a.a(i, 1, t.getString(i2));
    }

    private void c(int[] iArr, int[] iArr2) throws IOException {
        this.f30a.q(B() - 4, 120);
        this.f30a.bu = 2;
        this.f30a.a(3, 15, 4, 3, true);
        if (k.m()) {
            int iB = this.f30a.b();
            this.f30a.a(iB, this.l);
            this.f30a.a(iB, 2, this.f18a.a(iArr[0]).p);
            this.f30a.a(iB, 0, this.f18a.a(iArr2[0]).p);
            a(0, this.k, 119, false, iArr[9] + (iArr[5] * 2) + (iArr[7] * 3), iArr2[9] + (iArr2[5] * 2) + (iArr2[7] * 3));
            a(1, this.k, 115, false, iArr[10] + iArr[11], iArr2[10] + iArr2[11]);
            a(2, this.k, 116, false, iArr[10], iArr2[10]);
            a(3, this.k, 117, false, iArr[11], iArr2[11]);
            a(4, this.k, 121, false, iArr[12], iArr2[12]);
            a(5, this.k, 123, false, iArr[16], iArr2[16]);
            a(6, this.k, 122, false, iArr[14], iArr2[14]);
            a(7, this.k, 125, false, iArr[15], iArr2[15]);
            a(8, this.k, 112, iArr[5] + iArr[7], iArr[4] + iArr[6], iArr2[5] + iArr2[7], iArr2[4] + iArr2[6]);
            a(9, this.k, 109, true, iArr[4] + iArr[6] > 0 ? ((iArr[5] + iArr[7]) * 100) / (iArr[4] + iArr[6]) : 0, iArr2[4] + iArr2[6] > 0 ? ((iArr2[5] + iArr2[7]) * 100) / (iArr2[4] + iArr2[6]) : 0);
            a(10, this.k, 113, iArr[7], iArr[6], iArr2[7], iArr2[6]);
            a(11, this.k, 110, true, iArr[6] > 0 ? (iArr[7] * 100) / iArr[6] : 0, iArr2[6] > 0 ? (iArr2[7] * 100) / iArr2[6] : 0);
            a(12, this.k, 114, iArr[9], iArr[8], iArr2[9], iArr2[8]);
            a(13, this.k, 111, true, iArr[8] > 0 ? (iArr[9] * 100) / iArr[8] : 0, iArr2[8] > 0 ? (iArr2[9] * 100) / iArr2[8] : 0);
            a(14, this.k, 124, false, iArr[13], iArr2[13]);
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 71);
            this.f30a.repaint();
        }
    }

    private void a(i iVar) throws IOException {
        this.f30a.q(72, Math.min(112, ((C() - this.a.c()) - 46) - 25));
        this.f30a.bu = 36;
        this.f30a.a(2, iVar.bs, 8, 3, true);
        if (k.m()) {
            v vVar = this.f18a;
            vVar.getClass();
            ad adVar = new ad(vVar);
            int iB = this.f30a.b();
            this.f30a.a(iB, this.r);
            this.f30a.a(iB, 0, t.getString(99));
            this.f30a.a(iB, 1, t.getString(91));
            this.f30a.e(iB, 1, -1);
            for (int i = 0; i < iVar.bs; i++) {
                this.f30a.a(i, this.f21p);
                if (!this.f28Z) {
                    this.f18a.a(iVar.b[i][0], adVar);
                } else if (this.f27a.f78a.br == iVar.br) {
                    v.a(this.f27a.f78a.m37a(i), adVar);
                } else {
                    v.a(this.f27a.f79b.m37a(i), adVar);
                }
                this.f30a.a(i, 0, t.getString(80 + adVar.bp));
                this.f30a.a(i, 1, adVar.r);
                this.f30a.e(i, 1, -1);
            }
            this.f30a.a(true, true, true);
            this.f30a.setPosition(3, 71);
            this.f30a.repaint();
        }
        if (k.m()) {
            this.f30a.q(this.f30a.bz, Math.min(112, ((C() - this.a.c()) - 46) - 25));
            this.f30a.a(true, true, true);
            this.f30a.repaint();
        }
        this.b.q((B() - this.f30a.x()) - 6, this.f30a.y() + 8);
        this.b.bu = 4;
        this.b.a(16, iVar.bs, 6, 3, true);
        if (k.m()) {
            int iB2 = this.b.b();
            this.b.a(iB2, this.r);
            int length = Z.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.b.a(iB2, i2, t.getString(Z[i2]));
            }
            for (int i3 = 0; i3 < iVar.bs; i3++) {
                this.b.a(i3, this.f21p);
                for (int i4 = 0; i4 < 16; i4++) {
                    this.b.a(i3, i4, (byte) 1, true);
                }
            }
            this.b.a(true, true, true);
            this.b.setPosition(this.f30a.v() + this.f30a.x(), 71);
            this.b.repaint();
            b(iVar);
        }
    }

    private void b(i iVar) throws IOException {
        int i = this.b.bC;
        int i2 = this.b.bE;
        int i3 = this.b.bB;
        int i4 = this.b.bD;
        if (k.m()) {
            for (int i5 = i; i5 <= i2; i5++) {
                for (int i6 = i3; i6 <= i4; i6++) {
                    if (this.b.a(i5, i6) == null) {
                        this.b.a(i5, i6, a(iVar.b[i5], i6));
                    }
                }
            }
            this.b.a(false, false, false);
        }
    }

    private String a(int[] iArr, int i) {
        String strM15d;
        switch (i) {
            case 0:
                strM15d = m15d(iArr[9] + (iArr[5] * 2) + (iArr[7] * 3));
                break;
            case 1:
                strM15d = m15d(iArr[10] + iArr[11]);
                break;
            case 2:
                strM15d = m15d(iArr[10]);
                break;
            case 3:
                strM15d = m15d(iArr[11]);
                break;
            case 4:
                strM15d = m15d(iArr[12]);
                break;
            case 5:
                strM15d = m15d(iArr[16]);
                break;
            case 6:
                strM15d = m15d(iArr[14]);
                break;
            case 7:
                strM15d = m15d(iArr[15]);
                break;
            case 8:
                strM15d = m16b(iArr[5] + iArr[7], iArr[4] + iArr[6]);
                break;
            case 9:
                strM15d = m17c(iArr[5] + iArr[7], iArr[4] + iArr[6]);
                break;
            case 10:
                strM15d = m16b(iArr[7], iArr[6]);
                break;
            case 11:
                strM15d = m17c(iArr[7], iArr[6]);
                break;
            case 12:
                strM15d = m16b(iArr[9], iArr[8]);
                break;
            case 13:
                strM15d = m17c(iArr[9], iArr[8]);
                break;
            case 14:
                strM15d = m15d(iArr[2] / 60);
                break;
            case 15:
                strM15d = m15d(iArr[13]);
                break;
            default:
                strM15d = "NA";
                break;
        }
        return strM15d;
    }

    /* renamed from: d, reason: collision with other method in class */
    private static String m15d(int i) {
        return Integer.toString(i);
    }

    /* renamed from: b, reason: collision with other method in class */
    private static String m16b(int i, int i2) {
        return new StringBuffer().append(i).append("/").append(i2).toString();
    }

    /* renamed from: c, reason: collision with other method in class */
    private static String m17c(int i, int i2) {
        return i2 != 0 ? new StringBuffer().append("").append((i * 100) / i2).append("%").toString() : "0%";
    }

    private void a(int i, k kVar) throws IOException {
        kVar.a(i, this.r);
        kVar.d(i, 0, 99);
        kVar.d(i, 1, 100);
        kVar.d(i, 2, 101);
        kVar.d(i, 3, 102);
        kVar.d(i, 4, 103);
    }

    private void a(int i, k kVar, ad adVar) throws IOException {
        kVar.a(i, this.f21p);
        kVar.a(i, 0, t.getString(80 + adVar.bp));
        kVar.a(i, 1, adVar.r);
        kVar.a(i, 2, new StringBuffer().append("").append(adVar.eR).toString());
        kVar.a(i, 3, new StringBuffer().append("").append(adVar.eQ).toString());
        kVar.a(i, 4, new StringBuffer().append("").append(adVar.fj).toString());
    }

    private void a(s sVar) throws IOException {
        this.f30a.q(170, Math.max((this.k.cx + 3) << 1, ((C() - 71) >> 1) - 10));
        this.f30a.bu = 69;
        this.f30a.a(5, 5, 8, 3, true);
        if (k.m()) {
            a(this.f30a.b(), this.f30a);
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= 5) {
                    break;
                }
                a(s2, this.f30a, sVar.m39b((int) this.f27a.a((int) s2, sVar.r)));
                s = (short) (s2 + 1);
            }
            this.f30a.a(true, true, true);
            this.f30a.setPosition((B() - this.f30a.x()) >> 1, 63);
            this.f30a.repaint();
        }
        int i = sVar.bs - 5;
        this.b.q(170, Math.max((this.k.cx + 3) << 1, (((C() - this.f30a.y()) - 46) - 40) - this.a.c()));
        this.b.bu = 4;
        this.b.a(5, i, 8, 3, true);
        if (k.m()) {
            a(this.b.b(), this.b);
            for (int i2 = 0; i2 < i; i2++) {
                ad adVarM39b = sVar.m39b((int) this.f27a.b(i2, sVar.r));
                this.ae[i2] = adVarM39b.eL;
                a(i2, this.b, adVarM39b);
            }
            this.b.a(true, true, true);
            this.b.setPosition((B() - this.b.x()) >> 1, this.f30a.w() + this.f30a.y() + 17);
            this.b.repaint();
        }
    }

    private void a(short s, short s2) throws IOException {
        this.f30a.q(B(), this.f30a.y());
        this.b.q(B(), this.b.y());
        if (k.m() && k.m()) {
            k kVar = this.f30a;
            k kVar2 = this.b;
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= 5) {
                    break;
                }
                String strA = kVar.a(s, s4);
                kVar.a(s, s4, kVar2.a(s2, s4));
                kVar2.a(s2, s4, strA);
                s3 = (short) (s4 + 1);
            }
            this.f30a.a(true, true, true);
            this.b.a(true, true, true);
        }
        this.f30a.setPosition((B() - this.f30a.x()) >> 1, this.f30a.E());
        this.b.setPosition((B() - this.b.x()) >> 1, this.b.E());
        this.b.x(1);
        this.f30a.w(1);
        this.b.c(0);
        this.f30a.c(0);
        this.b.repaint();
        this.f30a.repaint();
    }

    private void bg() throws IOException {
        int i = 0;
        int i2 = 0;
        this.f30a.H();
        for (int i3 = 0; i3 < 8; i3++) {
            this.c[i3] = null;
        }
        boolean z = false;
        switch (this.fT) {
            case 0:
                i2 = 0;
                i = 1;
                break;
            case 1:
                i2 = 1;
                i = 1;
                break;
            case 2:
                i2 = 2;
                i = 1;
                z = true;
                break;
            case 3:
                i2 = 3;
                z = true;
                break;
            case 4:
                i2 = 2;
                i = 0;
                z = true;
                break;
            case 5:
                i2 = 1;
                i = 0;
                break;
            case 6:
                i2 = 0;
                i = 0;
                break;
        }
        this.f18a.m65q();
        this.fX = this.f18a.a(i2, i, this.f41ag, 8);
        for (int i4 = 0; i4 < this.fX; i4 += 2) {
            this.f37o[i4][0] = this.f41ag[i4];
            this.f37o[i4][1] = this.f18a.C(this.f41ag[i4]);
            this.f37o[i4 + 1][0] = this.f41ag[i4 + 1];
            this.f37o[i4 + 1][1] = this.f18a.C(this.f41ag[i4 + 1]);
            int[] iArr = new int[2];
            this.f18a.a(i2, this.f41ag[i4], iArr);
            this.f37o[i4][2] = iArr[0];
            this.f37o[i4 + 1][2] = iArr[1];
        }
        this.f18a.s();
        for (int i5 = 0; i5 < this.fX; i5++) {
            if (this.c[i5] == null) {
                int iMax = Math.max(this.f37o[i5][0], 0);
                if (z) {
                    this.c[i5] = t.m44a(313, 0 + iMax);
                } else {
                    this.c[i5] = t.m44a(312, 12 + iMax);
                }
            }
        }
    }

    private void a(int i, String str) throws IOException {
        this.fR = i;
        this.t = t.getString(this.fR);
        this.fQ = -1;
        this.fS = 0;
        this.f31a.aH();
        this.f31a.setText(str);
        a(this.f31a);
        this.f31a.aG();
    }

    private void E(int i, int i2) throws IOException {
        a(i, t.getString(i2));
        this.fQ = i2;
    }

    private void j(af afVar) {
        int i = ((15 - this.k.cx) + 1) >> 1;
        this.k.a(afVar, this.t, (B() - this.k.stringWidth(this.t)) - 2, 29 + i);
    }

    private void a(af afVar, boolean z) {
        int iB = (B() - this.x.getWidth()) >> 1;
        afVar.b(null, 0);
        afVar.a(this.x, iB, 0);
        if (!z || this.y == null) {
            return;
        }
        afVar.a(this.y, B() - this.y.getWidth(), C() - this.y.getHeight());
    }

    private void k(af afVar) {
        int i = 0;
        int iB = B() / 7;
        int iC = C() / 6;
        int width = iB - (this.c[0].getWidth() >> 1);
        int height = iC - (this.c[0].getHeight() >> 1);
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = width;
            for (int i4 = 0; i4 < 6; i4++) {
                afVar.a(this.c[i], i3, height);
                i3 += iB;
                i++;
            }
            height += iC;
        }
    }

    private void a(af afVar, String str, int i, r rVar) {
        rVar.a(afVar, str, (B() - this.k.stringWidth(str)) >> 1, i);
    }

    private void a(af afVar, int i, boolean z, boolean z2) {
        int iB = B() >> 1;
        int i2 = this.fY;
        int i3 = this.fZ;
        if (z2) {
            i2 = this.fZ;
            i3 = this.fY;
        }
        int iStringWidth = this.k.stringWidth(t.getString(284));
        afVar.a(this.c[i2], z ? 2 : (iB - (iStringWidth >> 1)) - this.c[i2].getWidth(), i);
        afVar.a(this.c[i3], z ? (B() - this.c[i3].getWidth()) - 2 : iB + (iStringWidth >> 1), i);
        a(afVar, t.getString(284), i + (this.c[i2].getHeight() >> 1), this.m);
    }

    private void a(af afVar, int i, int i2, boolean z) {
        q qVarA = this.f18a.a(i);
        int iB = ((B() - 153) >> 1) + 38;
        int i3 = i2 + 1;
        int i4 = (12 - this.f21p.cx) >> 1;
        int[] iArr = {qVarA.cr, qVarA.cs, qVarA.ct};
        for (int i5 = 0; i5 < 3; i5++) {
            this.g.c(iB, i3, 115, 12);
            afVar.b(this.g, (i5 & 1) == 0 ? -7960954 : -10395295);
            this.f21p.a(afVar, t.getString(94 + i5), iB + 3, i3 + i4);
            this.f21p.a(afVar, new StringBuffer().append("").append(iArr[i5]).toString(), iB + 50 + 50 + 3, i3 + i4);
            int i6 = iB + 50;
            int i7 = i3 + 1 + 1;
            int i8 = ((iArr[i5] - 50) + 2) / 5;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i6 + 4;
                int i11 = i7;
                for (int i12 = 0; i12 < 7; i12++) {
                    afVar.a(i6, i11, i10, i11, 16711680 | ((158 + ((64 * i12) / 6)) << 8));
                    i11++;
                }
                this.g.c(i6, i7, 5, 8);
                afVar.a(this.g, 7697781);
                i6 += 5;
                i9++;
            }
            while (i9 < 10) {
                this.g.c(i6, i7, 4, 7);
                afVar.b(this.g, 0);
                this.g.c(i6, i7, 5, 8);
                afVar.a(this.g, 7697781);
                i6 += 5;
                i9++;
            }
            i3 += 12;
        }
        this.g.c(iB - 1, i2, 117, 38);
        afVar.a(this.g, -3750202);
        if (this.c[i] != null) {
            int width = iB - this.c[i].getWidth();
            afVar.a(this.c[i], width - 1, i2 + 1);
            this.g.c(width - 2, i2, this.c[i].getWidth() + 2, 38);
            afVar.a(this.g, -3750202);
            if (z) {
                this.g.c(width - 3, i2 - 1, this.c[i].getWidth() + 115 + 5, 40);
                afVar.a(this.g, -25600);
            }
        }
    }

    private void a(af afVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.g.c(i, i2, B(), 15);
        int height = (this.g.gi - this.o.getHeight()) >> 1;
        if (z3) {
            afVar.b(this.g, -11240008);
        } else {
            afVar.b(this.g, -11053225);
        }
        if (z) {
            afVar.a(this.o, ((B() - i3) >> 1) - this.o.getWidth(), this.g.eG + height);
        }
        if (z2) {
            afVar.a(this.p, (B() + i3) >> 1, this.g.eG + height);
        }
    }

    private void a(af afVar, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        r rVar = (z2 && z) ? this.f20o : !z2 ? this.m : this.k;
        int iStringWidth = this.k.stringWidth(str);
        int iB = (B() - 40) - (iStringWidth >> 1);
        rVar.a(afVar, str, iB, i);
        if (z && z2) {
            int height = i + ((this.k.cx - this.o.getHeight()) >> 1);
            if (z3) {
                afVar.a(this.o, iB - this.o.getWidth(), height);
            }
            if (z4) {
                afVar.a(this.p, (B() - 40) + (iStringWidth >> 1), height);
            }
        }
    }

    private void l(af afVar) {
        int iB = (B() - 103) >> 1;
        switch (this.fT) {
            case 0:
            case 1:
            case 5:
            case 6:
                boolean z = this.fT == 6 || this.fT == 5;
                boolean z2 = this.fT == 1 || this.fT == 5;
                boolean z3 = z2;
                int i = z2 ? 56 : 19;
                int i2 = z3 ? 35 : 20;
                int i3 = z ? iB + 103 + 2 : 0;
                int iB2 = z ? B() : (iB - 2) - this.c[0].getWidth();
                int width = z ? (iB - 2) - this.c[0].getWidth() : iB + 103 + 2;
                int i4 = 46 + i2;
                for (int i5 = 0; i5 < this.fX; i5 += 2) {
                    a(afVar, i5, iB, i4, false);
                    int i6 = i4 + 16;
                    if (z3) {
                        afVar.a(i3, i6, iB2, i6, 7566195);
                    }
                    a(afVar, i5 + 1, iB, i6, false);
                    i4 = i6 + i;
                }
                int i7 = 46 + i2 + 16;
                b(afVar, width, i7, i7 + 16 + i, z);
                if (!z3) {
                    int i8 = i7 + ((16 + i) << 1);
                    b(afVar, width, i8, i8 + 16 + i, z);
                    break;
                }
                break;
            case 2:
            case 4:
                boolean z4 = this.fT == 4;
                boolean z5 = z4;
                int i9 = z4 ? iB + 103 + 2 : 0;
                int iB3 = z5 ? B() : iB - 2;
                int i10 = z5 ? iB - 2 : iB + 103 + 2;
                a(afVar, 0, iB, 117, true);
                a(afVar, 1, iB, 133, true);
                afVar.a(i9, 133, iB3, 133, 7566195);
                b(afVar, i10, 117, 149, z5);
                break;
            case 3:
                a(afVar, 0, iB, 117, true);
                afVar.a(0, 125, iB - 2, 125, 7566195);
                a(afVar, 1, iB, 133, true);
                afVar.a(iB + 103 + 2, 141, B(), 141, 7566195);
                break;
        }
    }

    private void a(af afVar, int i, int i2, int i3, boolean z) {
        this.g.c(i2, i3, 103, 16);
        afVar.b(this.g, 31481);
        int i4 = i3 + ((16 - this.k.cx) >> 1);
        if (this.f37o[i][0] < 0 || this.f37o[i][0] >= this.f18a.dC) {
            return;
        }
        this.n.a(afVar, new StringBuffer().append("").append(this.f37o[i][1]).toString(), i2 + 5, i4);
        this.l.a(afVar, new StringBuffer().append("").append(this.f37o[i][2]).toString(), i2 + 92, i4);
        this.k.a(afVar, this.f18a.a(this.f37o[i][0]).m, i2 + 15, i4);
        if (z) {
            if (i != 0) {
                afVar.a(this.c[i], i2 + ((103 - this.c[i].getWidth()) >> 1), i4 + 16 + 4);
            } else {
                afVar.a(this.c[i], i2 + ((103 - this.c[i].getWidth()) >> 1), (i4 - 8) - this.c[i].getHeight());
            }
        }
    }

    private void b(af afVar, int i, int i2, int i3, boolean z) {
        int i4;
        int iB;
        int i5 = (i2 + i3) >> 1;
        if (z) {
            i4 = i - 6;
            iB = 0;
        } else {
            i4 = i + 6;
            iB = B();
        }
        afVar.a(i, i2, i4, i2, 7566195);
        afVar.a(i, i3, i4, i3, 7566195);
        afVar.a(i4, i2, i4, i3, 7566195);
        afVar.a(i4, i5, iB, i5, 7566195);
    }

    private void bh() throws IOException {
        if (this.f28Z || this.a.d(23) == 0 || ((w) this).d.df != 0) {
            return;
        }
        ((w) this).d.p(8, -1);
        this.ge = -1;
    }

    private void bi() {
        this.ge = -1;
        ((w) this).d.am();
    }

    private void X(int i) throws IOException {
        switch (i) {
            case 0:
                if (this.a.d(23) == 0) {
                    bi();
                    break;
                } else {
                    this.ge = t.g() + 100;
                    break;
                }
            case 1:
                if (this.a.d(24) != 0) {
                    ((w) this).d.p(7, 0);
                    this.ge = t.g() + 100;
                    break;
                }
                break;
        }
    }

    private void bj() throws IOException {
        this.a.cc = 0;
        this.a.a(25, 4, this.a.d(15), true);
    }

    private void bk() throws IOException {
        String strSubstring;
        int i = 0;
        String appProperty = ((w) this).d.f164a.getAppProperty("MG_PRODUCTS");
        if (appProperty == null) {
            return;
        }
        do {
            if (appProperty.indexOf(44) != -1) {
                strSubstring = appProperty.substring(0, appProperty.indexOf(44));
                appProperty = appProperty.substring(appProperty.indexOf(44) + 1);
            } else {
                strSubstring = appProperty;
                appProperty = null;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                if (strSubstring.equals(e[i2])) {
                    this.ac[i] = i2;
                    i++;
                    break;
                }
                i2++;
            }
        } while (appProperty != null);
        if (i == 0) {
            return;
        }
        this.fS = i;
        this.E.gh = 176;
        this.E.gi = 15;
        if (this.f32k == null) {
            this.f32k = ((w) this).d.m51a(314, 10);
            Y(0);
            if (i == 1) {
                ac acVar = (ac) this.f32k.b(870414251);
                if (acVar != null) {
                    acVar.I = false;
                }
                ac acVar2 = (ac) this.f32k.b(-563143197);
                if (acVar2 != null) {
                    acVar2.I = false;
                }
            }
            ((w) this).d.b(this.f32k);
        }
    }

    private void bl() throws IOException {
        if (this.f32k != null) {
            ((w) this).d.c(this.f32k);
            this.f32k = null;
        }
    }

    private void Y(int i) throws IOException {
        int i2 = this.a.ce;
        int i3 = this.ac[i];
        this.fN = 0;
        String string = new StringBuffer().append("MG_BUYURI_").append(e[i3]).toString();
        String string2 = new StringBuffer().append("MG_CATURI_").append(e[i3]).toString();
        this.f[0] = ((w) this).d.f164a.getAppProperty(string);
        if (this.f[0] != null && this.f[0].length() == 0) {
            this.f[0] = null;
        }
        if (i2 == 1 || this.f[0] == null) {
            this.f[0] = null;
        } else {
            this.ad[this.fN] = 0;
            this.fN++;
        }
        this.f[1] = ((w) this).d.f164a.getAppProperty(string2);
        if (this.f[1] != null && this.f[1].length() == 0) {
            this.f[1] = null;
        }
        if (i2 == 2 && this.f[1] == null) {
            this.f[1] = null;
        } else {
            this.ad[this.fN] = 1;
            this.fN++;
        }
        if (this.f32k.y) {
            this.f32k.aH();
        }
        ac acVar = (ac) this.f32k.b(-428760576);
        if (acVar != null) {
            acVar.eJ = i3;
        }
        l lVar = (l) this.f32k.b(415277092);
        if (lVar != null) {
            lVar.q(B(), C());
            lVar.z(355 + i3);
        }
        a((g) this.f32k.b(835714782), 0, i3);
        a((g) this.f32k.b(1187565128), 1, i3);
        u uVar = (u) this.f32k.b(545648901);
        if (uVar != null) {
            uVar.I = true;
        }
        u uVar2 = (u) this.f32k.b(-1456093333);
        if (uVar2 != null) {
            uVar2.I = false;
            l lVar2 = (l) uVar2.b(-1418904553);
            if (lVar2 != null) {
                lVar2.q(B(), C());
            }
        }
        this.f32k.aG();
        this.fO = 1;
        Z(0);
        repaint();
    }

    private void a(g gVar, int i, int i2) throws IOException {
        if (gVar != null) {
            if (this.fN <= i) {
                gVar.I = false;
            } else {
                gVar.I = true;
                gVar.d(this.ad[i] == 0 ? W[i2] : X[i2], false);
            }
        }
    }

    private void Z(int i) {
        if (this.fO == i || this.fN <= 0) {
            return;
        }
        this.fO = i;
        g gVar = (g) this.f32k.b(i == 0 ? 835714782 : 1187565128);
        c(this.E);
        if (gVar != null) {
            ai aiVar = gVar.x;
            this.E.eF = gVar.t() + ((aiVar.gh - this.E.gh) >> 1);
            this.E.eG = gVar.u() + ((aiVar.gi - this.E.gi) >> 1);
            c(this.E);
        }
    }

    private void aa(int i) throws IOException {
        int i2 = this.a.ce;
        switch (i) {
            case 0:
                if (this.f[0] != null) {
                    ab(16384);
                    break;
                }
                break;
            case 1:
                if (i2 == 2) {
                    ab(16385);
                    break;
                } else if (i2 != 1 && this.f[1] != null) {
                    ab(16385);
                    break;
                } else {
                    bm();
                    break;
                }
                break;
        }
    }

    private void ab(int i) throws IOException {
        z zVar = (z) this.a.m51a(314, 2);
        zVar.e(this);
        zVar.g(142, 0, i);
        zVar.g(143, 1, 32767);
        zVar.z(351, 352);
        zVar.aG();
        this.a.b((u) zVar);
    }

    private void bm() {
        this.f33ab = !this.f33ab;
        u uVar = (u) this.f32k.b(545648901);
        if (uVar != null) {
            uVar.I = !this.f33ab;
        }
        u uVar2 = (u) this.f32k.b(-1456093333);
        if (uVar2 != null) {
            uVar2.I = this.f33ab;
        }
        repaint();
    }
}
