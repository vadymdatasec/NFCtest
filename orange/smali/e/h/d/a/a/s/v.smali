.class public Le/h/d/a/a/s/v;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public a:Le/h/d/a/a/s/z;

.field public final b:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/z;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/v;->a:Le/h/d/a/a/s/z;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/v;->b:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v1, p0, Le/h/d/a/a/s/v;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cipheredId"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Le/h/d/a/a/s/v;->a:Le/h/d/a/a/s/z;

    iget-object v2, v2, Le/h/d/a/a/s/z;->b:Lfr/mbs/binary/Octets;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-virtual {v2, v3, v4}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "XXXXXXXXXXXX"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/h/d/a/a/s/v;->a:Le/h/d/a/a/s/z;

    iget-object v2, v2, Le/h/d/a/a/s/z;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->size()I

    move-result v5

    sub-int/2addr v5, v4

    invoke-virtual {v2, v5, v4}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "maskedId"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-array v1, v4, [Ljava/lang/String;

    .line 6
    iget-object v2, p0, Le/h/d/a/a/s/v;->a:Le/h/d/a/a/s/z;

    iget-object v2, v2, Le/h/d/a/a/s/z;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget-object v2, p0, Le/h/d/a/a/s/v;->a:Le/h/d/a/a/s/z;

    iget-object v2, v2, Le/h/d/a/a/s/z;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "badge"

    const-string v3, "badgeId = ? AND zoneId = ?"

    .line 7
    invoke-virtual {p1, v2, v0, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 8
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
