package defpackage;

import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:t.class */
public class t extends FullCanvas implements Runnable, PlayerListener {
    public static t b;
    private final Display a;

    /* renamed from: a, reason: collision with other field name */
    public final e f164a;

    /* renamed from: a, reason: collision with other field name */
    public af f165a;
    private static int cK;
    public boolean A;
    private boolean B;

    /* renamed from: C, reason: collision with other field name */
    private boolean f167C;
    private u e;

    /* renamed from: a, reason: collision with other field name */
    private g f170a;

    /* renamed from: a, reason: collision with other field name */
    private static byte[] f171a;
    private u f;
    public u g;
    public u h;
    public boolean E;
    public int cZ;

    /* renamed from: a, reason: collision with other field name */
    private Player f182a;

    /* renamed from: a, reason: collision with other field name */
    public static Object f166a = new Object();
    private static int[] D = new int[12];
    public static int cM = 16777215;
    public static int cN = 0;
    public static int cO = 0;
    public static int cP = 8421504;
    public static int cQ = 16711680;
    public static int cR = 4128768;
    public static int cS = 16776960;
    public static int cT = 0;
    public static int cU = -1;
    public static int cV = -1;
    public static int cW = -1;
    public static int cX = -1;
    public static int cY = -1;

    /* renamed from: a, reason: collision with other field name */
    private static Hashtable f175a = new Hashtable();

    /* renamed from: b, reason: collision with other field name */
    private static Hashtable f176b = new Hashtable();
    private static Hashtable c = new Hashtable();
    private static Hashtable d = new Hashtable();

    /* renamed from: b, reason: collision with other field name */
    public static byte[] f177b = new byte[35000];

    /* renamed from: e, reason: collision with other field name */
    private static Hashtable f178e = new Hashtable();
    private static int da = 0;
    public static int db = -1;
    public static int dc = 1;
    public static int dd = 2;
    public static int de = 4;

    /* renamed from: c, reason: collision with other field name */
    private static final byte[] f179c = new byte[1024];
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    public boolean z = false;
    private int[] C = new int[32];
    private int cI = 0;
    private int cJ = 0;

    /* renamed from: D, reason: collision with other field name */
    private boolean f168D = false;

    /* renamed from: a, reason: collision with other field name */
    private Graphics f169a = null;
    public int cL = 100;
    private ai n = new ai();
    private boolean F = false;
    private ai o = new ai();
    private ai p = new ai();
    private ai q = new ai();
    private ai r = new ai();

    /* renamed from: a, reason: collision with other field name */
    private Random f172a = new Random();

    /* renamed from: E, reason: collision with other field name */
    public int[] f173E = new int[2];

    /* renamed from: F, reason: collision with other field name */
    public int[] f174F = new int[624];

    /* renamed from: c, reason: collision with other field name */
    private byte[][] f180c = new byte[128];
    public int df = 0;
    public int dg = -1;

    /* renamed from: b, reason: collision with other field name */
    private String[] f181b = new String[128];
    private int dh = 0;
    private int di = -1;
    private int dj = 0;

    /* JADX WARN: Type inference failed for: r1v24, types: [byte[], byte[][]] */
    public t(e eVar, Display display, String str) {
        this.A = true;
        b = this;
        this.a = display;
        this.f164a = eVar;
        aj();
        this.A = true;
        cK = f();
        G(cK);
        H(cK);
        if (str != "") {
            try {
                b(str);
            } catch (IOException unused) {
            }
        }
    }

    public void hideNotify() {
        pause();
    }

    public void showNotify() {
        ab();
    }

    public final void pause() {
        this.B = true;
    }

    public final void aa() throws IOException {
        this.B = false;
        if (this.w) {
            return;
        }
        this.w = true;
        ak();
        u uVarA = this.h;
        while (true) {
            u uVar = uVarA;
            if (uVar == null) {
                return;
            }
            uVar.d(3);
            uVarA = a(uVar);
        }
    }

    public final void ab() {
        this.f167C = true;
    }

    private void ac() throws IOException {
        this.f167C = false;
        if (!this.w) {
            return;
        }
        this.w = false;
        if (this.g != null) {
            b((u) null, (ai) null);
        }
        al();
        u uVarA = this.h;
        while (true) {
            u uVar = uVarA;
            if (uVar == null) {
                return;
            }
            uVar.d(4);
            uVarA = a(uVar);
        }
    }

    public final void a(AlertType alertType, String str, String str2, int i) throws InterruptedException {
        Alert alert = new Alert(str);
        alert.setTimeout(i);
        alert.setString(str2);
        alert.setType(alertType);
        this.a.setCurrent(alert);
        K(i);
    }

    public final int d() {
        return getWidth();
    }

    public final int e() {
        return (this.e == null || this.f168D) ? getHeight() : getHeight() - this.e.y();
    }

    public static final int f() {
        return (int) System.currentTimeMillis();
    }

    public static final int g() {
        return f() - cK;
    }

    public w a(int i) {
        return null;
    }

    public void A(int i) throws IOException {
    }

    public void K() throws IOException {
    }

    public void L() throws IOException {
    }

    public final void ad() throws IOException {
        synchronized (f166a) {
            L();
        }
    }

    public final void ae() {
        new Thread(this).start();
    }

