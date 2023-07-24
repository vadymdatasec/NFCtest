.class public Le/h/d/a/a/s/k0/c0;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lfr/mbs/binary/Octets;

.field public final b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;


# direct methods
.method public constructor <init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/c0;->a:Lfr/mbs/binary/Octets;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/c0;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 5

    .line 2
    new-instance v0, Le/h/d/a/a/s/k0/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/b;-><init>(Z)V

    iget-object v2, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    iget-object v3, p0, Le/h/d/a/a/s/k0/c0;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v2, v3}, Le/h/d/a/a/s/k0/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Landroid/content/ContentValues;

    move-result-object v0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "walletId = ? AND cipheredId = ? AND zoneId = ? AND "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "userId"

    invoke-virtual {p0, v4, v3}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/String;

    .line 4
    iget-object v4, p0, Le/h/d/a/a/s/k0/c0;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v1, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v3, v4

    iget-object v1, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v3, v4

    iget-object v1, p0, Le/h/d/a/a/s/k0/c0;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lm/a/a/c/a;->a([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const-string v3, "badge"

    .line 5
    invoke-virtual {p1, v3, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method
