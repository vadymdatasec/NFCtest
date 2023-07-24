.class public final enum Le/h/d/a/a/o/a/g;
.super Le/h/d/a/a/o/a/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILfr/mbs/binary/Octets;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Le/h/d/a/a/o/a/j;-><init>(Ljava/lang/String;ILfr/mbs/binary/Octets;Le/h/d/a/a/o/a/d;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/o/a/b;
    .locals 7

    .line 1
    new-instance v6, Le/h/d/a/a/o/a/s;

    sget-object v1, Le/h/d/a/a/o/a/m;->d:Le/h/d/a/a/o/a/m;

    move-object v0, v6

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/o/a/s;-><init>(Le/h/d/a/a/o/a/m;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object v6
.end method
