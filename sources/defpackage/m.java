package defpackage;

import NBALIVE08.EASports.Mobile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:m.class */
public final class m extends t {
    private int bZ;
    private boolean j;
    private u c;
    private int ca;
    private int cb;
    private v a;
    public int cc;
    private int[] u;
    private int cd;
    private boolean k;
    public int ce;
    private int cf;
    private int cg;
    private int s;
    private boolean l;

    /* renamed from: a, reason: collision with other field name */
    private f f157a;
    private boolean m;
    private boolean n;
    private int ch;
    private u d;
    private String h;
    private String i;

    /* renamed from: j, reason: collision with other field name */
    private String f158j;
    private int ci;

    /* renamed from: k, reason: collision with other field name */
    private String f159k;

    /* renamed from: l, reason: collision with other field name */
    private String f160l;
    private Image q;
    private Image r;
    private int cj;
    private boolean o;
    public boolean p;
    private int ck;

    private String a() {
        String appProperty = ((t) this).f164a.getAppProperty("Force-Locale");
        String string = null;
        String strSubstring = null;
        int[] iArr = new int[3];
        int i = 1;
        iArr[0] = 0;
        if (appProperty == null || appProperty.length() == 0) {
            i = 2;
            iArr[1] = 2;
        } else {
            appProperty.toLowerCase();
            if (!appProperty.equals("menu")) {
                if (appProperty.indexOf(45) == -1) {
                    i = 3;
                    iArr[1] = 2;
                    iArr[2] = 1;
                    strSubstring = new String(appProperty);
                } else if (appProperty.substring(0, appProperty.indexOf(45)).equals("auto")) {
                    i = 3;
                    iArr[1] = 1;
                    iArr[2] = 2;
                    strSubstring = appProperty.substring(appProperty.indexOf(45) + 1, appProperty.length());
                }
            }
        }
        while (i > 0) {
            i--;
            switch (iArr[i]) {
                case 1:
                    if (strSubstring.indexOf(45) != -1) {
                        strSubstring = appProperty.substring(strSubstring.indexOf(45) + 1, appProperty.length());
                    }
                    string = strSubstring.equals("en") ? "/s.v" : new StringBuffer().append("/s_").append(strSubstring).append(".v").toString();
                    if (string.getClass().getResourceAsStream(string) == null) {
                        break;
                    } else {
                        return string;
                    }
                case 2:
                    String property = System.getProperty("microedition.locale");
                    String strSubstring2 = property;
                    if (property != null && strSubstring2.length() > 0) {
                        if (strSubstring2.indexOf(45) != -1) {
                            strSubstring2 = strSubstring2.substring(0, strSubstring2.indexOf(45));
                        }
                        string = strSubstring2.equals("en") ? "/s.v" : new StringBuffer().append("/s_").append(strSubstring2).append(".v").toString();
                        if (string.getClass().getResourceAsStream(string) == null) {
                            break;
                        } else {
                            return string;
                        }
                    } else {
                        break;
                    }
                    break;
                default:
                    return null;
            }
        }
        return string;
    }

    public m(Mobile mobile, Display display) {
        super(mobile, display, "/s.v");
        this.bZ = -1;
        this.j = false;
        this.c = null;
        this.ca = 0;
        this.cb = 0;
        this.u = new int[29];
        this.f159k = "";
        this.f160l = "";
        this.p = true;
        t.cM = 11189179;
        t.cN = 3359812;
        t.cO = 16777215;
        t.cP = 11141137;
        t.cQ = 15601971;
        t.cR = 15601971;
        t.cS = 1140394;
        t.cT = 8;
        t.cU = 315;
        t.cV = 13;
        t.cW = 315;
        t.cX = 9;
        t.cY = 315;
        this.cj = -1;
    }

    @Override // defpackage.t
    public final void K() throws IOException {
        t.m46a(309);
        t.m46a(316);
        t.m46a(315);
        this.q = t.m44a(309, 8);
        this.r = t.m44a(309, 9);
        R();
        o();
        this.k = false;
        m(26, 0);
        this.cc = 0;
        this.a = new v();
        this.a.a(this);
        if (d(28) == 0) {
            String strA = a();
            if (strA == null) {
                this.cj = 0;
            } else {
                int i = 342;
                while (true) {
                    if (i > 346) {
                        break;
                    }
                    if (strA.equals(t.getString(i))) {
                        m(27, i - 342);
                        break;
                    }
                    i++;
                }
                t.b(strA);
                this.cj = 1;
            }
            m(28, 1);
        } else {
            t.b(t.getString(342 + d(27)));
            this.cj = 1;
        }
        e(1001, true);
    }

    @Override // defpackage.t
    public final void L() throws IOException {
        while (this.g != null) {
            u uVar = this.g;
            if (uVar.dM == 1000 && this.cc != -1) {
                this.f157a = (f) uVar;
                if (this.f157a.f142f) {
                    this.cd = 2;
                    t.b(v.b(this.cc), true);
                }
                this.f157a = null;
            }
            c(uVar);
            uVar.aH();
        }
        if (this.a != null) {
            this.a.as();
            this.a = null;
        }
        if (this.k) {
            return;
        }
        O();
        this.k = true;
    }

