package defpackage;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:f.class */
public final class f extends u {

    /* renamed from: a, reason: collision with other field name */
    private ai f57a;
    private ab K;
    private int[] i;
    private int[] j;

    /* renamed from: a, reason: collision with other field name */
    private ak[] f60a;
    public ab M;

    /* renamed from: a, reason: collision with other field name */
    private short[] f71a;

    /* renamed from: b, reason: collision with other field name */
    private short[] f72b;

    /* renamed from: c, reason: collision with other field name */
    private short[] f73c;

    /* renamed from: a, reason: collision with other field name */
    private short f74a;
    private ab N;
    private ab O;

    /* renamed from: c, reason: collision with other field name */
    private ai f75c;

    /* renamed from: d, reason: collision with other field name */
    private ai f76d;

    /* renamed from: e, reason: collision with other field name */
    public ak f77e;

    /* renamed from: a, reason: collision with other field name */
    public s f78a;

    /* renamed from: b, reason: collision with other field name */
    public s f79b;

    /* renamed from: a, reason: collision with other field name */
    private y f80a;
    private int p;
    private int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    private int w;
    private int x;
    private int y;
    private int z;
    public int A;
    public int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    public int H;
    private int I;
    private int J;

    /* renamed from: K, reason: collision with other field name */
    private int f81K;

    /* renamed from: L, reason: collision with other field name */
    private int f82L;

    /* renamed from: M, reason: collision with other field name */
    private int f83M;

    /* renamed from: N, reason: collision with other field name */
    private int f84N;

    /* renamed from: O, reason: collision with other field name */
    private int f85O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;

    /* renamed from: a, reason: collision with other field name */
    private short[][] f86a;

    /* renamed from: b, reason: collision with other field name */
    private short[][] f87b;

    /* renamed from: c, reason: collision with other field name */
    private short[][] f88c;

    /* renamed from: d, reason: collision with other field name */
    private short[][] f89d;

    /* renamed from: P, reason: collision with other field name */
    private ab f90P;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int[] k;
    private int[] l;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;

    /* renamed from: a, reason: collision with other field name */
    public aa f91a;

    /* renamed from: a, reason: collision with other field name */
    public Image f92a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f93a;
    public int[] m;
    public int af;
    public int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;

    /* renamed from: f, reason: collision with other field name */
    public ak f94f;
    private int al;
    private int am;

    /* renamed from: e, reason: collision with other field name */
    private ai f95e;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private int aE;

    /* renamed from: f, reason: collision with other field name */
    private ai f96f;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;

    /* renamed from: a, reason: collision with other field name */
    private String f97a;

    /* renamed from: b, reason: collision with other field name */
    private String f98b;

    /* renamed from: c, reason: collision with other field name */
    private String f99c;

    /* renamed from: b, reason: collision with other field name */
    private boolean f100b;

    /* renamed from: c, reason: collision with other field name */
    private boolean f101c;

    /* renamed from: d, reason: collision with other field name */
    private boolean f102d;

    /* renamed from: e, reason: collision with other field name */
    private boolean f103e;
    private int aL;

    /* renamed from: a, reason: collision with other field name */
    private aa[][] f104a;

    /* renamed from: a, reason: collision with other field name */
    private byte[][] f105a;

    /* renamed from: a, reason: collision with other field name */
    private n f106a;

    /* renamed from: b, reason: collision with other field name */
    private n f107b;

    /* renamed from: c, reason: collision with other field name */
    private n f108c;

    /* renamed from: a, reason: collision with other field name */
    private Image[] f109a;
    private int aM;
    private int aN;
    private int aO;
    private int aP;

    /* renamed from: a, reason: collision with other field name */
    private v f110a;

    /* renamed from: a, reason: collision with other field name */
    private aa[] f111a;

    /* renamed from: a, reason: collision with other field name */
    public aj f112a;

    /* renamed from: a, reason: collision with other field name */
    private r f113a;

    /* renamed from: b, reason: collision with other field name */
    private r f114b;

    /* renamed from: c, reason: collision with other field name */
    private r f115c;

    /* renamed from: d, reason: collision with other field name */
    private r f116d;

    /* renamed from: e, reason: collision with other field name */
    private r f117e;

    /* renamed from: f, reason: collision with other field name */
    private r f118f;

    /* renamed from: g, reason: collision with other field name */
    private r f119g;

    /* renamed from: h, reason: collision with other field name */
    private r f120h;

    /* renamed from: b, reason: collision with other field name */
    private aa f121b;

    /* renamed from: c, reason: collision with other field name */
    private aa f122c;

    /* renamed from: d, reason: collision with other field name */
    private aa f123d;

    /* renamed from: i, reason: collision with other field name */
    private r f124i;

    /* renamed from: b, reason: collision with other field name */
    private Image f125b;
    public int aQ;

    /* renamed from: c, reason: collision with other field name */
    private Image f126c;

    /* renamed from: d, reason: collision with other field name */
    private Image f127d;

    /* renamed from: e, reason: collision with other field name */
    private Image f128e;

    /* renamed from: b, reason: collision with other field name */
    private Image[] f129b;

    /* renamed from: f, reason: collision with other field name */
    private Image f130f;

    /* renamed from: e, reason: collision with other field name */
    private aa f131e;

    /* renamed from: g, reason: collision with other field name */
    private Image f132g;

    /* renamed from: h, reason: collision with other field name */
    private Image f133h;

    /* renamed from: i, reason: collision with other field name */
    private Image f134i;

    /* renamed from: j, reason: collision with other field name */
    private Image f135j;

    /* renamed from: k, reason: collision with other field name */
    private Image f136k;

    /* renamed from: l, reason: collision with other field name */
    private Image f137l;

    /* renamed from: f, reason: collision with other field name */
    private aa f138f;
    private int aR;

    /* renamed from: g, reason: collision with other field name */
    private aa f139g;

    /* renamed from: a, reason: collision with other field name */
    private u f140a;

    /* renamed from: d, reason: collision with other field name */
    private String f141d;
    private int aS;
    private int aT;

    /* renamed from: f, reason: collision with other field name */
    public boolean f142f;

    /* renamed from: b, reason: collision with other field name */
    private u f143b;
    private int[] n;

    /* renamed from: b, reason: collision with other field name */
    private boolean[] f144b;

    /* renamed from: a, reason: collision with other field name */
    private int[][] f145a;
    private int[] o;

    /* renamed from: g, reason: collision with other field name */
    private ai f146g;

    /* renamed from: h, reason: collision with other field name */
    private ai f147h;

    /* renamed from: Q, reason: collision with other field name */
    private ab f148Q;

    /* renamed from: a, reason: collision with other field name */
    private m f149a;

    /* renamed from: a, reason: collision with other field name */
    private StringBuffer f150a;

    /* renamed from: e, reason: collision with other field name */
    private String f151e;

    /* renamed from: f, reason: collision with other field name */
    private String f152f;
    private static final int[] a = {332, 0, 333, 341, 337, 335, 327, 328, 329, 340, 338, 336, 326, 330, 0, 334};
    private static final int[] b = {533, 1100, 800, 967, 500, 467, 1967, 5367, 567, 1967, 1300, 567, 567, 567, 833, 567, 833, 1367, 2333, 2267, 1633, 467, 1667, 1600, 1433, 667, 667, 4667, 2500, 2167, 2000};
    private static final int[] c = {9, 12, 7, 2, 15, 5, 12, 1, 13, 13, 7, 13, 5, 15, 6, 8, 12, 4, 14, 0, 3, 11, 4, 4, 4, 8, 8, 6, 10, 7, 7};
    private static final int[] d = {5, 6, 4, -1, 3, 12, -1, -1, 10, 8, 13, 8, 7, 9};
    private static final int[] e = {0, 6, 12};
    private static final int[] f = {-15132391, -14184103, -1092811, -13948117, -5026996, -14334810, -14393437, -15461356, -14536877, -3135687, -1974828, -13937004, -998841, -14139286, -15461356, -14127536, -14606047, -12757650, -15461356, -12816434, -13930586, -13684945, -1918584, -15461356, -11383644, -14606047, -14396088, -5036487, -14537394, -14726554};

    /* renamed from: b, reason: collision with other field name */
    private static ai f58b = new ai();
    private static ab L = new ab();
    private static final int[] g = {-410736520, -257623320, 2131235237, -999637483, 1770260123, -1825377841, 729320493, -1671988633, -18433438};
    private static final int[] h = {1053877900, 1924190721, 1674852851, -659122621, -640863542, 691770244, -1691240324, -2138353103, 1732954392};

    /* renamed from: a, reason: collision with other field name */
    private static final boolean[] f59a = {false, false, false, false, false, false, true, false, true};

    /* renamed from: a, reason: collision with other field name */
    private static final byte[][][] f61a = {new byte[]{new byte[]{22, 40}, new byte[]{27, 41}, new byte[]{30, 43}, new byte[]{32, 42}, new byte[]{43, 35}, new byte[]{41, 42}, new byte[]{33, 45}, new byte[]{26, 44}, new byte[]{22, 41}, new byte[]{17, 38}}, new byte[]{new byte[]{43, 40}, new byte[]{42, 39}, new byte[]{48, 38}, new byte[]{60, 43}, new byte[]{51, 28}, new byte[]{51, 34}, new byte[]{50, 39}, new byte[]{45, 41}, new byte[]{43, 40}, new byte[]{43, 39}}, new byte[]{new byte[]{39, 34}, new byte[]{35, 34}, new byte[]{30, 32}, new byte[]{29, 31}, new byte[]{23, 26}, new byte[]{24, 31}, new byte[]{31, 30}, new byte[]{35, 34}, new byte[]{39, 34}, new byte[]{44, 33}}, new byte[]{new byte[]{23, 34}, new byte[]{22, 37}, new byte[]{14, 39}, new byte[]{3, 35}, new byte[]{12, 32}, new byte[]{10, 38}, new byte[]{13, 40}, new byte[]{19, 38}, new byte[]{21, 35}, new byte[]{21, 32}}};

    /* renamed from: b, reason: collision with other field name */
    private static final byte[][][] f62b = {new byte[]{new byte[]{31, 32}, new byte[]{31, 37}, new byte[]{27, 44}, new byte[]{31, 42}, new byte[]{29, 38}, new byte[]{30, 38}}, new byte[]{new byte[]{42, 29}, new byte[]{43, 34}, new byte[]{53, 37}, new byte[]{45, 37}, new byte[]{38, 37}, new byte[]{35, 37}}, new byte[]{new byte[]{32, 27}, new byte[]{32, 31}, new byte[]{34, 31}, new byte[]{32, 34}, new byte[]{33, 34}, new byte[]{32, 35}}, new byte[]{new byte[]{20, 29}, new byte[]{20, 33}, new byte[]{11, 35}, new byte[]{18, 37}, new byte[]{24, 36}, new byte[]{27, 36}}};

    /* renamed from: c, reason: collision with other field name */
    private static final byte[][][] f63c = {new byte[]{new byte[]{40, 29}, new byte[]{39, 18}, new byte[]{39, 10}, new byte[]{39, 9}, new byte[]{34, 9}, new byte[]{33, 9}, new byte[]{33, 13}, new byte[]{33, 12}, new byte[]{33, 11}, new byte[]{33, 13}, new byte[]{33, 13}}, new byte[]{new byte[]{29, 25}, new byte[]{35, 16}, new byte[]{33, 9}, new byte[]{34, 7}, new byte[]{43, 8}, new byte[]{43, 8}, new byte[]{42, 12}, new byte[]{42, 10}, new byte[]{42, 10}, new byte[]{42, 10}, new byte[]{42, 10}}, new byte[]{new byte[]{24, 25}, new byte[]{24, 17}, new byte[]{24, 10}, new byte[]{24, 8}, new byte[]{28, 6}, new byte[]{30, 7}, new byte[]{29, 10}, new byte[]{29, 10}, new byte[]{29, 10}, new byte[]{29, 10}, new byte[]{29, 10}}, new byte[]{new byte[]{22, 29}, new byte[]{27, 19}, new byte[]{30, 11}, new byte[]{28, 9}, new byte[]{20, 8}, new byte[]{20, 8}, new byte[]{21, 12}, new byte[]{21, 12}, new byte[]{21, 12}, new byte[]{21, 12}, new byte[]{21, 12}}};

    /* renamed from: d, reason: collision with other field name */
    private static final byte[][][] f64d = {new byte[]{new byte[]{30, 37}, new byte[]{30, 35}, new byte[]{30, 29}, new byte[]{30, 18}, new byte[]{30, 21}, new byte[]{30, 16}, new byte[]{33, 9}}, new byte[]{new byte[]{43, 34}, new byte[]{44, 32}, new byte[]{45, 26}, new byte[]{42, 19}, new byte[]{36, 17}, new byte[]{35, 15}, new byte[]{42, 8}}, new byte[]{new byte[]{33, 31}, new byte[]{32, 28}, new byte[]{32, 23}, new byte[]{32, 17}, new byte[]{33, 16}, new byte[]{33, 14}, new byte[]{30, 7}}, new byte[]{new byte[]{20, 34}, new byte[]{19, 31}, new byte[]{18, 25}, new byte[]{21, 18}, new byte[]{26, 17}, new byte[]{27, 15}, new byte[]{21, 8}}};

    /* renamed from: e, reason: collision with other field name */
    private static final byte[][][] f65e = {new byte[]{new byte[]{26, 35}, new byte[]{33, 30}, new byte[]{36, 31}, new byte[]{35, 15}, new byte[]{34, 9}, new byte[]{32, 7}, new byte[]{33, 4}, new byte[]{35, 4}, new byte[]{34, 6}, new byte[]{35, 23}, new byte[]{35, 36}, new byte[]{30, 35}, new byte[]{28, 36}}, new byte[]{new byte[]{43, 33}, new byte[]{39, 28}, new byte[]{40, 27}, new byte[]{34, 14}, new byte[]{29, 10}, new byte[]{29, 7}, new byte[]{33, 3}, new byte[]{32, 4}, new byte[]{33, 6}, new byte[]{35, 22}, new byte[]{39, 33}, new byte[]{37, 34}, new byte[]{38, 35}}, new byte[]{new byte[]{36, 29}, new byte[]{30, 27}, new byte[]{28, 27}, new byte[]{28, 14}, new byte[]{29, 10}, new byte[]{30, 7}, new byte[]{30, 3}, new byte[]{29, 4}, new byte[]{29, 6}, new byte[]{28, 22}, new byte[]{28, 32}, new byte[]{33, 32}, new byte[]{34, 32}}, new byte[]{new byte[]{21, 30}, new byte[]{24, 29}, new byte[]{22, 29}, new byte[]{29, 15}, new byte[]{34, 10}, new byte[]{34, 7}, new byte[]{30, 4}, new byte[]{31, 5}, new byte[]{29, 6}, new byte[]{28, 23}, new byte[]{24, 35}, new byte[]{26, 33}, new byte[]{25, 33}}};

    /* renamed from: f, reason: collision with other field name */
    private static final byte[][][] f66f = {new byte[]{new byte[]{32, 34}}, new byte[]{new byte[]{38, 32}}, new byte[]{new byte[]{31, 30}}, new byte[]{new byte[]{24, 32}}};

    /* renamed from: g, reason: collision with other field name */
    private static final byte[][][] f67g = {new byte[]{new byte[]{27, 38}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{27, 13}, new byte[]{28, 5}, new byte[]{45, 13}, new byte[]{45, 13}, new byte[]{45, 13}, new byte[]{45, 13}, new byte[]{31, 36}, new byte[]{31, 36}}, new byte[]{new byte[]{32, 40}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{15, 16}, new byte[]{34, 5}, new byte[]{43, 10}, new byte[]{43, 10}, new byte[]{43, 10}, new byte[]{43, 10}, new byte[]{36, 35}, new byte[]{36, 35}}, new byte[]{new byte[]{36, 38}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{37, 18}, new byte[]{34, 4}, new byte[]{20, 9}, new byte[]{20, 9}, new byte[]{20, 9}, new byte[]{20, 9}, new byte[]{33, 34}, new byte[]{33, 34}}, new byte[]{new byte[]{31, 37}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{47, 14}, new byte[]{29, 5}, new byte[]{18, 13}, new byte[]{18, 13}, new byte[]{18, 13}, new byte[]{18, 13}, new byte[]{26, 34}, new byte[]{26, 34}}};

    /* renamed from: h, reason: collision with other field name */
    private static final byte[][][] f68h = {new byte[]{new byte[]{25, 35}, new byte[]{25, 39}, new byte[]{25, 50}, new byte[]{25, 46}, new byte[]{25, 39}, new byte[]{25, 35}}, new byte[]{new byte[]{42, 33}, new byte[]{43, 37}, new byte[]{44, 48}, new byte[]{44, 44}, new byte[]{43, 37}, new byte[]{42, 34}}, new byte[]{new byte[]{37, 29}, new byte[]{37, 32}, new byte[]{37, 41}, new byte[]{37, 38}, new byte[]{37, 32}, new byte[]{37, 30}}, new byte[]{new byte[]{22, 30}, new byte[]{21, 34}, new byte[]{19, 44}, new byte[]{20, 40}, new byte[]{20, 34}, new byte[]{21, 31}}};

