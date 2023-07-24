.class public Le/h/d/a/a/s/q0;
.super Le/h/d/a/a/s/r0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 1
    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "walletId = ?"

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Le/h/d/a/a/s/r0;-><init>(Le/h/d/a/a/s/e;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
