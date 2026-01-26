package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:g.class */
public final class g extends w {
    public r j;
    private String g;
    private int bc;
    private int bd;
    public int be;
    public int bf;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;

    /* renamed from: g, reason: collision with other field name */
    private boolean f154g;
    private int bm;

    public g(t tVar) {
        super(tVar);
        this.bl = -1;
        this.f154g = true;
        this.dL = 1;
    }

    public g(t tVar, int[] iArr) {
        super(tVar);
        this.bi = iArr[3];
        this.bl = iArr[4];
        this.f154g = iArr[11] != 0;
        this.bc = iArr[5];
        this.bd = iArr[6];
        this.be = iArr[7];
        this.bf = iArr[8];
        this.bg = iArr[9];
        this.bh = iArr[10];
        this.g = null;
        this.dL = 1;
    }

    public final void a(String str, boolean z) throws IOException {
        if (str == null) {
            return;
        }
        if (str != this.g) {
            this.g = new String(str);
            int iIndexOf = str.indexOf("%version");
            if (iIndexOf >= 0) {
                this.g = new StringBuffer().append(str.substring(0, iIndexOf)).append(((w) this).d.f164a.getAppProperty("MIDlet-Version")).append(str.substring(iIndexOf + 8)).toString();
            }
            this.g.length();
            this.bl = -1;
        }
        if (!z || this.j == null) {
            return;
        }
        this.bj = this.j.stringWidth(str) + 2;
        if (this.bi == 1) {
            this.bj++;
        }
        this.bk = this.j.cx;
        r(this.bj, this.bk);
    }

    public final void d(int i, boolean z) throws IOException {
        this.bl = i;
        if (i == -1) {
            a("", z);
        } else {
            a(t.getString(i), z);
        }
    }

    @Override // defpackage.w
    public final void b(af afVar) {
        int iStringWidth;
        super.b(afVar);
        afVar.translate(this.x.eF, this.x.eG);
        afVar.translate(this.w.eF, this.w.eG);
        String str = this.g;
        String str2 = str;
        if (str != null || this.bl < 0) {
            iStringWidth = this.bj - 2;
        } else {
            String string = t.getString(this.bl);
            str2 = string;
            string.length();
            iStringWidth = this.j.stringWidth(str2);
        }
        if (str2 != null) {
            int i = 1;
            switch (this.bi) {
                case 1:
                    i = ((this.bj - iStringWidth) + 1) >> 1;
                    break;
                case 2:
                    i = this.bj - iStringWidth;
                    break;
            }
            this.j.a(afVar, str2, i, 1);
        }
        afVar.translate(-this.w.eF, -this.w.eG);
        afVar.translate(-this.x.eF, -this.x.eG);
    }

    @Override // defpackage.w
    public final void c(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.bi = dataInputStream.readShort();
        this.bl = dataInputStream.readShort();
        this.bc = dataInputStream.readShort();
        this.bd = dataInputStream.readShort();
        this.be = dataInputStream.readShort();
        this.bf = dataInputStream.readShort();
        this.bg = dataInputStream.readShort();
        this.bh = dataInputStream.readShort();
        this.f154g = dataInputStream.readBoolean();
        this.bm = this.bl;
    }

    @Override // defpackage.w
    public final void f() throws IOException {
        this.j = ((w) this).d.m52a(this.bd, this.bc, this.bf, this.be, this.bh, this.bg);
        if (this.bl >= 0) {
            d(this.bl, this.f154g);
        } else {
            a(this.g, this.f154g);
        }
    }

    @Override // defpackage.w
    public final void g() {
        this.g = null;
        this.j = null;
        this.bl = this.bm;
    }
}