    /* renamed from: i, reason: collision with other field name */
    private static final byte[][][] f69i = {new byte[]{new byte[]{23, 33}, new byte[]{24, 31}, new byte[]{24, 32}, new byte[]{25, 37}, new byte[]{25, 47}, new byte[]{24, 51}, new byte[]{25, 44}, new byte[]{24, 38}, new byte[]{24, 33}}, new byte[]{new byte[]{40, 33}, new byte[]{39, 31}, new byte[]{40, 31}, new byte[]{40, 36}, new byte[]{39, 46}, new byte[]{39, 51}, new byte[]{39, 44}, new byte[]{39, 38}, new byte[]{39, 33}}, new byte[]{new byte[]{40, 29}, new byte[]{38, 28}, new byte[]{38, 28}, new byte[]{37, 32}, new byte[]{37, 42}, new byte[]{38, 45}, new byte[]{38, 39}, new byte[]{38, 33}, new byte[]{38, 29}}, new byte[]{new byte[]{24, 29}, new byte[]{24, 28}, new byte[]{24, 28}, new byte[]{24, 33}, new byte[]{24, 42}, new byte[]{24, 46}, new byte[]{24, 40}, new byte[]{24, 34}, new byte[]{24, 30}}};

    /* renamed from: j, reason: collision with other field name */
    private static final byte[][][] f70j = {new byte[]{new byte[]{38, 30}, new byte[]{34, 6}, new byte[]{32, 4}, new byte[]{31, 3}, new byte[]{30, 4}, new byte[]{30, 7}, new byte[]{33, 15}, new byte[]{29, 24}, new byte[]{26, 34}}, new byte[]{new byte[]{47, 26}, new byte[]{40, 4}, new byte[]{37, 8}, new byte[]{35, 4}, new byte[]{36, 5}, new byte[]{39, 8}, new byte[]{40, 15}, new byte[]{42, 23}, new byte[]{36, 38}}, new byte[]{new byte[]{27, 19}, new byte[]{29, 5}, new byte[]{31, 3}, new byte[]{32, 3}, new byte[]{34, 4}, new byte[]{32, 6}, new byte[]{30, 14}, new byte[]{37, 22}, new byte[]{36, 35}}, new byte[]{new byte[]{16, 27}, new byte[]{22, 5}, new byte[]{25, 5}, new byte[]{28, 2}, new byte[]{26, 5}, new byte[]{23, 8}, new byte[]{22, 17}, new byte[]{26, 22}, new byte[]{27, 35}}};
    private static int aU = 0;
    private static int aV = 1;
    private static int aW = 2;
    private static int aX = 3;
    private static int aY = 0;
    private static int aZ = 1;
    private static int ba = 2;
    private static int bb = 3;

    /* renamed from: a, reason: collision with other field name */
    private static final String[] f153a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    /* JADX WARN: Type inference failed for: r1v43, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int[], int[][]] */
    public f(t tVar, v vVar) {
        super(tVar, 0);
        this.f57a = new ai(0, 0, 0, 0);
        this.K = new ab(0, 0, 0);
        this.i = new int[4];
        this.j = new int[4];
        this.f60a = new ak[4];
        this.M = new ab();
        this.f71a = new short[5];
        this.f72b = new short[10];
        this.f73c = new short[10];
        this.f74a = (short) 0;
        new ab();
        this.N = new ab();
        this.O = new ab();
        this.f75c = new ai();
        this.f76d = new ai();
        this.f80a = new y();
        this.f86a = new short[2][5];
        this.f87b = new short[2][10];
        this.f88c = new short[2][5];
        this.f89d = new short[2][10];
        this.f90P = new ab();
        this.k = new int[4];
        this.l = new int[4];
        this.ae = 0;
        this.m = new int[5];
        this.f95e = new ai();
        this.f96f = new ai();
        this.f104a = new aa[2][16];
        this.f105a = new byte[2];
        this.f106a = new n(this);
        this.f107b = new n(this);
        this.f108c = new n(this);
        this.f109a = new Image[16];
        this.f111a = new aa[16];
        this.f112a = new aj();
        this.f129b = new Image[3];
        this.n = new int[31 * aX];
        this.f144b = new boolean[31];
        this.f145a = new int[31];
        this.o = new int[13];
        this.f146g = new ai();
        this.f147h = new ai();
        this.f148Q = new ab();
        this.f150a = new StringBuffer();
        this.f151e = new String();
        this.f152f = new String();
        this.f142f = false;
        this.dM = 1000;
        this.f149a = (m) tVar;
        this.f110a = vVar;
        this.f78a = new s();
        this.f79b = new s();
        this.f100b = true;
        this.f101c = false;
        this.f102d = false;
        this.aL = -1;
        c(9, false);
        this.ad = 0;
        this.aQ = 0;
        this.ac = -1;
    }

    @Override // defpackage.u
    public final void e() throws IOException {
        super.e();
    }

    public final void g(int i) throws IOException {
        if (this.f102d || ((m) ((w) this).d).d(24) == 0) {
            return;
        }
        ((w) this).d.p(i, 0);
    }

    @Override // defpackage.u, defpackage.w
    public final void f() throws IOException {
        super.f();
        q(((w) this).d.d(), ((w) this).d.e());
        setPosition(0, 0);
        m mVar = (m) ((w) this).d;
        this.f119g = mVar.a(10, 12, 11);
        this.f113a = mVar.a(8, 12, 9);
        this.f114b = mVar.a(8, 15, 9);
        this.f115c = mVar.a(8, 13, 9);
        this.f116d = mVar.a(8, 14, 9);
        this.f117e = mVar.a(8, 16, 9);
        this.f118f = mVar.a(8, 17, 9);
        this.f120h = mVar.a(10, 12, 11);
        mVar.a(10, 15, 11);
        mVar.a(10, 16, 11);
        mVar.a(10, 17, 11);
        mVar.a(10, 13, 11);
        t.g();
    }

    @Override // defpackage.u, defpackage.w
    public final void g() throws IOException {
        ((w) this).d.an();
        if (this.f79b != null) {
            this.f79b = null;
        }
        if (this.f78a != null) {
            this.f78a = null;
        }
        if (this.f80a != null) {
            this.f80a = null;
        }
        this.n = null;
        this.f144b = null;
        this.f145a = (int[][]) null;
        if (this.f109a != null) {
            for (int i = 0; i < 16; i++) {
                this.f109a[i] = null;
            }
        }
        if (this.f111a != null) {
            for (int i2 = 0; i2 < 16; i2++) {
                this.f111a[i2] = null;
            }
        }
        if (this.f112a != null) {
            this.f112a.as();
            this.f112a = null;
        }
        this.f113a = null;
        this.f114b = null;
        this.f115c = null;
        this.f116d = null;
        this.f117e = null;
        this.f118f = null;
        this.f119g = null;
        this.f120h = null;
        this.f121b = null;
        this.f122c = null;
        this.f123d = null;
        this.f124i = null;
        this.f125b = null;
        this.f126c = null;
        this.f127d = null;
        this.f128e = null;
        this.f131e = null;
        this.f132g = null;
        this.f133h = null;
        this.f134i = null;
        this.f135j = null;
        this.f136k = null;
        this.f138f = null;
        this.f139g = null;
        if (this.f91a != null) {
            this.f91a.aH();
            this.f91a = null;
        }
        this.f92a = null;
        t.I(t.db);
        super.g();
    }

    private void h() throws IOException {
        int i;
        int iG = t.g();
        if (f(2) || this.V != -1) {
            return;
        }
        int i2 = this.u - (iG - this.aq);
        int i3 = this.v - (iG - this.aq);
        int iMin = Math.min(i2, i3) - 20;
        if (iMin > 0 && iMin < 5020 && this.G > (i = iMin / 1000)) {
            this.G = i;
        }
        if (f(3) || f(25) || i3 > 0) {
            return;
        }
        c(25, true);
        g(0);
    }

