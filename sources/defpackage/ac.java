package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:ac.class */
public final class ac extends w {
    private aa h;
    private int p;
    private int eI;
    public int eJ;
    private int bf;
    private int be;
    private int bh;
    private int bg;
    private int eC;
    private int eD;
    private int eK;

    public ac(t tVar) {
        super(tVar);
        this.eC = -1;
        this.dL = 2;
    }

    @Override // defpackage.w
    public final void b(af afVar) {
        super.b(afVar);
        if (this.h != null) {
            afVar.translate(this.x.eF, this.x.eG);
            afVar.translate(this.w.eF, this.w.eG);
            this.h.a(afVar);
            afVar.translate(-this.w.eF, -this.w.eG);
            afVar.translate(-this.x.eF, -this.x.eG);
        }
    }

    @Override // defpackage.w
    public final void c(DataInputStream dataInputStream) throws IOException {
        this.eI = dataInputStream.readShort();
        this.eJ = dataInputStream.readShort();
        this.bf = dataInputStream.readShort();
        this.be = dataInputStream.readShort();
        this.bh = dataInputStream.readShort();
        this.bg = dataInputStream.readShort();
        this.eC = dataInputStream.readByte();
        this.eD = dataInputStream.readByte();
        this.eK = dataInputStream.readByte();
        dataInputStream.readBoolean();
        this.p = 0;
    }

    @Override // defpackage.w
    public final void f() throws IOException {
        if (this.eK == 1) {
            this.h = ((w) this).d.b(this.eI, this.eJ, this.bf, this.be, this.bh, this.bg);
        } else {
            this.h = ((w) this).d.a(this.eI, this.eJ, this.bf, this.be, this.bh, this.bg);
        }
        this.h.A(this.eC, this.p);
        this.h.l(this.p);
        this.h.setFrame(this.eD);
        ai aiVar = this.h.A;
        this.h.setPosition(-aiVar.eF, -aiVar.eG);
        r(this.h.getWidth(), this.h.getHeight());
    }

    @Override // defpackage.w
    public final void g() throws IOException {
        this.h = null;
    }
}