    public final void af() {
        this.z = true;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        if (!this.y) {
            try {
                K();
            } catch (Throwable unused) {
                this.f164a.o = 1;
                this.f164a.d();
            }
            this.y = true;
        }
        while (!this.z) {
            if (this.f167C || this.B || !this.w) {
                if (!this.w && !isShown()) {
                    pause();
                }
                synchronized (f166a) {
                    try {
                        try {
                        } catch (OutOfMemoryError unused2) {
                            this.f164a.o = 2;
                            this.f164a.d();
                        } catch (Throwable unused3) {
                            this.f164a.o = 1;
                            this.f164a.d();
                        }
                    } catch (IllegalArgumentException unused4) {
                        this.f164a.o = 3;
                        this.f164a.d();
                    } catch (NullPointerException unused5) {
                        this.f164a.o = 4;
                        this.f164a.d();
                    }
                    if (this.B) {
                        aa();
                    } else {
                        if (this.f167C) {
                            ac();
                        }
                        A(2);
                        ah();
                        int iG = g();
                        this.E = true;
                        u uVarB = b();
                        while (uVarB != null) {
                            uVarB.h(iG);
                            uVarB = c();
                        }
                        ai();
                        if (this.F) {
                            this.F = false;
                            repaint();
                        }
                        if (this.x) {
                            K(10);
                        }
                        Thread.yield();
                    }
                }
            } else {
                K(5);
            }
        }
        this.f164a.d();
    }

    public final void E(int i) {
        synchronized (this.C) {
            if (this.cJ < 32) {
                int i2 = this.cI + this.cJ;
                int i3 = i2;
                if (i2 >= 32) {
                    i3 -= 32;
                }
                this.C[i3] = i;
                this.cJ++;
            }
        }
    }

    public final void ag() {
        synchronized (this.C) {
            this.cI = 0;
            this.cJ = 0;
        }
    }

    private int h() {
        int i;
        synchronized (this.C) {
            int i2 = 0;
            if (this.cJ > 0) {
                i2 = this.C[this.cI];
                this.cJ--;
                this.cI++;
                if (this.cI == 32) {
                    this.cI = 0;
                }
            }
            i = i2;
        }
        return i;
    }

    private void ah() throws IOException {
        while (true) {
            int iH = h();
            if (iH == 0) {
                return;
            } else {
                i(iH);
            }
        }
    }

    public void keyPressed(int i) {
        int iN;
        if (this.w || (iN = n(i)) == 0) {
            return;
        }
        E(iN);
    }

