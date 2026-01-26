package defpackage;

import java.io.IOException;

/* loaded from: EA.Mobile.NBA.LIVE.08.v4.3.16.S60v2.J2ME.Retail-BiNPDA - Mastiwap.Com.jar:j.class */
public final class j extends u {
    private int bt;
    private boolean h;

    public j(t tVar) {
        super(tVar, 0);
        this.dM = 1004;
    }

    @Override // defpackage.u
    public final boolean a(int i, int i2) throws IOException {
        if (t.g() <= this.bt) {
            return true;
        }
        switch (i2) {
            case 524288:
            case 134217728:
            case 268435456:
                this.h = true;
                break;
        }
        return true;
    }

    @Override // defpackage.u
    public final boolean b(int i, int i2) throws IOException {
        switch (i2) {
            case 524288:
            case 134217728:
            case 268435456:
                if (this.h) {
                    ((w) this).d.c(this);
                    aH();
                    break;
                }
                break;
        }
        return true;
    }

    public final void a(String str, String str2, String str3) throws IOException {
        u uVar = (u) b(-246695179);
        g gVar = (g) uVar.b(127410583);
        g gVar2 = (g) uVar.b(-1634635731);
        g gVar3 = (g) uVar.b(-376028997);
        gVar.a(str, true);
        gVar2.a(str2, true);
        gVar3.a(str3, true);
        uVar.aG();
        uVar.r(uVar.B() + 20, uVar.C() + 20);
        u uVar2 = (u) uVar.b(-1159027257);
        uVar2.setPosition((uVar.B() - uVar2.B()) >> 1, (uVar.C() - uVar2.C()) >> 1);
        repaint();
    }

    @Override // defpackage.u, defpackage.w
    public final void f() throws IOException {
        super.f();
        this.bt = t.g() + 150;
    }
}