    public final String getVersion() {
        return ((t) this).f164a.getAppProperty("MIDlet-Version");
    }

    @Override // defpackage.t
    public final void d(DataInputStream dataInputStream) throws IOException {
        switch (this.cd) {
            case 0:
                e(dataInputStream);
                break;
            case 1:
                this.f157a.a(dataInputStream, t.g());
                break;
        }
    }

    @Override // defpackage.t
    public final void d(DataOutputStream dataOutputStream) throws IOException {
        switch (this.cd) {
            case 0:
                e(dataOutputStream);
                break;
            case 2:
                this.f157a.b(dataOutputStream);
                break;
        }
    }

    public final void a(f fVar) throws IOException {
        this.cd = 2;
        this.f157a = fVar;
        t.b(v.b(this.cc), true);
        this.f157a = null;
    }

    @Override // defpackage.t
    public final w a(int i) {
        switch (i) {
            case 0:
                return new u(this, 0);
            case 1:
                return new g(this);
            case 2:
                return new ac(this);
            case 4:
                return new l(this);
            case 1000:
                this.a.aF();
                return new f(this, this.a);
            case 1001:
                return new ag(this, this.a);
            case 1003:
                return new z(this);
            case 1004:
                return new j(this);
            case 1005:
                return new u(this, 0);
            default:
                return null;
        }
    }

    public final r a(int i, int i2, int i3) throws IOException {
        int i4 = 315;
        if (i2 == -1) {
            i4 = -1;
        }
        return m52a(315, i, i4, i2, 315, i3);
    }

    @Override // defpackage.t
    public final void g(af afVar) {
        if (this.c == null || this.c.dM == 1000 || this.c.dM == 1001) {
            super.g(afVar);
        }
    }

    @Override // defpackage.t
    public final void A(int i) throws IOException {
        if (i != 2) {
            return;
        }
        if (this.j) {
            this.j = false;
            u uVar = this.g;
            if (uVar != null) {
                if (uVar.dM == 1000 && this.m && this.cc != -1) {
                    this.m = false;
                    this.f157a = (f) uVar;
                    if (this.f157a.f142f) {
                        this.cd = 2;
                        t.b(v.b(this.cc), true);
                    }
                    this.f157a = null;
                }
                c(uVar);
                uVar.e();
                t.I(t.db & (t.de ^ (-1)));
            }
        }
        if (this.bZ != -1) {
            ag();
            int i2 = -1;
            switch (this.bZ) {
                case 1003:
                    i2 = 2;
                    break;
                case 1004:
                    i2 = 1;
                    break;
            }
            this.cb = 0;
            if (i2 != -1) {
                this.c = m51a(314, i2);
            } else {
                this.c = (u) a(this.bZ);
            }
            this.bZ = -1;
            this.c.aG();
            this.ca = 0;
            F(0);
            a(t.getString(2));
            switch (this.c.dM) {
                case 1000:
                    if (!this.n) {
                        v vVar = this.a;
                        vVar.getClass();
                        c cVar = new c(vVar);
                        DataInputStream dataInputStreamA = cVar.a(v.b(this.cc));
                        if (dataInputStreamA != null) {
                            dataInputStreamA.readInt();
                            dataInputStreamA.readInt();
                            short s = dataInputStreamA.readShort();
                            short s2 = dataInputStreamA.readShort();
                            int i3 = dataInputStreamA.readInt();
                            cVar.c();
                            ((f) this.c).b((int) s, (int) s2, i3);
                            break;
                        }
                    } else {
                        ((f) this.c).b(this.cf, this.cg, this.s);
                        break;
                    }
                    break;
            }
            return;
        }
        if (this.c != null) {
            u uVar2 = this.c;
            int i4 = this.ca;
            this.ca = i4 + 1;
            this.cb = uVar2.a(i4);
            a(new StringBuffer().append(t.getString(2)).append(this.cb).append("/100 ").toString());
            F(this.cb);
            if (this.cb != 100) {
                if (this.cb == -1) {
                    this.c.e();
                    this.c = null;
                    return;
                }
                return;
            }
            ag();
            b(this.c);
            switch (this.c.dM) {
                case 1000:
                    this.m = false;
                    if (!this.n) {
                        this.cd = 1;
                        this.f157a = (f) this.c;
                        t.a(v.b(this.cc), true);
                        this.f157a = null;
                        break;
                    } else {
                        ((f) this.c).a(this.s, this.l, d(1) != 0, t.g());
                        break;
                    }
                case 1001:
                    f fVar = (f) m43a(1000);
                    if (fVar != null) {
                        ((ag) this.c).b(fVar);
                    }
                    if (this.cj == -1) {
                        ((ag) this.c).m14b(6, t.g());
                    } else {
                        if (this.o && this.cj != 6) {
                            ((ag) this.c).T(6);
                        }
                        ((ag) this.c).m14b(this.cj, t.g());
                        this.cj = -1;
                    }
                    if (this.ch < 0) {
                        repaint();
                        b(this.f159k, this.f160l, null);
                        this.ch = 0;
                    }
                    this.p = false;
                    break;
                case 1003:
                    this.d.repaint();
                    ((z) this.c).e(this.d);
                    ((z) this.c).a(this.h, this.i);
                    ((z) this.c).Q(this.ci);
                    this.d = null;
                    this.h = null;
                    this.i = null;
                    this.c.aH();
                    this.c.aG();
                    break;
                case 1004:
                    ((j) this.c).a(this.h, this.i, this.f158j);
                    this.h = null;
                    this.i = null;
                    this.f158j = null;
                    break;
            }
            t.I(t.db & (t.de ^ (-1)));
            this.c = null;
        }
    }