    @Override // defpackage.u
    public final void h(int i) throws IOException {
        if (this.aL != 0) {
            repaint();
        }
        h();
        ((m) ((w) this).d).S();
        this.ao = Math.min(i - this.aq, 150);
        this.aq = i;
        this.ap = t.e(t.q(this.ao), 66);
        if (!f(26) || this.V != 15) {
            E();
        }
        if (f(26)) {
            switch (this.V) {
                case 2:
                    if (t.g() - this.aI > 5000) {
                        j(-1);
                        break;
                    }
                    break;
                case 7:
                    if (!f(27)) {
                        c(27, true);
                        this.f78a.T();
                        this.f79b.T();
                        m mVar = (m) ((w) this).d;
                        if (mVar.cc == 2 || mVar.cc == 1) {
                            this.f110a.t(this.f78a.cB, this.f79b.cB);
                        }
                        v.c(v.b(mVar.cc));
                        break;
                    }
                    break;
                case 14:
                    ak akVar = this.f80a.g;
                    int iE = 43691 + t.e(65536 - t.e((akVar.f46a.eX - 50) << 16, 1337), 131072 - 43691);
                    if (akVar != this.f77e) {
                        j(-1);
                        akVar.c(512, this.p, true);
                        break;
                    } else if (!f(13)) {
                        this.Q -= t.e(iE, this.ap);
                        if (this.Q <= 0) {
                            this.Q = -this.Q;
                            c(13, true);
                            break;
                        }
                    } else {
                        this.Q += t.e(iE, this.ap);
                        if (this.Q >= 65536) {
                            this.Q = 65536 - (this.Q - 65536);
                            c(13, false);
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        if (this.f102d) {
            switch (((m) ((w) this).d).cc) {
                case 1:
                    if (!this.f110a.r()) {
                        ((m) ((w) this).d).a(23, true, true);
                        break;
                    } else {
                        ((m) ((w) this).d).a(24, true, true);
                        break;
                    }
                case 2:
                    ((m) ((w) this).d).a(24, true, true);
                    break;
                default:
                    ((m) ((w) this).d).a(6, false, true);
                    break;
            }
            return;
        }
        if (f(21)) {
            if (this.p - this.aK >= 3750) {
                this.aK = 0;
                c(21, false);
                c(22, false);
                o();
            }
        } else {
            if (f(17)) {
                c(17, false);
                c(30, false);
                j(14);
                this.Q = ((w) this).d.o(65536);
                c(13, ((w) this).d.o(2) == 1);
                c(14, true);
                ak akVar2 = this.f80a.g;
                if (akVar2.r != this.f77e.r) {
                    this.S = 32768 + ((((w) this).d.o(100) < akVar2.f46a.eX ? 0 : 8192 + ((w) this).d.o(16384)) * (((w) this).d.o(2) == 0 ? 1 : -1));
                    this.T = 32768 + (((w) this).d.o(8192) * (((w) this).d.o(2) == 0 ? 1 : -1));
                    this.R = this.S;
                    this.Q = this.T;
                }
                repaint();
                return;
            }
            if (f(18)) {
                c(18, false);
                ak akVarA = this.f84N > 0 ? this.f78a.a(this.f84N - 1) : this.f79b.a((-this.f84N) - 1);
                this.f80a.a(0, this.R - 32768, this.Q - 32768, 0, this.p, 0);
                int i2 = this.f85O - 1;
                this.f85O = i2;
                if (i2 == 0) {
                    c(true);
                    this.f80a.a(true, true, (ak) null, (ak) null);
                    c(20, false);
                    this.U = -1;
                    this.f78a.f(akVarA, this.p);
                    this.f79b.f(akVarA, this.p);
                    this.f84N = 0;
                }
            } else if (f(19)) {
                if (this.p > this.P) {
                    c(19, false);
                    ak akVarA2 = this.f84N > 0 ? this.f78a.a(this.f84N - 1) : this.f79b.a((-this.f84N) - 1);
                    this.f80a.a(akVarA2, false, this.p, 0);
                    this.A = akVarA2.r ? 1 : -1;
                    akVarA2.c(256, this.p, true);
                    akVarA2.a.b(7, this.p);
                    c(14, true);
                }
            } else if (f(7)) {
                if (this.D == -1) {
                    if (this.p >= this.aM + 6000) {
                        this.f80a.h(true);
                        c(30, false);
                        f(8, this.p);
                    } else if (this.p >= (this.aM + 6000) - 3000) {
                        v(0);
                    }
                } else if (!f(8) && this.p - (this.D - 2000) > 750) {
                    d(false);
                }
            } else if (f(2) && !f(15) && !f(23) && this.u != 0) {
                this.f78a.U();
                this.f79b.U();
            }
        }
        if (f(30)) {
            if (this.f74a > 0) {
                j(12);
            } else {
                q(this.p);
            }
        }
        if (f(26)) {
            return;
        }
        n();
    }

    private void a(af afVar) {
        switch (this.V) {
            case 0:
            case 1:
            case 11:
                r rVar = this.f113a;
                afVar.b(this.f96f, -14479352);
                afVar.a(this.f96f, -3750202);
                int i = this.f96f.eG + ((this.f96f.gi - (this.aG * 16)) >> 1);
                int i2 = this.f96f.eF + 12;
                int i3 = ((15 - rVar.cx) + 1) >> 1;
                this.f147h.c(this.f96f.eF + ((this.f96f.gh - this.aH) >> 1), 0, this.aH, 16);
                for (int i4 = 0; i4 < this.aG; i4++) {
                    String string = t.getString(177 + i4);
                    if (this.V == 11) {
                        switch (i4) {
                            case -1:
                                string = t.getString(175);
                                break;
                            case 0:
                                string = t.getString(180);
                                break;
                            case 1:
                                z = ((m) ((w) this).d).cc <= 0;
                                string = t.getString(185);
                                break;
                            case 2:
                                string = t.getString(183);
                                break;
                        }
                    } else if (i4 == 1) {
                        if (f(28) || this.f80a.g == null || this.f80a.g.r != f(4)) {
                            z = false;
                        } else if ((f(4) ? this.f78a : this.f79b).cC == 0) {
                            z = false;
                        }
                    }
                    int iStringWidth = this.f113a.stringWidth(string);
                    if (i4 == this.aF && this.f100b) {
                        this.f147h.eG = i;
                        afVar.aV();
                        afVar.g(this.f147h);
                        this.f146g.c(i2, i, 176, 15);
                        afVar.b(this.f146g, 5537208);
                        int i5 = this.f96f.eF + ((this.f96f.gh - iStringWidth) >> 1);
                        afVar.aW();
                        this.f113a.a(afVar, string, i5, i + i3);
                    } else {
                        ((z && this.f100b) ? this.f113a : this.f114b).a(afVar, string, this.f96f.eF + ((this.f96f.gh - iStringWidth) >> 1), i + i3);
                    }
                    i += 16;
                }
                this.f149a.a(afVar, true, true);
                break;
            case 14:
                if (this.f80a.g == this.f77e) {
                    int iB = this.f77e.t ? (B() - this.f136k.getWidth()) - 3 : 3;
                    int iC = ((C() - 15) - 3) - this.f136k.getHeight();
                    afVar.a(this.f136k, iB, iC);
                    int i6 = iB + 2;
                    int i7 = iC + 2;
                    int width = this.f136k.getWidth() - 4;
                    int height = this.f136k.getHeight() - 4;
                    int i8 = f(14) ? this.Q : this.R;
                    afVar.a(i6 + (width >> 1), i7 + (height >> 1), -1);
                    int iP = i6 + t.p(t.e(i8, t.q(width)));
                    afVar.a(iP, i7, iP, i7 + height, f(14) ? -589953 : -29921);
                    if (!f(14)) {
                        int iP2 = i7 + t.p(t.e(this.Q, t.q(height)));
                        afVar.a(i6, iP2, i6 + width, iP2, -589953);
                    }
                    this.f146g.c(i6, i7, width, height);
                    c(this.f146g);
                    break;
                }
                break;
        }
    }

    private void a(af afVar, n nVar) {
        if (!nVar.q || nVar.a == null) {
            return;
        }
        Image image = nVar.s;
        a(nVar.a.aC, this.f57a);
        afVar.a(image, this.f57a.eF - (image.getWidth() >> 1), this.f57a.eG - (image.getHeight() >> 1));
    }

    @Override // defpackage.u, defpackage.w
    public final void b(af afVar) {
        int width;
        int width2;
        int width3 = this.f130f.getWidth();
        int height = this.f130f.getHeight();
        f58b.c(0, 0, width3, height + 66);
        if (this.f80a.g == null) {
            L.c(this.f80a.aC);
        } else {
            L.c(this.f80a.g.aC);
            L.eG = 65536;
        }
        a(L, this.f57a);
        this.aS = this.f57a.eF;
        this.aT = this.f57a.eG;
        int i = this.f95e.gh >> 1;
        int i2 = this.f95e.gi >> 1;
        if (f58b.gh <= this.f95e.gh || this.aS < i) {
            this.aS = i;
        } else if (this.aS > f58b.gh - i) {
            this.aS = f58b.gh - i;
        }
        if (f58b.gi <= this.f95e.gi) {
            this.aT = f58b.gi >> 1;
        } else if (this.aT < i2) {
            this.aT = i2;
        } else if (this.aT > f58b.gi - i2) {
            this.aT = f58b.gi - i2;
        }
        this.aS = (this.f95e.eF + (this.f95e.gh >> 1)) - this.aS;
        this.aT = ((this.f95e.eG + (this.f95e.gi >> 1)) - this.aT) + 66;
        afVar.translate(this.aS, this.aT);
        afVar.a(this.f130f, 0, 0);
        a(afVar, this.f107b);
        a(afVar, this.f106a);
        a(afVar, this.f108c);
        int i3 = 0;
        int i4 = -(this.f132g.getHeight() + this.f133h.getHeight());
        this.f57a.eF = -this.aS;
        this.f57a.gh = this.f95e.gh;
        if (i4 + this.aT > this.f95e.eG) {
            this.f57a.eG = this.f95e.eG - this.aT;
            this.f57a.gi = i4 - this.f57a.eG;
            afVar.b(this.f57a, 0);
        }
        do {
            afVar.a(this.f132g, i3, i4);
            width = i3 + this.f132g.getWidth();
            i3 = width;
        } while (width < f58b.gh);
        int i5 = 0;
        int height2 = i4 + this.f132g.getHeight();
        do {
            afVar.a(this.f133h, i5, height2);
            width2 = i5 + this.f133h.getWidth();
            i5 = width2;
        } while (width2 < f58b.gh);
        if (this.aT + height < this.f95e.eG + this.f95e.gi) {
            this.f57a.eG = height;
            this.f57a.gi = (this.f95e.eG + this.f95e.gi) - this.f57a.eG;
            afVar.b(this.f57a, f[this.f78a.br]);
        }
        this.K.c(this.f80a.aC);
        this.K.eG = 0;
        a(this.K, this.f57a);
        afVar.a(this.f128e, this.f57a.eF - (this.f128e.getWidth() >> 1), this.f57a.eG - (this.f128e.getHeight() >> 1));
        int i6 = 0;
        while (i6 < 10) {
            this.o[i6] = ((i6 < 5 ? this.f78a.a(i6) : this.f79b.a(i6 - 5)).aC.eH & (-256)) | (i6 & 255);
            i6++;
        }
        int i7 = 0;
        if (this.f80a.g != null) {
            ab abVar = this.f80a.g.bb;
            if (Math.abs(abVar.eH) > Math.abs(abVar.eF) && abVar.eH < 0) {
                i7 = -16384;
            }
        }
        this.o[12] = ((this.f80a.aC.eH + i7) & (-256)) | 12;
        this.o[10] = 10;
        this.o[11] = 11;
        for (int i8 = 0; i8 < 12; i8++) {
            for (int i9 = i8; i9 < 13; i9++) {
                if ((this.o[i8] & (-256)) > (this.o[i9] & (-256))) {
                    int[] iArr = this.o;
                    int i10 = i8;
                    iArr[i10] = iArr[i10] ^ this.o[i9];
                    int[] iArr2 = this.o;
                    int i11 = i9;
                    iArr2[i11] = iArr2[i11] ^ this.o[i8];
                    int[] iArr3 = this.o;
                    int i12 = i8;
                    iArr3[i12] = iArr3[i12] ^ this.o[i9];
                }
            }
        }
        for (int i13 = 0; i13 < 13; i13++) {
            int i14 = this.o[i13] & 255;
            if (i14 >= 10) {
                switch (i14) {
                    case 10:
                        if (this.f80a.O) {
                            break;
                        } else {
                            this.f131e.A(0, 0);
                            this.f131e.a(afVar, 2, -3);
                            this.f131e.A(1, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 2, -3);
                            this.f131e.A(2, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 2, -3);
                            break;
                        }
                    case 11:
                        if (this.f80a.O) {
                            break;
                        } else {
                            this.f131e.A(3, 0);
                            this.f131e.a(afVar, 455, -3);
                            this.f131e.A(4, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 455, -3);
                            this.f131e.A(5, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 455, -3);
                            break;
                        }
                    case 12:
                        a(this.f80a.aC, this.f57a);
                        if (this.f80a.O) {
                            this.f131e.A(0, 0);
                            this.f131e.a(afVar, 2, -3);
                            this.f131e.A(1, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 2, -3);
                            this.f131e.A(3, 0);
                            this.f131e.a(afVar, 455, -3);
                            this.f131e.A(4, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 455, -3);
                        }
                        afVar.a(this.f127d, this.f57a.eF - (this.f127d.getWidth() >> 1), this.f57a.eG - (this.f127d.getHeight() >> 1));
                        if (this.f80a.R) {
                            for (int i15 = 0; i15 < 3; i15++) {
                                a(this.f80a.a(i15), this.f57a);
                                afVar.a(this.f129b[i15], this.f57a.eF - (this.f129b[i15].getWidth() >> 1), this.f57a.eG - (this.f129b[i15].getHeight() >> 1));
                            }
                        }
                        if (this.f80a.O) {
                            this.f131e.A(2, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 2, -3);
                            this.f131e.A(5, this.ad);
                            this.f131e.l(this.p);
                            this.f131e.a(afVar, 455, -3);
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                ak akVarA = i14 < 5 ? this.f78a.a(i14) : this.f79b.a(i14 - 5);
                ak akVar = akVarA;
                ab abVar2 = akVarA.bb;
                int i16 = Math.abs(abVar2.eF) > Math.abs(abVar2.eH) ? abVar2.eF > 0 ? 1 : 3 : abVar2.eH > 0 ? 0 : 2;
                aa aaVar = this.f104a[!akVar.r ? 1 : 0][c[akVar.gq]];
                aaVar.A(i16, akVar.gs);
                aaVar.l(this.p);
                this.K.c(akVar.aC);
                this.K.eG = akVar.gm;
                a(this.K, this.f57a);
                aaVar.a(afVar, this.f57a.eF, this.f57a.eG);
            }
        }
        afVar.translate(-this.aS, -this.aT);
        e(afVar);
        if (f(26)) {
            a(afVar);
        }
        super.b(afVar);
    }

    @Override // defpackage.u
    public final boolean a(int i, int i2) throws IOException {
        if (f(26)) {
            return d(i, i2);
        }
        if (i2 != 268435456) {
            if (f(20)) {
                return false;
            }
            return e(i, i2);
        }
        if (f(26)) {
            j(-1);
            return false;
        }
        j(0);
        repaint();
        return false;
    }

    @Override // defpackage.u
    public final boolean b(int i, int i2) throws IOException {
        if (f(26)) {
            return m29j();
        }
        if (i2 == 268435456) {
            return true;
        }
        return m30f(i, i2);
    }

    @Override // defpackage.u
    public final boolean d(int i) throws IOException {
        switch (i) {
            case 0:
                if (this.f101c) {
                    this.f102d = true;
                } else {
                    c(true);
                }
                if (this.aL == 0) {
                    this.aL = 1;
                }
                this.f100b = true;
                break;
            case 1:
                this.f100b = false;
                break;
            case 3:
                if (!f(26)) {
                    j(0);
                    break;
                }
                break;
            case 4:
                if (this.aL == 0) {
                    this.aL = 1;
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.u
    public final boolean c(int i, int i2) throws IOException {
        t.g();
        if ((this.V != 0 && this.V != 1) || this.aF != 6) {
            return true;
        }
        if (i != 0) {
            repaint();
            return true;
        }
        if (!f(22) || f(21)) {
            ((m) ((w) this).d).M();
            return true;
        }
        ((m) ((w) this).d).e(1001, true);
        return true;
    }

    public final void b(int i, int i2, int i3) {
        this.aN = i;
        this.aO = i2;
        this.aP = i3;
    }

    @Override // defpackage.u
    public final int a(int i) throws IOException {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                if (i < 16) {
                    if (i == 0) {
                        this.f105a[0] = t.m47a(318, this.aN);
                        this.f105a[1] = t.m47a(319, this.aO);
                    }
                    if (a[i] != 0) {
                        this.f104a[0][i] = ((w) this).d.a(a[i], 1, this.f105a[0], a[i], 0);
                        this.f104a[1][i] = ((w) this).d.a(a[i], 1, this.f105a[1], a[i], 0);
                    }
                    t.I(t.dc | t.dd);
                }
                return i;
            case 16:
                this.f105a[0] = null;
                this.f105a[1] = null;
                this.f127d = t.m44a(320, 0);
                this.f128e = t.m44a(320, 4);
                for (int i2 = 0; i2 < 3; i2++) {
                    this.f129b[i2] = t.m44a(320, 1 + i2);
                }
                this.f131e = ((w) this).d.a(320, 9, -1, -1, 320, 10);
                this.f130f = Image.createImage(528, 139);
                Graphics graphics = this.f130f.getGraphics();
                graphics.setColor(0);
                graphics.fillRect(0, 0, 528, 139);
                DirectGraphics directGraphics = DirectUtils.getDirectGraphics(graphics);
                int width = 0;
                byte[] bArrM47a = t.m47a(324, this.aN);
                for (int i3 = 0; i3 < 4; i3++) {
                    Image imageA = t.a(320, 5 + i3, bArrM47a);
                    t.I(t.dc);
                    graphics.drawImage(imageA, width, 0, 20);
                    if ((528 - width) - imageA.getWidth() >= 264) {
                        directGraphics.drawImage(imageA, (528 - width) - imageA.getWidth(), 0, 20, 8192);
                    }
                    width += imageA.getWidth();
                }
                graphics.drawImage(t.m44a(321, 0 + this.aN), 263, 65, 3);
                t.I(t.dc);
                graphics.drawImage(t.m44a(322, 0 + this.aN), 0, 0, 20);
                t.I(t.dc);
                graphics.drawImage(t.m44a(323, 0 + this.aN), 528, 0, 24);
                t.I(t.dc);
                t.I(t.db & (t.de ^ (-1)));
                return 20;
            case 17:
                return 21;
            case 18:
                this.f124i = ((m) ((w) this).d).a(0, -1, 1);
                this.f124i.cy = -2;
                this.f123d = ((w) this).d.a(315, 6, -1, -1, 315, 7);
                this.f121b = ((w) this).d.a(315, 2, -1, -1, 315, 3);
                this.f122c = ((w) this).d.a(315, 4, -1, -1, 315, 5);
                this.f125b = t.m44a(312, 1);
                this.f126c = t.m44a(312, 2);
                this.f138f = ((w) this).d.a(312, 6, -1, -1, 312, 7);
                this.f137l = t.m44a(312, 8);
                return 25;
            case 19:
                this.f134i = t.m44a(312, 3);
                this.f135j = t.m44a(312, 4);
                this.f136k = t.m44a(312, 5);
                this.f139g = ((w) this).d.a(312, 42, -1, -1, 312, 43);
                return 30;
            case 20:
                return 35;
            case 21:
                c(true);
                return 40;
            case 22:
                return 45;
            case 23:
                this.f132g = t.m44a(320, 11);
                this.f133h = t.m44a(320, 12);
                this.f80a.a(this, this.f78a, this.f79b);
                return 55;
            case 24:
                this.f91a = ((w) this).d.a(317, 17, -1, -1, 317, 18);
                this.f92a = t.m44a(317, 19);
                for (int i4 = 0; i4 < 16; i4++) {
                    this.f109a[i4] = t.m44a(317, 0 + i4);
                }
                return 65;
            case 25:
                for (int i5 = 0; i5 < 8; i5++) {
                    ((w) this).d.a(325, 0 + i5, i5, "audio/amr");
                }
                t.I(t.db & (t.de ^ (-1)));
                return 68;
            case 26:
                this.f78a.a(this.f110a, this, this.f80a, -1, true);
                this.f79b.a(this.f110a, this, this.f80a, -1, false);
                return 70;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                int i6 = i - 27;
                this.f78a.a(this.f110a, this, this.f80a, i6, true);
                this.f79b.a(this.f110a, this, this.f80a, i6, false);
                return 75 + i6;
            case 32:
                C();
                return 85;
            case 33:
                h(this.aN, this.aO);
                return 95;
            case 34:
                g(this.aP, 24000);
                return 98;
            default:
                this.f112a.b(((w) this).d);
                this.aq = t.g();
                this.ao = 0;
                this.p = 0;
                this.ar = 255;
                this.as = 255;
                this.at = 255;
                return 100;
        }
    }

    public final void a(int i, boolean z, boolean z2, int i2) throws IOException {
        this.aq = i2;
        this.ao = 0;
        this.p = 0;
        this.s = i;
        this.t = -1;
        c(4, z);
        c(5, z2);
        this.E = 0;
        this.F = 0;
        this.f101c = false;
        this.f102d = false;
        c(27, false);
        this.f139g.setVisible(false);
        x();
        this.J = 0;
        this.f81K = 0;
        this.H = ((m) ((w) this).d).d(14);
        F();
        G();
        this.aj = -1;
        this.x = -1;
        this.f78a.a(this.f86a[0]);
        this.f78a.b(this.f87b[0]);
        this.f78a.a(this.f88c[0]);
        this.f78a.b(this.f89d[0]);
        this.f79b.a(this.f86a[1]);
        this.f79b.b(this.f87b[1]);
        this.f79b.a(this.f88c[1]);
        this.f79b.b(this.f89d[1]);
        o();
        this.f142f = true;
    }

    public final void b(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(2005406260);
        dataOutputStream.writeInt(536870964);
        dataOutputStream.writeShort(this.f78a.br);
        dataOutputStream.writeShort(this.f79b.br);
        dataOutputStream.writeInt(this.s);
        c(dataOutputStream);
    }

    public final void a(DataInputStream dataInputStream, int i) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        dataInputStream.readShort();
        dataInputStream.readShort();
        dataInputStream.readInt();
        b(dataInputStream);
        this.ao = 0;
        this.ap = 0;
        this.aq = i;
        this.E = 0;
        this.F = 0;
        this.f94f = null;
        this.f101c = false;
        this.f102d = false;
        this.f139g.setVisible(false);
        this.E = this.f78a.cB;
        this.F = this.f79b.cB;
        int i2 = this.V;
        this.V = -1;
        if (i2 == -1) {
            j(0);
        } else {
            j(i2);
        }
        g(this.u, this.v);
        a(this.f77e, this.f106a);
        if (this.f80a.g == null || this.f80a.g.r == this.f77e.r) {
            this.f108c.q = false;
            ak akVarB = b();
            if (akVarB != null && !f(11) && !f(12)) {
                a(akVarB, this.f107b);
                this.f107b.q = true;
            }
        } else {
            a(this.f80a.g, this.f108c);
            this.f108c.q = true;
            this.f107b.q = false;
        }
        if (this.t < 4) {
            this.f141d = t.getString(37 + this.t);
        } else if (this.t > 4) {
            this.f141d = new StringBuffer().append((this.t - 4) + 1).append(t.getString(43)).toString();
        } else {
            this.f141d = t.getString(43);
        }
        F();
        G();
        c(true);
        if (f(11) && this.f80a.g != null) {
            s sVar = this.f80a.g.r ? this.f78a : this.f79b;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.f80a.g == null || !f(11)) {
                    this.l[i3] = 65536;
                } else {
                    ak akVarA = sVar.a(this.k[i3]);
                    this.f148Q.b(this.f80a.g.aC, akVarA.aC);
                    this.l[i3] = a(akVarA, this.f148Q.length());
                }
            }
        }
        v();
        this.f142f = true;
    }

    private boolean e(int i) {
        return (this.I & (1 << i)) != 0;
    }

    public final void a(int i, ak akVar, ak akVar2, int i2) throws IOException {
        int iMax = 24000;
        if (f(20) || f(22) || f(15)) {
            return;
        }
        if (this.u != 0 || i == 8) {
            if (!e(2) || d[i] < 0 || e(d[i])) {
                z();
                A();
                g(6);
                boolean z = true;
                boolean z2 = true;
                if (akVar == null) {
                    this.f83M = 0;
                } else if (akVar.r) {
                    this.f83M = 1 + akVar.gk;
                } else {
                    this.f83M = (-1) - akVar.gk;
                }
                this.f84N = 0;
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (akVar == null) {
                            z = this.A == -1;
                            break;
                        } else {
                            if (i == 2) {
                                if (akVar.r == (this.A == 1)) {
                                    int[] iArr = akVar.aj;
                                    iArr[15] = iArr[15] + 1;
                                } else {
                                    iMax = this.v;
                                }
                            }
                            z = !akVar.r;
                            break;
                        }
                    case 8:
                        a(akVar2, this.f80a.et == 1 ? 2 : 3, 7, i2);
                        z = !akVar2.r;
                        break;
                    case 9:
                    case 10:
                    case 11:
                        iMax = Math.max(this.v, 14000);
                    case 12:
                    case 13:
                        s sVar = akVar.r ? this.f78a : this.f79b;
                        if (i == 12) {
                            int[] iArr2 = akVar.aj;
                            iArr2[15] = iArr2[15] + 1;
                        }
                        z = !akVar.r;
                        int iA = sVar.a(akVar, i != 12);
                        int i3 = akVar2.f48a;
                        if (i3 == 5 || i3 == 18) {
                            if (akVar2.w()) {
                                this.f85O = 3;
                            } else {
                                this.f85O = 2;
                            }
                            c(15, true);
                            z2 = false;
                            i = 13;
                        } else if (i3 == 7 || i3 == 17) {
                            this.f85O = 2;
                            c(15, true);
                            z2 = false;
                            i = 13;
                        } else if (iA >= 5) {
                            iMax = 24000;
                            this.f85O = 2;
                            c(15, true);
                        }
                        if (f(15)) {
                            if (akVar2.r) {
                                this.f84N = 1 + akVar2.gk;
                            } else {
                                this.f84N = (-1) - akVar2.gk;
                            }
                            this.r = -1;
                            this.f80a.a(false, false, (ak) null, (ak) null);
                            break;
                        }
                        break;
                }
                this.U = i;
                if (akVar == null) {
                    this.f90P.aT();
                } else if (i == 2) {
                    this.f90P.c(this.f80a.aC);
                } else {
                    this.f90P.c(akVar.aC);
                }
                c(23, false);
                c(2, true);
                c(3, true);
                this.v = iMax;
                this.G = 6;
                c(25, false);
                if (z2) {
                    this.A = 0;
                    ak akVarA = this.f78a.a(z, i2);
                    ak akVarA2 = this.f79b.a(!z, i2);
                    this.f80a.c(akVarA != null ? akVarA : akVarA2);
                    a(akVarA, akVarA2, false);
                    this.f80a.a(false, false, akVarA, akVarA2);
                    this.r = -1;
                    c(30, true);
                }
                v();
                this.f82L = i2 + 2500;
            }
        }
    }

    private void a(boolean z, int i) {
        if (this.f80a.g == null || this.f80a.g.r != z) {
            return;
        }
        if ((z ? this.f78a : this.f79b).cC > 0) {
            this.f78a.f(z);
            this.f79b.f(!z);
            c(28, true);
            c(29, z);
            if (f(15) || f(9) || f(20)) {
                return;
            }
            c(30, true);
            this.U = -1;
            this.f90P.c(this.f80a.aC);
            c(2, true);
            c(3, true);
            c(23, false);
            this.A = 0;
            ak akVarA = this.f78a.a(z, i);
            ak akVarA2 = this.f79b.a(!z, i);
            this.f80a.c(akVarA != null ? akVarA : akVarA2);
            a(akVarA, akVarA2, false);
            A();
            z();
            this.Z = 0;
            this.f80a.a(false, false, akVarA, akVarA2);
            this.r = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.y r7, defpackage.ak r8, int r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.a(y, ak, int):void");
    }

    public final void i() {
        this.f94f = null;
    }

    public final void a(y yVar, ak akVar, int i, int i2) throws IOException {
        int i3;
        if (i == 1 || i == 5 || i == 6) {
            i3 = 2;
        } else if (i == 2) {
            i3 = 3;
        } else {
            i3 = 1;
            if (this.f85O == 0) {
                c(30, true);
            }
        }
        a(akVar, i3, i, i2);
        this.ad = i2;
        if (f(15)) {
            this.f85O = 1;
            return;
        }
        if (this.f85O > 0) {
            k(i2);
            return;
        }
        i(i2);
        c(23, true);
        c(3, true);
        this.U = -1;
        if (this.t < 3) {
            c(2, this.u <= 60000);
        } else {
            c(2, this.u <= 120000);
        }
        c(2, true);
        this.A = 0;
        ak akVarA = this.f78a.a(!akVar.r, i2);
        ak akVarA2 = this.f79b.a(akVar.r, i2);
        a(akVarA, akVarA2, f(4) ? akVarA != null : akVarA2 != null);
        this.f80a.a(false, false, akVarA, akVarA2);
        this.r = -1;
        ak akVarB = (!akVar.r ? this.f78a : this.f79b).b(0);
        int i4 = akVarB.t ? -807770 : 807770;
        akVarB.H(i4, 262144);
        akVarB.a.a(i4, 262144);
        if (this.f77e == akVar) {
            akVar.ap = false;
        }
    }

    public final void i(int i) {
        this.v = 24000;
        this.G = 6;
        c(25, false);
        this.B = i;
    }

    public final void f(int i, int i2) {
        this.C = i;
        this.D = i2 + 2000;
        if (i == 3 || i == 4) {
            c(1, true);
        }
    }

    public final boolean d() {
        return f(6);
    }

    public final void a(ak akVar, ab abVar) {
        ab abVar2;
        int iD;
        if (this.U == -1 || this.U == 8) {
            if (f(28)) {
                abVar.eF = t.d(this.f90P.eF, -559311, 559311);
                if (this.u <= 120000 && this.t >= 3) {
                    int i = akVar.t ? 359452 : -359452;
                    if (akVar.t) {
                        if (i > abVar.eF) {
                            abVar.eF = i;
                        }
                    } else if (i < abVar.eF) {
                        abVar.eF = i;
                    }
                }
                abVar.eH = this.f90P.eH >= 0 ? 564920 : -564920;
            } else {
                abVar.eF = !akVar.t ? 1004378 : -1004378;
                abVar2 = abVar;
                iD = 262144;
                abVar2.eH = iD;
            }
        } else if (this.U == 2) {
            if (Math.abs(this.f90P.eF) >= 938842) {
                abVar.eF = this.f90P.eF >= 0 ? 1004378 : -1004378;
                abVar2 = abVar;
                iD = t.d(this.f90P.eH, -499384, 499384);
                abVar2.eH = iD;
            } else {
                abVar.eF = t.d(this.f90P.eF, -938842, 938842);
                abVar.eH = this.f90P.eH >= 0 ? 564920 : -564920;
            }
        } else if (this.U < 4) {
            abVar.eF = akVar.t ? 65536 : -65536;
            abVar.eH = this.f90P.eH >= 0 ? 564920 : -564920;
        } else {
            abVar.eF = t.d(this.f90P.eF, -559311, 559311);
            abVar2 = abVar;
            iD = this.f90P.eH >= 0 ? 564920 : -564920;
            abVar2.eH = iD;
        }
        abVar.eG = 65536;
    }

    public final ak b(ak akVar) {
        s sVar = akVar.r ? this.f78a : this.f79b;
        ak akVar2 = null;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            ak akVarA = sVar.a(i2);
            if (akVarA != akVar) {
                int iM19b = akVar.m19b(akVarA.aC);
                if (akVar2 == null || iM19b < i) {
                    akVar2 = akVarA;
                    i = iM19b;
                }
            }
        }
        return akVar2;
    }

    public final s a(ak akVar) {
        return akVar.r ? this.f79b : this.f78a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final s m21b(ak akVar) {
        return akVar.r ? this.f78a : this.f79b;
    }

    private void j(int i) throws IOException {
        g gVar;
        int i2;
        g gVar2;
        this.aL = 0;
        if (this.f143b != null) {
            c(this.f143b);
            this.f143b.aH();
            this.f143b = null;
        }
        switch (this.V) {
            case 2:
            case 6:
                if (this.aL == 0) {
                    this.aL = 1;
                    break;
                }
                break;
            case 14:
                if (i == -1) {
                    c(9, false);
                    break;
                }
                break;
            case 15:
                if (this.f140a != null) {
                    ((w) this).d.c(this.f140a);
                    this.f140a.aH();
                    this.f140a = null;
                    break;
                }
                break;
        }
        if (i != -1) {
            c(26, true);
            this.aF = 0;
            this.aI = t.g();
            switch (i) {
                case 1:
                    this.W = this.V;
                case 0:
                case 11:
                    this.aL = 1;
                    this.f103e = false;
                    if (i == 0 || i == 1) {
                        this.aG = 7;
                    } else {
                        this.aG = 3;
                    }
                    this.f96f.gh = 152;
                    this.f96f.gi = ((this.aG + 1) * 16) + 16;
                    this.f96f.eF = this.f95e.eF + ((this.f95e.gh - this.f96f.gh) >> 1);
                    this.f96f.eG = this.f95e.eG + ((this.f95e.gi - this.f96f.gi) >> 1);
                    this.aH = 98;
                    for (int i3 = 0; i3 < this.aG; i3++) {
                        int iStringWidth = this.f113a.stringWidth(t.getString(177 + i3)) + 20;
                        if (iStringWidth > this.aH) {
                            this.aH = iStringWidth;
                        }
                    }
                    break;
                case 2:
                    this.f143b = ((w) this).d.m51a(314, 4);
                    switch (((m) ((w) this).d).cc) {
                        case -1:
                        case 0:
                            this.aJ = 198;
                            break;
                        case 1:
                            this.aJ = 199;
                            break;
                        case 2:
                            this.aJ = 200;
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.f143b = ((w) this).d.m51a(314, 5);
                    switch (i) {
                        case 3:
                            this.aJ = 152;
                            break;
                        case 4:
                            this.aJ = 153;
                            break;
                        case 5:
                            this.aJ = 154;
                            break;
                        case 6:
                            this.aJ = 155;
                            break;
                        case 7:
                            this.aJ = 156;
                            break;
                    }
                case 9:
                    this.aJ = 158;
                    this.f143b = ((w) this).d.m51a(314, 6);
                    if (this.f143b != null) {
                        a(this.f143b);
                        break;
                    }
                    break;
                case 10:
                    this.aJ = 157;
                    this.f143b = ((w) this).d.m51a(314, 6);
                    if (this.f143b != null) {
                        a(this.f143b);
                        break;
                    }
                    break;
                case 12:
                    this.aL = 1;
                    if (this.f74a > 0) {
                        this.f74a = (short) (this.f74a - 1);
                        s sVar = this.f78a.m39b((int) this.f72b[this.f74a]) != null ? this.f78a : this.f79b;
                        this.f143b = ((w) this).d.m51a(314, 0);
                        ad adVarM39b = sVar.m39b((int) this.f73c[this.f74a]);
                        ad adVarM39b2 = sVar.m39b((int) this.f72b[this.f74a]);
                        String string = new StringBuffer().append(t.getString(101)).append(adVarM39b2.eR).append(" ").append(adVarM39b2.q).append(" ").append(adVarM39b2.r).toString();
                        String string2 = new StringBuffer().append(t.getString(101)).append(adVarM39b.eR).append(" ").append(adVarM39b.q).append(" ").append(adVarM39b.r).toString();
                        if (this.f143b != null) {
                            g gVar3 = (g) this.f143b.b(-1634635731);
                            if (gVar3 != null) {
                                gVar3.a(string, false);
                            }
                            g gVar4 = (g) this.f143b.b(-376028997);
                            if (gVar4 != null) {
                                gVar4.a(string2, false);
                            }
                            ac acVar = (ac) this.f143b.b(sVar.r ? -1601970876 : 959426110);
                            if (acVar != null) {
                                acVar.I = false;
                                break;
                            }
                        }
                    }
                    break;
                case 13:
                    this.aJ = 178;
                    this.f143b = ((w) this).d.m51a(314, 7);
                    if (this.f143b != null) {
                        ac acVar2 = f(29) ? (ac) this.f143b.b(-1601970876) : (ac) this.f143b.b(959426110);
                        if (acVar2 != null) {
                            acVar2.I = false;
                        }
                    }
                    if (f(15) || f(9) || f(20)) {
                        c(28, false);
                        break;
                    }
                    break;
                case 14:
                    this.aL = 1;
                    c(9, true);
                    break;
                case 15:
                    if (this.f140a == null && this.ac != -1) {
                        this.f140a = ((w) this).d.m51a(314, 9);
                        this.f140a.aG();
                        g gVar5 = (g) this.f140a.b(-1917550175);
                        u uVar = (u) this.f140a.b(911288515);
                        g gVar6 = (g) this.f140a.b(1871715184);
                        l lVar = (l) this.f140a.b(-1964401314);
                        lVar.q(this.f140a.B(), this.f140a.C() - (gVar5.y() + uVar.y()));
                        lVar.z(297 + this.ac);
                        if (this.A == 0) {
                            gVar = gVar6;
                            i2 = 97;
                        } else {
                            gVar = gVar6;
                            i2 = (this.A == 1) == f(4) ? 94 : 95;
                        }
                        gVar.d(i2, true);
                        lVar.aG();
                        gVar6.i.q(lVar.x(), gVar6.i.y());
                        this.f140a.aq();
                        ((w) this).d.b(this.f140a);
                        break;
                    }
                    break;
            }
        } else {
            ((w) this).d.am();
            this.aL = -1;
            c(26, false);
        }
        if (this.f143b != null) {
            g gVar7 = (g) this.f143b.b(171915688);
            if (gVar7 != null) {
                gVar7.a(new StringBuffer().append("").append(this.f78a.cB).toString(), false);
            }
            g gVar8 = (g) this.f143b.b(-1166668295);
            if (gVar8 != null) {
                gVar8.a(new StringBuffer().append("").append(this.f79b.cB).toString(), false);
            }
            g gVar9 = (g) this.f143b.b(-1922065238);
            if (gVar9 != null) {
                gVar9.a(new StringBuffer().append("(").append(this.aB).append("-").append(this.aC).append(")").toString(), false);
            }
            g gVar10 = (g) this.f143b.b(-1850493700);
            if (gVar10 != null) {
                gVar10.a(new StringBuffer().append("(").append(this.aD).append("-").append(this.aE).append(")").toString(), false);
            }
            g gVar11 = (g) this.f143b.b(-2110825374);
            if (gVar11 != null) {
                gVar11.a(this.f110a.a(this.f78a.br).n, false);
            }
            g gVar12 = (g) this.f143b.b(-954312709);
            if (gVar12 != null) {
                gVar12.a(this.f110a.a(this.f79b.br).p, false);
            }
            g gVar13 = (g) this.f143b.b(508172559);
            if (gVar13 != null) {
                gVar13.a(this.f110a.a(this.f78a.br).p, false);
            }
            if (this.aJ != -1 && (gVar2 = (g) this.f143b.b(1764233584)) != null) {
                gVar2.d(this.aJ, false);
            }
            ac acVar3 = (ac) this.f143b.b(959426110);
            if (acVar3 != null) {
                acVar3.eJ += this.f78a.br;
            }
            ac acVar4 = (ac) this.f143b.b(-1601970876);
            if (acVar4 != null) {
                acVar4.eJ += this.f79b.br;
            }
            a((w) this.f143b);
            this.f143b.aG();
        }
        this.X = t.g();
        this.V = i;
        w();
        repaint();
    }

    private void a(u uVar) throws IOException {
        int[] iArr = new int[9];
        int[][] iArr2 = new int[2][17];
        this.f78a.a(iArr2[1]);
        this.f79b.a(iArr2[0]);
        int i = 0;
        while (i < 2) {
            int[] iArr3 = iArr2[i];
            iArr[0] = iArr3[11] + iArr3[10];
            iArr[1] = iArr3[12];
            iArr[2] = iArr3[14];
            iArr[3] = iArr3[16];
            iArr[4] = iArr3[13];
            iArr[5] = iArr3[15];
            if (iArr2[i][4] + iArr3[6] != 0) {
                iArr[6] = ((iArr3[5] + iArr3[7]) * 100) / (iArr3[4] + iArr3[6]);
            } else {
                iArr[6] = 0;
            }
            iArr[7] = iArr3[7];
            if (iArr3[6] != 0) {
                iArr[8] = (iArr[7] * 100) / iArr3[6];
            } else {
                iArr[8] = 0;
            }
            int[] iArr4 = i == 0 ? g : h;
            int i2 = 0;
            for (int i3 = 0; i3 < 9; i3++) {
                g gVar = (g) uVar.b(iArr4[i2]);
                if (gVar != null) {
                    String string = new StringBuffer().append("").append(iArr[i3]).toString();
                    if (f59a[i2]) {
                        string = new StringBuffer().append(string).append("%").toString();
                    }
                    gVar.a(string, false);
                }
                i2++;
            }
            i++;
        }
    }

    private void a(boolean z) {
        s sVar = this.f77e.r ? this.f78a : this.f79b;
        int i = -1;
        int i2 = 0;
        int i3 = this.f77e.t ? -833867 : 833867;
        int i4 = -this.f80a.aC.eH;
        int i5 = i3 - this.f80a.aC.eF;
        for (int i6 = 0; i6 < 5; i6++) {
            ak akVarA = sVar.a(i6);
            if ((akVarA != this.f77e || !z) && akVarA.a.f2a != 5) {
                int i7 = akVarA.aC.eF - this.f80a.aC.eF;
                int i8 = akVarA.aC.eH - this.f80a.aC.eH;
                int iM54a = (int) t.m54a(i7, i8);
                if (t.e(i4, i8) + t.e(i5, i7) < 0) {
                    iM54a <<= 2;
                }
                if (i < 0 || iM54a < i2) {
                    i2 = iM54a;
                    i = i6;
                }
            }
        }
        this.q = i;
        this.f77e = sVar.a(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j() {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.j():void");
    }

    /* renamed from: e, reason: collision with other method in class */
    public final boolean m22e() {
        return f(10);
    }

    public final void b(boolean z) {
        c(10, z);
    }

    /* renamed from: f, reason: collision with other method in class */
    public final boolean m23f() {
        return f(15);
    }

    public final void d(ak akVar, int i) throws IOException {
        ak akVarB = (akVar.r ? this.f78a : this.f79b).b(0);
        this.f80a.a(true, true, (ak) null, (ak) null);
        this.f80a.a(akVar, false, i, 0);
        akVarB.a.a(akVarB.aC, i);
        this.f80a.a(akVarB, akVarB.aC, 65536, i, 0);
        c(2, false);
    }

    public final void k() {
        this.J = 0;
        c(17, true);
    }

    public final void l() {
        c(18, true);
    }

    public final void k(int i) {
        if (this.f85O > 0) {
            c(19, true);
            this.P = i + 2500;
        }
    }

    /* renamed from: g, reason: collision with other method in class */
    public final boolean m24g() {
        return f(5);
    }

    /* renamed from: h, reason: collision with other method in class */
    public final boolean m25h() {
        return f(4);
    }

    public final boolean a(int i, int i2, boolean z, boolean z2) {
        boolean z3 = !z;
        short[] sArr = z2 ? this.f88c[z3 ? 1 : 0] : this.f86a[z3 ? 1 : 0];
        short[] sArr2 = z2 ? this.f89d[z3 ? 1 : 0] : this.f87b[z3 ? 1 : 0];
        if (z2 && (!m26a(z) || !a(sArr[i]))) {
            return false;
        }
        short s = sArr[i];
        sArr[i] = sArr2[i2];
        sArr2[i2] = s;
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m26a(boolean z) {
        return true;
    }

    private boolean a(short s) {
        if (this.f84N != 0) {
            return (this.f84N > 0 ? this.f78a.a(this.f84N - 1) : this.f79b.a((-this.f84N) - 1)).f46a.eL != s;
        }
        return true;
    }

    /* renamed from: i, reason: collision with other method in class */
    public final boolean m27i() {
        return f(26);
    }

    public final short a(int i, boolean z) {
        return this.f88c[!z ? 1 : 0][i];
    }

    public final short b(int i, boolean z) {
        return this.f89d[!z ? 1 : 0][i];
    }

    public final short a(short s, boolean z, boolean z2) {
        boolean z3 = !z;
        short[] sArr = z2 ? this.f88c[z3 ? 1 : 0] : this.f86a[z3 ? 1 : 0];
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= 5) {
                return (short) -1;
            }
            if (sArr[s3] == s) {
                return s3;
            }
            s2 = (short) (s3 + 1);
        }
    }

    public final short b(short s, boolean z, boolean z2) {
        s sVar = z ? this.f78a : this.f79b;
        boolean z3 = !z;
        short[] sArr = z2 ? this.f89d[z3 ? 1 : 0] : this.f87b[z3 ? 1 : 0];
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= sVar.bs - 5) {
                return (short) -1;
            }
            if (sArr[s3] == s) {
                return s3;
            }
            s2 = (short) (s3 + 1);
        }
    }

    public final boolean e(ak akVar) {
        if (m21b(akVar).cB > a(akVar).cB || this.H == 0) {
            return false;
        }
        int i = this.u;
        if (this.u < 15000) {
            return true;
        }
        return (((i + (this.t < 3 ? (3 - this.t) * this.s : 0)) / 24000) >> 2) * 2 > 0;
    }

    public final void m() {
        this.f94f = null;
    }

    public final void b(ak akVar, ab abVar, int i) {
        this.f94f = akVar;
        b(akVar, abVar);
    }

    private void b(ak akVar, ab abVar) {
        int i;
        abVar.eF = akVar.aC.eF;
        abVar.eG = akVar.gm;
        abVar.eH = akVar.aC.eH;
        int i2 = akVar.gq;
        aa aaVar = this.f104a[!akVar.r ? 1 : 0][c[i2]];
        ab abVar2 = akVar.bb;
        if (Math.abs(abVar2.eF) > Math.abs(abVar2.eH)) {
            i = abVar2.eF > 0 ? 1 : 3;
            abVar.eH++;
        } else if (abVar2.eH > 0) {
            i = 0;
            abVar.eH++;
        } else {
            i = 2;
            abVar.eH--;
        }
        aaVar.A(i, akVar.gs);
        aaVar.l(this.p);
        int i3 = aaVar.eD;
        this.al = 0;
        this.am = 0;
        byte[][][] bArr = (byte[][][]) null;
        switch (i2) {
            case 1:
            case 16:
                bArr = f66f;
                break;
            case 2:
            case 29:
            case 30:
                bArr = f70j;
                break;
            case 3:
                bArr = f61a;
                break;
            case 14:
            case 25:
            case 26:
            case 27:
                bArr = f69i;
                break;
            case 15:
                bArr = f68h;
                break;
            case 17:
            case 22:
            case 23:
            case 24:
                bArr = f63c;
                break;
            case 19:
                bArr = f67g;
                break;
            case 20:
                bArr = f65e;
                break;
            case 21:
                bArr = f62b;
                break;
            case 28:
                if (i3 >= 7) {
                    i3 = 6;
                }
                bArr = f64d;
                break;
        }
        if (bArr != null) {
            this.al = bArr[i][i3][0];
            this.am = bArr[i][i3][1];
        }
        int iA = a(akVar.aC);
        int iA2 = a();
        abVar.eF += t.e((this.al - 32) << 16, iA);
        if (this.am != 0) {
            abVar.eG += t.e((55 - this.am) << 16, iA2);
        } else {
            abVar.eG += 65536;
        }
    }

    public final ak a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i == 0) {
            return null;
        }
        return i > 0 ? this.f78a.a(i - 1) : this.f79b.a((-i) - 1);
    }

    public static void a(ak akVar, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(akVar == null ? 0 : akVar.r ? akVar.gk + 1 : (-akVar.gk) - 1);
    }

    private void b(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.f77e = a(dataInputStream);
        this.f78a.a(dataInputStream);
        this.f79b.a(dataInputStream);
        this.f80a.a(dataInputStream);
        this.p = dataInputStream.readInt();
        this.q = dataInputStream.readInt();
        this.r = dataInputStream.readInt();
        this.s = dataInputStream.readInt();
        this.t = dataInputStream.readInt();
        this.u = dataInputStream.readInt();
        this.v = dataInputStream.readInt();
        this.w = dataInputStream.readInt();
        this.x = dataInputStream.readInt();
        this.y = dataInputStream.readInt();
        this.z = dataInputStream.readInt();
        this.A = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.C = dataInputStream.readInt();
        this.D = dataInputStream.readInt();
        this.E = dataInputStream.readInt();
        this.F = dataInputStream.readInt();
        this.G = dataInputStream.readInt();
        this.f82L = dataInputStream.readInt();
        this.f83M = dataInputStream.readInt();
        this.f84N = dataInputStream.readInt();
        this.f85O = dataInputStream.readInt();
        this.P = dataInputStream.readInt();
        this.Q = dataInputStream.readInt();
        this.R = dataInputStream.readInt();
        this.S = dataInputStream.readInt();
        this.T = dataInputStream.readInt();
        this.aK = dataInputStream.readInt();
        this.Y = dataInputStream.readInt();
        for (int i = 0; i < 4; i++) {
            this.k[i] = dataInputStream.readInt();
        }
        this.ah = dataInputStream.readInt();
        this.ai = dataInputStream.readInt();
        this.aj = dataInputStream.readInt();
        this.ae = dataInputStream.readInt();
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                this.f86a[i2][i3] = dataInputStream.readShort();
                this.f88c[i2][i3] = dataInputStream.readShort();
            }
            for (int i4 = 0; i4 < 10; i4++) {
                this.f87b[i2][i4] = dataInputStream.readShort();
                this.f89d[i2][i4] = dataInputStream.readShort();
            }
        }
        this.f90P.a(dataInputStream);
        this.U = dataInputStream.readInt();
        this.V = dataInputStream.readInt();
        this.W = dataInputStream.readInt();
        this.X = dataInputStream.readInt();
        this.I = dataInputStream.readInt();
        this.J = dataInputStream.readInt();
        this.f81K = dataInputStream.readInt();
        this.H = dataInputStream.readInt();
        this.aa = dataInputStream.readInt();
        this.ab = dataInputStream.readInt();
        this.ac = dataInputStream.readInt();
    }

    private void c(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(2005406260);
        dataOutputStream.writeInt(536870964);
        a(this.f77e, dataOutputStream);
        this.f78a.a(dataOutputStream);
        this.f79b.a(dataOutputStream);
        this.f80a.a(dataOutputStream);
        dataOutputStream.writeInt(this.p);
        dataOutputStream.writeInt(this.q);
        dataOutputStream.writeInt(this.r);
        dataOutputStream.writeInt(this.s);
        dataOutputStream.writeInt(this.t);
        dataOutputStream.writeInt(this.u);
        dataOutputStream.writeInt(this.v);
        dataOutputStream.writeInt(this.w);
        dataOutputStream.writeInt(this.x);
        dataOutputStream.writeInt(this.y);
        dataOutputStream.writeInt(this.z);
        dataOutputStream.writeInt(this.A);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeInt(this.C);
        dataOutputStream.writeInt(this.D);
        dataOutputStream.writeInt(this.E);
        dataOutputStream.writeInt(this.F);
        dataOutputStream.writeInt(this.G);
        dataOutputStream.writeInt(this.f82L);
        dataOutputStream.writeInt(this.f83M);
        dataOutputStream.writeInt(this.f84N);
        dataOutputStream.writeInt(this.f85O);
        dataOutputStream.writeInt(this.P);
        dataOutputStream.writeInt(this.Q);
        dataOutputStream.writeInt(this.R);
        dataOutputStream.writeInt(this.S);
        dataOutputStream.writeInt(this.T);
        dataOutputStream.writeInt(this.aK);
        dataOutputStream.writeInt(this.Y);
        for (int i = 0; i < 4; i++) {
            dataOutputStream.writeInt(this.k[i]);
        }
        dataOutputStream.writeInt(this.ah);
        dataOutputStream.writeInt(this.ai);
        dataOutputStream.writeInt(this.aj);
        dataOutputStream.writeInt(this.ae);
        for (int i2 = 0; i2 < 2; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                dataOutputStream.writeShort(this.f86a[i2][i3]);
                dataOutputStream.writeShort(this.f88c[i2][i3]);
            }
            for (int i4 = 0; i4 < 10; i4++) {
                dataOutputStream.writeShort(this.f87b[i2][i4]);
                dataOutputStream.writeShort(this.f89d[i2][i4]);
            }
        }
        this.f90P.a(dataOutputStream);
        dataOutputStream.writeInt(this.U);
        dataOutputStream.writeInt(this.V);
        dataOutputStream.writeInt(this.W);
        dataOutputStream.writeInt(this.X);
        dataOutputStream.writeInt(this.I);
        dataOutputStream.writeInt(this.J);
        dataOutputStream.writeInt(this.f81K);
        dataOutputStream.writeInt(this.H);
        dataOutputStream.writeInt(this.aa);
        dataOutputStream.writeInt(this.ab);
        dataOutputStream.writeInt(this.ac);
    }