    public void keyReleased(int i) {
        int iN;
        if (this.w || (iN = n(i)) == 0) {
            return;
        }
        E(iN | 1073741824);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int n(int i) {
        int i2 = 0;
        try {
            switch (getGameAction(i)) {
                case 1:
                    i2 = 131072;
                    break;
                case 2:
                    i2 = 32768;
                    break;
                case 5:
                    i2 = 65536;
                    break;
                case 6:
                    i2 = 262144;
                    break;
                case 8:
                    i2 = 524288;
                    break;
            }
        } catch (IllegalArgumentException unused) {
        }
        switch (i) {
            case -8:
                i2 = 268435456;
                break;
            case -7:
                i2 = 268443648;
                break;
            case -6:
                i2 = 134221824;
                break;
            case -5:
                i2 = 134217728;
                break;
            case 35:
                i2 = 33556480;
                break;
            case 42:
                i2 = 16778240;
                break;
            case 48:
                i2 = 67108865;
                break;
            case 49:
                i2 = 1048578;
                break;
            case 50:
                i2 = 131076;
                break;
            case 51:
                i2 = 2097160;
                break;
            case 52:
                i2 = 32784;
                break;
            case 53:
                i2 = 524320;
                break;
            case 54:
                i2 = 65600;
                break;
            case 55:
                i2 = 4194432;
                break;
            case 56:
                i2 = 262400;
                break;
            case 57:
                i2 = 8389120;
                break;
        }
        if (i2 == 524288) {
            i2 = 134217728;
        }
        return i2;
    }

    private boolean i(int i) throws IOException {
        if (this.cL < 100) {
            return false;
        }
        boolean zB = false;
        boolean z = (i & 1073741824) != 0;
        int i2 = i & (-1073741825);
        this.E = false;
        u uVarA = a();
        while (true) {
            u uVar = uVarA;
            if (uVar == null) {
                break;
            }
            zB = z ? uVar.b(i2 & 32767, i2 & (-32768)) : uVar.a(i2 & 32767, i2 & (-32768));
            if (zB) {
                break;
            }
            uVarA = m41d();
        }
        ai();
        A(z ? 0 : 1);
        return zB;
    }

    public void paint(Graphics graphics) {
        synchronized (f166a) {
            if (this.f169a != graphics || getHeight() != this.f165a.fF) {
                this.f165a = null;
                this.f169a = graphics;
                this.f165a = new af(graphics, getWidth(), getHeight());
            }
            this.f165a.g(null);
            if (this.cL < 100) {
                g(this.f165a);
            } else {
                this.f165a.b(0, 0, getWidth(), e());
                h(this.f165a);
                if (this.e != null) {
                    int i = this.f165a.fC;
                    int i2 = this.f165a.fD;
                    this.f165a.aV();
                    this.f165a.D(0, 0);
                    this.e.setPosition(0, getHeight() - this.e.y());
                    this.f165a.b(0, getHeight() - this.e.y(), getWidth(), this.e.y());
                    this.e.b(this.f165a);
                    this.f165a.D(i, i2);
                    this.f165a.aW();
                }
            }
            this.f165a.aU();
        }
    }

    public final void a(String str) {
        try {
            if (this.f170a == null) {
                int[] iArrM55a = m55a();
                iArrM55a[0] = cM;
                iArrM55a[1] = cN;
                iArrM55a[2] = 0;
                iArrM55a[3] = 1;
                iArrM55a[4] = -1;
                iArrM55a[5] = cT;
                iArrM55a[6] = cU;
                iArrM55a[7] = cV;
                iArrM55a[8] = cW;
                iArrM55a[9] = cX;
                iArrM55a[10] = cY;
                iArrM55a[11] = 1;
                this.f170a = new g(this, iArrM55a);
                this.f170a.aG();
            }
            this.f170a.a(str, true);
            this.f170a.setPosition((d() - this.f170a.x()) >> 1, (e() >> 1) + 12);
        } catch (Exception unused) {
        }
    }

    public final void F(int i) {
        this.cL = i;
        if (this.cL >= 100) {
            this.f170a = null;
        }
        this.F = true;
    }

    public void g(af afVar) {
        afVar.b(null, cO);
        if (this.f170a != null) {
            this.f170a.b(afVar);
        }
        this.n.c((d() - 102) >> 1, ((e() - 12) >> 1) - 1, 102, 12);
        afVar.a(this.n, cS);
        this.n.eF++;
        this.n.eG++;
        this.n.gi -= 2;
        this.n.gh = this.cL;
        if (this.n.gh > 0) {
            afVar.b(this.n, cQ);
            afVar.a(this.n, cR);
        }
        this.n.eF += this.n.gh;
        this.n.gh = 100 - this.n.gh;
        if (this.n.gh > 0) {
            afVar.b(this.n, cP);
        }
    }

    public static final String getString(int i) {
        String str;
        int i2 = i << 1;
        int i3 = ((f171a[i2 + 0] << 8) & 65280) | (f171a[i2 + 1] & 255);
        try {
            str = new String(f171a, i3, (((f171a[i2 + 2] << 8) & 65280) | (f171a[i2 + 3] & 255)) - i3, "ISO-8859-1");
        } catch (Exception unused) {
            str = new String(f171a, i3, (((f171a[i2 + 2] << 8) & 65280) | (f171a[i2 + 3] & 255)) - i3);
        }
        return str;
    }

    public final synchronized void b(u uVar) {
        u uVar2 = this.g;
        u uVarM42b = uVar2;
        ((w) uVar).f193d = null;
        uVar.c = null;
        if (uVarM42b != null) {
            while (uVarM42b != null && uVarM42b.dV > uVar.dV) {
                uVarM42b = m42b(uVarM42b);
            }
            if (uVarM42b != null) {
                if (this.g == uVarM42b) {
                    this.g = uVar;
                    this.g.c = null;
                } else {
                    uVarM42b.c.f193d = uVar;
                }
                uVar.c = uVarM42b.c;
                ((w) uVar).f193d = uVarM42b;
                uVarM42b.c = uVar;
            } else {
                ((w) this.h).f193d = uVar;
                uVar.c = this.h;
                this.h = uVar;
            }
        } else {
            this.g = uVar;
            this.h = uVar;
        }
        uVar.H = true;
        uVar.s.gh = 0;
        uVar.t.c(0, 0, uVar.x(), uVar.y());
        a(uVar, (ai) null);
        if (uVar2 != null) {
            try {
                if (uVar2 != this.g) {
                    uVar2.d(1);
                }
            } catch (IOException unused) {
                return;
            }
        }
        if (uVar == this.g) {
            uVar.d(0);
        }
    }

    public final void c(u uVar) {
        u uVar2 = this.g;
        uVar.a(this.q, uVar.t);
        uVar.H = false;
        if (this.g == uVar) {
            this.g = (u) ((w) uVar).f193d;
            if (this.g != null) {
                this.g.c = null;
            }
        } else {
            uVar.c.f193d = ((w) uVar).f193d;
        }
        if (this.h == uVar) {
            this.h = (u) uVar.c;
            if (this.h != null) {
                ((w) this.h).f193d = null;
            }
        } else {
            ((w) uVar).f193d.c = uVar.c;
        }
        uVar.c = null;
        ((w) uVar).f193d = null;
        a((u) null, this.q);
        u uVar3 = this.g;
        if (uVar3 != null && uVar3 != uVar2) {
            try {
                uVar3.d(0);
            } catch (IOException unused) {
            }
        }
        if (this.f == null || this.f != uVar) {
            return;
        }
        if (this.E) {
            this.f = a(uVar);
        } else {
            this.f = m42b(uVar);
        }
    }

    public final void d(u uVar) {
        uVar.a(this.q, uVar.t);
        if (this.q.eF == uVar.v() && this.q.eG == uVar.w() && this.q.gh == uVar.x() && this.q.gi == uVar.y()) {
            return;
        }
        a((u) null, this.q);
        this.o.c(0, 0, d(), e());
        this.r.c(uVar.v(), uVar.w(), uVar.x(), uVar.y());
        this.r.c(this.o);
        uVar.b(uVar.t, this.r);
        b(uVar, (ai) null);
    }

    private void a(u uVar, ai aiVar, boolean z) {
        if (uVar != null) {
            if (aiVar != null) {
                this.p.h(aiVar);
                if (!this.p.c(uVar.t)) {
                    return;
                } else {
                    uVar.a(this.q, this.p);
                }
            } else {
                uVar.a(this.q, uVar.t);
            }
        } else if (aiVar != null) {
            this.q.h(aiVar);
        } else {
            this.q.c(0, 0, d(), e());
        }
        if (z) {
            u uVarA = this.h;
            while (true) {
                u uVar2 = uVarA;
                if (uVar2 == null) {
                    break;
                }
                uVar2.b(this.p, this.q);
                if (this.p.c(uVar2.t)) {
                    try {
                        uVar2.d(2);
                    } catch (IOException unused) {
                    }
                }
                uVarA = a(uVar2);
            }
        }
        u uVarA2 = this.h;
        while (true) {
            u uVar3 = uVarA2;
            if (uVar3 == null) {
                this.F = true;
                return;
            }
            uVar3.b(this.p, this.q);
            if (this.p.c(uVar3.t)) {
                if (uVar3.s.gh == 0) {
                    uVar3.s.h(this.p);
                } else {
                    uVar3.s.i(this.p);
                }
                uVar3.a(this.r, uVar3.s);
                this.q.i(this.r);
            }
            uVarA2 = a(uVar3);
        }
    }

    private void h(af afVar) {
        int i = afVar.fC;
        int i2 = afVar.fD;
        afVar.aV();
        afVar.D(0, 0);
        u uVarA = this.h;
        while (true) {
            u uVar = uVarA;
            if (uVar == null) {
                afVar.D(i, i2);
                afVar.aW();
                return;
            }
            if (uVar.s.gh > 0) {
                uVar.a(this.q, uVar.s);
                afVar.e(this.q);
                uVar.s.gh = 0;
                uVar.b(afVar);
            }
            uVarA = a(uVar);
        }
    }

    public final void ai() {
        this.f = null;
    }

    public final u a() {
        this.f = this.g;
        return this.f;
    }

    public final u b() {
        this.f = this.h;
        return this.f;
    }

    public final u c() {
        if (this.f != null) {
            this.f = a(this.f);
        }
        return this.f;
    }

    /* renamed from: d, reason: collision with other method in class */
    public final u m41d() {
        if (this.f != null) {
            this.f = m42b(this.f);
        }
        return this.f;
    }

    public static u a(u uVar) {
        return (u) uVar.c;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static u m42b(u uVar) {
        return (u) ((w) uVar).f193d;
    }

    public final void a(u uVar, ai aiVar) {
        a(uVar, aiVar, true);
    }

    public final void b(u uVar, ai aiVar) {
        a(uVar, aiVar, false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public final u m43a(int i) {
        u uVarM42b = this.g;
        while (true) {
            u uVar = uVarM42b;
            if (uVar == null) {
                return null;
            }
            if (uVar.dM == i) {
                return uVar;
            }
            uVarM42b = m42b(uVar);
        }
    }

    private void aj() {
        this.cZ = 625;
        this.f173E[0] = 0;
        this.f173E[1] = -1727483681;
    }

    public final void G(int i) {
        this.f174F[0] = i;
        this.cZ = 1;
        while (this.cZ < 624) {
            this.f174F[this.cZ] = (1812433253 * (this.f174F[this.cZ - 1] ^ (this.f174F[this.cZ - 1] >> 30))) + this.cZ;
            this.cZ++;
        }
    }

    public final int i() {
        if (this.cZ >= 624) {
            int i = 0;
            while (i < 227) {
                int i2 = (this.f174F[i] & Integer.MIN_VALUE) | (this.f174F[i + 1] & Integer.MAX_VALUE);
                this.f174F[i] = (this.f174F[i + 397] ^ (i2 >> 1)) ^ this.f173E[i2 & 1];
                i++;
            }
            while (i < 623) {
                int i3 = (this.f174F[i] & Integer.MIN_VALUE) | (this.f174F[i + 1] & Integer.MAX_VALUE);
                this.f174F[i] = (this.f174F[i - 227] ^ (i3 >> 1)) ^ this.f173E[i3 & 1];
                i++;
            }
            int i4 = (this.f174F[623] & Integer.MIN_VALUE) | (this.f174F[0] & Integer.MAX_VALUE);
            this.f174F[623] = (this.f174F[396] ^ (i4 >> 1)) ^ this.f173E[i4 & 1];
            this.cZ = 0;
        }
        int[] iArr = this.f174F;
        int i5 = this.cZ;
        this.cZ = i5 + 1;
        int i6 = iArr[i5];
        int i7 = i6 ^ (i6 >> 11);
        int i8 = i7 ^ ((i7 << 7) & (-1658038656));
        int i9 = i8 ^ ((i8 << 15) & (-272236544));
        return i9 ^ (i9 >> 18);
    }

    public final int o(int i) {
        return i() % i;
    }

    public final void H(int i) {
        this.f172a.setSeed(i);
    }

    public void d(DataInputStream dataInputStream) throws IOException {
    }

    public void d(DataOutputStream dataOutputStream) throws IOException {
    }

    public static boolean a(String str, boolean z) {
        boolean z2 = false;
        ByteArrayInputStream byteArrayInputStream = null;
        DataInputStream dataInputStream = null;
        RecordStore recordStore = null;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
            recordStore = recordStoreOpenRecordStore;
            if (recordStoreOpenRecordStore != null) {
                byte[] record = recordStore.getRecord(1);
                if (z) {
                    byteArrayInputStream = new ByteArrayInputStream(record);
                    dataInputStream = new DataInputStream(byteArrayInputStream);
                    b.d(dataInputStream);
                    z2 = true;
                } else {
                    z2 = record != null;
                }
            }
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreException unused) {
                }
                a(dataInputStream);
                a(byteArrayInputStream);
            } else {
                a(dataInputStream);
                a(byteArrayInputStream);
            }
        } catch (Exception unused2) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreException unused3) {
                    a(dataInputStream);
                    a(byteArrayInputStream);
                    return z2;
                }
                a(dataInputStream);
                a(byteArrayInputStream);
            } else {
                a(dataInputStream);
                a(byteArrayInputStream);
            }
        } catch (Throwable th) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreException unused4) {
                    a(dataInputStream);
                    a(byteArrayInputStream);
                    throw th;
                }
            }
            a(dataInputStream);
            a(byteArrayInputStream);
            throw th;
        }
        return z2;
    }

    public static boolean b(String str, boolean z) {
        boolean z2 = false;
        RecordStore recordStoreOpenRecordStore = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            recordStoreOpenRecordStore = RecordStore.openRecordStore(str, z);
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            b.d(dataOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                recordStoreOpenRecordStore.setRecord(1, byteArray, 0, byteArray.length);
                z2 = true;
            } catch (InvalidRecordIDException unused) {
                recordStoreOpenRecordStore.addRecord(byteArray, 0, byteArray.length);
                z2 = true;
            }
            if (recordStoreOpenRecordStore != null) {
                try {
                    recordStoreOpenRecordStore.closeRecordStore();
                } catch (RecordStoreException unused2) {
                }
                a(dataOutputStream);
                a(byteArrayOutputStream);
            } else {
                a(dataOutputStream);
                a(byteArrayOutputStream);
            }
        } catch (RecordStoreException unused3) {
            if (recordStoreOpenRecordStore != null) {
                try {
                    recordStoreOpenRecordStore.closeRecordStore();
                } catch (RecordStoreException unused4) {
                    a(dataOutputStream);
                    a(byteArrayOutputStream);
                    return z2;
                }
                a(dataOutputStream);
                a(byteArrayOutputStream);
            } else {
                a(dataOutputStream);
                a(byteArrayOutputStream);
            }
        } catch (IOException unused5) {
            if (recordStoreOpenRecordStore != null) {
                try {
                    recordStoreOpenRecordStore.closeRecordStore();
                } catch (RecordStoreException unused6) {
                    a(dataOutputStream);
                    a(byteArrayOutputStream);
                    return z2;
                }
                a(dataOutputStream);
                a(byteArrayOutputStream);
            } else {
                a(dataOutputStream);
                a(byteArrayOutputStream);
            }
        } catch (Throwable th) {
            if (recordStoreOpenRecordStore != null) {
                try {
                    recordStoreOpenRecordStore.closeRecordStore();
                } catch (RecordStoreException unused7) {
                    a(dataOutputStream);
                    a(byteArrayOutputStream);
                    throw th;
                }
            }
            a(dataOutputStream);
            a(byteArrayOutputStream);
            throw th;
        }
        return z2;
    }

    public static int j() {
        return da;
    }

    public static final void I(int i) {
        if ((i & dd) != 0) {
            c = null;
        }
        if ((i & de) != 0) {
            f175a = null;
        }
        if ((i & dc) != 0) {
            f176b = null;
            d = null;
        }
        System.gc();
        System.gc();
        if (c == null) {
            c = new Hashtable();
        }
        if (f175a == null) {
            f175a = new Hashtable();
        }
        if (f176b == null) {
            f176b = new Hashtable();
        }
        if (d == null) {
            d = new Hashtable();
        }
    }

    public static ah a(int i, int i2) throws IOException {
        DataInputStream dataInputStreamM48a = null;
        try {
            dataInputStreamM48a = m48a(i, i2);
            ah ahVar = new ah(dataInputStreamM48a);
            a(dataInputStreamM48a);
            return ahVar;
        } catch (Throwable th) {
            a(dataInputStreamM48a);
            throw th;
        }
    }

    public final ah b(int i, int i2) throws IOException {
        Integer num = new Integer((i << 7) + i2 + 1);
        ah ahVar = (ah) c.get(num);
        ah ahVar2 = ahVar;
        if (ahVar == null) {
            ah ahVarA = a(i, i2);
            ahVar2 = ahVarA;
            if (ahVarA != null) {
                c.put(num, ahVar2);
            }
        }
        return ahVar2;
    }

    public final aa a(int i, int i2, int i3, int i4, int i5, int i6) throws IOException {
        Image imageM44a = (i3 < 0 || i4 < 0) ? m44a(i, i2) : a(i, i2, i3, i4);
        if (imageM44a == null) {
            return null;
        }
        ah ahVarB = null;
        if (i5 >= 0) {
            ahVarB = b(i5, i6);
        }
        return new aa(imageM44a, ahVarB);
    }

    public final aa a(int i, int i2, byte[] bArr, int i3, int i4) throws IOException {
        Image imageA = a(i, i2, bArr);
        if (imageA == null) {
            return null;
        }
        ah ahVarB = null;
        if (i3 >= 0) {
            ahVarB = b(i3, i4);
        }
        return new aa(imageA, ahVarB);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Image m44a(int i, int i2) throws IOException {
        Integer num = new Integer((i << 7) + i2 + 1);
        Image image = (Image) f176b.get(num);
        Image image2 = image;
        if (image == null) {
            Image imageC = c(i, i2);
            image2 = imageC;
            if (imageC != null) {
                f176b.put(num, image2);
            }
        }
        return image2;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static Image m45b(int i, int i2) throws IOException {
        return c(i, i2);
    }

    public static Image a(int i, int i2, int i3, int i4) throws IOException {
        Integer num = new Integer((i3 << 23) + (i4 << 16) + (i << 7) + i2 + 1);
        Image image = (Image) f176b.get(num);
        Image image2 = image;
        if (image == null) {
            Image imageM50b = m50b(i, i2, i3, i4);
            image2 = imageM50b;
            if (imageM50b != null) {
                f176b.put(num, image2);
            }
        }
        return image2;
    }

    public static Image a(int i, int i2, byte[] bArr) throws IOException {
        return a(m48a(i, i2), new DataInputStream(new ByteArrayInputStream(bArr)), bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final byte[] m46a(int i) throws IOException {
        InputStream resourceAsStream = null;
        String string = getString(i);
        try {
            byte[] bArr = (byte[]) f178e.get(string);
            byte[] bArr2 = bArr;
            if (bArr == null) {
                resourceAsStream = string.getClass().getResourceAsStream(string);
                int i2 = 0;
                while (true) {
                    int i3 = resourceAsStream.read(f177b, i2, f177b.length - i2);
                    if (i3 == -1) {
                        bArr2 = new byte[i2];
                        System.arraycopy(f177b, 0, bArr2, 0, i2);
                        f178e.put(string, bArr2);
                        break;
                    }
                    if (i3 == 0) {
                        throw new IOException("File read exceeding buffer size");
                    }
                    i2 += i3;
                }
            }
            resourceAsStream = resourceAsStream;
            return bArr2;
        } finally {
            a((InputStream) null);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m47a(int i, int i2) throws IOException {
        DataInputStream dataInputStreamM48a = null;
        try {
            dataInputStreamM48a = m48a(i, i2);
            byte[] bArr = new byte[j()];
            dataInputStreamM48a.read(bArr);
            a(dataInputStreamM48a);
            return bArr;
        } catch (Throwable th) {
            a(dataInputStreamM48a);
            throw th;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static DataInputStream m48a(int i, int i2) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m46a(i));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            int i3 = dataInputStream.readInt();
            if (i2 >= i3) {
                throw new IOException("PackRat: Index > NumFiles");
            }
            int i4 = dataInputStream.readInt();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = dataInputStream.readInt();
                if (i7 == i2) {
                    i5 = i8;
                } else if (i7 == i2 + 1) {
                    i6 = i8;
                }
            }
            if (i6 == 0) {
                i6 = i4;
            }
            da = i6 - i5;
            int i9 = i5 - (8 + (4 * i3));
            if (i9 > 0) {
                dataInputStream.skipBytes(i9);
            }
            a(byteArrayInputStream);
            return dataInputStream;
        } catch (Throwable th) {
            a((InputStream) null);
            throw th;
        }
    }

    public final aa b(int i, int i2, int i3, int i4, int i5, int i6) throws IOException {
        short[] sArrM49a = m49a(i, i2, i3, i4);
        if (sArrM49a == null) {
            return null;
        }
        if (i5 < 0) {
            return new aa(sArrM49a, (ah) null);
        }
        ah ahVarB = b(i5, i6);
        if (ahVarB != null) {
            return new aa(sArrM49a, ahVarB);
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static short[] m49a(int i, int i2, int i3, int i4) throws IOException {
        Integer num = new Integer((i3 << 23) + (i4 << 16) + (i << 7) + i2 + 1);
        short[] sArr = (short[]) d.get(num);
        short[] sArr2 = sArr;
        if (sArr == null) {
            short[] sArrB = b(i, i2, i3, i4);
            sArr2 = sArrB;
            if (sArrB != null) {
                d.put(num, sArr2);
            }
        }
        return sArr2;
    }

    /* JADX WARN: Finally extract failed */
    public static final short[] b(int i, int i2, int i3, int i4) throws IOException {
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStreamM48a = m48a(i3, i4);
            dataInputStream = dataInputStreamM48a;
            int i5 = dataInputStreamM48a.readShort();
            short[] sArr = new short[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                sArr[i6] = dataInputStream.readShort();
            }
            a(dataInputStream);
            try {
                DataInputStream dataInputStreamM48a2 = m48a(i, i2);
                dataInputStream = dataInputStreamM48a2;
                short s = dataInputStreamM48a2.readShort();
                short s2 = dataInputStream.readShort();
                int i7 = s * s2;
                short[] sArr2 = new short[2 + i7];
                sArr2[sArr2.length - 2] = s;
                sArr2[sArr2.length - 1] = s2;
                for (int i8 = 0; i8 < i7; i8++) {
                    short s3 = dataInputStream.readByte();
                    short s4 = s3;
                    if (s3 < 0) {
                        s4 = (short) (s4 + 256);
                    }
                    sArr2[i8] = sArr[s4];
                }
                a(dataInputStream);
                return sArr2;
            } finally {
                a(dataInputStream);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Image c(int i, int i2) throws IOException {
        byte[] bArrM47a = m47a(i, i2);
        return Image.createImage(bArrM47a, 0, bArrM47a.length);
    }

    /* renamed from: b, reason: collision with other method in class */
    private static final Image m50b(int i, int i2, int i3, int i4) throws IOException {
        DataInputStream dataInputStream = null;
        DataInputStream dataInputStream2 = null;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            DataInputStream dataInputStreamM48a = m48a(i3, i4);
            int iJ = j();
            dataInputStreamM48a.read(f179c, 0, iJ);
            a(dataInputStreamM48a);
            byteArrayInputStream = new ByteArrayInputStream(f179c);
            dataInputStream2 = new DataInputStream(byteArrayInputStream);
            DataInputStream dataInputStreamM48a2 = m48a(i, i2);
            dataInputStream = dataInputStreamM48a2;
            Image imageA = a(dataInputStreamM48a2, dataInputStream2, iJ);
            a(byteArrayInputStream);
            a(dataInputStream);
            a(dataInputStream2);
            return imageA;
        } catch (Throwable th) {
            a(byteArrayInputStream);
            a(dataInputStream);
            a(dataInputStream2);
            throw th;
        }
    }

    private static final Image a(DataInputStream dataInputStream, DataInputStream dataInputStream2, int i) throws IOException {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = null;
        OutputStream outputStream = null;
        OutputStream outputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[33];
            dataInputStream.read(bArr);
            byteArrayOutputStream.write(bArr);
            byte[] bArr2 = new byte[i];
            dataInputStream2.read(bArr2);
            byteArrayOutputStream.write(bArr2);
            do {
                int i3 = dataInputStream.readInt();
                i2 = dataInputStream.readInt();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(i3 + 12);
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream2);
                dataOutputStream.writeInt(i3);
                dataOutputStream.writeInt(i2);
                if (i3 > 0) {
                    byte[] bArr3 = new byte[i3];
                    dataInputStream.read(bArr3);
                    byteArrayOutputStream2.write(bArr3);
                }
                dataOutputStream.writeInt(dataInputStream.readInt());
                if (i2 != 1347179589) {
                    byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
                }
                a(dataOutputStream);
                a(byteArrayOutputStream2);
                outputStream2 = null;
                outputStream = null;
            } while (i2 != 1229278788);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            a((OutputStream) null);
            a((OutputStream) null);
            a(byteArrayOutputStream);
            return Image.createImage(byteArray, 0, byteArray.length);
        } catch (Throwable th) {
            a(outputStream2);
            a(outputStream);
            a(byteArrayOutputStream);
            throw th;
        }
    }

    public static final void a(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static final void a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(String str) throws IOException {
        DataInputStream dataInputStream = null;
        InputStream resourceAsStream = null;
        if (f171a != null) {
            f171a = null;
            System.gc();
        }
        try {
            resourceAsStream = b.getClass().getResourceAsStream(str);
            DataInputStream dataInputStream2 = new DataInputStream(resourceAsStream);
            dataInputStream = dataInputStream2;
            f171a = new byte[dataInputStream2.readInt() - 4];
            dataInputStream.readFully(f171a);
            a(dataInputStream);
            a(resourceAsStream);
        } catch (Throwable th) {
            a(dataInputStream);
            a(resourceAsStream);
            throw th;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final u m51a(int i, int i2) throws IOException {
        DataInputStream dataInputStreamM48a = null;
        try {
            dataInputStreamM48a = m48a(i, i2);
            u uVar = (u) a((int) dataInputStreamM48a.readShort());
            if (uVar != null) {
                uVar.a(dataInputStreamM48a);
            }
            a(dataInputStreamM48a);
            return uVar;
        } catch (Throwable th) {
            a(dataInputStreamM48a);
            throw th;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public final r m52a(int i, int i2, int i3, int i4, int i5, int i6) throws IOException {
        Long l = new Long((i5 << 39) + (i6 << 32) + (i3 << 23) + (i4 << 16) + (i << 7) + i2 + 1);
        r rVar = (r) f175a.get(l);
        r rVar2 = rVar;
        if (rVar == null) {
            Image imageA = i4 != -1 ? a(i, i2, i3, i4) : m44a(i, i2);
            if (imageA != null) {
                rVar2 = new r(imageA);
                DataInputStream dataInputStreamM48a = m48a(i5, i6);
                try {
                    rVar2.f(dataInputStreamM48a);
                    a(dataInputStreamM48a);
                } catch (Throwable th) {
                    a(dataInputStreamM48a);
                    throw th;
                }
            }
            if (rVar2 != null) {
                f175a.put(l, rVar2);
            }
        }
        return rVar2;
    }

    public void playerUpdate(Player player, String str, Object obj) {
        if (str == "endOfMedia") {
            if (this.dh == 0) {
                this.df = 0;
            } else if (this.dh > 0) {
                this.dh--;
            }
        }
    }

    public final void a(int i, int i2, int i3, Object obj) throws IOException {
        if (i3 < 0 || i3 >= 128 || this.f180c[i3] != null) {
            return;
        }
        this.f180c[i3] = m47a(i, i2);
        this.f181b[i3] = (String) obj;
    }

    public final void J(int i) throws IOException {
        if (this.dg == i || this.df != 0) {
            return;
        }
        try {
            if (this.f182a != null) {
                this.f182a.close();
                this.f182a = null;
            }
        } catch (Exception unused) {
        }
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(this.f180c[i]);
                this.f182a = Manager.createPlayer(byteArrayInputStream, this.f181b[i]);
                this.f182a.addPlayerListener(this);
                this.f182a.realize();
                this.dg = i;
                a(byteArrayInputStream);
            } catch (Exception unused2) {
                this.dg = -1;
                this.df = 0;
                if (this.f182a != null) {
                    this.f182a.close();
                    this.f182a = null;
                }
                a(byteArrayInputStream);
            }
        } catch (Throwable th) {
            a(byteArrayInputStream);
            throw th;
        }
    }

    public final void p(int i, int i2) throws IOException {
        if (!this.A || i == -1 || this.f180c[i] == null) {
            return;
        }
        if (this.dg != i) {
            this.dg = -1;
            this.df = 0;
            J(i);
            this.dj = i2;
        } else {
            try {
                try {
                    this.f182a.stop();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            this.f182a.setMediaTime(1L);
        }
        try {
            this.dh = i2;
            if (i2 != -1) {
                i2++;
            }
            this.f182a.setLoopCount(i2);
            this.f182a.start();
            this.df = 1;
        } catch (Exception unused3) {
            this.dg = -1;
            this.df = 0;
            if (this.f182a != null) {
                this.f182a.close();
                this.f182a = null;
            }
        }
    }

    public final void ak() {
        if (this.df == 1) {
            this.di = this.dg;
        } else {
            this.di = -1;
        }
        am();
    }

    public final void al() throws IOException {
        if (this.di == -1 || this.dh >= 0) {
            return;
        }
        p(this.di, this.dj);
    }

    public final void am() {
        try {
            if (this.f182a != null) {
                this.f182a.close();
            }
            this.dg = -1;
            this.df = 0;
            this.f182a = null;
        } catch (Exception unused) {
            this.dg = -1;
            this.df = 0;
            this.f182a = null;
        } catch (Throwable th) {
            this.dg = -1;
            this.df = 0;
            this.f182a = null;
            throw th;
        }
    }

    public final void an() {
        am();
        for (int i = 0; i < 128; i++) {
            this.f180c[i] = null;
        }
    }

    public final void g(boolean z) {
        if (!z) {
            am();
        }
        this.A = z;
    }

    public static final int p(int i) {
        return i >= 0 ? i >> 16 : (i >> 16) + 1;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final short m53a(int i) {
        return (short) p(i);
    }

    public static final int q(int i) {
        return i << 16;
    }

    public static final int e(int i, int i2) {
        return (int) ((i * i2) >> 16);
    }

    public static final int f(int i, int i2) {
        return (int) ((i << 16) / i2);
    }

    public static final int r(int i) {
        int iF = (i + 65536) >> 1;
        for (int i2 = 0; i2 < 8; i2++) {
            iF = (iF + f(i, iF)) >> 1;
        }
        return iF;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static final long m54a(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j * j) + (j2 * j2)) >> 16;
    }

    public static final int c(int i, int i2, int i3) {
        long j = (((i * i) + (i2 * i2)) + (i3 * i3)) >> 16;
        long j2 = (j + 65536) >> 1;
        long j3 = j << 16;
        for (int i4 = 0; i4 < 8; i4++) {
            j2 = (j2 + (j3 / j2)) >> 1;
        }
        return (int) j2;
    }

    public static final long a(int i, int i2, int i3) {
        long j = i;
        long j2 = i2;
        long j3 = i3;
        return (((j * j) + (j2 * j2)) + (j3 * j3)) >> 16;
    }

    public static final int a(int i, int i2, int i3, int[] iArr) {
        if (i == 0 && i2 == 0 && i3 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            return 0;
        }
        int i4 = i < 0 ? -1 : 1;
        int i5 = i2 < 0 ? -1 : 1;
        int i6 = i3 < 0 ? -1 : 1;
        int i7 = i * i4;
        int i8 = i2 * i5;
        int i9 = i3 * i6;
        int i10 = 0;
        while (true) {
            if (i7 <= 131072 && i8 <= 131072 && i9 <= 131072) {
                break;
            }
            i7 >>= 1;
            i8 >>= 1;
            i9 >>= 1;
            i10++;
        }
        while (i7 < 65536 && i8 < 65536 && i9 < 65536) {
            i7 <<= 1;
            i8 <<= 1;
            i9 <<= 1;
            i10--;
        }
        int i11 = i7 * i4;
        int i12 = i8 * i5;
        int i13 = i9 * i6;
        int iC = c(i11, i12, i13);
        int iF = f(65536, iC);
        int iE = e(i11, iF);
        int iE2 = e(i12, iF);
        int iE3 = e(i13, iF);
        iArr[0] = iE;
        iArr[1] = iE2;
        iArr[2] = iE3;
        return i10 < 0 ? iC >> (-i10) : iC << i10;
    }

    public static final int s(int i) {
        while (i < 0) {
            i += 411775;
        }
        while (i >= 411775) {
            i -= 411775;
        }
        int i2 = 1;
        if (i >= 102944 && i < 205887) {
            i = 205887 - i;
        }
        if (i >= 205887 && i < 308831) {
            i -= 205887;
            i2 = -1;
        }
        if (i >= 308831) {
            i = 411775 - i;
            i2 = -1;
        }
        int iE = e(i, i);
        return i2 * e(e(e(e(-13, iE) + 546, iE) - 10923, iE) + 65536, i);
    }

    public static final int t(int i) {
        while (i < 0) {
            i += 411775;
        }
        while (i >= 411775) {
            i -= 411775;
        }
        int i2 = 1;
        if (i >= 102944 && i < 205887) {
            i = 205887 - i;
            i2 = -1;
        } else if (i >= 102944 && i < 308831) {
            i -= 205887;
            i2 = -1;
        } else if (i >= 308831) {
            i = 411775 - i;
        }
        int iE = e(i, i);
        return (e(e(e(-91, iE) + 2731, iE) - 32768, iE) + 65536) * i2;
    }

    public static final int u(int i) {
        int iE;
        int iE2 = e(i, i);
        if (iE2 == 0 && i != 0) {
            return 0;
        }
        if (i >= 65536) {
            int iF = f(65536, iE2);
            iE = f(e(e(e(e(e(e(5041, iF) - 5958, iF) + 7282, iF) - 9362, iF) + 13107, iF) - 21845, iF) + 65536, -i) + 102944;
        } else if (i <= -65536) {
            int iF2 = f(65536, iE2);
            iE = f(e(e(e(e(e(e(5041, iF2) - 5958, iF2) + 7282, iF2) - 9362, iF2) + 13107, iF2) - 21845, iF2) + 65536, -i) - 102944;
        } else {
            iE = e(e(e(e(e(e(e(5041, iE2) - 5958, iE2) + 7282, iE2) - 9362, iE2) + 13107, iE2) - 21845, iE2) + 65536, i);
        }
        return iE;
    }

    public static final int g(int i, int i2) {
        if (i2 == 0) {
            return i != 0 ? i >= 0 ? 102944 : -102944 : 0;
        }
        int iU = u(f(i, i2));
        if (i2 < 0) {
            iU += 205887;
        }
        return iU;
    }

    public static void K(int i) throws InterruptedException {
        try {
            Thread.currentThread();
            Thread.sleep(i);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static int[] m55a() {
        return D;
    }

    public static int d(int i, int i2, int i3) {
        return i <= i2 ? i2 : i >= i3 ? i3 : i;
    }

    public static short a(short s) {
        return (short) (((s & 255) << 8) | ((s & 65280) >> 8));
    }
}