    public final void e(int i, boolean z) {
        this.bZ = i;
        this.j = z;
    }

    public final void M() {
        this.m = true;
        e(1001, true);
    }

    public final void a(int i, boolean z, boolean z2) {
        e(1001, z2);
        this.cj = i;
        this.o = z;
    }

    public final void a(u uVar, int i, int i2, int i3) throws IOException {
        a(uVar, t.getString(i), t.getString(i2), i3);
    }

    public final void a(u uVar, String str, String str2, int i) throws IOException {
        e(1003, false);
        this.d = uVar;
        this.h = str;
        this.i = str2;
        this.ci = i;
    }

    public final void b(String str, String str2, String str3) throws IOException {
        e(1004, false);
        this.h = str;
        this.i = str2;
        this.f158j = str3;
    }

    public final void a(int i, int i2, int i3, boolean z) throws IOException {
        e(1000, true);
        this.n = true;
        this.cf = i;
        this.cg = i2;
        this.s = i3;
        this.l = z;
    }

    public final void N() throws IOException {
        if (this.a.j(this.cc)) {
            e(1000, true);
            this.n = false;
        }
    }

    private boolean o() throws IOException {
        this.cd = 0;
        boolean zA = t.a("nba_prefs.dat", true);
        if (!zA || this.u[0] != 268435747) {
            P();
        }
        for (int i = 1; i < 29; i++) {
            int i2 = i;
            m(i2, d(i2));
        }
        return zA;
    }

    private void e(DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < 29; i++) {
            this.u[i] = dataInputStream.readInt();
        }
    }

    public final void O() throws IOException {
        this.cd = 0;
        t.b("nba_prefs.dat", true);
    }

    private void e(DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < 29; i++) {
            dataOutputStream.writeInt(this.u[i]);
        }
    }

    private void P() {
        this.u[0] = 268435747;
        this.u[23] = 1;
        this.u[24] = 1;
        this.u[14] = 1;
        this.u[15] = 120000;
        this.u[17] = 20;
        this.u[18] = 5;
        this.u[21] = 1;
        this.u[20] = 1;
        this.u[19] = 0;
        this.u[25] = 0;
        this.u[16] = 2;
        this.u[22] = 1;
        this.u[1] = 1;
        this.u[2] = 1;
        this.u[26] = 0;
        Q();
    }

    public final int d(int i) {
        return this.u[i];
    }

    public final void m(int i, int i2) {
        this.u[i] = i2;
        switch (i) {
            case 14:
                Q();
                break;
            case 23:
            case 24:
                g((this.u[23] == 0 && this.u[24] == 0) ? false : true);
                break;
            case 25:
                break;
        }
    }

    private void Q() {
        if (this.u[2] == 0) {
        }
        switch (this.u[14]) {
            case 0:
                for (int i = 3; i <= 13; i++) {
                    this.u[i] = 0;
                }
                this.u[3] = 1;
                this.u[4] = 1;
                this.u[9] = 1;
                this.u[13] = 1;
                break;
            case 1:
                for (int i2 = 3; i2 <= 13; i2++) {
                    this.u[i2] = 1;
                }
                this.u[7] = 0;
                this.u[8] = 0;
                break;
            case 2:
                for (int i3 = 3; i3 <= 13; i3++) {
                    this.u[i3] = 1;
                }
                break;
        }
    }

    private void R() {
        String appProperty = ((t) this).f164a.getAppProperty("MG_PRODUCTS");
        String appProperty2 = ((t) this).f164a.getAppProperty("MG_Impl");
        if (appProperty == null || appProperty.length() == 0) {
            this.ce = 0;
            return;
        }
        if (appProperty2 != null) {
            String lowerCase = appProperty2.trim().toLowerCase();
            if (lowerCase.equals("static")) {
                this.ce = 1;
                return;
            } else if (lowerCase.equals("wap")) {
                this.ce = 2;
                return;
            } else if (lowerCase.equals("wapstatic")) {
                this.ce = 3;
                return;
            }
        }
        this.ce = 0;
    }

    public final void S() {
        if (this.ck > 0) {
            t.g();
        }
    }

    public final void a(af afVar, boolean z, boolean z2) {
        if (z2) {
            afVar.a(this.q, d() - this.q.getWidth(), e() - this.q.getHeight());
        }
        if (z) {
            afVar.a(this.r, 0, e() - this.r.getHeight());
        }
    }

    public final int c() {
        return Math.max(this.r.getHeight(), this.q.getHeight());
    }
}
