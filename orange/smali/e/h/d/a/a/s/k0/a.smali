.class public Le/h/d/a/a/s/k0/a;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public final b:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/util/Date;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/a;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/a;->b:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 4

    .line 2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v1, p0, Le/h/d/a/a/s/k0/a;->b:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "regenerationDate"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 4
    iget-object v2, p0, Le/h/d/a/a/s/k0/a;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Le/h/d/a/a/s/k0/a;->a:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "badge"

    const-string v3, "cipheredId = ? AND zoneId = ?"

    .line 5
    invoke-virtual {p1, v2, v0, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method