    private void c(boolean z) {
        int iB = B();
        int iC = C();
        if (!z) {
            this.f95e.c(0, 0, iB, iC);
        } else {
            this.f95e.c(0, 17, iB, (iC - 17) - 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0543  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.n():void");
    }

    private void o() throws IOException {
        boolean z;
        this.u = this.s;
        this.t++;
        this.v = 24000;
        this.G = 6;
        c(25, false);
        this.w = -1;
        this.x = -1;
        this.D = -1;
        this.y = -1;
        this.aK = 0;
        c(10, false);
        c(11, false);
        c(12, false);
        c(28, false);
        c(24, false);
        c(21, false);
        c(22, false);
        c(20, false);
        c(17, false);
        c(18, false);
        c(19, false);
        c(15, false);
        c(16, false);
        c(30, true);
        this.f85O = 0;
        this.f83M = 0;
        this.f84N = 0;
        this.f82L = 0;
        this.U = -1;
        c(1, false);
        this.Y = 0;
        this.Z = 0;
        this.r = -1;
        this.an = 0;
        this.f94f = null;
        ak akVarA = this.f78a.a(this.t, this.p);
        ak akVarA2 = this.f79b.a(this.t, this.p);
        this.f80a.a(false, false, akVarA, akVarA2);
        this.A = 0;
        c(2, true);
        c(3, true);
        c(23, false);
        this.E = this.f78a.cB;
        this.F = this.f79b.cB;
        if (this.t == 0 || this.t >= 4) {
            this.f77e = f(4) ? akVarA : akVarA2;
            s sVar = f(4) ? this.f78a : this.f79b;
            int i = 0;
            while (true) {
                if (i >= 5) {
                    break;
                }
                if (this.f77e == sVar.a(i)) {
                    this.q = i;
                    break;
                }
                i++;
            }
            this.f80a.h(false);
            this.f80a.a(false, false, (ak) null, (ak) null);
            c(7, true);
            c(8, false);
            this.aM = this.p;
        } else {
            a(akVarA, akVarA2, f(4) ? akVarA != null : akVarA2 != null);
            this.f80a.c(akVarA != null ? akVarA : akVarA2);
            if (this.t == 1) {
                z = f(6);
            } else if (this.t == 2) {
                z = !f(6);
            } else {
                z = f(6);
            }
            this.f80a.f(z ? 971610 : -971610, 65536, 131072);
        }
        j(-1);
        j(-1);
        if (this.t < 4) {
            this.f141d = t.getString(37 + this.t);
        } else if (this.t > 4) {
            this.f141d = new StringBuffer().append((this.t - 4) + 1).append(t.getString(43)).toString();
        } else {
            this.f141d = t.getString(43);
        }
        g(this.u, this.v);
        if (this.t < 4) {
            j(2 + this.t);
        } else {
            j(6);
        }
        ((m) ((w) this).d).a(this);
    }

    private void a(ak akVar, int i, int i2, int i3) throws IOException {
        this.f139g.setVisible(true);
        this.f139g.A(0, i3);
        if (akVar.r) {
            this.f78a.g(akVar, i);
            this.f139g.setPosition(84, 3);
        } else {
            this.f79b.g(akVar, i);
            this.f139g.setPosition(39, 3);
        }
        if (i2 == 5) {
            g(3);
        } else if (((w) this).d.o(100) <= 50) {
            g(5);
        } else {
            g(7);
        }
        this.w = i3 + 2500;
        if (i2 != 0) {
            f(i2, i3);
        }
    }

    private void a(ak akVar, ak akVar2, boolean z) {
        s sVar = f(4) ? this.f78a : this.f79b;
        if (z && (akVar2 == sVar.b(0) || akVar == sVar.b(0))) {
            z = false;
        }
        while (true) {
            if (this.f77e == akVar || this.f77e == akVar2) {
                int i = this.q - 1;
                this.q = i;
                if (i < 0) {
                    this.q = 4;
                }
                this.f77e = sVar.a(this.q);
            }
            if (!z || this.f77e == sVar.b(0)) {
                return;
            }
            int i2 = this.q - 1;
            this.q = i2;
            if (i2 < 0) {
                this.q = 4;
            }
            this.f77e = sVar.a(this.q);
            if (this.r == this.q) {
                int i3 = this.r - 1;
                this.r = i3;
                if (i3 < 0) {
                    this.r += 5;
                }
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m28a(int i, boolean z) {
        if (f(7)) {
            return;
        }
        boolean z2 = (this.f77e.gt & 4096) == 0;
        if (i != 0 && z) {
            this.f77e.ap = true;
        }
        if (!this.f77e.ap) {
            if (i == 0 || z) {
                return;
            }
            this.an &= i ^ (-1);
            return;
        }
        if (z) {
            this.an |= i;
        } else {
            this.an &= i ^ (-1);
        }
        if (this.f81K > 0 && this.p - this.f81K > 500) {
            if (this.f80a.g == this.f77e) {
                this.f77e.c(1, this.p, true);
            } else {
                this.f77e.c(8, this.p, true);
            }
            this.f81K = 0;
        }
        if (!z || (!f(11) && !f(12))) {
            if (this.an == 0) {
                this.f77e.c(32, this.p, false);
                return;
            }
            int i2 = 0;
            int i3 = 0;
            if ((this.an & 81) != 0) {
                i2 = -65536;
            } else if ((this.an & 162) != 0) {
                i2 = 65536;
            }
            if ((this.an & 52) != 0) {
                i3 = -65536;
            } else if ((this.an & 200) != 0) {
                i3 = 65536;
            }
            this.f77e.d(this.f77e.aC.eF + i2, this.f77e.aC.eH + i3, z2);
            this.f77e.c(32, this.p, true);
            return;
        }
        ak akVarA = null;
        s sVar = this.f77e.r ? this.f78a : this.f79b;
        int i4 = -1;
        if ((i & 4) != 0) {
            i4 = 0;
        } else if ((i & 2) != 0) {
            i4 = 1;
        } else if ((i & 8) != 0) {
            i4 = 2;
        } else if ((i & 1) != 0) {
            i4 = 3;
        }
        if (i4 != -1) {
            akVarA = sVar.a(this.k[i4]);
            for (int i5 = 0; i5 < 4; i5++) {
                if (i5 != i4) {
                    this.k[i5] = -1;
                }
            }
        }
        if (akVarA != null) {
            if (f(12)) {
                this.f77e = akVarA;
                this.q = this.f77e.gk;
                A();
                this.Z = 750;
                return;
            }
            if (this.f80a.g != null) {
                b(true);
                this.f80a.g.n = akVarA;
                this.f80a.g.c(4, this.p, true);
                z();
                this.Z = 3000;
            }
        }
    }

    private void a(ak akVar, n nVar) {
        int iA;
        int i = 3;
        boolean z = false;
        if (akVar.f46a.fj >= 90) {
            z = true;
        }
        boolean z2 = z;
        if (akVar.r == this.f77e.r) {
            if (akVar != this.f77e) {
                z = 2;
            } else if (f(7)) {
                i = 2;
            } else if (this.f80a.g == akVar) {
                int iE = (!this.f93a || ((m) ((w) this).d).d(22) == 0) ? 65536 - t.e(81920, akVar.L()) : this.aj == -1 ? 65536 - akVar.a((int[]) null, false) : this.z;
                i = iE <= 0 ? 2 : iE <= 13107 ? 5 : iE <= 32768 ? 1 : iE <= 52429 ? 4 : 0;
            } else {
                if (this.f77e.r == (this.A == -1)) {
                    i = 2;
                }
            }
            z2 = z;
            if (i == 3) {
                if (akVar != this.f77e) {
                    this.f148Q.b(akVar.aC, this.f77e.aC);
                    iA = a(akVar, this.f148Q.length());
                } else {
                    iA = akVar.a((int[]) null, true);
                }
                if (iA >= 39321) {
                    i = 2;
                    z2 = z;
                } else if (iA >= 19660) {
                    i = 1;
                    z2 = z;
                } else {
                    i = 0;
                    z2 = z;
                }
            }
        }
        nVar.s = this.f109a[e[z2 ? 1 : 0] + i];
    }

    private void g(int i, int i2) {
        int i3 = (i2 + 999) / 1000;
        int i4 = i + 99;
        int i5 = i4 / 1000;
        if (i3 >= i5) {
            this.ar = 255;
        } else if (i3 != this.ar) {
            this.az = i3 / 10;
            this.aA = i3 % 10;
            this.ar = i3;
        }
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i7 == this.at && i6 == this.as && i6 != 0) {
            return;
        }
        if (i6 == 0) {
            if (i7 != this.at) {
                this.ax = i7 / 10;
                this.ay = i7 % 10;
            }
            this.au = (i4 % 1000) / 100;
            if (i4 > 0 && i4 < 1000 && this.au < 0) {
                this.au = 0;
            }
        } else {
            this.av = i6 / 10;
            this.aw = i6 % 10;
            this.ax = i7 / 10;
            this.ay = i7 % 10;
        }
        this.as = i6;
        this.at = i7;
    }

    private int a(ak akVar, int i) {
        int iE = t.e((Math.max(0, t.f(1877685 - i, 1877685)) >> 1) + (t.e((5 - (akVar.r ? this.f78a : this.f79b).l(akVar.gk)) << 16, 13107) >> 1), t.f(this.f77e.f46a.fb, 100));
        if (i > 655360) {
            iE = t.e(iE, 49152);
        }
        return iE;
    }

    private void a(af afVar, ak akVar, int i, ab abVar) {
        String string;
        short sM53a = t.m53a(abVar.eF);
        int iM53a = t.m53a(abVar.eG);
        int i2 = sM53a - this.f95e.eF;
        int i3 = iM53a - this.f95e.eG;
        int i4 = this.f113a.cx;
        switch (((m) ((w) this).d).d(16)) {
            case 1:
                string = new StringBuffer().append("").append(akVar.f46a.eR).toString();
                break;
            case 2:
                string = new StringBuffer().append(akVar.f46a.q.charAt(0)).append(".").append(akVar.f46a.r).toString();
                break;
            default:
                string = t.getString(80 + akVar.gk);
                break;
        }
        int i5 = this.l[i];
        int i6 = i5 > 39321 ? 0 + i : i5 > 19660 ? 4 + i : 8 + i;
        int iJ = this.f138f.J(i6);
        int I = this.f138f.I(i6);
        int iStringWidth = this.f113a.stringWidth(string);
        int i7 = (I - iStringWidth) >> 1;
        int I2 = (i2 < 0 || i2 - (I >> 1) < 0) ? this.f95e.eF : i2 + I >= this.f95e.gh ? (this.f95e.gh - I) + this.f95e.eF : sM53a - (this.f138f.I(i6) >> 1);
        if (I2 + i7 < this.f95e.eF) {
            i7 = -I2;
        } else if (I2 + i7 + iStringWidth > this.f95e.gh) {
            i7 -= ((I2 + i7) + iStringWidth) - this.f95e.gh;
        }
        if (i3 - i4 < 0) {
            iM53a = this.f95e.eG + i4;
        } else if (i3 + iJ >= this.f95e.gi) {
            iM53a = (this.f95e.gi - iJ) + this.f95e.eG;
        }
        if (this.Z <= 0) {
            afVar.a(this.f137l, I2 + ((I - this.f137l.getWidth()) >> 1), iM53a + ((iJ - this.f137l.getHeight()) >> 1));
            this.f138f.a(afVar, I2, iM53a, i6);
        }
        if (akVar.gk != this.r || (!(f(11) || f(12)) || ((this.p - this.Y) & 64) == 0)) {
            int i8 = I2 + i7;
            int i9 = iM53a - i4;
            this.f115c.a(afVar, string, i8 - 1, i9 - 1);
            this.f115c.a(afVar, string, i8 + 1, i9 + 1);
            this.f113a.a(afVar, string, i8, i9);
        }
    }

    private void a(af afVar, ak akVar, ab abVar) {
        int i;
        int iA = akVar.a((int[]) null, false);
        int iP = t.p(abVar.eF);
        int iP2 = t.p(abVar.eG);
        int iQ = t.q((iP - this.f95e.eF) - (this.f95e.gh >> 1)) / (this.f95e.gh >> 1);
        int iQ2 = t.q((iP2 - this.f95e.eG) - (this.f95e.gi >> 1)) / (this.f95e.gi >> 1);
        int i2 = (this.p >> 3) & 1;
        if (Math.abs(iQ) > Math.abs(iQ2)) {
            if (iQ > 0) {
                i = 9;
                iP -= this.f138f.I(9) - i2;
            } else {
                i = 11;
                iP += i2;
            }
            if (iP2 > (this.f95e.eG + this.f95e.gi) - this.f138f.J(i)) {
                iP2 = (this.f95e.eG + this.f95e.gi) - this.f138f.J(i);
            }
        } else {
            if (iQ2 > 0) {
                i = 10;
                iP2 -= this.f138f.J(10) - i2;
            } else {
                i = 8;
                iP2 += i2;
            }
            if (iP > (this.f95e.eF + this.f95e.gh) - this.f138f.I(i)) {
                iP = (this.f95e.eF + this.f95e.gh) - this.f138f.I(i);
            }
        }
        if (iA > 39321) {
            i -= 8;
        } else if (iA > 19660) {
            i -= 4;
        }
        this.f138f.a(afVar, iP, iP2, i);
    }

    private static int a(af afVar, aa aaVar, int i, int i2, int i3) {
        aaVar.a(afVar, i2, i3, i);
        return aaVar.I(i) + 1;
    }

    private boolean a(ab abVar, ab abVar2) {
        ai aiVar = new ai();
        a(abVar, aiVar);
        int i = aiVar.eF + this.aS;
        int i2 = aiVar.eG + this.aT;
        if (i < this.f95e.eF || i2 < this.f95e.eG || i >= this.f95e.eF + this.f95e.gh || i2 >= this.f95e.eG + this.f95e.gi) {
            return false;
        }
        abVar2.eF = i << 16;
        abVar2.eG = i2 << 16;
        return true;
    }

    private boolean b(ab abVar, ab abVar2) {
        ai aiVar = new ai();
        a(abVar, aiVar);
        int i = aiVar.eF + this.aS;
        int i2 = aiVar.eG + this.aT;
        int iD = t.d(i, this.f95e.eF, this.f95e.eF + this.f95e.gh);
        int iD2 = t.d(i2, this.f95e.eG, this.f95e.eG + this.f95e.gi);
        abVar2.eF = iD << 16;
        abVar2.eG = iD2 << 16;
        return true;
    }

    private static void a(ab abVar, ai aiVar) {
        int iE = t.e(abVar.eH + 499384, 4300);
        int iE2 = t.e(t.e(13697024, 65536 - iE) + t.e(15204352, iE), 4574);
        int iE3 = t.e(7536640, 4300);
        aiVar.eF = 263 + t.p(t.e(abVar.eF, iE2));
        aiVar.eG = 65 + t.p(t.e(abVar.eH, iE3));
        aiVar.gh = 4;
        aiVar.gi = 4;
        aiVar.eG -= t.p(t.e(abVar.eG, 946061));
    }

    private int a(ab abVar) {
        return a();
    }

    private static int a() {
        return t.f(65536, 946061);
    }

    private void c(af afVar) {
        int height = (this.f125b.getHeight() - this.f119g.cx) >> 1;
        afVar.a(this.f125b, 0, 0);
        q qVarA = this.f110a.a(this.f79b.br);
        this.f119g.a(afVar, qVarA.p, 39 - this.f119g.stringWidth(qVarA.p), height);
        String str = this.f152f;
        this.f119g.a(afVar, str, 49 - (this.f119g.stringWidth(str) >> 1), height);
        q qVarA2 = this.f110a.a(this.f78a.br);
        this.f119g.a(afVar, qVarA2.p, 84 - this.f119g.stringWidth(qVarA2.p), height);
        String str2 = this.f151e;
        this.f119g.a(afVar, str2, 94 - (this.f119g.stringWidth(str2) >> 1), height);
        int i = 112;
        if (this.t > 4) {
            i = 112 - 2;
        }
        this.f120h.a(afVar, this.f141d, i, (this.f125b.getHeight() - this.f120h.cx) >> 1);
    }

    private void d(af afVar) {
        int iMin;
        int iMin2;
        this.f146g.c(0, 0, B(), 15);
        afVar.b(this.f146g, 0);
        afVar.a(0, this.f146g.eG, this.f146g.gh, this.f146g.eG, -3224882);
        if (this.f77e == null || this.V != -1) {
            return;
        }
        ad adVar = this.f77e.f46a;
        String str = null;
        r rVar = null;
        boolean z = false;
        int i = (15 - this.f118f.cx) >> 1;
        int iStringWidth = 0;
        String strA = adVar.s;
        int iStringWidth2 = this.f118f.stringWidth(strA);
        ak akVar = this.f80a.g;
        if (akVar != null) {
            if (akVar.r == this.f77e.r) {
                ak akVarB = b();
                if (akVarB != null) {
                    str = akVarB.f46a.s;
                    iStringWidth = this.f118f.stringWidth(str);
                    rVar = this.f118f;
                    z = true;
                }
            } else {
                str = akVar.f46a.s;
                iStringWidth = this.f114b.stringWidth(str);
                rVar = this.f114b;
            }
        }
        if (iStringWidth > 0) {
            int iB = B() - 10;
            if (z) {
                iB -= this.f126c.getWidth() + 2;
            }
            if (iStringWidth2 < iStringWidth) {
                iMin2 = Math.min(iB >> 1, iStringWidth2);
                iMin = Math.min(iStringWidth, Math.max(iB >> 1, iB - iMin2));
            } else {
                iMin = Math.min(iB >> 1, iStringWidth);
                iMin2 = Math.min(iStringWidth2, Math.max(iB >> 1, iB - iMin));
            }
            strA = a(strA, iMin2, this.f118f);
            String strA2 = a(str, iMin, rVar);
            int iB2 = (B() - iMin) - 5;
            rVar.a(afVar, strA2, iB2, i);
            if (z) {
                afVar.a(this.f126c, 5 + iMin2 + (((iB2 - (5 + iMin2)) - this.f126c.getWidth()) >> 1), 15 - this.f126c.getHeight());
            }
        }
        this.f118f.a(afVar, strA, 5, i);
    }

    private void e(af afVar) {
        ak akVarB = b();
        if (akVarB != null && ((this.f85O == 0 || f(15)) && !f(11) && !f(12) && !a(akVarB.aC, this.M) && b(akVarB.aC, this.M))) {
            a(afVar, akVarB, this.M);
        }
        if (f(11) || f(12) || (this.Z > 0 && (this.Z & 256) == 0)) {
            s sVar = this.f77e.r ? this.f78a : this.f79b;
            for (int i = 0; i < 4; i++) {
                if (this.k[i] != -1) {
                    ak akVarA = sVar.a(this.k[i]);
                    this.f148Q.c(akVarA.aC);
                    this.f148Q.eG = 212992;
                    if (a(this.f148Q, this.M)) {
                        a(afVar, akVarA, i, this.M);
                    } else if (b(this.f148Q, this.M)) {
                        a(afVar, akVarA, i, this.M);
                    }
                }
            }
        }
        if (this.f77e != null && ((this.f85O == 0 || f(15)) && !f(26) && !f(11) && !f(12) && !a(this.f77e.aC, this.M))) {
            if (b(this.f77e.aC, this.M)) {
                a(afVar, this.f77e, this.M);
            } else {
                this.M.B(t.q(this.f95e.gh) >> 1, t.q(this.f95e.eG + this.f95e.gi));
                a(afVar, this.f77e, this.M);
            }
        }
        if (!f(26)) {
            f(afVar);
        }
        afVar.translate(0, C() - 15);
        d(afVar);
        afVar.translate(0, (-C()) + 15);
        this.f146g.c(0, 0, this.f125b.getWidth(), this.f125b.getHeight());
        afVar.aV();
        if (afVar.b(this.f146g)) {
            afVar.translate(this.aQ, 0);
            c(afVar);
            if (this.f139g.isVisible()) {
                this.f139g.a(afVar);
            }
            if (this.as != 255) {
                aa aaVar = this.f121b;
                if (this.as == 0) {
                    int iA = 132 + a(afVar, aaVar, this.ax, 132, 4);
                    int iA2 = iA + a(afVar, aaVar, this.ay, iA, 4);
                    a(afVar, aaVar, this.au, iA2 + a(afVar, aaVar, 11, iA2, 4), 4);
                } else {
                    int iA3 = 132 + a(afVar, aaVar, this.av, 132, 4);
                    int iA4 = iA3 + a(afVar, aaVar, this.aw, iA3, 4);
                    int iA5 = iA4 + a(afVar, aaVar, 10, iA4, 4);
                    a(afVar, aaVar, this.ay, iA5 + a(afVar, aaVar, this.ax, iA5, 4), 4);
                }
            }
            if (this.ar != 255) {
                aa aaVar2 = this.f122c;
                if (this.v <= 5000 && !f(26) && ((t.g() >> 9) & 1) != 0) {
                    aaVar2 = this.f123d;
                }
                a(afVar, aaVar2, this.aA, 163 + a(afVar, aaVar2, this.az, 163, 4), 4);
            }
            afVar.translate(-this.aQ, 0);
        }
        afVar.aW();
        if (this.f85O == 0 || f(15)) {
            aa aaVar3 = this.f122c;
            aa aaVar4 = aaVar3;
            int width = (aaVar3.getWidth() + 5) << 1;
            int height = aaVar4.getHeight() + 6;
            this.f146g.c(((this.f95e.eF + this.f95e.gh) - width) - 5, ((this.f95e.eG + this.f95e.gi) - height) - 3, width, height);
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            if (this.ar != 255 && this.v < 10000) {
                z = true;
                i2 = this.az;
                i3 = this.aA;
            } else if (this.as == 0 && this.at < 10) {
                z = true;
                i2 = this.ax;
                i3 = this.ay;
                if (this.au > 0) {
                    i3++;
                    if (i3 >= 10) {
                        i3 -= 10;
                        i2++;
                    }
                }
            }
            if (z) {
                afVar.b(this.f146g, 0);
                afVar.a(this.f146g, -3224882);
                if (i2 == 0 && i3 < 6 && i3 > 0 && !f(26) && ((t.g() >> 9) & 1) != 0) {
                    aaVar4 = this.f123d;
                }
                int i4 = this.f146g.eF + 5;
                int height2 = this.f146g.eG + ((this.f146g.gi - aaVar4.getHeight()) >> 1);
                a(afVar, aaVar4, i3, i4 + a(afVar, aaVar4, i2, i4, height2), height2);
            }
        }
        if (this.p < this.D) {
            String string = t.getString(71 + this.C);
            this.f124i.a(afVar, string, this.f95e.eF + ((this.f95e.gh - this.f124i.stringWidth(string)) >> 1), this.f95e.eG + (this.f119g.cx << 1));
        }
        if (this.p < this.x && this.f93a) {
            int iF = t.f(this.ah - Math.abs(this.ah - this.ai), this.ah);
            int i5 = iF >= 58982 ? 70 : iF >= 49152 ? 69 : iF >= 22937 ? 68 : 67;
            int i6 = this.z;
            r rVar = i6 <= 0 ? this.f118f : i6 <= 32768 ? this.f116d : this.f117e;
            String string2 = t.getString(i5);
            int iStringWidth = this.f95e.eF + ((this.f95e.gh - rVar.stringWidth(string2)) >> 1);
            int i7 = this.f95e.eG + ((this.f95e.gi * 3) >> 2);
            this.f115c.a(afVar, string2, iStringWidth - 1, i7);
            this.f115c.a(afVar, string2, iStringWidth + 1, i7);
            this.f115c.a(afVar, string2, iStringWidth, i7 - 1);
            this.f115c.a(afVar, string2, iStringWidth, i7 + 1);
            rVar.a(afVar, string2, iStringWidth, i7);
        }
        if (this.p < this.f82L) {
            r rVar2 = this.f115c;
            int width2 = this.f134i.getWidth();
            int height3 = this.f134i.getHeight();
            int i8 = (this.f95e.eF + this.f95e.gh) - width2;
            int i9 = ((this.f95e.eG + this.f95e.gi) - 3) - height3;
            afVar.a(this.f134i, i8, i9);
            rVar2.a(afVar, this.f97a, i8 + ((width2 - rVar2.stringWidth(this.f97a)) >> 1), i9 + 2);
            rVar2.a(afVar, this.f98b, i8 + ((width2 - rVar2.stringWidth(this.f98b)) >> 1), i9 + 18);
            if (this.f99c.length() > 0) {
                int width3 = this.f135j.getWidth();
                int height4 = this.f135j.getHeight();
                int i10 = (this.f95e.eF + this.f95e.gh) - width3;
                int i11 = i9 - height4;
                r rVar3 = this.f116d;
                afVar.a(this.f135j, i10, i11);
                rVar3.a(afVar, this.f99c, i10 + ((width3 - rVar3.stringWidth(this.f99c)) >> 1), i11 + 3);
            }
        }
    }

    private void h(int i, int i2) throws IOException {
        this.f78a.a(i, true, this.f79b);
        this.f79b.a(i2, false, this.f78a);
        switch (((m) ((w) this).d).cc) {
            case -1:
            case 0:
                q qVarA = this.f110a.a(this.f79b.br);
                this.aD = qVarA.cv;
                this.aE = qVarA.cw;
                q qVarA2 = this.f110a.a(this.f78a.br);
                this.aB = qVarA2.cv;
                this.aC = qVarA2.cw;
                break;
            case 1:
            case 2:
                this.aD = this.f110a.Q[14];
                this.aE = this.f110a.Q[15];
                this.aB = this.f110a.P[14];
                this.aC = this.f110a.P[15];
                break;
        }
    }

    private boolean d(int i, int i2) throws IOException {
        this.f103e = false;
        switch (this.V) {
            case 0:
            case 1:
            case 11:
                if (t.g() - this.aI >= 300) {
                    switch (i2) {
                        case 131072:
                        case 262144:
                            int i3 = i2 == 131072 ? -1 : 1;
                            this.f146g.c(this.f96f.eF, this.aR, this.f96f.gh, 16);
                            c(this.f146g);
                            this.aF += i3;
                            if (this.aF < 0) {
                                this.aF = this.aG - 1;
                            } else if (this.aF >= this.aG) {
                                this.aF = 0;
                            }
                            if ((this.V == 0 || this.V == 1) && this.aF == 1) {
                                if (f(28) || this.f80a.g == null || this.f80a.g.r != f(4)) {
                                    this.aF += i3;
                                } else {
                                    if ((f(4) ? this.f78a : this.f79b).cC == 0) {
                                        this.aF += i3;
                                    }
                                }
                            } else if (this.V == 11 && this.aF == 1 && ((m) ((w) this).d).cc > 0) {
                                this.aF += i3;
                            }
                            this.aR = this.f96f.eG + 8 + (16 * (this.aF + 1));
                            this.f146g.c(this.f96f.eF, this.aR, this.f96f.gh, 16);
                            c(this.f146g);
                            break;
                        case 524288:
                        case 134217728:
                            this.f103e = true;
                            this.f146g.c(this.f96f.eF, this.aR, this.f96f.gh, 16);
                            c(this.f146g);
                            break;
                        case 268435456:
                            if (this.V != 11) {
                                if (!f(9)) {
                                    if (!f(28)) {
                                        if (this.V != 11) {
                                            if (this.V != 1) {
                                                j(-1);
                                                break;
                                            } else {
                                                j(this.W);
                                                break;
                                            }
                                        } else {
                                            j(1);
                                            break;
                                        }
                                    } else {
                                        j(13);
                                        break;
                                    }
                                } else {
                                    j(14);
                                    break;
                                }
                            } else {
                                this.f103e = true;
                                if (this.aF != 2) {
                                    this.f146g.c(this.f96f.eF, this.aR, this.f96f.gh, 16);
                                    c(this.f146g);
                                    this.aF = 2;
                                }
                                this.f146g.c(this.f96f.eF, this.aR, this.f96f.gh, 16);
                                c(this.f146g);
                                break;
                            }
                    }
                }
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            case 12:
            case 13:
                if (t.g() - this.aI >= 300) {
                    switch (i2) {
                        case 524288:
                        case 134217728:
                            j(-1);
                            break;
                        case 268435456:
                            j(1);
                            break;
                    }
                }
                break;
            case 4:
                if (t.g() - this.aI >= 300) {
                    switch (i2) {
                        case 524288:
                        case 134217728:
                            j(10);
                            break;
                        case 268435456:
                            j(1);
                            break;
                    }
                }
                break;
            case 7:
                if (t.g() - this.aI >= 300) {
                    switch (i2) {
                        case 524288:
                        case 134217728:
                            j(9);
                            break;
                        case 268435456:
                            j(1);
                            break;
                    }
                }
                break;
            case 9:
                if (t.g() - this.aI >= 300) {
                    switch (i2) {
                        case 524288:
                        case 134217728:
                            j(11);
                            break;
                        case 268435456:
                            j(1);
                            break;
                    }
                }
                break;
            case 14:
                switch (i2) {
                    case 524288:
                    case 134217728:
                        if (i != 4096) {
                            ak akVar = this.f80a.g;
                            if (akVar.r == this.f77e.r) {
                                if (!f(14)) {
                                    akVar.c(512, this.p, true);
                                    j(-1);
                                    break;
                                } else {
                                    this.R = this.Q;
                                    c(14, false);
                                    this.Q = ((w) this).d.o(65536);
                                    c(13, ((w) this).d.o(2) == 1);
                                    break;
                                }
                            }
                        }
                        break;
                    case 268435456:
                        j(0);
                        break;
                }
            case 15:
                l lVar = (l) this.f140a.b(-1964401314);
                switch (i2) {
                    case 131072:
                        lVar.J();
                        this.f140a.repaint();
                        break;
                    case 262144:
                        lVar.I();
                        this.f140a.repaint();
                        break;
                    case 524288:
                    case 134217728:
                    case 268435456:
                        j(-1);
                        break;
                }
        }
        return false;
    }

    private void l(int i) throws IOException {
        ((m) ((w) this).d).a(i, false, false);
    }

    /* renamed from: j, reason: collision with other method in class */
    private boolean m29j() throws IOException {
        if (!this.f103e || (this.V != 0 && this.V != 1)) {
            if (!this.f103e || this.V != 11) {
                return false;
            }
            this.f103e = false;
            switch (this.aF) {
                case 0:
                    l(27);
                    break;
                case 1:
                    if (((m) ((w) this).d).cc <= 0) {
                        r(t.g());
                        j(-1);
                        break;
                    }
                    break;
                case 2:
                    j(-1);
                    this.f102d = true;
                    v.c(v.b(((m) ((w) this).d).cc));
                    break;
            }
            return true;
        }
        this.f103e = false;
        switch (this.aF) {
            case 0:
                if (!f(9)) {
                    if (!f(28)) {
                        if (this.V != 1) {
                            j(-1);
                            break;
                        } else {
                            j(this.W);
                            break;
                        }
                    } else {
                        j(13);
                        break;
                    }
                } else {
                    j(14);
                    break;
                }
            case 1:
                a(f(4), this.p);
                d(131072, 131072);
                break;
            case 2:
                l(35);
                break;
            case 3:
                l(27);
                break;
            case 4:
                l(9);
                break;
            case 5:
                l(13);
                break;
            case 6:
                ((m) ((w) this).d).a(this, 138, 139, 1);
                break;
        }
        return true;
    }

    private boolean e(int i, int i2) throws IOException {
        switch (i) {
            case 4096:
                if (!f(7)) {
                    this.f77e.ap = true;
                    if (this.A != 0 || this.f80a.b(this.f77e.r)) {
                        if (this.f77e.r == (this.A == 1) || this.A == 0) {
                            m(-1);
                            break;
                        }
                    }
                    o(this.p);
                    break;
                }
                break;
            default:
                switch (i2) {
                    case 32768:
                        m28a(1, true);
                        break;
                    case 65536:
                        m28a(2, true);
                        break;
                    case 131072:
                        m28a(4, true);
                        break;
                    case 262144:
                        m28a(8, true);
                        break;
                    case 524288:
                    case 134217728:
                        if (!f(7)) {
                            if (this.f80a.g != this.f77e) {
                                if (this.f80a.g == null || this.f80a.g.r != this.f77e.r || this.f80a.g.a.f2a != 5) {
                                    this.f77e.ap = true;
                                    switch (this.f77e.N()) {
                                        case 0:
                                            r();
                                            break;
                                        case 1:
                                            this.f77e.c(8, this.p, true);
                                            break;
                                        default:
                                            m(-1);
                                            break;
                                    }
                                } else {
                                    q();
                                    if (f(11)) {
                                        z();
                                        break;
                                    }
                                }
                            } else if (this.f80a.g.Q() != 7) {
                                if (!f(11)) {
                                    this.f77e.ap = true;
                                    this.f81K = this.p;
                                    break;
                                } else {
                                    z();
                                    u();
                                    break;
                                }
                            } else {
                                this.f80a.g.c(1, this.p, true);
                                break;
                            }
                        } else if (this.D != -1) {
                            d(true);
                            break;
                        }
                        break;
                    case 1048576:
                        m28a(16, true);
                        break;
                    case 2097152:
                        m28a(32, true);
                        break;
                    case 4194304:
                        m28a(64, true);
                        break;
                    case 8388608:
                        m28a(128, true);
                        break;
                    case 16777216:
                        this.f77e.ap = true;
                        m(-1);
                        break;
                    case 33554432:
                        t();
                        break;
                    case 67108864:
                        s();
                        break;
                }
        }
        return true;
    }

    /* renamed from: f, reason: collision with other method in class */
    private boolean m30f(int i, int i2) throws IOException {
        switch (i) {
            case 4096:
                break;
            default:
                switch (i2) {
                    case 32768:
                        m28a(1, false);
                        break;
                    case 65536:
                        m28a(2, false);
                        break;
                    case 131072:
                        m28a(4, false);
                        break;
                    case 262144:
                        m28a(8, false);
                        break;
                    case 524288:
                    case 134217728:
                        if (this.f80a.g == this.f77e && !f(11)) {
                            if (this.p - this.f81K <= 500) {
                                n(this.p);
                            } else {
                                if (((m) ((w) this).d).d(22) != 0) {
                                    this.f77e.bo();
                                } else {
                                    this.f77e.c(1, this.p, false);
                                }
                                D();
                            }
                        }
                        this.f81K = 0;
                        break;
                    case 1048576:
                        m28a(16, false);
                        break;
                    case 2097152:
                        m28a(32, false);
                        break;
                    case 4194304:
                        m28a(64, false);
                        break;
                    case 8388608:
                        m28a(128, false);
                        break;
                }
        }
        return true;
    }

    private void d(boolean z) {
        ak akVarB;
        ak akVarB2;
        if (f(8)) {
            return;
        }
        c(8, true);
        c(30, false);
        if (f(4)) {
            akVarB = this.f78a.b(4);
            akVarB2 = this.f79b.b(4);
            this.f80a.a(false, false, akVarB, akVarB2);
        } else {
            akVarB = this.f79b.b(4);
            akVarB2 = this.f78a.b(4);
            this.f80a.a(false, false, akVarB2, akVarB);
        }
        if (z) {
            akVarB.c(1024, this.p, true);
            akVarB2.c(2048, this.p, true);
        } else {
            akVarB2.c(1024, this.p, true);
            akVarB.c(2048, this.p, true);
        }
    }

    private void m(int i) {
        if (f(7)) {
            return;
        }
        ak akVar = this.f80a.g;
        if (akVar == null || akVar.r != this.f77e.r) {
            a(true);
            y();
        } else if (akVar == this.f77e) {
            n(this.p);
        } else if (akVar.a.f2a == 5 && (akVar.gt & 32) == 0) {
            n(this.p);
        }
    }

    /* renamed from: k, reason: collision with other method in class */
    public static boolean m31k() {
        return true;
    }

    public final void p() {
        c(0, false);
    }

    private void q() {
        if (f(7)) {
            return;
        }
        ak akVar = this.f80a.g;
        if (akVar == null || akVar.r != this.f77e.r) {
            a(true);
            y();
            return;
        }
        if (akVar == this.f77e) {
            akVar.n = f(4) ? this.f78a.a(this.r) : this.f79b.a(this.r);
        } else if (!m31k()) {
            return;
        } else {
            akVar.n = this.f77e;
        }
        b(false);
        if (akVar.a.f2a != 5 || (akVar.gt & 32) == 0) {
            akVar.c(4, this.p, true);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private void m32b(int i, boolean z) {
        if (this.A == 0) {
            return;
        }
        if ((this.f77e.r == (this.A == 1)) == z) {
            this.f77e.ap = true;
            this.f77e.c(i, this.p, true);
        }
    }

    private void r() {
        m32b(16, false);
    }

    private void s() {
        m32b(16384, true);
    }

    private void t() {
        m32b(128, true);
    }

    private void u() {
        int i = this.f77e.f48a;
        if (i == 2 || i == 0) {
            ak akVarA = m21b(this.f77e).a(this.r);
            b(false);
            this.f77e.n = akVarA;
            this.f77e.c(4, this.p, true);
        }
    }

    private void v() {
        if (this.f83M == 0) {
            return;
        }
        ak akVarA = this.f83M > 0 ? this.f78a.a(this.f83M - 1) : this.f79b.a((-this.f83M) - 1);
        ak akVar = akVarA;
        ad adVar = akVarA.f46a;
        this.f97a = new StringBuffer().append(t.getString(62)).append(adVar.eR).append(" ").append(adVar.q.charAt(0)).append(". ").append(adVar.r).toString();
        if (akVar.aj[13] >= 6) {
            this.f98b = t.getString(66);
        } else {
            this.f98b = t.getString(48 + this.U);
        }
        if (this.U < 9) {
            this.f99c = "";
            return;
        }
        int i = akVar.r ? this.f78a.cA : this.f79b.cA;
        String string = t.getString(65);
        String string2 = t.getString(64);
        String string3 = t.getString(65);
        int[] iArr = akVar.aj;
        if (i >= 5) {
            this.f99c = new StringBuffer().append(t.getString((37 + iArr[13]) - 1)).append(" ").append(string).append(".  ").append(string3).toString();
        } else if (i == 0) {
            this.f99c = new StringBuffer().append(t.getString((37 + iArr[13]) - 1)).append(string).append(".").toString();
        } else {
            this.f99c = new StringBuffer().append(t.getString((37 + iArr[13]) - 1)).append(string).append(". ").append(t.getString((37 + i) - 1)).append(" ").append(string2).toString();
        }
    }

    private void w() {
        this.an = 0;
    }

    private void i(int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < 10) {
            ak akVarA = i3 < 5 ? this.f78a.a(i3) : this.f79b.a(i3 - 5);
            if (akVarA.y()) {
                int i4 = i3 + 1;
                while (i4 < 10) {
                    akVarA.a(i4 < 5 ? this.f78a.a(i4) : this.f79b.a(i4 - 5), i);
                    i4++;
                }
            }
            i3++;
        }
    }

    private ak b() {
        if (this.r != -1) {
            return f(4) ? this.f78a.a(this.r) : this.f79b.a(this.r);
        }
        return null;
    }

    private void x() {
        m mVar = (m) ((w) this).d;
        this.I = 0;
        for (int i = 2; i <= 10; i++) {
            if (mVar.d(i) != 0) {
                this.I |= 1 << i;
            }
        }
        for (int i2 = 12; i2 <= 13; i2++) {
            if (mVar.d(i2) != 0) {
                this.I |= 1 << i2;
            }
        }
    }

    private void y() {
        if ((this.an & 255) != 0) {
            this.f77e.ap = true;
        }
    }

    private void n(int i) {
        if (f(11) || null == this.f80a.g || !this.f80a.g.z()) {
            return;
        }
        A();
        c(11, true);
        p(this.f80a.g.gk);
        this.Y = i;
        this.Z = 0;
        this.f77e.ap = true;
        v(4);
    }

    private void z() {
        if (f(11)) {
            c(11, false);
        }
    }

    private void o(int i) {
        if (f(12) || this.f77e == null) {
            return;
        }
        z();
        c(12, true);
        p(this.f77e.gk);
        this.Y = i;
        this.Z = 0;
        this.f77e.ap = true;
        v(7);
    }

    private void A() {
        c(12, false);
    }

    public final void B() {
        if (this.Z > 250) {
            this.Z = 250;
        }
    }

    private void p(int i) {
        s sVar = this.f77e.r ? this.f78a : this.f79b;
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i2 < 4; i3++) {
            ak akVarA = sVar.a(i3);
            if (i3 != i) {
                this.k[i2] = i3;
                if (this.f80a.g == null || !f(11)) {
                    this.l[i2] = 65536;
                } else {
                    this.f148Q.b(akVarA.aC, this.f80a.g.aC);
                    this.l[i2] = a(akVarA, this.f148Q.length());
                }
                i2++;
            }
        }
    }

    private void q(int i) throws IOException {
        if (m33l()) {
            int i2 = 0;
            while (i2 < 2) {
                s sVar = i2 == 0 ? this.f78a : this.f79b;
                short s = 0;
                short s2 = -1;
                short s3 = 0;
                while (true) {
                    short s4 = s3;
                    if (s4 >= 5) {
                        break;
                    }
                    this.f71a[s4] = s4;
                    if (this.f86a[i2][s4] != this.f88c[i2][s4]) {
                        if (!a(this.f86a[i2][s4])) {
                            s2 = this.f86a[i2][s4];
                        }
                        if (b(this.f88c[i2][s4], sVar.r, false) <= -1) {
                            short[] sArr = this.f71a;
                            short s5 = s;
                            sArr[s5] = (short) (sArr[s5] ^ this.f71a[s4]);
                            short[] sArr2 = this.f71a;
                            sArr2[s4] = (short) (sArr2[s4] ^ this.f71a[s]);
                            short[] sArr3 = this.f71a;
                            short s6 = s;
                            sArr3[s6] = (short) (sArr3[s6] ^ this.f71a[s4]);
                            s = (short) (s + 1);
                        }
                    }
                    s3 = (short) (s4 + 1);
                }
                for (int i3 = 0; i3 < 5; i3++) {
                    short s7 = this.f71a[i3];
                    if (this.f86a[i2][s7] != this.f88c[i2][s7] && s2 != this.f86a[i2][s7] && s2 != this.f88c[i2][s7]) {
                        short s8 = this.f86a[i2][s7];
                        short s9 = this.f88c[i2][s7];
                        short sB = b(s9, sVar.r, false);
                        if (sB >= 0) {
                            this.f72b[this.f74a] = s9;
                            this.f73c[this.f74a] = s8;
                            this.f74a = (short) (this.f74a + 1);
                            a((int) s7, (int) sB, sVar.r, false);
                        } else {
                            short sA = a(s9, sVar.r, false);
                            short[] sArr4 = this.f86a[i2];
                            sArr4[sA] = (short) (sArr4[sA] ^ this.f86a[i2][s7]);
                            short[] sArr5 = this.f86a[i2];
                            sArr5[s7] = (short) (sArr5[s7] ^ this.f86a[i2][sA]);
                            short[] sArr6 = this.f86a[i2];
                            sArr6[sA] = (short) (sArr6[sA] ^ this.f86a[i2][s7]);
                        }
                        sVar.n(s9, s8);
                    }
                }
                i2++;
            }
            g(4);
        }
    }

    /* renamed from: l, reason: collision with other method in class */
    private boolean m33l() {
        if (this.f74a != 0) {
            return false;
        }
        for (int i = 0; i < 5; i++) {
            if (this.f88c[0][i] != this.f86a[0][i] || this.f88c[1][i] != this.f86a[1][i]) {
                return true;
            }
        }
        return false;
    }

    private void r(int i) throws IOException {
        this.f78a.Z();
        this.f79b.Z();
        this.aq = i;
        this.ao = 0;
        this.p = 0;
        this.t = -1;
        this.E = 0;
        this.F = 0;
        this.f101c = false;
        this.f102d = false;
        c(27, false);
        this.f139g.setVisible(false);
        this.J = 0;
        this.f81K = 0;
        this.f78a.a(this.f86a[0]);
        this.f78a.b(this.f87b[0]);
        this.f78a.a(this.f88c[0]);
        this.f78a.b(this.f89d[0]);
        this.f79b.a(this.f86a[1]);
        this.f79b.b(this.f87b[1]);
        this.f79b.a(this.f88c[1]);
        this.f79b.b(this.f89d[1]);
        o();
        F();
        G();
        repaint();
    }

    private void C() throws IOException {
        for (int i = 0; i < 31; i++) {
            int i2 = i * aX;
            this.n[i2 + aU] = b[i];
            this.f144b[i] = false;
            DataInputStream dataInputStreamM48a = t.m48a(316, 9 + i);
            this.n[i2 + aV] = dataInputStreamM48a.readInt();
            this.f145a[i] = new int[this.n[i2 + aV] * bb];
            for (int i3 = 0; i3 < this.n[i2 + aV]; i3++) {
                int i4 = i3 * bb;
                this.f145a[i][i4 + aY] = dataInputStreamM48a.readInt();
                this.f145a[i][i4 + aZ] = t.e(dataInputStreamM48a.readInt(), 65536000) >> 16;
                this.f145a[i][i4 + ba] = dataInputStreamM48a.readBoolean() ? 1 : 0;
                if (this.f145a[i][i4 + ba] != 0) {
                    this.f144b[i] = true;
                }
            }
        }
    }

    public final int b(int i) {
        return this.n[(i * aX) + aU];
    }

    public final int a(int i, int i2, int i3) {
        int i4 = i * aX;
        int i5 = this.n[i4 + aV];
        int i6 = this.n[i4 + aU];
        this.n[i4 + aW] = 0;
        boolean z = false;
        if (i2 > i6) {
            if (!this.f144b[i]) {
                return 0;
            }
            i2 %= i6;
            i3 %= i6;
            z = true;
        } else if (i3 > i6 && this.f144b[i]) {
            i3 %= i6;
        }
        int i7 = -1;
        if (i2 < i3) {
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = i8 * bb;
                if ((!z || this.f145a[i][i9 + ba] != 0) && this.f145a[i][i9 + aZ] >= i2 && this.f145a[i][i9 + aZ] < i3) {
                    if (i7 == -1) {
                        this.n[i4 + aW] = i8;
                    }
                    i7 = i8;
                }
            }
            return (i7 - this.n[i4 + aW]) + 1;
        }
        if (i2 <= i3) {
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 * bb;
                if ((!z || this.f145a[i][i11 + ba] != 0) && this.f145a[i][i11 + aZ] == i2) {
                    if (i7 == -1) {
                        this.n[i4 + aW] = i10;
                    }
                    i7 = i10;
                }
            }
            return (i7 - this.n[i4 + aW]) + 1;
        }
        for (int i12 = 0; i12 < i5; i12++) {
            int i13 = i12 * bb;
            if (this.f145a[i][i13 + aZ] >= i2) {
                if (i7 == -1) {
                    this.n[i4 + aW] = i12;
                }
                i7 = i12;
            } else if (this.f145a[i][i13 + aZ] < i3 && this.f145a[i][i13 + ba] != 0) {
                if (i7 == -1) {
                    this.n[i4 + aW] = i12;
                }
                i7 = i12;
            }
        }
        return i7 >= this.n[i4 + aW] ? (i7 - this.n[i4 + aW]) + 1 : i7 + (i5 - this.n[i4 + aW]);
    }

    /* renamed from: b, reason: collision with other method in class */
    private int m34b(int i, int i2, int i3) {
        int i4 = i * aX;
        int i5 = this.n[i4 + aV];
        int i6 = this.n[i4 + aW] + i2;
        int i7 = i6;
        if (i6 >= i5) {
            i7 -= i5;
        }
        return this.f145a[i][(i7 * bb) + i3];
    }

    /* renamed from: b, reason: collision with other method in class */
    public final int m35b(int i, int i2) {
        return m34b(i, i2, aY);
    }

    private void c(int i, boolean z) {
        this.ae &= (1 << i) ^ (-1);
        this.ae |= z ? 1 << i : 0;
    }

    private boolean f(int i) {
        return (this.ae & (1 << i)) != 0;
    }

    private void s(int i) {
        if (((m) ((w) this).d).d(22) != 0 && this.f93a) {
            if (this.aj >= 0) {
                this.aj += i;
            }
            if (this.aj >= 2000 || !(this.f80a.g == this.f77e || this.f80a.f198a == 0)) {
                this.f93a = false;
            }
        }
    }

    public final void e(boolean z) {
        this.f93a = z;
        if (!z) {
            this.aj = -1;
            this.x = -1;
            return;
        }
        int iL = this.f77e.L();
        this.ak = Math.min(Math.max(16384, 16384 + t.e(32768, 65536 - iL)), 49152);
        int[] iArr = {0, 13107, 32768, 52429, 65536};
        int iF = t.f(65536, t.e(iL, 65536));
        int iF2 = t.f(32768, 65536);
        int i = 0;
        int iE = 65536 - t.e(iL, 98304);
        int iE2 = 65536 - t.e(iL, 32768);
        for (int i2 = 0; i2 < 4; i2++) {
            if (iArr[i2] >= iE && iArr[i2] <= iE2) {
                this.m[i2] = 65536 - (t.e(65536 - iArr[i2], iF) - iF2);
            } else if (iArr[i2] < iE || i >= 65536) {
                this.m[i2] = 0;
            } else {
                this.m[i2] = 65536;
            }
            if (this.m[i2] > 0) {
                int[] iArr2 = this.m;
                int i3 = i2;
                iArr2[i3] = iArr2[i3] - i;
            }
            i += this.m[i2];
        }
        if (i < 65536) {
            this.m[4] = 65536 - i;
        } else {
            this.m[4] = 0;
        }
        this.O.h(this.f77e.t ? 833867 : -833867, 199753, 0);
        this.f91a.setFrame(0);
        if (!a(this.f77e.aC, this.N)) {
            b(this.f77e.aC, this.N);
        }
        this.af = t.m53a(this.N.eF);
        this.ag = t.m53a(this.N.eG);
        if (!a(this.O, this.N)) {
            b(this.O, this.N);
        }
        this.ag -= this.f91a.getHeight();
        if (this.af < t.m53a(this.N.eF)) {
            this.af -= this.f91a.getWidth() << 1;
        } else {
            this.af += this.f91a.getWidth();
        }
        if (this.ag < this.f95e.eG) {
            this.ag = this.f95e.eG;
        } else if (this.ag + this.f91a.getHeight() >= this.f95e.eG + this.f95e.gi) {
            this.ag = (this.f95e.eG + this.f95e.gh) - this.f91a.getHeight();
        }
        if (this.af < this.f95e.eF) {
            this.af = this.f95e.eF;
        } else if (this.af + this.f91a.getWidth() >= this.f95e.eF + this.f95e.gh) {
            this.af = (this.f95e.eF + this.f95e.gh) - this.f91a.getWidth();
        }
    }

    public final void t(int i) {
        this.ah = i;
        this.ai = 0;
    }

    public final void u(int i) {
        if (this.aj < 0) {
            this.ai = i;
        }
    }

    public final void D() {
        if (this.ah > 0) {
            this.aj = 0;
            this.x = this.p + 2000;
            this.z = 65536 - this.f77e.a((int[]) null, false);
            if (t.f(this.ah - Math.abs(this.ah - this.ai), this.ah) >= 58982) {
                this.f80a.aL();
            }
        }
    }

    private void f(af afVar) {
        if (this.f93a) {
            int i = this.ai;
            if (this.ai > this.ah) {
                i = (this.ah << 1) - this.ai;
            }
            int iF = t.f(i, this.ah);
            this.f91a.setFrame(0);
            this.f91a.a(afVar, this.af, this.ag);
            this.f91a.setFrame(1);
            this.f75c.h(this.f91a.B);
            this.f75c.eF += this.af;
            this.f75c.eG += this.ag;
            int i2 = this.f75c.gi;
            afVar.aV();
            this.f76d.h(this.f75c);
            this.f76d.eG += t.m53a((65536 - iF) * this.f76d.gi);
            this.f76d.gi = t.m53a(this.f76d.gi * iF);
            afVar.g(this.f76d);
            for (int i3 = 0; i3 < 5; i3++) {
                afVar.aV();
                this.f75c.gi = t.m53a(i2 * this.m[i3]);
                this.f91a.setFrame(i3 + 1);
                if (this.f75c.gi > 0) {
                    afVar.f(this.f76d);
                    if (this.f76d.gi > 0 && this.f76d.c(this.f75c)) {
                        afVar.g(this.f76d);
                        this.f91a.a(afVar, this.af, this.ag);
                    }
                }
                this.f75c.eG += this.f75c.gi;
                afVar.aW();
            }
            afVar.aW();
            if (iF >= 58982) {
                afVar.a(this.f92a, this.af, this.ag);
            }
        }
    }

    public final void v(int i) {
        if (((m) ((w) this).d).d(20) == 0 || (this.ab & (1 << i)) != 0) {
            return;
        }
        this.aa |= 1 << i;
    }

    private void E() throws IOException {
        for (int i = 0; i < 8; i++) {
            if ((this.aa & (1 << i)) != 0) {
                this.ab |= 1 << i;
                this.aa &= (1 << i) ^ (-1);
                this.ac = i;
                j(15);
                return;
            }
        }
    }

    private static void a(int i, StringBuffer stringBuffer) {
        if (i >= 1000) {
            i = 999;
        }
        stringBuffer.setLength(0);
        for (int i2 = i >= 100 ? 100 : i >= 10 ? 10 : 1; i2 > 0; i2 /= 10) {
            int i3 = i / i2;
            i -= i3 * i2;
            if (i3 < 10) {
                stringBuffer.append(f153a[i3]);
            }
        }
    }

    private void F() {
        a(this.f78a.cB, this.f150a);
        this.f151e = this.f150a.toString();
    }

    private void G() {
        a(this.f79b.cB, this.f150a);
        this.f152f = this.f150a.toString();
    }

    private static String a(String str, int i, r rVar) {
        for (int length = str.length(); rVar.stringWidth(str) > i && length > 0; length--) {
            if (length >= 3) {
                str = new StringBuffer().append(str.substring(0, length - 3)).append("...").toString();
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v25, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v27, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v29, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v31, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v33, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v35, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v39, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [byte[][], byte[][][]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [byte[][], byte[][][]] */
    static {
        int[] iArr = {new int[]{16765980, 14825278}, new int[]{12293972, 33609}, new int[]{15885617, 481929}, new int[]{13439041, 465185}, new int[]{10059085, 12001081}, new int[]{27575, 9821}, new int[]{16627752, 4952268}, new int[]{15537739, 27575}, new int[]{16359452, 10848}, new int[]{13504065, 2235935}, new int[]{16694068, 9821}, new int[]{15537995, 27575}, new int[]{16627751, 5514627}, new int[]{6458043, 9821}, new int[]{16359451, 12528695}, new int[]{12849456, 681278}, new int[]{32851, 20612}, new int[]{13439041, 9821}, new int[]{37810, 2505111}, new int[]{16019234, 31425}, new int[]{32198, 465185}, new int[]{13151092, 27575}, new int[]{16359451, 4073088}, new int[]{14825278, 2235935}, new int[]{3750294, 465185}, new int[]{11713214, 2301728}, new int[]{16695841, 24625}, new int[]{3750295, 13504065}, new int[]{7122655, 9821}, new int[]{12154950, 20612}};
        byte[][] bArr = {new byte[]{new byte[]{29, 35}, new byte[]{27, 9}, new byte[]{27, 9}, new byte[]{27, 9}, new byte[]{27, 9}, new byte[]{46, 15}, new byte[]{46, 15}, new byte[]{46, 15}, new byte[]{29, 4}, new byte[]{29, 4}, new byte[]{37, 8}, new byte[]{37, 8}, new byte[]{28, 35}, new byte[]{28, 35}}, new byte[]{new byte[]{41, 33}, new byte[]{37, 9}, new byte[]{37, 9}, new byte[]{37, 9}, new byte[]{37, 9}, new byte[]{33, 13}, new byte[]{33, 13}, new byte[]{33, 13}, new byte[]{36, 3}, new byte[]{36, 3}, new byte[]{23, 9}, new byte[]{23, 9}, new byte[]{25, 38}, new byte[]{25, 38}}, new byte[]{new byte[]{34, 30}, new byte[]{35, 8}, new byte[]{35, 8}, new byte[]{35, 8}, new byte[]{35, 8}, new byte[]{17, 15}, new byte[]{17, 15}, new byte[]{17, 15}, new byte[]{34, 3}, new byte[]{34, 3}, new byte[]{26, 11}, new byte[]{26, 11}, new byte[]{36, 39}, new byte[]{36, 39}}, new byte[]{new byte[]{23, 31}, new byte[]{27, 8}, new byte[]{27, 8}, new byte[]{27, 8}, new byte[]{27, 8}, new byte[]{31, 17}, new byte[]{31, 17}, new byte[]{31, 17}, new byte[]{28, 4}, new byte[]{28, 4}, new byte[]{41, 10}, new byte[]{41, 10}, new byte[]{37, 36}, new byte[]{37, 36}}};
    }
}
